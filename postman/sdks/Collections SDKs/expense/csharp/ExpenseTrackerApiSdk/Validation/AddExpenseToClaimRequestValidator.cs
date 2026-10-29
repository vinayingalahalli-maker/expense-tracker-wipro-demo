namespace ExpenseTrackerApiSdk.Validation;

using ExpenseTrackerApiSdk.Models;
using FluentValidation;
using FluentValidation.Results;

/// <summary>
/// FluentValidation validator for global::ExpenseTrackerApiSdk.Models.AddExpenseToClaimRequest model.
/// Defines validation rules for required fields, formats, ranges, and constraints based on the API schema.
/// Automatically validates instances during request serialization and response deserialization.
/// </summary>
public class AddExpenseToClaimRequestValidator
    : AbstractValidator<global::ExpenseTrackerApiSdk.Models.AddExpenseToClaimRequest>
{
    public AddExpenseToClaimRequestValidator() { }
}
