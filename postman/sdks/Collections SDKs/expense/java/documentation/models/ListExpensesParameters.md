# ListExpensesParameters

**Properties**

| Name       | Type   | Required | Description                             |
| :--------- | :----- | :------- | :-------------------------------------- |
| page       | String | ❌       | Page number (starts at 1)               |
| pageSize   | String | ❌       | Number of items per page (max 100)      |
| dateFrom   | String | ❌       | Filter by date incurred from (ISO 8601) |
| dateTo     | String | ❌       | Filter by date incurred to (ISO 8601)   |
| categoryId | String | ❌       | Filter by category ID                   |
| inClaim    | String | ❌       | Filter by claim status (true/false)     |
