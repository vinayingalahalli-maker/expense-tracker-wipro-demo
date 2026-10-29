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

| Name                  | Type                                                        | Required | Description  |
| :-------------------- | :---------------------------------------------------------- | :------- | :----------- |
| createCategoryRequest | [CreateCategoryRequest](../models/CreateCategoryRequest.md) | ✅       | Request Body |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;
import com.expensetrackerapisdk.models.CreateCategoryRequest;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    CreateCategoryRequest createCategoryRequest = CreateCategoryRequest.builder()
      .name("Travel")
      .receiptThreshold(50D)
      .active(true)
      .build();

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.createCategory(
      createCategoryRequest
    );

    System.out.println(response);
  }
}

```

## listCategories

- HTTP Method: `GET`
- Endpoint: `/categories`

**Parameters**

| Name              | Type                                                              | Required | Description               |
| :---------------- | :---------------------------------------------------------------- | :------- | :------------------------ |
| requestParameters | [ListCategoriesParameters](../models/ListCategoriesParameters.md) | ❌       | Request Parameters Object |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;
import com.expensetrackerapisdk.models.ListCategoriesParameters;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    ListCategoriesParameters requestParameters = ListCategoriesParameters.builder()
      .page("1")
      .pageSize("20")
      .active("true")
      .build();

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.listCategories(requestParameters);

    System.out.println(response);
  }
}

```

## getCategory

- HTTP Method: `GET`
- Endpoint: `/categories/{id}`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | String | ✅       |             |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.getCategory("id");

    System.out.println(response);
  }
}

```

## updateCategory

- HTTP Method: `PUT`
- Endpoint: `/categories/{id}`

**Parameters**

| Name                  | Type                                                        | Required | Description  |
| :-------------------- | :---------------------------------------------------------- | :------- | :----------- |
| id                    | String                                                      | ✅       |              |
| updateCategoryRequest | [UpdateCategoryRequest](../models/UpdateCategoryRequest.md) | ✅       | Request Body |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;
import com.expensetrackerapisdk.models.UpdateCategoryRequest;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    UpdateCategoryRequest updateCategoryRequest = UpdateCategoryRequest.builder()
      .name("Business Travel")
      .receiptThreshold(75D)
      .build();

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.updateCategory(
      "id",
      updateCategoryRequest
    );

    System.out.println(response);
  }
}

```

## retireCategory

- HTTP Method: `PATCH`
- Endpoint: `/categories/{id}/retire`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | String | ✅       |             |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.retireCategory("id");

    System.out.println(response);
  }
}

```

## createExpense

- HTTP Method: `POST`
- Endpoint: `/expenses`

**Parameters**

| Name                 | Type                                                      | Required | Description  |
| :------------------- | :-------------------------------------------------------- | :------- | :----------- |
| createExpenseRequest | [CreateExpenseRequest](../models/CreateExpenseRequest.md) | ✅       | Request Body |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;
import com.expensetrackerapisdk.models.CreateExpenseRequest;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    CreateExpenseRequest createExpenseRequest = CreateExpenseRequest.builder()
      .amount(125.5D)
      .currency("EUR")
      .amountEur(125.5D)
      .dateIncurred("2026-10-15")
      .categoryId("cat_7x9k2m4n")
      .description("Train ticket from Berlin to Munich")
      .paymentMethod("personal")
      .clientReference("PROJECT-2026-Q4")
      .build();

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.createExpense(createExpenseRequest);

    System.out.println(response);
  }
}

```

## listExpenses

- HTTP Method: `GET`
- Endpoint: `/expenses`

**Parameters**

| Name              | Type                                                          | Required | Description               |
| :---------------- | :------------------------------------------------------------ | :------- | :------------------------ |
| requestParameters | [ListExpensesParameters](../models/ListExpensesParameters.md) | ❌       | Request Parameters Object |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;
import com.expensetrackerapisdk.models.ListExpensesParameters;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    ListExpensesParameters requestParameters = ListExpensesParameters.builder()
      .page("1")
      .pageSize("20")
      .dateFrom("2026-10-01")
      .dateTo("2026-10-31")
      .categoryId("cat_7x9k2m4n")
      .inClaim("false")
      .build();

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.listExpenses(requestParameters);

    System.out.println(response);
  }
}

