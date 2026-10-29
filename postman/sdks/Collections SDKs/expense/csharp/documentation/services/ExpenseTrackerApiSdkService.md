# ExpenseTrackerApiSdkService

A list of all methods in the `ExpenseTrackerApiSdkService` service. Click on the method name to view detailed information about that method.

| Methods                                                     | Description |
| :---------------------------------------------------------- | :---------- |
| [CreateCategoryAsync](#createcategoryasync)                 |             |
| [ListCategoriesAsync](#listcategoriesasync)                 |             |
| [GetCategoryAsync](#getcategoryasync)                       |             |
| [UpdateCategoryAsync](#updatecategoryasync)                 |             |
| [RetireCategoryAsync](#retirecategoryasync)                 |             |
| [CreateExpenseAsync](#createexpenseasync)                   |             |
| [ListExpensesAsync](#listexpensesasync)                     |             |
| [GetExpenseAsync](#getexpenseasync)                         |             |
| [UpdateExpenseAsync](#updateexpenseasync)                   |             |
| [DeleteExpenseAsync](#deleteexpenseasync)                   |             |
| [AttachReceiptAsync](#attachreceiptasync)                   |             |
| [RemoveReceiptAsync](#removereceiptasync)                   |             |
| [CreateClaimAsync](#createclaimasync)                       |             |
| [ListClaimsAsync](#listclaimsasync)                         |             |
| [GetClaimAsync](#getclaimasync)                             |             |
| [UpdateClaimAsync](#updateclaimasync)                       |             |
| [AddExpenseToClaimAsync](#addexpensetoclaimasync)           |             |
| [RemoveExpenseFromClaimAsync](#removeexpensefromclaimasync) |             |
| [SubmitClaimAsync](#submitclaimasync)                       |             |
| [ApproveClaimAsync](#approveclaimasync)                     |             |
| [RejectClaimAsync](#rejectclaimasync)                       |             |
| [MarkAsReimbursedAsync](#markasreimbursedasync)             |             |

## CreateCategoryAsync

- HTTP Method: `POST`
- Endpoint: `/categories`

**Parameters**

| Name  | Type                  | Required | Description       |
| :---- | :-------------------- | :------- | :---------------- |
| input | CreateCategoryRequest | ✅       | The request body. |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;
using ExpenseTrackerApiSdk.Models;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var input = new CreateCategoryRequest(Optional<string?>.Of("Travel"), Optional<double?>.Of(50), Optional<bool?>.Of(true));

var response = await client.ExpenseTrackerApiSdk.CreateCategoryAsync(input);

Console.WriteLine(response);
```

## ListCategoriesAsync

- HTTP Method: `GET`
- Endpoint: `/categories`

**Parameters**

| Name     | Type   | Required | Description                          |
| :------- | :----- | :------- | :----------------------------------- |
| page     | string | ❌       | Page number (starts at 1)            |
| pageSize | string | ❌       | Number of items per page (max 100)   |
| active   | string | ❌       | Filter by active status (true/false) |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var response = await client.ExpenseTrackerApiSdk.ListCategoriesAsync("1", "20", "true");

Console.WriteLine(response);
```

## GetCategoryAsync

- HTTP Method: `GET`
- Endpoint: `/categories/{id}`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var response = await client.ExpenseTrackerApiSdk.GetCategoryAsync("id");

Console.WriteLine(response);
```

## UpdateCategoryAsync

- HTTP Method: `PUT`
- Endpoint: `/categories/{id}`

**Parameters**

| Name  | Type                  | Required | Description       |
| :---- | :-------------------- | :------- | :---------------- |
| input | UpdateCategoryRequest | ✅       | The request body. |
| id    | string                | ✅       |                   |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;
using ExpenseTrackerApiSdk.Models;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var input = new UpdateCategoryRequest(Optional<string?>.Of("Business Travel"), Optional<double?>.Of(75));

var response = await client.ExpenseTrackerApiSdk.UpdateCategoryAsync(input, "id");

Console.WriteLine(response);
```

## RetireCategoryAsync

- HTTP Method: `PATCH`
- Endpoint: `/categories/{id}/retire`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var response = await client.ExpenseTrackerApiSdk.RetireCategoryAsync("id");

Console.WriteLine(response);
```

## CreateExpenseAsync

- HTTP Method: `POST`
- Endpoint: `/expenses`

**Parameters**

| Name  | Type                 | Required | Description       |
| :---- | :------------------- | :------- | :---------------- |
| input | CreateExpenseRequest | ✅       | The request body. |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;
using ExpenseTrackerApiSdk.Models;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var input = new CreateExpenseRequest(Optional<double?>.Of(125.5), Optional<string?>.Of("EUR"), Optional<double?>.Of(125.5), Optional<string?>.Of("2026-10-15"), Optional<string?>.Of("cat_7x9k2m4n"), Optional<string?>.Of("Train ticket from Berlin to Munich"), Optional<string?>.Of("personal"), Optional<string?>.Of("PROJECT-2026-Q4"));

var response = await client.ExpenseTrackerApiSdk.CreateExpenseAsync(input);

Console.WriteLine(response);
```

## ListExpensesAsync

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

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var response = await client.ExpenseTrackerApiSdk.ListExpensesAsync("1", "20", "2026-10-01", "2026-10-31", "cat_7x9k2m4n", "false");

Console.WriteLine(response);
```

## GetExpenseAsync

- HTTP Method: `GET`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var response = await client.ExpenseTrackerApiSdk.GetExpenseAsync("id");

Console.WriteLine(response);
```

## UpdateExpenseAsync

- HTTP Method: `PUT`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name  | Type                 | Required | Description       |
| :---- | :------------------- | :------- | :---------------- |
| input | UpdateExpenseRequest | ✅       | The request body. |
| id    | string               | ✅       |                   |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;
using ExpenseTrackerApiSdk.Models;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var input = new UpdateExpenseRequest(Optional<double?>.Of(135), Optional<string?>.Of("EUR"), Optional<double?>.Of(135), Optional<string?>.Of("2026-10-15"), Optional<string?>.Of("cat_7x9k2m4n"), Optional<string?>.Of("Train ticket from Berlin to Munich (updated fare)"), Optional<string?>.Of("personal"), Optional<string?>.Of("PROJECT-2026-Q4"));

var response = await client.ExpenseTrackerApiSdk.UpdateExpenseAsync(input, "id");

Console.WriteLine(response);
```

## DeleteExpenseAsync

- HTTP Method: `DELETE`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var response = await client.ExpenseTrackerApiSdk.DeleteExpenseAsync("id");

Console.WriteLine(response);
```

## AttachReceiptAsync

- HTTP Method: `POST`
- Endpoint: `/expenses/{id}/receipts`

**Parameters**

| Name  | Type                 | Required | Description       |
| :---- | :------------------- | :------- | :---------------- |
| input | AttachReceiptRequest | ✅       | The request body. |
| id    | string               | ✅       |                   |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;
using ExpenseTrackerApiSdk.Models;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var input = new AttachReceiptRequest(Optional<string?>.Of("https://storage.example.com/receipts/train-ticket-oct15.pdf"), Optional<string?>.Of("train-ticket-oct15.pdf"), Optional<string?>.Of("application/pdf"), Optional<double?>.Of(245678));

var response = await client.ExpenseTrackerApiSdk.AttachReceiptAsync(input, "id");

Console.WriteLine(response);
```

## RemoveReceiptAsync

- HTTP Method: `DELETE`
- Endpoint: `/expenses/{id}/receipts/{receiptId}`

**Parameters**

| Name      | Type   | Required | Description |
| :-------- | :----- | :------- | :---------- |
| id        | string | ✅       |             |
| receiptId | string | ✅       |             |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var response = await client.ExpenseTrackerApiSdk.RemoveReceiptAsync("id", "receiptId");

Console.WriteLine(response);
```

## CreateClaimAsync

- HTTP Method: `POST`
- Endpoint: `/claims`

**Parameters**

| Name  | Type               | Required | Description       |
| :---- | :----------------- | :------- | :---------------- |
| input | CreateClaimRequest | ✅       | The request body. |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;
using ExpenseTrackerApiSdk.Models;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var expenseIds = new List<object>() { new object {} };
var input = new CreateClaimRequest(Optional<string?>.Of("October 2026 Business Travel Expenses"), Optional<List<object>?>.Of(expenseIds));

var response = await client.ExpenseTrackerApiSdk.CreateClaimAsync(input);

Console.WriteLine(response);
```

## ListClaimsAsync

- HTTP Method: `GET`
- Endpoint: `/claims`

**Parameters**

| Name     | Type   | Required | Description                                                         |
| :------- | :----- | :------- | :------------------------------------------------------------------ |
| page     | string | ❌       | Page number (starts at 1)                                           |
| pageSize | string | ❌       | Number of items per page (max 100)                                  |
| status   | string | ❌       | Filter by status (draft, submitted, approved, rejected, reimbursed) |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var response = await client.ExpenseTrackerApiSdk.ListClaimsAsync("1", "20", "draft");

Console.WriteLine(response);
```

## GetClaimAsync

- HTTP Method: `GET`
- Endpoint: `/claims/{id}`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var response = await client.ExpenseTrackerApiSdk.GetClaimAsync("id");

Console.WriteLine(response);
```

## UpdateClaimAsync

- HTTP Method: `PUT`
- Endpoint: `/claims/{id}`

**Parameters**

| Name  | Type               | Required | Description       |
| :---- | :----------------- | :------- | :---------------- |
| input | UpdateClaimRequest | ✅       | The request body. |
| id    | string             | ✅       |                   |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;
using ExpenseTrackerApiSdk.Models;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var input = new UpdateClaimRequest(Optional<string?>.Of("October 2026 Business Travel - Updated"));

var response = await client.ExpenseTrackerApiSdk.UpdateClaimAsync(input, "id");

Console.WriteLine(response);
```

## AddExpenseToClaimAsync

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/expenses`

**Parameters**

| Name  | Type                     | Required | Description       |
| :---- | :----------------------- | :------- | :---------------- |
| input | AddExpenseToClaimRequest | ✅       | The request body. |
| id    | string                   | ✅       |                   |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;
using ExpenseTrackerApiSdk.Models;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var input = new AddExpenseToClaimRequest(Optional<string?>.Of("exp_a1b2c3d4e5"));

var response = await client.ExpenseTrackerApiSdk.AddExpenseToClaimAsync(input, "id");

Console.WriteLine(response);
```

## RemoveExpenseFromClaimAsync

- HTTP Method: `DELETE`
- Endpoint: `/claims/{id}/expenses/{expenseId}`

**Parameters**

| Name      | Type   | Required | Description |
| :-------- | :----- | :------- | :---------- |
| id        | string | ✅       |             |
| expenseId | string | ✅       |             |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var response = await client.ExpenseTrackerApiSdk.RemoveExpenseFromClaimAsync("id", "expenseId");

Console.WriteLine(response);
```

## SubmitClaimAsync

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/submit`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var response = await client.ExpenseTrackerApiSdk.SubmitClaimAsync("id");

Console.WriteLine(response);
```

## ApproveClaimAsync

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/approve`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var response = await client.ExpenseTrackerApiSdk.ApproveClaimAsync("id");

Console.WriteLine(response);
```

## RejectClaimAsync

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/reject`

**Parameters**

| Name  | Type               | Required | Description       |
| :---- | :----------------- | :------- | :---------------- |
| input | RejectClaimRequest | ✅       | The request body. |
| id    | string             | ✅       |                   |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;
using ExpenseTrackerApiSdk.Models;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var input = new RejectClaimRequest(Optional<string?>.Of("Missing receipts for expenses over EUR 50.00. Please attach receipts and resubmit."));

var response = await client.ExpenseTrackerApiSdk.RejectClaimAsync(input, "id");

Console.WriteLine(response);
```

## MarkAsReimbursedAsync

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/reimburse`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | string | ✅       |             |

**Return Type**

`object`

**Example Usage Code Snippet**

```csharp
using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;

var config = new ExpenseTrackerApiSdkConfig{
    AccessToken = "YOUR_ACCESS_TOKEN"
};

var client = new ExpenseTrackerApiSdkClient(config);

var response = await client.ExpenseTrackerApiSdk.MarkAsReimbursedAsync("id");

Console.WriteLine(response);
```
