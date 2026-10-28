# Expense Tracker — Business Requirements (v2.0)

## 1. What to build

A REST API for company expense claims. Employees record expenses and group them into claims. Approvers approve or reject claims. Finance maintains categories and marks approved claims as reimbursed.

This document defines the entities, operations and rules. It does not define endpoints, paths, HTTP methods or status codes — those are design decisions.

Three entities only: **Category**, **Expense**, **Claim**. Reporting currency is EUR. All monetary values are exact to 2 decimal places.

## 2. Entities

### Category

| Field | Type | Req | Rules |
|---|---|---|---|
| id | string | gen | Server-generated. Immutable. |
| name | string | yes | 1–50 characters. Unique across categories. |
| receiptThreshold | decimal | yes | EUR. A receipt is required when an expense in this category exceeds it. 0 means always required. |
| active | boolean | no | Defaults to true. Only active categories may be assigned to a new expense. |

### Expense

| Field | Type | Req | Rules |
|---|---|---|---|
| id | string | gen | Server-generated. Immutable. |
| ownerId | string | gen | The authenticated employee who created it. Immutable. |
| amount | decimal | yes | Must be > 0. The amount as paid, in `currency`. |
| currency | string | yes | ISO 4217 three-letter code, uppercase. Example: USD. |
| amountEur | decimal | yes | Must be > 0. The same amount in EUR. Equals `amount` when currency is EUR. |
| dateIncurred | date | yes | ISO 8601 date (YYYY-MM-DD). Must not be in the future. |
| categoryId | string | yes | Must reference an existing, active Category. |
| description | string | yes | 1–200 characters. |
| paymentMethod | enum | yes | One of: `personal`, `company_card`. |
| clientReference | string | no | Free text, max 50 characters. |
| receipts | array | no | 0 to 10 receipt references. JPEG, PNG or PDF, max 10 MB each. |
| claimId | string | no | Null until the expense is added to a Claim. |
| createdAt | timestamp | gen | ISO 8601. Server-generated. Immutable. |

### Claim

| Field | Type | Req | Rules |
|---|---|---|---|
| id | string | gen | Server-generated. Immutable. |
| ownerId | string | gen | The authenticated employee who created it. Immutable. |
| title | string | yes | 1–100 characters. |
| expenseIds | array | yes | References to Expenses owned by the same employee. |
| totalEur | decimal | gen | Computed: the sum of `amountEur` of the expenses it contains. |
| status | enum | gen | One of: `draft`, `submitted`, `approved`, `rejected`, `reimbursed`. Starts at `draft`. |
| submittedAt | timestamp | no | Set when status becomes `submitted`. Null before that. |
| decidedBy | string | no | The approver who approved or rejected it. |
| decidedAt | timestamp | no | Set when status becomes `approved` or `rejected`. |
| rejectionReason | string | no | 1–500 characters. Required when rejecting. Preserved after the claim returns to `draft`. |

## 3. Roles and required operations

The caller's role is carried in the access token. Anything not listed here must be refused for that role.

| Role | Must be able to |
|---|---|
| Employee | Create, read, update and delete their own expenses. List their own expenses, filtered by date range, category, and whether the expense is already in a claim. Attach and remove receipts on their own expenses. Read the category list. Create a claim, add and remove their own expenses from it while it is in `draft`, and submit it. List their own claims and read one. |
| Approver | List claims that are `submitted` and not their own. Read one such claim including its expenses and receipts. Approve a claim. Reject a claim with a reason. |
| Finance | Create, rename, retire and list categories, and change a receipt threshold. Mark an approved claim as reimbursed. List all expenses across all employees for a date range. Read any claim. |

## 4. Rules

Every rule below must be enforced. A request that breaks one must be refused with a response identifying which rule failed.

| ID | Rule |
|---|---|
| R1 | `amount` and `amountEur` must be greater than 0. Negative amounts and refunds are not supported. |
| R2 | `dateIncurred` must not be later than today. |
| R3 | `categoryId` must reference a Category whose `active` is true at the time the expense is created or its category is changed. |
| R4 | An expense whose `dateIncurred` is more than 90 days before today cannot be added to a claim. It can still be created, read and updated. |
| R5 | An expense whose `amountEur` exceeds its category's `receiptThreshold` must have at least one receipt before its claim can be submitted. |
| R6 | A claim must contain at least one expense to be submitted. |
| R7 | An expense can belong to at most one claim. Adding it to a second claim must be refused. |
| R8 | All expenses in a claim must have the same `ownerId` as the claim. |
| R9 | Claim status may change only as follows, and by no other path: `draft` → `submitted`; `submitted` → `approved`; `submitted` → `rejected`; `approved` → `reimbursed`; `rejected` → `draft`. |
| R10 | Rejecting a claim requires `rejectionReason`. Approving must not accept one. |
| R11 | While a claim's status is `submitted`, `approved` or `reimbursed`, neither the claim nor any expense in it may be modified or deleted, and expenses may not be added or removed. |
| R12 | An approver must not approve or reject a claim whose `ownerId` is their own. |
| R13 | A claim with status `reimbursed` is final. No further change of any kind is permitted. |
| R14 | Retiring a category must not change or invalidate any existing expense assigned to it. |
| R15 | An employee must not read, modify or delete an expense or claim owned by another employee. |
| R16 | `totalEur` is always derived from the claim's expenses and must never be accepted from the caller. |

## 5. Technical requirements

| ID | Requirement |
|---|---|
| T1 | Every request must be authenticated. No operation may be reachable anonymously. |
| T2 | Authentication uses a JWT bearer token. The token carries the caller's identity and one role: `employee`, `approver` or `finance`. |
| T3 | An authenticated caller attempting an operation outside their role must be refused explicitly, not given an empty result. |
| T4 | Every list operation must be paginated, with a caller-supplied page size capped at a documented maximum. |
| T5 | Every error response must identify the rule that failed in a form a client can display to a user. |
| T6 | Every operation must have at least one success example and one failure example documented. |

## 6. Out of scope

- Corporate card feeds and transaction matching
- Reading data from receipt images
- Mileage calculation
- Executing payments
- Budget enforcement
- Currency conversion (the caller supplies `amountEur`)
- Multiple approvers on one claim