```

## getExpense

- HTTP Method: `GET`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | String | ✅       |             |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.getExpense("id");

    System.out.println(response);
  }
}

```

## updateExpense

- HTTP Method: `PUT`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name                 | Type                                                      | Required | Description  |
| :------------------- | :-------------------------------------------------------- | :------- | :----------- |
| id                   | String                                                    | ✅       |              |
| updateExpenseRequest | [UpdateExpenseRequest](../models/UpdateExpenseRequest.md) | ✅       | Request Body |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;
import com.expensetrackerapisdk.models.UpdateExpenseRequest;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    UpdateExpenseRequest updateExpenseRequest = UpdateExpenseRequest.builder()
      .amount(135D)
      .currency("EUR")
      .amountEur(135D)
      .dateIncurred("2026-10-15")
      .categoryId("cat_7x9k2m4n")
      .description("Train ticket from Berlin to Munich (updated fare)")
      .paymentMethod("personal")
      .clientReference("PROJECT-2026-Q4")
      .build();

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.updateExpense(
      "id",
      updateExpenseRequest
    );

    System.out.println(response);
  }
}

```

## deleteExpense

- HTTP Method: `DELETE`
- Endpoint: `/expenses/{id}`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | String | ✅       |             |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.deleteExpense("id");

    System.out.println(response);
  }
}

```

## attachReceipt

- HTTP Method: `POST`
- Endpoint: `/expenses/{id}/receipts`

**Parameters**

| Name                 | Type                                                      | Required | Description  |
| :------------------- | :-------------------------------------------------------- | :------- | :----------- |
| id                   | String                                                    | ✅       |              |
| attachReceiptRequest | [AttachReceiptRequest](../models/AttachReceiptRequest.md) | ✅       | Request Body |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;
import com.expensetrackerapisdk.models.AttachReceiptRequest;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    AttachReceiptRequest attachReceiptRequest = AttachReceiptRequest.builder()
      .receiptUrl("https://storage.example.com/receipts/train-ticket-oct15.pdf")
      .fileName("train-ticket-oct15.pdf")
      .contentType("application/pdf")
      .sizeBytes(245678D)
      .build();

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.attachReceipt(
      "id",
      attachReceiptRequest
    );

    System.out.println(response);
  }
}

```

## removeReceipt

- HTTP Method: `DELETE`
- Endpoint: `/expenses/{id}/receipts/{receiptId}`

**Parameters**

| Name      | Type   | Required | Description |
| :-------- | :----- | :------- | :---------- |
| id        | String | ✅       |             |
| receiptId | String | ✅       |             |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.removeReceipt("id", "receiptId");

    System.out.println(response);
  }
}

```

## createClaim

- HTTP Method: `POST`
- Endpoint: `/claims`

**Parameters**

| Name               | Type                                                  | Required | Description  |
| :----------------- | :---------------------------------------------------- | :------- | :----------- |
| createClaimRequest | [CreateClaimRequest](../models/CreateClaimRequest.md) | ✅       | Request Body |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;
import com.expensetrackerapisdk.models.CreateClaimRequest;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    List<Object> expenseIdsList = Arrays.asList(new Object());

    CreateClaimRequest createClaimRequest = CreateClaimRequest.builder()
      .title("October 2026 Business Travel Expenses")
      .expenseIds(expenseIdsList)
      .build();

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.createClaim(createClaimRequest);

    System.out.println(response);
  }
}

```

## listClaims

- HTTP Method: `GET`
- Endpoint: `/claims`

**Parameters**

| Name              | Type                                                      | Required | Description               |
| :---------------- | :-------------------------------------------------------- | :------- | :------------------------ |
| requestParameters | [ListClaimsParameters](../models/ListClaimsParameters.md) | ❌       | Request Parameters Object |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;
import com.expensetrackerapisdk.models.ListClaimsParameters;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    ListClaimsParameters requestParameters = ListClaimsParameters.builder()
      .page("1")
      .pageSize("20")
      .status("draft")
      .build();

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.listClaims(requestParameters);

    System.out.println(response);
  }
}

```

