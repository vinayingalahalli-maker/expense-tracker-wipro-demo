using System.Text.Json.Serialization;

namespace ExpenseTrackerApiSdk.Models;

public record AttachReceiptRequest(
    [property:
        JsonPropertyName("receiptUrl"),
        JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)
    ]
        Optional<string?> ReceiptUrl = default,
    [property:
        JsonPropertyName("fileName"),
        JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)
    ]
        Optional<string?> FileName = default,
    [property:
        JsonPropertyName("contentType"),
        JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)
    ]
        Optional<string?> ContentType = default,
    [property:
        JsonPropertyName("sizeBytes"),
        JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)
    ]
        Optional<double?> SizeBytes = default
)
{
    [JsonExtensionData]
    public Dictionary<string, object?> AdditionalProperties { get; set; } = new();
}
