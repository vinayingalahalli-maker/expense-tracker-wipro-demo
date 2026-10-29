using System.Net.Http.Json;
using ExpenseTrackerApiSdk.Config;
using ExpenseTrackerApiSdk.Http;
using ExpenseTrackerApiSdk.Http.Exceptions;
using ExpenseTrackerApiSdk.Http.Extensions;
using ExpenseTrackerApiSdk.Http.Handlers;
using ExpenseTrackerApiSdk.Http.Serialization;
using ExpenseTrackerApiSdk.Models;
using ExpenseTrackerApiSdk.Validation;
using ExpenseTrackerApiSdk.Validation.Extensions;

namespace ExpenseTrackerApiSdk.Services;

/// <summary>
/// Service class providing access to API endpoints for ExpenseTrackerApiSdkService.
/// Inherits HTTP client management, JSON serialization, and streaming capabilities from the base service.
/// Each method corresponds to an API operation and handles request building, execution, and response parsing.
/// </summary>
public class ExpenseTrackerApiSdkService : BaseService
{
    private RequestConfig? _createCategoryAsyncConfig;
    private RequestConfig? _listCategoriesAsyncConfig;
    private RequestConfig? _getCategoryAsyncConfig;
    private RequestConfig? _updateCategoryAsyncConfig;
    private RequestConfig? _retireCategoryAsyncConfig;
    private RequestConfig? _createExpenseAsyncConfig;
    private RequestConfig? _listExpensesAsyncConfig;
    private RequestConfig? _getExpenseAsyncConfig;
    private RequestConfig? _updateExpenseAsyncConfig;
    private RequestConfig? _deleteExpenseAsyncConfig;
    private RequestConfig? _attachReceiptAsyncConfig;
    private RequestConfig? _removeReceiptAsyncConfig;
    private RequestConfig? _createClaimAsyncConfig;
    private RequestConfig? _listClaimsAsyncConfig;
    private RequestConfig? _getClaimAsyncConfig;
    private RequestConfig? _updateClaimAsyncConfig;
    private RequestConfig? _addExpenseToClaimAsyncConfig;
    private RequestConfig? _removeExpenseFromClaimAsyncConfig;
    private RequestConfig? _submitClaimAsyncConfig;
    private RequestConfig? _approveClaimAsyncConfig;
    private RequestConfig? _rejectClaimAsyncConfig;
    private RequestConfig? _markAsReimbursedAsyncConfig;

    internal ExpenseTrackerApiSdkService(global::ExpenseTrackerApiSdk.Http.Client httpClient)
        : base(httpClient) { }

