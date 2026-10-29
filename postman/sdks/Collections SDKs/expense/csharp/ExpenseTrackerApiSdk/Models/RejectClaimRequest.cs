using System.Text.Json.Serialization;

namespace ExpenseTrackerApiSdk.Models;

public record RejectClaimRequest(
    [property:
        JsonPropertyName("rejectionReason"),
        JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)
    ]
        Optional<string?> RejectionReason = default
)
{
    [JsonExtensionData]
    public Dictionary<string, object?> AdditionalProperties { get; set; } = new();
}
