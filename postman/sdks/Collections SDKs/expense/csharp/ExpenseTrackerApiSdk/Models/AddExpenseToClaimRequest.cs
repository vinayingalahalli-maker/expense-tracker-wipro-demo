using System.Text.Json.Serialization;

namespace ExpenseTrackerApiSdk.Models;

public record AddExpenseToClaimRequest(
    [property:
        JsonPropertyName("expenseId"),
        JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)
    ]
        Optional<string?> ExpenseId = default
)
{
    [JsonExtensionData]
    public Dictionary<string, object?> AdditionalProperties { get; set; } = new();
}
