# ExpenseTrackerApiSdkService

A list of all methods in the `ExpenseTrackerApiSdkService` service. Click on the method name to view detailed information about that method.

| Methods                                                 | Description |
| :------------------------------------------------------ | :---------- |
| [create_category](#create_category)                     |             |
| [list_categories](#list_categories)                     |             |
| [get_category](#get_category)                           |             |
| [update_category](#update_category)                     |             |
| [retire_category](#retire_category)                     |             |
| [create_expense](#create_expense)                       |             |
| [list_expenses](#list_expenses)                         |             |
| [get_expense](#get_expense)                             |             |
| [update_expense](#update_expense)                       |             |
| [delete_expense](#delete_expense)                       |             |
| [attach_receipt](#attach_receipt)                       |             |
| [remove_receipt](#remove_receipt)                       |             |
| [create_claim](#create_claim)                           |             |
| [list_claims](#list_claims)                             |             |
| [get_claim](#get_claim)                                 |             |
| [update_claim](#update_claim)                           |             |
| [add_expense_to_claim](#add_expense_to_claim)           |             |
| [remove_expense_from_claim](#remove_expense_from_claim) |             |
| [submit_claim](#submit_claim)                           |             |
| [approve_claim](#approve_claim)                         |             |
| [reject_claim](#reject_claim)                           |             |
| [mark_as_reimbursed](#mark_as_reimbursed)               |             |

## create_category

- HTTP Method: `POST`
- Endpoint: `/categories`

**Parameters**

| Name         | Type                                                        | Required | Description       |
| :----------- | :---------------------------------------------------------- | :------- | :---------------- |
| request_body | [CreateCategoryRequest](../models/CreateCategoryRequest.md) | ✅       | The request body. |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment
from expense_tracker_api_sdk.models import CreateCategoryRequest

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

request_body = CreateCategoryRequest(
    name="Travel",
    receipt_threshold=50,
    active=True
)

result = sdk.expense_tracker_api_sdk.create_category(request_body=request_body)

print(result)
```

## list_categories

- HTTP Method: `GET`
- Endpoint: `/categories`

**Parameters**

| Name      | Type | Required | Description                          |
| :-------- | :--- | :------- | :----------------------------------- |
| page      | str  | ❌       | Page number (starts at 1)            |
| page_size | str  | ❌       | Number of items per page (max 100)   |
| active    | str  | ❌       | Filter by active status (true/false) |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.list_categories(
    page="1",
    page_size="20",
    active="true"
)

print(result)
```

## get_category

- HTTP Method: `GET`
- Endpoint: `/categories/{id}`

**Parameters**

| Name | Type | Required | Description |
| :--- | :--- | :------- | :---------- |
| id\_ | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.get_category(id_="id")

print(result)
```

## update_category

- HTTP Method: `PUT`
- Endpoint: `/categories/{id}`

**Parameters**

| Name         | Type                                                        | Required | Description       |
| :----------- | :---------------------------------------------------------- | :------- | :---------------- |
| request_body | [UpdateCategoryRequest](../models/UpdateCategoryRequest.md) | ✅       | The request body. |
| id\_         | str                                                         | ✅       |                   |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment
from expense_tracker_api_sdk.models import UpdateCategoryRequest

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

request_body = UpdateCategoryRequest(
    name="Business Travel",
    receipt_threshold=75
)

result = sdk.expense_tracker_api_sdk.update_category(
    request_body=request_body,
    id_="id"
)

print(result)
```

## retire_category

- HTTP Method: `PATCH`
- Endpoint: `/categories/{id}/retire`

**Parameters**

| Name | Type | Required | Description |
| :--- | :--- | :------- | :---------- |
| id\_ | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.retire_category(id_="id")

print(result)
```

## create_expense

- HTTP Method: `POST`
- Endpoint: `/expenses`

**Parameters**

| Name         | Type                                                      | Required | Description       |
| :----------- | :-------------------------------------------------------- | :------- | :---------------- |
| request_body | [CreateExpenseRequest](../models/CreateExpenseRequest.md) | ✅       | The request body. |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment
from expense_tracker_api_sdk.models import CreateExpenseRequest

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

request_body = CreateExpenseRequest(
    amount=125.5,
    currency="EUR",
    amount_eur=125.5,
    date_incurred="2026-10-15",
    category_id="cat_7x9k2m4n",
    description="Train ticket from Berlin to Munich",
    payment_method="personal",
    client_reference="PROJECT-2026-Q4"
)

result = sdk.expense_tracker_api_sdk.create_expense(request_body=request_body)

print(result)
```

## list_expenses

- HTTP Method: `GET`
- Endpoint: `/expenses`

**Parameters**

| Name        | Type | Required | Description                             |
| :---------- | :--- | :------- | :-------------------------------------- |
| page        | str  | ❌       | Page number (starts at 1)               |
| page_size   | str  | ❌       | Number of items per page (max 100)      |
| date_from   | str  | ❌       | Filter by date incurred from (ISO 8601) |
| date_to     | str  | ❌       | Filter by date incurred to (ISO 8601)   |
| category_id | str  | ❌       | Filter by category ID                   |
| in_claim    | str  | ❌       | Filter by claim status (true/false)     |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.list_expenses(
    page="1",
    page_size="20",
    date_from="2026-10-01",
    date_to="2026-10-31",
    category_id="cat_7x9k2m4n",
    in_claim="false"
)

print(result)
```

## get_expense

- HTTP Method: `GET`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name | Type | Required | Description |
| :--- | :--- | :------- | :---------- |
| id\_ | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.get_expense(id_="id")

print(result)
```

## update_expense

- HTTP Method: `PUT`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name         | Type                                                      | Required | Description       |
| :----------- | :-------------------------------------------------------- | :------- | :---------------- |
| request_body | [UpdateExpenseRequest](../models/UpdateExpenseRequest.md) | ✅       | The request body. |
| id\_         | str                                                       | ✅       |                   |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment
from expense_tracker_api_sdk.models import UpdateExpenseRequest

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

request_body = UpdateExpenseRequest(
    amount=135,
    currency="EUR",
    amount_eur=135,
    date_incurred="2026-10-15",
    category_id="cat_7x9k2m4n",
    description="Train ticket from Berlin to Munich (updated fare)",
    payment_method="personal",
    client_reference="PROJECT-2026-Q4"
)

result = sdk.expense_tracker_api_sdk.update_expense(
    request_body=request_body,
    id_="id"
)

print(result)
```

## delete_expense

- HTTP Method: `DELETE`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name | Type | Required | Description |
| :--- | :--- | :------- | :---------- |
| id\_ | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.delete_expense(id_="id")

print(result)
```

## attach_receipt

- HTTP Method: `POST`
- Endpoint: `/expenses/{id}/receipts`

**Parameters**

| Name         | Type                                                      | Required | Description       |
| :----------- | :-------------------------------------------------------- | :------- | :---------------- |
| request_body | [AttachReceiptRequest](../models/AttachReceiptRequest.md) | ✅       | The request body. |
| id\_         | str                                                       | ✅       |                   |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment
from expense_tracker_api_sdk.models import AttachReceiptRequest

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

request_body = AttachReceiptRequest(
    receipt_url="https://storage.example.com/receipts/train-ticket-oct15.pdf",
    file_name="train-ticket-oct15.pdf",
    content_type="application/pdf",
    size_bytes=245678
)

result = sdk.expense_tracker_api_sdk.attach_receipt(
    request_body=request_body,
    id_="id"
)

print(result)
```

## remove_receipt

- HTTP Method: `DELETE`
- Endpoint: `/expenses/{id}/receipts/{receiptId}`

**Parameters**

| Name       | Type | Required | Description |
| :--------- | :--- | :------- | :---------- |
| id\_       | str  | ✅       |             |
| receipt_id | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.remove_receipt(
    id_="id",
    receipt_id="receiptId"
)

print(result)
```

## create_claim

- HTTP Method: `POST`
- Endpoint: `/claims`

**Parameters**

| Name         | Type                                                  | Required | Description       |
| :----------- | :---------------------------------------------------- | :------- | :---------------- |
| request_body | [CreateClaimRequest](../models/CreateClaimRequest.md) | ✅       | The request body. |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment
from expense_tracker_api_sdk.models import CreateClaimRequest

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

request_body = CreateClaimRequest(
    title="October 2026 Business Travel Expenses",
    expense_ids=[
        ""
    ]
)

result = sdk.expense_tracker_api_sdk.create_claim(request_body=request_body)

print(result)
```

## list_claims

- HTTP Method: `GET`
- Endpoint: `/claims`

**Parameters**

| Name      | Type | Required | Description                                                         |
| :-------- | :--- | :------- | :------------------------------------------------------------------ |
| page      | str  | ❌       | Page number (starts at 1)                                           |
| page_size | str  | ❌       | Number of items per page (max 100)                                  |
| status    | str  | ❌       | Filter by status (draft, submitted, approved, rejected, reimbursed) |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.list_claims(
    page="1",
    page_size="20",
    status="draft"
)

print(result)
```

## get_claim

- HTTP Method: `GET`
- Endpoint: `/claims/{id}`

**Parameters**

| Name | Type | Required | Description |
| :--- | :--- | :------- | :---------- |
| id\_ | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.get_claim(id_="id")

print(result)
```

## update_claim

- HTTP Method: `PUT`
- Endpoint: `/claims/{id}`

**Parameters**

| Name         | Type                                                  | Required | Description       |
| :----------- | :---------------------------------------------------- | :------- | :---------------- |
| request_body | [UpdateClaimRequest](../models/UpdateClaimRequest.md) | ✅       | The request body. |
| id\_         | str                                                   | ✅       |                   |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment
from expense_tracker_api_sdk.models import UpdateClaimRequest

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

request_body = UpdateClaimRequest(
    title="October 2026 Business Travel - Updated"
)

result = sdk.expense_tracker_api_sdk.update_claim(
    request_body=request_body,
    id_="id"
)

print(result)
```

## add_expense_to_claim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/expenses`

**Parameters**

| Name         | Type                                                              | Required | Description       |
| :----------- | :---------------------------------------------------------------- | :------- | :---------------- |
| request_body | [AddExpenseToClaimRequest](../models/AddExpenseToClaimRequest.md) | ✅       | The request body. |
| id\_         | str                                                               | ✅       |                   |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment
from expense_tracker_api_sdk.models import AddExpenseToClaimRequest

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

request_body = AddExpenseToClaimRequest(
    expense_id="exp_a1b2c3d4e5"
)

result = sdk.expense_tracker_api_sdk.add_expense_to_claim(
    request_body=request_body,
    id_="id"
)

print(result)
```

## remove_expense_from_claim

- HTTP Method: `DELETE`
- Endpoint: `/claims/{id}/expenses/{expenseId}`

**Parameters**

| Name       | Type | Required | Description |
| :--------- | :--- | :------- | :---------- |
| id\_       | str  | ✅       |             |
| expense_id | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.remove_expense_from_claim(
    id_="id",
    expense_id="expenseId"
)

print(result)
```

## submit_claim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/submit`

**Parameters**

| Name | Type | Required | Description |
| :--- | :--- | :------- | :---------- |
| id\_ | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.submit_claim(id_="id")

print(result)
```

## approve_claim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/approve`

**Parameters**

| Name | Type | Required | Description |
| :--- | :--- | :------- | :---------- |
| id\_ | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.approve_claim(id_="id")

print(result)
```

## reject_claim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/reject`

**Parameters**

| Name         | Type                                                  | Required | Description       |
| :----------- | :---------------------------------------------------- | :------- | :---------------- |
| request_body | [RejectClaimRequest](../models/RejectClaimRequest.md) | ✅       | The request body. |
| id\_         | str                                                   | ✅       |                   |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment
from expense_tracker_api_sdk.models import RejectClaimRequest

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

request_body = RejectClaimRequest(
    rejection_reason="Missing receipts for expenses over EUR 50.00. Please attach receipts and resubmit."
)

result = sdk.expense_tracker_api_sdk.reject_claim(
    request_body=request_body,
    id_="id"
)

print(result)
```

## mark_as_reimbursed

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/reimburse`

**Parameters**

| Name | Type | Required | Description |
| :--- | :--- | :------- | :---------- |
| id\_ | str  | ✅       |             |

**Return Type**

`Any`

**Example Usage Code Snippet**

```python
from expense_tracker_api_sdk import ExpenseTrackerApiSdk, Environment

sdk = ExpenseTrackerApiSdk(
    access_token="YOUR_ACCESS_TOKEN",
    base_url=Environment.DEFAULT.value,
    timeout=10
)

result = sdk.expense_tracker_api_sdk.mark_as_reimbursed(id_="id")

print(result)
```