    /// <summary>
    /// Sets method-level configuration for <c>CreateCategoryAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetCreateCategoryAsyncConfig(RequestConfig config)
    {
        _createCategoryAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>ListCategoriesAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetListCategoriesAsyncConfig(RequestConfig config)
    {
        _listCategoriesAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>GetCategoryAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetGetCategoryAsyncConfig(RequestConfig config)
    {
        _getCategoryAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>UpdateCategoryAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetUpdateCategoryAsyncConfig(RequestConfig config)
    {
        _updateCategoryAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>RetireCategoryAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetRetireCategoryAsyncConfig(RequestConfig config)
    {
        _retireCategoryAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>CreateExpenseAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetCreateExpenseAsyncConfig(RequestConfig config)
    {
        _createExpenseAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>ListExpensesAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetListExpensesAsyncConfig(RequestConfig config)
    {
        _listExpensesAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>GetExpenseAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetGetExpenseAsyncConfig(RequestConfig config)
    {
        _getExpenseAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>UpdateExpenseAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetUpdateExpenseAsyncConfig(RequestConfig config)
    {
        _updateExpenseAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>DeleteExpenseAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetDeleteExpenseAsyncConfig(RequestConfig config)
    {
        _deleteExpenseAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>AttachReceiptAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetAttachReceiptAsyncConfig(RequestConfig config)
    {
        _attachReceiptAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>RemoveReceiptAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetRemoveReceiptAsyncConfig(RequestConfig config)
    {
        _removeReceiptAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>CreateClaimAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetCreateClaimAsyncConfig(RequestConfig config)
    {
        _createClaimAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>ListClaimsAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetListClaimsAsyncConfig(RequestConfig config)
    {
        _listClaimsAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>GetClaimAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetGetClaimAsyncConfig(RequestConfig config)
    {
        _getClaimAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>UpdateClaimAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetUpdateClaimAsyncConfig(RequestConfig config)
    {
        _updateClaimAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>AddExpenseToClaimAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetAddExpenseToClaimAsyncConfig(RequestConfig config)
    {
        _addExpenseToClaimAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>RemoveExpenseFromClaimAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetRemoveExpenseFromClaimAsyncConfig(RequestConfig config)
    {
        _removeExpenseFromClaimAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>SubmitClaimAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetSubmitClaimAsyncConfig(RequestConfig config)
    {
        _submitClaimAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>ApproveClaimAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetApproveClaimAsyncConfig(RequestConfig config)
    {
        _approveClaimAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>RejectClaimAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetRejectClaimAsyncConfig(RequestConfig config)
    {
        _rejectClaimAsyncConfig = config;
        return this;
    }

    /// <summary>
    /// Sets method-level configuration for <c>MarkAsReimbursedAsync</c>.
    /// Method-level config overrides service-level config but is overridden by per-request config.
    /// </summary>
    public ExpenseTrackerApiSdkService SetMarkAsReimbursedAsyncConfig(RequestConfig config)
    {
        _markAsReimbursedAsyncConfig = config;
        return this;
    }

    public async global::System.Threading.Tasks.Task<object> CreateCategoryAsync(
        global::ExpenseTrackerApiSdk.Models.CreateCategoryRequest? input,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        var validationResults = new List<FluentValidation.Results.ValidationResult> { };
        var validator = new CreateCategoryRequestValidator();
        var validationResult = validator.Validate(input);
        validationResults.Add(validationResult);

        var combinedFailures = validationResults.SelectMany(result => result.Errors).ToList();
        if (combinedFailures.Any())
        {
            throw new Http.Exceptions.ValidationException(combinedFailures);
        }

        var resolvedConfig = GetResolvedConfig(_createCategoryAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Post, "categories")
            .SetContentAsJson(input, _jsonSerializerOptions)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    /// <param name="page">Page number (starts at 1)</param>
    /// <param name="pageSize">Number of items per page (max 100)</param>
    /// <param name="active">Filter by active status (true/false)</param>
    public async global::System.Threading.Tasks.Task<object> ListCategoriesAsync(
        string? page = null,
        string? pageSize = null,
        string? active = null,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        var resolvedConfig = GetResolvedConfig(_listCategoriesAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Get, "categories")
            .SetQueryParameter("page", page)
            .SetQueryParameter("pageSize", pageSize)
            .SetQueryParameter("active", active)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    public async global::System.Threading.Tasks.Task<object> GetCategoryAsync(
        string id,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        ArgumentNullException.ThrowIfNull(id, nameof(id));
        var validationResults = new List<FluentValidation.Results.ValidationResult> { };
        var idValidationResult = new StringValidator().ValidateRequired<string>(id);
        if (idValidationResult != null)
        {
            validationResults.Add(idValidationResult);
        }

        var combinedFailures = validationResults.SelectMany(result => result.Errors).ToList();
        if (combinedFailures.Any())
        {
            throw new Http.Exceptions.ValidationException(combinedFailures);
        }

        var resolvedConfig = GetResolvedConfig(_getCategoryAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Get, "categories/{id}")
            .SetPathParameter("id", id)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    public async global::System.Threading.Tasks.Task<object> UpdateCategoryAsync(
        global::ExpenseTrackerApiSdk.Models.UpdateCategoryRequest? input,
        string id,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        ArgumentNullException.ThrowIfNull(id, nameof(id));
        var validationResults = new List<FluentValidation.Results.ValidationResult> { };
        var idValidationResult = new StringValidator().ValidateRequired<string>(id);
        if (idValidationResult != null)
        {
            validationResults.Add(idValidationResult);
        }
        ;
        var validator = new UpdateCategoryRequestValidator();
        var validationResult = validator.Validate(input);
        validationResults.Add(validationResult);

        var combinedFailures = validationResults.SelectMany(result => result.Errors).ToList();
        if (combinedFailures.Any())
        {
            throw new Http.Exceptions.ValidationException(combinedFailures);
        }

        var resolvedConfig = GetResolvedConfig(_updateCategoryAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Put, "categories/{id}")
            .SetPathParameter("id", id)
            .SetContentAsJson(input, _jsonSerializerOptions)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    public async global::System.Threading.Tasks.Task<object> RetireCategoryAsync(
        string id,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        ArgumentNullException.ThrowIfNull(id, nameof(id));
        var validationResults = new List<FluentValidation.Results.ValidationResult> { };
        var idValidationResult = new StringValidator().ValidateRequired<string>(id);
        if (idValidationResult != null)
        {
            validationResults.Add(idValidationResult);
        }

        var combinedFailures = validationResults.SelectMany(result => result.Errors).ToList();
        if (combinedFailures.Any())
        {
            throw new Http.Exceptions.ValidationException(combinedFailures);
        }

        var resolvedConfig = GetResolvedConfig(_retireCategoryAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Patch, "categories/{id}/retire")
            .SetPathParameter("id", id)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    public async global::System.Threading.Tasks.Task<object> CreateExpenseAsync(
        global::ExpenseTrackerApiSdk.Models.CreateExpenseRequest? input,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        var validationResults = new List<FluentValidation.Results.ValidationResult> { };
        var validator = new CreateExpenseRequestValidator();
        var validationResult = validator.Validate(input);
        validationResults.Add(validationResult);

        var combinedFailures = validationResults.SelectMany(result => result.Errors).ToList();
        if (combinedFailures.Any())
        {
            throw new Http.Exceptions.ValidationException(combinedFailures);
        }

        var resolvedConfig = GetResolvedConfig(_createExpenseAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Post, "expenses")
            .SetContentAsJson(input, _jsonSerializerOptions)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    /// <param name="page">Page number (starts at 1)</param>
    /// <param name="pageSize">Number of items per page (max 100)</param>
    /// <param name="dateFrom">Filter by date incurred from (ISO 8601)</param>
    /// <param name="dateTo">Filter by date incurred to (ISO 8601)</param>
    /// <param name="categoryId">Filter by category ID</param>
    /// <param name="inClaim">Filter by claim status (true/false)</param>
    public async global::System.Threading.Tasks.Task<object> ListExpensesAsync(
        string? page = null,
        string? pageSize = null,
        string? dateFrom = null,
        string? dateTo = null,
        string? categoryId = null,
        string? inClaim = null,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        var resolvedConfig = GetResolvedConfig(_listExpensesAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Get, "expenses")
            .SetQueryParameter("page", page)
            .SetQueryParameter("pageSize", pageSize)
            .SetQueryParameter("dateFrom", dateFrom)
            .SetQueryParameter("dateTo", dateTo)
            .SetQueryParameter("categoryId", categoryId)
            .SetQueryParameter("inClaim", inClaim)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    public async global::System.Threading.Tasks.Task<object> GetExpenseAsync(
        string id,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        ArgumentNullException.ThrowIfNull(id, nameof(id));
        var validationResults = new List<FluentValidation.Results.ValidationResult> { };
        var idValidationResult = new StringValidator().ValidateRequired<string>(id);
        if (idValidationResult != null)
        {
            validationResults.Add(idValidationResult);
        }

        var combinedFailures = validationResults.SelectMany(result => result.Errors).ToList();
        if (combinedFailures.Any())
        {
            throw new Http.Exceptions.ValidationException(combinedFailures);
        }

        var resolvedConfig = GetResolvedConfig(_getExpenseAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Get, "expenses/{id}")
            .SetPathParameter("id", id)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    public async global::System.Threading.Tasks.Task<object> UpdateExpenseAsync(
        global::ExpenseTrackerApiSdk.Models.UpdateExpenseRequest? input,
        string id,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        ArgumentNullException.ThrowIfNull(id, nameof(id));
        var validationResults = new List<FluentValidation.Results.ValidationResult> { };
        var idValidationResult = new StringValidator().ValidateRequired<string>(id);
        if (idValidationResult != null)
        {
            validationResults.Add(idValidationResult);
        }
        ;
        var validator = new UpdateExpenseRequestValidator();
        var validationResult = validator.Validate(input);
        validationResults.Add(validationResult);

        var combinedFailures = validationResults.SelectMany(result => result.Errors).ToList();
        if (combinedFailures.Any())
        {
            throw new Http.Exceptions.ValidationException(combinedFailures);
        }

        var resolvedConfig = GetResolvedConfig(_updateExpenseAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Put, "expenses/{id}")
            .SetPathParameter("id", id)
            .SetContentAsJson(input, _jsonSerializerOptions)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    public async global::System.Threading.Tasks.Task<object> DeleteExpenseAsync(
        string id,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        ArgumentNullException.ThrowIfNull(id, nameof(id));
        var validationResults = new List<FluentValidation.Results.ValidationResult> { };
        var idValidationResult = new StringValidator().ValidateRequired<string>(id);
        if (idValidationResult != null)
        {
            validationResults.Add(idValidationResult);
        }

        var combinedFailures = validationResults.SelectMany(result => result.Errors).ToList();
        if (combinedFailures.Any())
        {
            throw new Http.Exceptions.ValidationException(combinedFailures);
        }

        var resolvedConfig = GetResolvedConfig(_deleteExpenseAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Delete, "expenses/{id}")
            .SetPathParameter("id", id)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    public async global::System.Threading.Tasks.Task<object> AttachReceiptAsync(
        global::ExpenseTrackerApiSdk.Models.AttachReceiptRequest? input,
        string id,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        ArgumentNullException.ThrowIfNull(id, nameof(id));
        var validationResults = new List<FluentValidation.Results.ValidationResult> { };
        var idValidationResult = new StringValidator().ValidateRequired<string>(id);
        if (idValidationResult != null)
        {
            validationResults.Add(idValidationResult);
        }
        ;
        var validator = new AttachReceiptRequestValidator();
        var validationResult = validator.Validate(input);
        validationResults.Add(validationResult);

        var combinedFailures = validationResults.SelectMany(result => result.Errors).ToList();
        if (combinedFailures.Any())
        {
            throw new Http.Exceptions.ValidationException(combinedFailures);
        }

        var resolvedConfig = GetResolvedConfig(_attachReceiptAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Post, "expenses/{id}/receipts")
            .SetPathParameter("id", id)
            .SetContentAsJson(input, _jsonSerializerOptions)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    public async global::System.Threading.Tasks.Task<object> RemoveReceiptAsync(
        string id,
        string receiptId,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        ArgumentNullException.ThrowIfNull(id, nameof(id));
        ArgumentNullException.ThrowIfNull(receiptId, nameof(receiptId));
        var validationResults = new List<FluentValidation.Results.ValidationResult> { };
        var idValidationResult = new StringValidator().ValidateRequired<string>(id);
        if (idValidationResult != null)
        {
            validationResults.Add(idValidationResult);
        }
        ;
        var receiptIdValidationResult = new StringValidator().ValidateRequired<string>(receiptId);
        if (receiptIdValidationResult != null)
        {
            validationResults.Add(receiptIdValidationResult);
        }

        var combinedFailures = validationResults.SelectMany(result => result.Errors).ToList();
        if (combinedFailures.Any())
        {
            throw new Http.Exceptions.ValidationException(combinedFailures);
        }

        var resolvedConfig = GetResolvedConfig(_removeReceiptAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Delete, "expenses/{id}/receipts/{receiptId}")
            .SetPathParameter("id", id)
            .SetPathParameter("receiptId", receiptId)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    public async global::System.Threading.Tasks.Task<object> CreateClaimAsync(
        global::ExpenseTrackerApiSdk.Models.CreateClaimRequest? input,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        var validationResults = new List<FluentValidation.Results.ValidationResult> { };
        var validator = new CreateClaimRequestValidator();
        var validationResult = validator.Validate(input);
        validationResults.Add(validationResult);

        var combinedFailures = validationResults.SelectMany(result => result.Errors).ToList();
        if (combinedFailures.Any())
        {
            throw new Http.Exceptions.ValidationException(combinedFailures);
        }

        var resolvedConfig = GetResolvedConfig(_createClaimAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Post, "claims")
            .SetContentAsJson(input, _jsonSerializerOptions)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    /// <param name="page">Page number (starts at 1)</param>
    /// <param name="pageSize">Number of items per page (max 100)</param>
    /// <param name="status">Filter by status (draft, submitted, approved, rejected, reimbursed)</param>
    public async global::System.Threading.Tasks.Task<object> ListClaimsAsync(
        string? page = null,
        string? pageSize = null,
        string? status = null,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        var resolvedConfig = GetResolvedConfig(_listClaimsAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Get, "claims")
            .SetQueryParameter("page", page)
            .SetQueryParameter("pageSize", pageSize)
            .SetQueryParameter("status", status)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    public async global::System.Threading.Tasks.Task<object> GetClaimAsync(
        string id,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        ArgumentNullException.ThrowIfNull(id, nameof(id));
        var validationResults = new List<FluentValidation.Results.ValidationResult> { };
        var idValidationResult = new StringValidator().ValidateRequired<string>(id);
        if (idValidationResult != null)
        {
            validationResults.Add(idValidationResult);
        }

        var combinedFailures = validationResults.SelectMany(result => result.Errors).ToList();
        if (combinedFailures.Any())
        {
            throw new Http.Exceptions.ValidationException(combinedFailures);
        }

        var resolvedConfig = GetResolvedConfig(_getClaimAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Get, "claims/{id}")
            .SetPathParameter("id", id)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    public async global::System.Threading.Tasks.Task<object> UpdateClaimAsync(
        global::ExpenseTrackerApiSdk.Models.UpdateClaimRequest? input,
        string id,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        ArgumentNullException.ThrowIfNull(id, nameof(id));
        var validationResults = new List<FluentValidation.Results.ValidationResult> { };
        var idValidationResult = new StringValidator().ValidateRequired<string>(id);
        if (idValidationResult != null)
        {
            validationResults.Add(idValidationResult);
        }
        ;
        var validator = new UpdateClaimRequestValidator();
        var validationResult = validator.Validate(input);
        validationResults.Add(validationResult);

        var combinedFailures = validationResults.SelectMany(result => result.Errors).ToList();
        if (combinedFailures.Any())
        {
            throw new Http.Exceptions.ValidationException(combinedFailures);
        }

        var resolvedConfig = GetResolvedConfig(_updateClaimAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Put, "claims/{id}")
            .SetPathParameter("id", id)
            .SetContentAsJson(input, _jsonSerializerOptions)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    public async global::System.Threading.Tasks.Task<object> AddExpenseToClaimAsync(
        global::ExpenseTrackerApiSdk.Models.AddExpenseToClaimRequest? input,
        string id,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        ArgumentNullException.ThrowIfNull(id, nameof(id));
        var validationResults = new List<FluentValidation.Results.ValidationResult> { };
        var idValidationResult = new StringValidator().ValidateRequired<string>(id);
        if (idValidationResult != null)
        {
            validationResults.Add(idValidationResult);
        }
        ;
        var validator = new AddExpenseToClaimRequestValidator();
        var validationResult = validator.Validate(input);
        validationResults.Add(validationResult);

        var combinedFailures = validationResults.SelectMany(result => result.Errors).ToList();
        if (combinedFailures.Any())
        {
            throw new Http.Exceptions.ValidationException(combinedFailures);
        }

        var resolvedConfig = GetResolvedConfig(_addExpenseToClaimAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Post, "claims/{id}/expenses")
            .SetPathParameter("id", id)
            .SetContentAsJson(input, _jsonSerializerOptions)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    public async global::System.Threading.Tasks.Task<object> RemoveExpenseFromClaimAsync(
        string id,
        string expenseId,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        ArgumentNullException.ThrowIfNull(id, nameof(id));
        ArgumentNullException.ThrowIfNull(expenseId, nameof(expenseId));
        var validationResults = new List<FluentValidation.Results.ValidationResult> { };
        var idValidationResult = new StringValidator().ValidateRequired<string>(id);
        if (idValidationResult != null)
        {
            validationResults.Add(idValidationResult);
        }
        ;
        var expenseIdValidationResult = new StringValidator().ValidateRequired<string>(expenseId);
        if (expenseIdValidationResult != null)
        {
            validationResults.Add(expenseIdValidationResult);
        }

        var combinedFailures = validationResults.SelectMany(result => result.Errors).ToList();
        if (combinedFailures.Any())
        {
            throw new Http.Exceptions.ValidationException(combinedFailures);
        }

        var resolvedConfig = GetResolvedConfig(_removeExpenseFromClaimAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Delete, "claims/{id}/expenses/{expenseId}")
            .SetPathParameter("id", id)
            .SetPathParameter("expenseId", expenseId)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    public async global::System.Threading.Tasks.Task<object> SubmitClaimAsync(
        string id,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        ArgumentNullException.ThrowIfNull(id, nameof(id));
        var validationResults = new List<FluentValidation.Results.ValidationResult> { };
        var idValidationResult = new StringValidator().ValidateRequired<string>(id);
        if (idValidationResult != null)
        {
            validationResults.Add(idValidationResult);
        }

        var combinedFailures = validationResults.SelectMany(result => result.Errors).ToList();
        if (combinedFailures.Any())
        {
            throw new Http.Exceptions.ValidationException(combinedFailures);
        }

        var resolvedConfig = GetResolvedConfig(_submitClaimAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Post, "claims/{id}/submit")
            .SetPathParameter("id", id)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    public async global::System.Threading.Tasks.Task<object> ApproveClaimAsync(
        string id,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        ArgumentNullException.ThrowIfNull(id, nameof(id));
        var validationResults = new List<FluentValidation.Results.ValidationResult> { };
        var idValidationResult = new StringValidator().ValidateRequired<string>(id);
        if (idValidationResult != null)
        {
            validationResults.Add(idValidationResult);
        }

        var combinedFailures = validationResults.SelectMany(result => result.Errors).ToList();
        if (combinedFailures.Any())
        {
            throw new Http.Exceptions.ValidationException(combinedFailures);
        }

        var resolvedConfig = GetResolvedConfig(_approveClaimAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Post, "claims/{id}/approve")
            .SetPathParameter("id", id)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    public async global::System.Threading.Tasks.Task<object> RejectClaimAsync(
        global::ExpenseTrackerApiSdk.Models.RejectClaimRequest? input,
        string id,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        ArgumentNullException.ThrowIfNull(id, nameof(id));
        var validationResults = new List<FluentValidation.Results.ValidationResult> { };
        var idValidationResult = new StringValidator().ValidateRequired<string>(id);
        if (idValidationResult != null)
        {
            validationResults.Add(idValidationResult);
        }
        ;
        var validator = new RejectClaimRequestValidator();
        var validationResult = validator.Validate(input);
        validationResults.Add(validationResult);

        var combinedFailures = validationResults.SelectMany(result => result.Errors).ToList();
        if (combinedFailures.Any())
        {
            throw new Http.Exceptions.ValidationException(combinedFailures);
        }

        var resolvedConfig = GetResolvedConfig(_rejectClaimAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Post, "claims/{id}/reject")
            .SetPathParameter("id", id)
            .SetContentAsJson(input, _jsonSerializerOptions)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }

    public async global::System.Threading.Tasks.Task<object> MarkAsReimbursedAsync(
        string id,
        RequestConfig? requestConfig = null,
        CancellationToken cancellationToken = default
    )
    {
        ArgumentNullException.ThrowIfNull(id, nameof(id));
        var validationResults = new List<FluentValidation.Results.ValidationResult> { };
        var idValidationResult = new StringValidator().ValidateRequired<string>(id);
        if (idValidationResult != null)
        {
            validationResults.Add(idValidationResult);
        }

        var combinedFailures = validationResults.SelectMany(result => result.Errors).ToList();
        if (combinedFailures.Any())
        {
            throw new Http.Exceptions.ValidationException(combinedFailures);
        }

        var resolvedConfig = GetResolvedConfig(_markAsReimbursedAsyncConfig, requestConfig);

        var request = new RequestBuilder(HttpMethod.Post, "claims/{id}/reimburse")
            .SetPathParameter("id", id)
            .Build();

        var response = await ExecuteAsync(request, resolvedConfig, cancellationToken)
            .ConfigureAwait(false);

        // Standard deserialization
        var responseContent = response.Content;
        var responseContentLength = responseContent.Headers.ContentLength;

        object result;
        if (responseContentLength == null || responseContentLength > 0)
        {
            result =
                await responseContent
                    .ReadFromJsonAsync<object>(_jsonSerializerOptions, cancellationToken)
                    .ConfigureAwait(false)
                ?? throw new Exception("Failed to deserialize response.");
        }
        else
        {
            // Empty response body - return default instance
            result = default!;
        }

        return result;
    }
}
