using System.Text.Json.Serialization;

namespace ExpenseTrackerApiSdk.Models;

public record CreateCategoryRequest(
    [property:
        JsonPropertyName("name"),
        JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)
    ]
        Optional<string?> Name = default,
    [property:
        JsonPropertyName("receiptThreshold"),
        JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)
    ]
        Optional<double?> ReceiptThreshold = default,
    [property:
        JsonPropertyName("active"),
        JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)
    ]
        Optional<bool?> Active = default
)
{
    [JsonExtensionData]
    public Dictionary<string, object?> AdditionalProperties { get; set; } = new();
}
