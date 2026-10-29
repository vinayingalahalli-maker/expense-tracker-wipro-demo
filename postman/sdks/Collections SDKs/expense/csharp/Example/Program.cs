using ExpenseTrackerApiSdk;
using ExpenseTrackerApiSdk.Config;
using Environment = ExpenseTrackerApiSdk.Http.Environment;

var config = new ExpenseTrackerApiSdkConfig { AccessToken = "YOUR_ACCESS_TOKEN" };

var client = new ExpenseTrackerApiSdkClient(config);

var response = await client.ExpenseTrackerApiSdk.ListCategoriesAsync("1", "20", "true");

Console.WriteLine(response);
