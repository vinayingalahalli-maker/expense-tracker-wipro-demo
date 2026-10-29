# ExpenseTrackerApiSdkService

A list of all methods in the `ExpenseTrackerApiSdkService` service. Click on the method name to view detailed information about that method.

| Methods                                           | Description |
| :------------------------------------------------ | :---------- |
| [createCategory](#createcategory)                 |             |
| [listCategories](#listcategories)                 |             |
| [getCategory](#getcategory)                       |             |
| [updateCategory](#updatecategory)                 |             |
| [retireCategory](#retirecategory)                 |             |
| [createExpense](#createexpense)                   |             |
| [listExpenses](#listexpenses)                     |             |
| [getExpense](#getexpense)                         |             |
| [updateExpense](#updateexpense)                   |             |
| [deleteExpense](#deleteexpense)                   |             |
| [attachReceipt](#attachreceipt)                   |             |
| [removeReceipt](#removereceipt)                   |             |
| [createClaim](#createclaim)                       |             |
| [listClaims](#listclaims)                         |             |
| [getClaim](#getclaim)                             |             |
| [updateClaim](#updateclaim)                       |             |
| [addExpenseToClaim](#addexpensetoclaim)           |             |
| [removeExpenseFromClaim](#removeexpensefromclaim) |             |
| [submitClaim](#submitclaim)                       |             |
| [approveClaim](#approveclaim)                     |             |
| [rejectClaim](#rejectclaim)                       |             |
| [markAsReimbursed](#markasreimbursed)             |             |

## createCategory

- HTTP Method: `POST`
- Endpoint: `/categories`

**Parameters**

| Name | Type                                                        | Required | Description       |
| :--- | :---------------------------------------------------------- | :------- | :---------------- |
| body | [CreateCategoryRequest](../models/CreateCategoryRequest.md) | ✅       | The request body. |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { CreateCategoryRequest, ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const createCategoryRequest: CreateCategoryRequest = {
    name: 'Travel',
    receiptThreshold: 50,
    active: true,
  };

  const data =
    await expenseTrackerApiSdk.expenseTrackerApiSdk.createCategory(createCategoryRequest);

  console.log(data);
})();
```

## listCategories

- HTTP Method: `GET`
- Endpoint: `/categories`

**Parameters**

| Name     | Type   | Required | Description                          |
| :------- | :----- | :------- | :----------------------------------- |
| page     | string | ❌       | Page number (starts at 1)            |
| pageSize | string | ❌       | Number of items per page (max 100)   |
| active   | string | ❌       | Filter by active status (true/false) |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.listCategories({
    page: '1',
    pageSize: '20',
    active: 'true',
  });

  console.log(data);
})();
```

## getCategory

- HTTP Method: `GET`
- Endpoint: `/categories/{id}`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.getCategory('id');

  console.log(data);
})();
```

## updateCategory

- HTTP Method: `PUT`
- Endpoint: `/categories/{id}`

**Parameters**

| Name | Type                                                        | Required | Description       |
| :--- | :---------------------------------------------------------- | :------- | :---------------- |
| body | [UpdateCategoryRequest](../models/UpdateCategoryRequest.md) | ✅       | The request body. |
| id   | string                                                      | ✅       |                   |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk, UpdateCategoryRequest } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const updateCategoryRequest: UpdateCategoryRequest = {
    name: 'Business Travel',
    receiptThreshold: 75,
  };

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.updateCategory(
    'id',
    updateCategoryRequest,
  );

  console.log(data);
})();
```

## retireCategory

- HTTP Method: `PATCH`
- Endpoint: `/categories/{id}/retire`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.retireCategory('id');

  console.log(data);
})();
```

## createExpense

- HTTP Method: `POST`
- Endpoint: `/expenses`

**Parameters**

| Name | Type                                                      | Required | Description       |
| :--- | :-------------------------------------------------------- | :------- | :---------------- |
| body | [CreateExpenseRequest](../models/CreateExpenseRequest.md) | ✅       | The request body. |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { CreateExpenseRequest, ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const createExpenseRequest: CreateExpenseRequest = {
    amount: 125.5,
    currency: 'EUR',
    amountEur: 125.5,
    dateIncurred: '2026-10-15',
    categoryId: 'cat_7x9k2m4n',
    description: 'Train ticket from Berlin to Munich',
    paymentMethod: 'personal',
    clientReference: 'PROJECT-2026-Q4',
  };

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.createExpense(createExpenseRequest);

  console.log(data);
})();
```

## listExpenses

- HTTP Method: `GET`
- Endpoint: `/expenses`

**Parameters**

| Name       | Type   | Required | Description                             |
| :--------- | :----- | :------- | :-------------------------------------- |
| page       | string | ❌       | Page number (starts at 1)               |
| pageSize   | string | ❌       | Number of items per page (max 100)      |
| dateFrom   | string | ❌       | Filter by date incurred from (ISO 8601) |
| dateTo     | string | ❌       | Filter by date incurred to (ISO 8601)   |
| categoryId | string | ❌       | Filter by category ID                   |
| inClaim    | string | ❌       | Filter by claim status (true/false)     |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.listExpenses({
    page: '1',
    pageSize: '20',
    dateFrom: '2026-10-01',
    dateTo: '2026-10-31',
    categoryId: 'cat_7x9k2m4n',
    inClaim: 'false',
  });

  console.log(data);
})();
```

## getExpense

- HTTP Method: `GET`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.getExpense('id');

  console.log(data);
})();
```

## updateExpense

- HTTP Method: `PUT`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name | Type                                                      | Required | Description       |
| :--- | :-------------------------------------------------------- | :------- | :---------------- |
| body | [UpdateExpenseRequest](../models/UpdateExpenseRequest.md) | ✅       | The request body. |
| id   | string                                                    | ✅       |                   |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk, UpdateExpenseRequest } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const updateExpenseRequest: UpdateExpenseRequest = {
    amount: 135,
    currency: 'EUR',
    amountEur: 135,
    dateIncurred: '2026-10-15',
    categoryId: 'cat_7x9k2m4n',
    description: 'Train ticket from Berlin to Munich (updated fare)',
    paymentMethod: 'personal',
    clientReference: 'PROJECT-2026-Q4',
  };

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.updateExpense(
    'id',
    updateExpenseRequest,
  );

  console.log(data);
})();
```

## deleteExpense

- HTTP Method: `DELETE`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.deleteExpense('id');

  console.log(data);
})();
```

## attachReceipt

- HTTP Method: `POST`
- Endpoint: `/expenses/{id}/receipts`

**Parameters**

| Name | Type                                                      | Required | Description       |
| :--- | :-------------------------------------------------------- | :------- | :---------------- |
| body | [AttachReceiptRequest](../models/AttachReceiptRequest.md) | ✅       | The request body. |
| id   | string                                                    | ✅       |                   |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { AttachReceiptRequest, ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const attachReceiptRequest: AttachReceiptRequest = {
    receiptUrl: 'https://storage.example.com/receipts/train-ticket-oct15.pdf',
    fileName: 'train-ticket-oct15.pdf',
    contentType: 'application/pdf',
    sizeBytes: 245678,
  };

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.attachReceipt(
    'id',
    attachReceiptRequest,
  );

  console.log(data);
})();
```

## removeReceipt

- HTTP Method: `DELETE`
- Endpoint: `/expenses/{id}/receipts/{receiptId}`

**Parameters**

| Name      | Type   | Required | Description |
| :-------- | :----- | :------- | :---------- |
| id        | string | ✅       |             |
| receiptId | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.removeReceipt('id', 'receiptId');

  console.log(data);
})();
```

## createClaim

- HTTP Method: `POST`
- Endpoint: `/claims`

**Parameters**

| Name | Type                                                  | Required | Description       |
| :--- | :---------------------------------------------------- | :------- | :---------------- |
| body | [CreateClaimRequest](../models/CreateClaimRequest.md) | ✅       | The request body. |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { CreateClaimRequest, ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const createClaimRequest: CreateClaimRequest = {
    title: 'October 2026 Business Travel Expenses',
    expenseIds: [[]],
  };

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.createClaim(createClaimRequest);

  console.log(data);
})();
```

## listClaims

- HTTP Method: `GET`
- Endpoint: `/claims`

**Parameters**

| Name     | Type   | Required | Description                                                         |
| :------- | :----- | :------- | :------------------------------------------------------------------ |
| page     | string | ❌       | Page number (starts at 1)                                           |
| pageSize | string | ❌       | Number of items per page (max 100)                                  |
| status   | string | ❌       | Filter by status (draft, submitted, approved, rejected, reimbursed) |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.listClaims({
    page: '1',
    pageSize: '20',
    status: 'draft',
  });

  console.log(data);
})();
```

## getClaim

- HTTP Method: `GET`
- Endpoint: `/claims/{id}`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.getClaim('id');

  console.log(data);
})();
```

## updateClaim

- HTTP Method: `PUT`
- Endpoint: `/claims/{id}`

**Parameters**

| Name | Type                                                  | Required | Description       |
| :--- | :---------------------------------------------------- | :------- | :---------------- |
| body | [UpdateClaimRequest](../models/UpdateClaimRequest.md) | ✅       | The request body. |
| id   | string                                                | ✅       |                   |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk, UpdateClaimRequest } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const updateClaimRequest: UpdateClaimRequest = {
    title: 'October 2026 Business Travel - Updated',
  };

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.updateClaim(
    'id',
    updateClaimRequest,
  );

  console.log(data);
})();
```

## addExpenseToClaim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/expenses`

**Parameters**

| Name | Type                                                              | Required | Description       |
| :--- | :---------------------------------------------------------------- | :------- | :---------------- |
| body | [AddExpenseToClaimRequest](../models/AddExpenseToClaimRequest.md) | ✅       | The request body. |
| id   | string                                                            | ✅       |                   |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { AddExpenseToClaimRequest, ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const addExpenseToClaimRequest: AddExpenseToClaimRequest = {
    expenseId: 'exp_a1b2c3d4e5',
  };

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.addExpenseToClaim(
    'id',
    addExpenseToClaimRequest,
  );

  console.log(data);
})();
```

## removeExpenseFromClaim

- HTTP Method: `DELETE`
- Endpoint: `/claims/{id}/expenses/{expenseId}`

**Parameters**

| Name      | Type   | Required | Description |
| :-------- | :----- | :------- | :---------- |
| id        | string | ✅       |             |
| expenseId | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.removeExpenseFromClaim(
    'id',
    'expenseId',
  );

  console.log(data);
})();
```

## submitClaim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/submit`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.submitClaim('id');

  console.log(data);
})();
```

## approveClaim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/approve`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.approveClaim('id');

  console.log(data);
})();
```

## rejectClaim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/reject`

**Parameters**

| Name | Type                                                  | Required | Description       |
| :--- | :---------------------------------------------------- | :------- | :---------------- |
| body | [RejectClaimRequest](../models/RejectClaimRequest.md) | ✅       | The request body. |
| id   | string                                                | ✅       |                   |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk, RejectClaimRequest } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const rejectClaimRequest: RejectClaimRequest = {
    rejectionReason:
      'Missing receipts for expenses over EUR 50.00. Please attach receipts and resubmit.',
  };

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.rejectClaim(
    'id',
    rejectClaimRequest,
  );

  console.log(data);
})();
```

## markAsReimbursed

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/reimburse`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`any`

**Example Usage Code Snippet**

```typescript
import { ExpenseTrackerApiSdk } from 'expense-tracker-api-sdk';

(async () => {
  const expenseTrackerApiSdk = new ExpenseTrackerApiSdk({
    token: 'YOUR_TOKEN',
  });

  const data = await expenseTrackerApiSdk.expenseTrackerApiSdk.markAsReimbursed('id');

  console.log(data);
})();
```