## getClaim

- HTTP Method: `GET`
- Endpoint: `/claims/{id}`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | String | ✅       |             |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.getClaim("id");

    System.out.println(response);
  }
}

```

## updateClaim

- HTTP Method: `PUT`
- Endpoint: `/claims/{id}`

**Parameters**

| Name               | Type                                                  | Required | Description  |
| :----------------- | :---------------------------------------------------- | :------- | :----------- |
| id                 | String                                                | ✅       |              |
| updateClaimRequest | [UpdateClaimRequest](../models/UpdateClaimRequest.md) | ✅       | Request Body |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;
import com.expensetrackerapisdk.models.UpdateClaimRequest;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    UpdateClaimRequest updateClaimRequest = UpdateClaimRequest.builder()
      .title("October 2026 Business Travel - Updated")
      .build();

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.updateClaim(
      "id",
      updateClaimRequest
    );

    System.out.println(response);
  }
}

```

## addExpenseToClaim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/expenses`

**Parameters**

| Name                     | Type                                                              | Required | Description  |
| :----------------------- | :---------------------------------------------------------------- | :------- | :----------- |
| id                       | String                                                            | ✅       |              |
| addExpenseToClaimRequest | [AddExpenseToClaimRequest](../models/AddExpenseToClaimRequest.md) | ✅       | Request Body |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;
import com.expensetrackerapisdk.models.AddExpenseToClaimRequest;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    AddExpenseToClaimRequest addExpenseToClaimRequest = AddExpenseToClaimRequest.builder()
      .expenseId("exp_a1b2c3d4e5")
      .build();

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.addExpenseToClaim(
      "id",
      addExpenseToClaimRequest
    );

    System.out.println(response);
  }
}

```

## removeExpenseFromClaim

- HTTP Method: `DELETE`
- Endpoint: `/claims/{id}/expenses/{expenseId}`

**Parameters**

| Name      | Type   | Required | Description |
| :-------- | :----- | :------- | :---------- |
| id        | String | ✅       |             |
| expenseId | String | ✅       |             |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.removeExpenseFromClaim(
      "id",
      "expenseId"
    );

    System.out.println(response);
  }
}

```

## submitClaim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/submit`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | String | ✅       |             |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.submitClaim("id");

    System.out.println(response);
  }
}

```

## approveClaim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/approve`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | String | ✅       |             |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.approveClaim("id");

    System.out.println(response);
  }
}

```

## rejectClaim

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/reject`

**Parameters**

| Name               | Type                                                  | Required | Description  |
| :----------------- | :---------------------------------------------------- | :------- | :----------- |
| id                 | String                                                | ✅       |              |
| rejectClaimRequest | [RejectClaimRequest](../models/RejectClaimRequest.md) | ✅       | Request Body |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;
import com.expensetrackerapisdk.models.RejectClaimRequest;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    RejectClaimRequest rejectClaimRequest = RejectClaimRequest.builder()
      .rejectionReason(
        "Missing receipts for expenses over EUR 50.00. Please attach receipts and resubmit."
      )
      .build();

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.rejectClaim(
      "id",
      rejectClaimRequest
    );

    System.out.println(response);
  }
}

```

## markAsReimbursed

- HTTP Method: `POST`
- Endpoint: `/claims/{id}/reimburse`

**Parameters**

| Name | Type   | Required | Description |
| :--- | :----- | :------- | :---------- |
| id   | String | ✅       |             |

**Return Type**

`Object`

**Example Usage Code Snippet**

```java
import com.expensetrackerapisdk.ExpenseTrackerApiSdk;
import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;

public class Main {

  public static void main(String[] args) {
    ExpenseTrackerApiSdkConfig config = ExpenseTrackerApiSdkConfig.builder()
      .accessToken("YOUR_ACCESS_TOKEN")
      .build();

    ExpenseTrackerApiSdk expenseTrackerApiSdk = new ExpenseTrackerApiSdk(config);

    Object response = expenseTrackerApiSdk.expenseTrackerApiSdk.markAsReimbursed("id");

    System.out.println(response);
  }
}

```
