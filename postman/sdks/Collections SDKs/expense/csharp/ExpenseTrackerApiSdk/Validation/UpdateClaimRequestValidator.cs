namespace ExpenseTrackerApiSdk.Validation;

using ExpenseTrackerApiSdk.Models;
using FluentValidation;
using FluentValidation.Results;

/// <summary>
/// FluentValidation validator for global::ExpenseTrackerApiSdk.Models.UpdateClaimRequest model.
/// Defines validation rules for required fields, formats, ranges, and constraints based on the API schema.
/// Automatically validates instances during request serialization and response deserialization.
/// </summary>
public class UpdateClaimRequestValidator
    : AbstractValidator<global::ExpenseTrackerApiSdk.Models.UpdateClaimRequest>
{
    public UpdateClaimRequestValidator() { }
}
