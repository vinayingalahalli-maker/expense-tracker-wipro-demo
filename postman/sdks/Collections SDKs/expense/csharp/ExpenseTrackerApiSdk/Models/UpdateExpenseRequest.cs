using System.Text.Json.Serialization;

namespace ExpenseTrackerApiSdk.Models;

public record UpdateExpenseRequest(
    [property:
        JsonPropertyName("amount"),
        JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)
    ]
        Optional<double?> Amount = default,
    [property:
        JsonPropertyName("currency"),
        JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)
    ]
        Optional<string?> Currency = default,
    [property:
        JsonPropertyName("amountEur"),
        JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)
    ]
        Optional<double?> AmountEur = default,
    [property:
        JsonPropertyName("dateIncurred"),
        JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)
    ]
        Optional<string?> DateIncurred = default,
    [property:
        JsonPropertyName("categoryId"),
        JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)
    ]
        Optional<string?> CategoryId = default,
    [property:
        JsonPropertyName("description"),
        JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)
    ]
        Optional<string?> Description = default,
    [property:
        JsonPropertyName("paymentMethod"),
        JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)
    ]
        Optional<string?> PaymentMethod = default,
    [property:
        JsonPropertyName("clientReference"),
        JsonIgnore(Condition = JsonIgnoreCondition.WhenWritingDefault)
    ]
        Optional<string?> ClientReference = default
)
{
    [JsonExtensionData]
    public Dictionary<string, object?> AdditionalProperties { get; set; } = new();
}
