namespace ExpenseTrackerApiSdk.Validation;

using ExpenseTrackerApiSdk.Models;
using FluentValidation;
using FluentValidation.Results;

/// <summary>
/// FluentValidation validator for global::ExpenseTrackerApiSdk.Models.AttachReceiptRequest model.
/// Defines validation rules for required fields, formats, ranges, and constraints based on the API schema.
/// Automatically validates instances during request serialization and response deserialization.
/// </summary>
public class AttachReceiptRequestValidator
    : AbstractValidator<global::ExpenseTrackerApiSdk.Models.AttachReceiptRequest>
{
    public AttachReceiptRequestValidator() { }
}
