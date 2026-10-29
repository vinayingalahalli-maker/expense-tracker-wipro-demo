using System.Text.Json.Serialization;

namespace ExpenseTrackerApiSdk.Models;

public record CreateClaimRequest(
    [property:
        JsonPropertyName("title"),
        JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)
    ]
        Optional<string?> Title = default,
    [property:
        JsonPropertyName("expenseIds"),
        JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)
    ]
        Optional<List<object>?> ExpenseIds = default
)
{
    [JsonExtensionData]
    public Dictionary<string, object?> AdditionalProperties { get; set; } = new();
}
