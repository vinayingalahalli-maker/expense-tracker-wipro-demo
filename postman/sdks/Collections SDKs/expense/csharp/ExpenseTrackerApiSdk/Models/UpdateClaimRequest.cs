using System.Text.Json.Serialization;

namespace ExpenseTrackerApiSdk.Models;

public record UpdateClaimRequest(
    [property:
        JsonPropertyName("title"),
        JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)
    ]
        Optional<string?> Title = default
)
{
    [JsonExtensionData]
    public Dictionary<string, object?> AdditionalProperties { get; set; } = new();
}
