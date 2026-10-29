using ExpenseTrackerApiSdk.Models;
using Environment = ExpenseTrackerApiSdk.Http.Environment;

namespace ExpenseTrackerApiSdk.Config;

/// <summary>
/// Configuration options for the ExpenseTrackerApiSdkClient.
/// </summary>
public record ExpenseTrackerApiSdkConfig(
    /// <value>The environment to use for the SDK.</value>
    Environment? Environment = null,
    /// <value>The access token.</value>
    string? AccessToken = null
);
