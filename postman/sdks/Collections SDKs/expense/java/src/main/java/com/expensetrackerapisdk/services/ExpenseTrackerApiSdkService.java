package com.expensetrackerapisdk.services;

import com.expensetrackerapisdk.config.ExpenseTrackerApiSdkConfig;
import com.expensetrackerapisdk.config.RequestConfig;
import com.expensetrackerapisdk.exceptions.ApiError;
import com.expensetrackerapisdk.http.Environment;
import com.expensetrackerapisdk.http.ExpenseTrackerApiSdkResponse;
import com.expensetrackerapisdk.http.HttpMethod;
import com.expensetrackerapisdk.http.ModelConverter;
import com.expensetrackerapisdk.http.util.RequestBuilder;
import com.expensetrackerapisdk.models.AddExpenseToClaimRequest;
import com.expensetrackerapisdk.models.AttachReceiptRequest;
import com.expensetrackerapisdk.models.CreateCategoryRequest;
import com.expensetrackerapisdk.models.CreateClaimRequest;
import com.expensetrackerapisdk.models.CreateExpenseRequest;
import com.expensetrackerapisdk.models.ListCategoriesParameters;
import com.expensetrackerapisdk.models.ListClaimsParameters;
import com.expensetrackerapisdk.models.ListExpensesParameters;
import com.expensetrackerapisdk.models.RejectClaimRequest;
import com.expensetrackerapisdk.models.UpdateCategoryRequest;
import com.expensetrackerapisdk.models.UpdateClaimRequest;
import com.expensetrackerapisdk.models.UpdateExpenseRequest;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import lombok.NonNull;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * ExpenseTrackerApiSdkService Service
 */
public class ExpenseTrackerApiSdkService extends BaseService {

  private RequestConfig createCategoryConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig listCategoriesConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig getCategoryConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig updateCategoryConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig retireCategoryConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig createExpenseConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig listExpensesConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig getExpenseConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig updateExpenseConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig deleteExpenseConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig attachReceiptConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig removeReceiptConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig createClaimConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig listClaimsConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig getClaimConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig updateClaimConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig addExpenseToClaimConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig removeExpenseFromClaimConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig submitClaimConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig approveClaimConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig rejectClaimConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();
  private RequestConfig markAsReimbursedConfig = RequestConfig.builder()
    .environment(Environment.API)
    .build();

  /**
   * Constructs a new instance of ExpenseTrackerApiSdkService.
   *
   * @param httpClient The HTTP client to use for requests
   * @param config The SDK configuration
   */
  public ExpenseTrackerApiSdkService(
    @NonNull OkHttpClient httpClient,
    ExpenseTrackerApiSdkConfig config
  ) {
    super(httpClient, config);
  }

  /**
   * Sets method-level configuration for {@code createCategory}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setCreateCategoryConfig(RequestConfig config) {
    this.createCategoryConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code listCategories}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setListCategoriesConfig(RequestConfig config) {
    this.listCategoriesConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code getCategory}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setGetCategoryConfig(RequestConfig config) {
    this.getCategoryConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code updateCategory}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setUpdateCategoryConfig(RequestConfig config) {
    this.updateCategoryConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code retireCategory}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setRetireCategoryConfig(RequestConfig config) {
    this.retireCategoryConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code createExpense}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setCreateExpenseConfig(RequestConfig config) {
    this.createExpenseConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code listExpenses}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setListExpensesConfig(RequestConfig config) {
    this.listExpensesConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code getExpense}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setGetExpenseConfig(RequestConfig config) {
    this.getExpenseConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code updateExpense}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setUpdateExpenseConfig(RequestConfig config) {
    this.updateExpenseConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code deleteExpense}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setDeleteExpenseConfig(RequestConfig config) {
    this.deleteExpenseConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code attachReceipt}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setAttachReceiptConfig(RequestConfig config) {
    this.attachReceiptConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code removeReceipt}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setRemoveReceiptConfig(RequestConfig config) {
    this.removeReceiptConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code createClaim}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setCreateClaimConfig(RequestConfig config) {
    this.createClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code listClaims}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setListClaimsConfig(RequestConfig config) {
    this.listClaimsConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code getClaim}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setGetClaimConfig(RequestConfig config) {
    this.getClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code updateClaim}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setUpdateClaimConfig(RequestConfig config) {
    this.updateClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code addExpenseToClaim}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setAddExpenseToClaimConfig(RequestConfig config) {
    this.addExpenseToClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code removeExpenseFromClaim}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setRemoveExpenseFromClaimConfig(RequestConfig config) {
    this.removeExpenseFromClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code submitClaim}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setSubmitClaimConfig(RequestConfig config) {
    this.submitClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code approveClaim}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setApproveClaimConfig(RequestConfig config) {
    this.approveClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code rejectClaim}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setRejectClaimConfig(RequestConfig config) {
    this.rejectClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for {@code markAsReimbursed}.
   * Method-level overrides take precedence over service-level configuration but are
   * overridden by request-level configurations.
   *
   * @param config The configuration overrides to apply at the method level
   * @return This service instance for method chaining
   */
  public ExpenseTrackerApiSdkService setMarkAsReimbursedConfig(RequestConfig config) {
    this.markAsReimbursedConfig = config;
    return this;
  }

  /**
   * Method createCategory
   * POST /categories
   *
   * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
   * @return response of {@code Object}
   */
  public Object createCategory(@NonNull CreateCategoryRequest createCategoryRequest)
    throws ApiError {
    return this.createCategory(createCategoryRequest, null);
  }

  /**
   * Method createCategory
   * POST /categories
   *
   * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
   * @return response of {@code Object}
   */
  public Object createCategory(
    @NonNull CreateCategoryRequest createCategoryRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse().createCategory(createCategoryRequest, requestConfig).getData();
  }

  /**
   * Method createCategory
   * POST /categories
   *
   * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> createCategoryAsync(
    @NonNull CreateCategoryRequest createCategoryRequest
  ) throws ApiError {
    return this.createCategoryAsync(createCategoryRequest, null);
  }

  /**
   * Method createCategory
   * POST /categories
   *
   * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> createCategoryAsync(
    @NonNull CreateCategoryRequest createCategoryRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .createCategoryAsync(createCategoryRequest, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildCreateCategoryRequest(
    @NonNull CreateCategoryRequest createCategoryRequest,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.POST,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "categories"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setJsonContent(createCategoryRequest)
      .build();
  }

  /**
   * Method listCategories
   * GET /categories
   *
   * @return response of {@code Object}
   */
  public Object listCategories() throws ApiError {
    return this.listCategories(ListCategoriesParameters.builder().build());
  }

  /**
   * Method listCategories
   * GET /categories
   *
   * @param requestParameters {@link ListCategoriesParameters} Request Parameters Object
   * @return response of {@code Object}
   */
  public Object listCategories(@NonNull ListCategoriesParameters requestParameters)
    throws ApiError {
    return this.listCategories(requestParameters, null);
  }

  /**
   * Method listCategories
   * GET /categories
   *
   * @param requestParameters {@link ListCategoriesParameters} Request Parameters Object
   * @return response of {@code Object}
   */
  public Object listCategories(
    @NonNull ListCategoriesParameters requestParameters,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse().listCategories(requestParameters, requestConfig).getData();
  }

  /**
   * Method listCategories
   * GET /categories
   *
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> listCategoriesAsync() throws ApiError {
    return this.listCategoriesAsync(ListCategoriesParameters.builder().build());
  }

  /**
   * Method listCategories
   * GET /categories
   *
   * @param requestParameters {@link ListCategoriesParameters} Request Parameters Object
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> listCategoriesAsync(
    @NonNull ListCategoriesParameters requestParameters
  ) throws ApiError {
    return this.listCategoriesAsync(requestParameters, null);
  }

  /**
   * Method listCategories
   * GET /categories
   *
   * @param requestParameters {@link ListCategoriesParameters} Request Parameters Object
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> listCategoriesAsync(
    @NonNull ListCategoriesParameters requestParameters,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .listCategoriesAsync(requestParameters, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildListCategoriesRequest(
    @NonNull ListCategoriesParameters requestParameters,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.GET,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "categories"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setOptionalQueryParameter("page", requestParameters.getPage())
      .setOptionalQueryParameter("pageSize", requestParameters.getPageSize())
      .setOptionalQueryParameter("active", requestParameters.getActive())
      .build();
  }

  /**
   * Method getCategory
   * GET /categories/{id}
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object getCategory(@NonNull String id) throws ApiError {
    return this.getCategory(id, null);
  }

  /**
   * Method getCategory
   * GET /categories/{id}
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object getCategory(@NonNull String id, RequestConfig requestConfig) throws ApiError {
    return withRawResponse().getCategory(id, requestConfig).getData();
  }

  /**
   * Method getCategory
   * GET /categories/{id}
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getCategoryAsync(@NonNull String id) throws ApiError {
    return this.getCategoryAsync(id, null);
  }

  /**
   * Method getCategory
   * GET /categories/{id}
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getCategoryAsync(
    @NonNull String id,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .getCategoryAsync(id, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildGetCategoryRequest(@NonNull String id, RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.GET,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "categories/{id}"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .build();
  }

  /**
   * Method updateCategory
   * PUT /categories/{id}
   *
   * @param id String
   * @param updateCategoryRequest {@link UpdateCategoryRequest} Request Body
   * @return response of {@code Object}
   */
  public Object updateCategory(
    @NonNull String id,
    @NonNull UpdateCategoryRequest updateCategoryRequest
  ) throws ApiError {
    return this.updateCategory(id, updateCategoryRequest, null);
  }

  /**
   * Method updateCategory
   * PUT /categories/{id}
   *
   * @param id String
   * @param updateCategoryRequest {@link UpdateCategoryRequest} Request Body
   * @return response of {@code Object}
   */
  public Object updateCategory(
    @NonNull String id,
    @NonNull UpdateCategoryRequest updateCategoryRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse().updateCategory(id, updateCategoryRequest, requestConfig).getData();
  }

  /**
   * Method updateCategory
   * PUT /categories/{id}
   *
   * @param id String
   * @param updateCategoryRequest {@link UpdateCategoryRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> updateCategoryAsync(
    @NonNull String id,
    @NonNull UpdateCategoryRequest updateCategoryRequest
  ) throws ApiError {
    return this.updateCategoryAsync(id, updateCategoryRequest, null);
  }

  /**
   * Method updateCategory
   * PUT /categories/{id}
   *
   * @param id String
   * @param updateCategoryRequest {@link UpdateCategoryRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> updateCategoryAsync(
    @NonNull String id,
    @NonNull UpdateCategoryRequest updateCategoryRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .updateCategoryAsync(id, updateCategoryRequest, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildUpdateCategoryRequest(
    @NonNull String id,
    @NonNull UpdateCategoryRequest updateCategoryRequest,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.PUT,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "categories/{id}"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .setJsonContent(updateCategoryRequest)
      .build();
  }

  /**
   * Method retireCategory
   * PATCH /categories/{id}/retire
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object retireCategory(@NonNull String id) throws ApiError {
    return this.retireCategory(id, null);
  }

  /**
   * Method retireCategory
   * PATCH /categories/{id}/retire
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object retireCategory(@NonNull String id, RequestConfig requestConfig) throws ApiError {
    return withRawResponse().retireCategory(id, requestConfig).getData();
  }

  /**
   * Method retireCategory
   * PATCH /categories/{id}/retire
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> retireCategoryAsync(@NonNull String id) throws ApiError {
    return this.retireCategoryAsync(id, null);
  }

  /**
   * Method retireCategory
   * PATCH /categories/{id}/retire
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> retireCategoryAsync(
    @NonNull String id,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .retireCategoryAsync(id, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildRetireCategoryRequest(@NonNull String id, RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.PATCH,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "categories/{id}/retire"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .build();
  }

  /**
   * Method createExpense
   * POST /expenses
   *
   * @param createExpenseRequest {@link CreateExpenseRequest} Request Body
   * @return response of {@code Object}
   */
  public Object createExpense(@NonNull CreateExpenseRequest createExpenseRequest) throws ApiError {
    return this.createExpense(createExpenseRequest, null);
  }

  /**
   * Method createExpense
   * POST /expenses
   *
   * @param createExpenseRequest {@link CreateExpenseRequest} Request Body
   * @return response of {@code Object}
   */
  public Object createExpense(
    @NonNull CreateExpenseRequest createExpenseRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse().createExpense(createExpenseRequest, requestConfig).getData();
  }

  /**
   * Method createExpense
   * POST /expenses
   *
   * @param createExpenseRequest {@link CreateExpenseRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> createExpenseAsync(
    @NonNull CreateExpenseRequest createExpenseRequest
  ) throws ApiError {
    return this.createExpenseAsync(createExpenseRequest, null);
  }

  /**
   * Method createExpense
   * POST /expenses
   *
   * @param createExpenseRequest {@link CreateExpenseRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> createExpenseAsync(
    @NonNull CreateExpenseRequest createExpenseRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .createExpenseAsync(createExpenseRequest, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildCreateExpenseRequest(
    @NonNull CreateExpenseRequest createExpenseRequest,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.POST,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "expenses"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setJsonContent(createExpenseRequest)
      .build();
  }

  /**
   * Method listExpenses
   * GET /expenses
   *
   * @return response of {@code Object}
   */
  public Object listExpenses() throws ApiError {
    return this.listExpenses(ListExpensesParameters.builder().build());
  }

  /**
   * Method listExpenses
   * GET /expenses
   *
   * @param requestParameters {@link ListExpensesParameters} Request Parameters Object
   * @return response of {@code Object}
   */
  public Object listExpenses(@NonNull ListExpensesParameters requestParameters) throws ApiError {
    return this.listExpenses(requestParameters, null);
  }

  /**
   * Method listExpenses
   * GET /expenses
   *
   * @param requestParameters {@link ListExpensesParameters} Request Parameters Object
   * @return response of {@code Object}
   */
  public Object listExpenses(
    @NonNull ListExpensesParameters requestParameters,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse().listExpenses(requestParameters, requestConfig).getData();
  }

  /**
   * Method listExpenses
   * GET /expenses
   *
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> listExpensesAsync() throws ApiError {
    return this.listExpensesAsync(ListExpensesParameters.builder().build());
  }

  /**
   * Method listExpenses
   * GET /expenses
   *
   * @param requestParameters {@link ListExpensesParameters} Request Parameters Object
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> listExpensesAsync(
    @NonNull ListExpensesParameters requestParameters
  ) throws ApiError {
    return this.listExpensesAsync(requestParameters, null);
  }

  /**
   * Method listExpenses
   * GET /expenses
   *
   * @param requestParameters {@link ListExpensesParameters} Request Parameters Object
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> listExpensesAsync(
    @NonNull ListExpensesParameters requestParameters,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .listExpensesAsync(requestParameters, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildListExpensesRequest(
    @NonNull ListExpensesParameters requestParameters,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.GET,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "expenses"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setOptionalQueryParameter("page", requestParameters.getPage())
      .setOptionalQueryParameter("pageSize", requestParameters.getPageSize())
      .setOptionalQueryParameter("dateFrom", requestParameters.getDateFrom())
      .setOptionalQueryParameter("dateTo", requestParameters.getDateTo())
      .setOptionalQueryParameter("categoryId", requestParameters.getCategoryId())
      .setOptionalQueryParameter("inClaim", requestParameters.getInClaim())
      .build();
  }

  /**
   * Method getExpense
   * GET /expenses/{id}
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object getExpense(@NonNull String id) throws ApiError {
    return this.getExpense(id, null);
  }

  /**
   * Method getExpense
   * GET /expenses/{id}
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object getExpense(@NonNull String id, RequestConfig requestConfig) throws ApiError {
    return withRawResponse().getExpense(id, requestConfig).getData();
  }

  /**
   * Method getExpense
   * GET /expenses/{id}
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getExpenseAsync(@NonNull String id) throws ApiError {
    return this.getExpenseAsync(id, null);
  }

  /**
   * Method getExpense
   * GET /expenses/{id}
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getExpenseAsync(@NonNull String id, RequestConfig requestConfig)
    throws ApiError {
    return withRawResponse()
      .getExpenseAsync(id, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildGetExpenseRequest(@NonNull String id, RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.GET,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "expenses/{id}"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .build();
  }

  /**
   * Method updateExpense
   * PUT /expenses/{id}
   *
   * @param id String
   * @param updateExpenseRequest {@link UpdateExpenseRequest} Request Body
   * @return response of {@code Object}
   */
  public Object updateExpense(
    @NonNull String id,
    @NonNull UpdateExpenseRequest updateExpenseRequest
  ) throws ApiError {
    return this.updateExpense(id, updateExpenseRequest, null);
  }

  /**
   * Method updateExpense
   * PUT /expenses/{id}
   *
   * @param id String
   * @param updateExpenseRequest {@link UpdateExpenseRequest} Request Body
   * @return response of {@code Object}
   */
  public Object updateExpense(
    @NonNull String id,
    @NonNull UpdateExpenseRequest updateExpenseRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse().updateExpense(id, updateExpenseRequest, requestConfig).getData();
  }

  /**
   * Method updateExpense
   * PUT /expenses/{id}
   *
   * @param id String
   * @param updateExpenseRequest {@link UpdateExpenseRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> updateExpenseAsync(
    @NonNull String id,
    @NonNull UpdateExpenseRequest updateExpenseRequest
  ) throws ApiError {
    return this.updateExpenseAsync(id, updateExpenseRequest, null);
  }

  /**
   * Method updateExpense
   * PUT /expenses/{id}
   *
   * @param id String
   * @param updateExpenseRequest {@link UpdateExpenseRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> updateExpenseAsync(
    @NonNull String id,
    @NonNull UpdateExpenseRequest updateExpenseRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .updateExpenseAsync(id, updateExpenseRequest, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildUpdateExpenseRequest(
    @NonNull String id,
    @NonNull UpdateExpenseRequest updateExpenseRequest,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.PUT,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "expenses/{id}"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .setJsonContent(updateExpenseRequest)
      .build();
  }

  /**
   * Method deleteExpense
   * DELETE /expenses/{id}
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object deleteExpense(@NonNull String id) throws ApiError {
    return this.deleteExpense(id, null);
  }

  /**
   * Method deleteExpense
   * DELETE /expenses/{id}
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object deleteExpense(@NonNull String id, RequestConfig requestConfig) throws ApiError {
    return withRawResponse().deleteExpense(id, requestConfig).getData();
  }

  /**
   * Method deleteExpense
   * DELETE /expenses/{id}
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> deleteExpenseAsync(@NonNull String id) throws ApiError {
    return this.deleteExpenseAsync(id, null);
  }

  /**
   * Method deleteExpense
   * DELETE /expenses/{id}
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> deleteExpenseAsync(
    @NonNull String id,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .deleteExpenseAsync(id, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildDeleteExpenseRequest(@NonNull String id, RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.DELETE,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "expenses/{id}"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .build();
  }

  /**
   * Method attachReceipt
   * POST /expenses/{id}/receipts
   *
   * @param id String
   * @param attachReceiptRequest {@link AttachReceiptRequest} Request Body
   * @return response of {@code Object}
   */
  public Object attachReceipt(
    @NonNull String id,
    @NonNull AttachReceiptRequest attachReceiptRequest
  ) throws ApiError {
    return this.attachReceipt(id, attachReceiptRequest, null);
  }

  /**
   * Method attachReceipt
   * POST /expenses/{id}/receipts
   *
   * @param id String
   * @param attachReceiptRequest {@link AttachReceiptRequest} Request Body
   * @return response of {@code Object}
   */
  public Object attachReceipt(
    @NonNull String id,
    @NonNull AttachReceiptRequest attachReceiptRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse().attachReceipt(id, attachReceiptRequest, requestConfig).getData();
  }

  /**
   * Method attachReceipt
   * POST /expenses/{id}/receipts
   *
   * @param id String
   * @param attachReceiptRequest {@link AttachReceiptRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> attachReceiptAsync(
    @NonNull String id,
    @NonNull AttachReceiptRequest attachReceiptRequest
  ) throws ApiError {
    return this.attachReceiptAsync(id, attachReceiptRequest, null);
  }

  /**
   * Method attachReceipt
   * POST /expenses/{id}/receipts
   *
   * @param id String
   * @param attachReceiptRequest {@link AttachReceiptRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> attachReceiptAsync(
    @NonNull String id,
    @NonNull AttachReceiptRequest attachReceiptRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .attachReceiptAsync(id, attachReceiptRequest, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildAttachReceiptRequest(
    @NonNull String id,
    @NonNull AttachReceiptRequest attachReceiptRequest,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.POST,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "expenses/{id}/receipts"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .setJsonContent(attachReceiptRequest)
      .build();
  }

  /**
   * Method removeReceipt
   * DELETE /expenses/{id}/receipts/{receiptId}
   *
   * @param id String
   * @param receiptId String
   * @return response of {@code Object}
   */
  public Object removeReceipt(@NonNull String id, @NonNull String receiptId) throws ApiError {
    return this.removeReceipt(id, receiptId, null);
  }

  /**
   * Method removeReceipt
   * DELETE /expenses/{id}/receipts/{receiptId}
   *
   * @param id String
   * @param receiptId String
   * @return response of {@code Object}
   */
  public Object removeReceipt(
    @NonNull String id,
    @NonNull String receiptId,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse().removeReceipt(id, receiptId, requestConfig).getData();
  }

  /**
   * Method removeReceipt
   * DELETE /expenses/{id}/receipts/{receiptId}
   *
   * @param id String
   * @param receiptId String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> removeReceiptAsync(
    @NonNull String id,
    @NonNull String receiptId
  ) throws ApiError {
    return this.removeReceiptAsync(id, receiptId, null);
  }

  /**
   * Method removeReceipt
   * DELETE /expenses/{id}/receipts/{receiptId}
   *
   * @param id String
   * @param receiptId String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> removeReceiptAsync(
    @NonNull String id,
    @NonNull String receiptId,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .removeReceiptAsync(id, receiptId, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildRemoveReceiptRequest(
    @NonNull String id,
    @NonNull String receiptId,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.DELETE,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "expenses/{id}/receipts/{receiptId}"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .setPathParameter("receiptId", receiptId)
      .build();
  }

  /**
   * Method createClaim
   * POST /claims
   *
   * @param createClaimRequest {@link CreateClaimRequest} Request Body
   * @return response of {@code Object}
   */
  public Object createClaim(@NonNull CreateClaimRequest createClaimRequest) throws ApiError {
    return this.createClaim(createClaimRequest, null);
  }

  /**
   * Method createClaim
   * POST /claims
   *
   * @param createClaimRequest {@link CreateClaimRequest} Request Body
   * @return response of {@code Object}
   */
  public Object createClaim(
    @NonNull CreateClaimRequest createClaimRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse().createClaim(createClaimRequest, requestConfig).getData();
  }

  /**
   * Method createClaim
   * POST /claims
   *
   * @param createClaimRequest {@link CreateClaimRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> createClaimAsync(@NonNull CreateClaimRequest createClaimRequest)
    throws ApiError {
    return this.createClaimAsync(createClaimRequest, null);
  }

  /**
   * Method createClaim
   * POST /claims
   *
   * @param createClaimRequest {@link CreateClaimRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> createClaimAsync(
    @NonNull CreateClaimRequest createClaimRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .createClaimAsync(createClaimRequest, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildCreateClaimRequest(
    @NonNull CreateClaimRequest createClaimRequest,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.POST,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "claims"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setJsonContent(createClaimRequest)
      .build();
  }

  /**
   * Method listClaims
   * GET /claims
   *
   * @return response of {@code Object}
   */
  public Object listClaims() throws ApiError {
    return this.listClaims(ListClaimsParameters.builder().build());
  }

  /**
   * Method listClaims
   * GET /claims
   *
   * @param requestParameters {@link ListClaimsParameters} Request Parameters Object
   * @return response of {@code Object}
   */
  public Object listClaims(@NonNull ListClaimsParameters requestParameters) throws ApiError {
    return this.listClaims(requestParameters, null);
  }

  /**
   * Method listClaims
   * GET /claims
   *
   * @param requestParameters {@link ListClaimsParameters} Request Parameters Object
   * @return response of {@code Object}
   */
  public Object listClaims(
    @NonNull ListClaimsParameters requestParameters,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse().listClaims(requestParameters, requestConfig).getData();
  }

  /**
   * Method listClaims
   * GET /claims
   *
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> listClaimsAsync() throws ApiError {
    return this.listClaimsAsync(ListClaimsParameters.builder().build());
  }

  /**
   * Method listClaims
   * GET /claims
   *
   * @param requestParameters {@link ListClaimsParameters} Request Parameters Object
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> listClaimsAsync(@NonNull ListClaimsParameters requestParameters)
    throws ApiError {
    return this.listClaimsAsync(requestParameters, null);
  }

  /**
   * Method listClaims
   * GET /claims
   *
   * @param requestParameters {@link ListClaimsParameters} Request Parameters Object
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> listClaimsAsync(
    @NonNull ListClaimsParameters requestParameters,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .listClaimsAsync(requestParameters, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildListClaimsRequest(
    @NonNull ListClaimsParameters requestParameters,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.GET,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "claims"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setOptionalQueryParameter("page", requestParameters.getPage())
      .setOptionalQueryParameter("pageSize", requestParameters.getPageSize())
      .setOptionalQueryParameter("status", requestParameters.getStatus())
      .build();
  }

  /**
   * Method getClaim
   * GET /claims/{id}
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object getClaim(@NonNull String id) throws ApiError {
    return this.getClaim(id, null);
  }

  /**
   * Method getClaim
   * GET /claims/{id}
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object getClaim(@NonNull String id, RequestConfig requestConfig) throws ApiError {
    return withRawResponse().getClaim(id, requestConfig).getData();
  }

  /**
   * Method getClaim
   * GET /claims/{id}
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getClaimAsync(@NonNull String id) throws ApiError {
    return this.getClaimAsync(id, null);
  }

  /**
   * Method getClaim
   * GET /claims/{id}
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> getClaimAsync(@NonNull String id, RequestConfig requestConfig)
    throws ApiError {
    return withRawResponse()
      .getClaimAsync(id, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildGetClaimRequest(@NonNull String id, RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.GET,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "claims/{id}"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .build();
  }

  /**
   * Method updateClaim
   * PUT /claims/{id}
   *
   * @param id String
   * @param updateClaimRequest {@link UpdateClaimRequest} Request Body
   * @return response of {@code Object}
   */
  public Object updateClaim(@NonNull String id, @NonNull UpdateClaimRequest updateClaimRequest)
    throws ApiError {
    return this.updateClaim(id, updateClaimRequest, null);
  }

  /**
   * Method updateClaim
   * PUT /claims/{id}
   *
   * @param id String
   * @param updateClaimRequest {@link UpdateClaimRequest} Request Body
   * @return response of {@code Object}
   */
  public Object updateClaim(
    @NonNull String id,
    @NonNull UpdateClaimRequest updateClaimRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse().updateClaim(id, updateClaimRequest, requestConfig).getData();
  }

  /**
   * Method updateClaim
   * PUT /claims/{id}
   *
   * @param id String
   * @param updateClaimRequest {@link UpdateClaimRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> updateClaimAsync(
    @NonNull String id,
    @NonNull UpdateClaimRequest updateClaimRequest
  ) throws ApiError {
    return this.updateClaimAsync(id, updateClaimRequest, null);
  }

  /**
   * Method updateClaim
   * PUT /claims/{id}
   *
   * @param id String
   * @param updateClaimRequest {@link UpdateClaimRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> updateClaimAsync(
    @NonNull String id,
    @NonNull UpdateClaimRequest updateClaimRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .updateClaimAsync(id, updateClaimRequest, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildUpdateClaimRequest(
    @NonNull String id,
    @NonNull UpdateClaimRequest updateClaimRequest,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.PUT,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "claims/{id}"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .setJsonContent(updateClaimRequest)
      .build();
  }

  /**
   * Method addExpenseToClaim
   * POST /claims/{id}/expenses
   *
   * @param id String
   * @param addExpenseToClaimRequest {@link AddExpenseToClaimRequest} Request Body
   * @return response of {@code Object}
   */
  public Object addExpenseToClaim(
    @NonNull String id,
    @NonNull AddExpenseToClaimRequest addExpenseToClaimRequest
  ) throws ApiError {
    return this.addExpenseToClaim(id, addExpenseToClaimRequest, null);
  }

  /**
   * Method addExpenseToClaim
   * POST /claims/{id}/expenses
   *
   * @param id String
   * @param addExpenseToClaimRequest {@link AddExpenseToClaimRequest} Request Body
   * @return response of {@code Object}
   */
  public Object addExpenseToClaim(
    @NonNull String id,
    @NonNull AddExpenseToClaimRequest addExpenseToClaimRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .addExpenseToClaim(id, addExpenseToClaimRequest, requestConfig)
      .getData();
  }

  /**
   * Method addExpenseToClaim
   * POST /claims/{id}/expenses
   *
   * @param id String
   * @param addExpenseToClaimRequest {@link AddExpenseToClaimRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> addExpenseToClaimAsync(
    @NonNull String id,
    @NonNull AddExpenseToClaimRequest addExpenseToClaimRequest
  ) throws ApiError {
    return this.addExpenseToClaimAsync(id, addExpenseToClaimRequest, null);
  }

  /**
   * Method addExpenseToClaim
   * POST /claims/{id}/expenses
   *
   * @param id String
   * @param addExpenseToClaimRequest {@link AddExpenseToClaimRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> addExpenseToClaimAsync(
    @NonNull String id,
    @NonNull AddExpenseToClaimRequest addExpenseToClaimRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .addExpenseToClaimAsync(id, addExpenseToClaimRequest, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildAddExpenseToClaimRequest(
    @NonNull String id,
    @NonNull AddExpenseToClaimRequest addExpenseToClaimRequest,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.POST,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "claims/{id}/expenses"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .setJsonContent(addExpenseToClaimRequest)
      .build();
  }

  /**
   * Method removeExpenseFromClaim
   * DELETE /claims/{id}/expenses/{expenseId}
   *
   * @param id String
   * @param expenseId String
   * @return response of {@code Object}
   */
  public Object removeExpenseFromClaim(@NonNull String id, @NonNull String expenseId)
    throws ApiError {
    return this.removeExpenseFromClaim(id, expenseId, null);
  }

  /**
   * Method removeExpenseFromClaim
   * DELETE /claims/{id}/expenses/{expenseId}
   *
   * @param id String
   * @param expenseId String
   * @return response of {@code Object}
   */
  public Object removeExpenseFromClaim(
    @NonNull String id,
    @NonNull String expenseId,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse().removeExpenseFromClaim(id, expenseId, requestConfig).getData();
  }

  /**
   * Method removeExpenseFromClaim
   * DELETE /claims/{id}/expenses/{expenseId}
   *
   * @param id String
   * @param expenseId String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> removeExpenseFromClaimAsync(
    @NonNull String id,
    @NonNull String expenseId
  ) throws ApiError {
    return this.removeExpenseFromClaimAsync(id, expenseId, null);
  }

  /**
   * Method removeExpenseFromClaim
   * DELETE /claims/{id}/expenses/{expenseId}
   *
   * @param id String
   * @param expenseId String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> removeExpenseFromClaimAsync(
    @NonNull String id,
    @NonNull String expenseId,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .removeExpenseFromClaimAsync(id, expenseId, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildRemoveExpenseFromClaimRequest(
    @NonNull String id,
    @NonNull String expenseId,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.DELETE,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "claims/{id}/expenses/{expenseId}"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .setPathParameter("expenseId", expenseId)
      .build();
  }

  /**
   * Method submitClaim
   * POST /claims/{id}/submit
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object submitClaim(@NonNull String id) throws ApiError {
    return this.submitClaim(id, null);
  }

  /**
   * Method submitClaim
   * POST /claims/{id}/submit
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object submitClaim(@NonNull String id, RequestConfig requestConfig) throws ApiError {
    return withRawResponse().submitClaim(id, requestConfig).getData();
  }

  /**
   * Method submitClaim
   * POST /claims/{id}/submit
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> submitClaimAsync(@NonNull String id) throws ApiError {
    return this.submitClaimAsync(id, null);
  }

  /**
   * Method submitClaim
   * POST /claims/{id}/submit
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> submitClaimAsync(
    @NonNull String id,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .submitClaimAsync(id, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildSubmitClaimRequest(@NonNull String id, RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.POST,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "claims/{id}/submit"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .build();
  }

  /**
   * Method approveClaim
   * POST /claims/{id}/approve
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object approveClaim(@NonNull String id) throws ApiError {
    return this.approveClaim(id, null);
  }

  /**
   * Method approveClaim
   * POST /claims/{id}/approve
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object approveClaim(@NonNull String id, RequestConfig requestConfig) throws ApiError {
    return withRawResponse().approveClaim(id, requestConfig).getData();
  }

  /**
   * Method approveClaim
   * POST /claims/{id}/approve
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> approveClaimAsync(@NonNull String id) throws ApiError {
    return this.approveClaimAsync(id, null);
  }

  /**
   * Method approveClaim
   * POST /claims/{id}/approve
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> approveClaimAsync(
    @NonNull String id,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .approveClaimAsync(id, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildApproveClaimRequest(@NonNull String id, RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.POST,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "claims/{id}/approve"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .build();
  }

  /**
   * Method rejectClaim
   * POST /claims/{id}/reject
   *
   * @param id String
   * @param rejectClaimRequest {@link RejectClaimRequest} Request Body
   * @return response of {@code Object}
   */
  public Object rejectClaim(@NonNull String id, @NonNull RejectClaimRequest rejectClaimRequest)
    throws ApiError {
    return this.rejectClaim(id, rejectClaimRequest, null);
  }

  /**
   * Method rejectClaim
   * POST /claims/{id}/reject
   *
   * @param id String
   * @param rejectClaimRequest {@link RejectClaimRequest} Request Body
   * @return response of {@code Object}
   */
  public Object rejectClaim(
    @NonNull String id,
    @NonNull RejectClaimRequest rejectClaimRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse().rejectClaim(id, rejectClaimRequest, requestConfig).getData();
  }

  /**
   * Method rejectClaim
   * POST /claims/{id}/reject
   *
   * @param id String
   * @param rejectClaimRequest {@link RejectClaimRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> rejectClaimAsync(
    @NonNull String id,
    @NonNull RejectClaimRequest rejectClaimRequest
  ) throws ApiError {
    return this.rejectClaimAsync(id, rejectClaimRequest, null);
  }

  /**
   * Method rejectClaim
   * POST /claims/{id}/reject
   *
   * @param id String
   * @param rejectClaimRequest {@link RejectClaimRequest} Request Body
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> rejectClaimAsync(
    @NonNull String id,
    @NonNull RejectClaimRequest rejectClaimRequest,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .rejectClaimAsync(id, rejectClaimRequest, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildRejectClaimRequest(
    @NonNull String id,
    @NonNull RejectClaimRequest rejectClaimRequest,
    RequestConfig resolvedConfig
  ) {
    return new RequestBuilder(
      HttpMethod.POST,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "claims/{id}/reject"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .setJsonContent(rejectClaimRequest)
      .build();
  }

  /**
   * Method markAsReimbursed
   * POST /claims/{id}/reimburse
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object markAsReimbursed(@NonNull String id) throws ApiError {
    return this.markAsReimbursed(id, null);
  }

  /**
   * Method markAsReimbursed
   * POST /claims/{id}/reimburse
   *
   * @param id String
   * @return response of {@code Object}
   */
  public Object markAsReimbursed(@NonNull String id, RequestConfig requestConfig) throws ApiError {
    return withRawResponse().markAsReimbursed(id, requestConfig).getData();
  }

  /**
   * Method markAsReimbursed
   * POST /claims/{id}/reimburse
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> markAsReimbursedAsync(@NonNull String id) throws ApiError {
    return this.markAsReimbursedAsync(id, null);
  }

  /**
   * Method markAsReimbursed
   * POST /claims/{id}/reimburse
   *
   * @param id String
   * @return response of {@code CompletableFuture<Object>}
   */
  public CompletableFuture<Object> markAsReimbursedAsync(
    @NonNull String id,
    RequestConfig requestConfig
  ) throws ApiError {
    return withRawResponse()
      .markAsReimbursedAsync(id, requestConfig)
      .thenApply(response -> response.getData());
  }

  private Request buildMarkAsReimbursedRequest(@NonNull String id, RequestConfig resolvedConfig) {
    return new RequestBuilder(
      HttpMethod.POST,
      resolveBaseUrl(resolvedConfig, Environment.API),
      "claims/{id}/reimburse"
    )
      .setAccessTokenAuth(resolveAccessToken(resolvedConfig), "Bearer")
      .setPathParameter("id", id)
      .build();
  }

  /**
   * Returns an accessor whose methods mirror this service but return the full HTTP response
   * (status code, headers, and raw body) wrapped alongside the parsed data.
   *
   * @return An accessor exposing raw-response variants of this service's methods
   */
  public WithRawResponse withRawResponse() {
    return new WithRawResponse();
  }

  /**
   * Per-call accessor exposing raw-response variants of {@link ExpenseTrackerApiSdkService}'s methods.
   * Reuses the enclosing service's request builders and configuration.
   */
  public class WithRawResponse {

    /**
     * Method createCategory
     * POST /categories
     *
     * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> createCategory(
      @NonNull CreateCategoryRequest createCategoryRequest
    ) throws ApiError {
      return this.createCategory(createCategoryRequest, null);
    }

    /**
     * Method createCategory
     * POST /categories
     *
     * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> createCategory(
      @NonNull CreateCategoryRequest createCategoryRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(createCategoryConfig, requestConfig);
      Request request = buildCreateCategoryRequest(createCategoryRequest, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method createCategory
     * POST /categories
     *
     * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> createCategoryAsync(
      @NonNull CreateCategoryRequest createCategoryRequest
    ) throws ApiError {
      return this.createCategoryAsync(createCategoryRequest, null);
    }

    /**
     * Method createCategory
     * POST /categories
     *
     * @param createCategoryRequest {@link CreateCategoryRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> createCategoryAsync(
      @NonNull CreateCategoryRequest createCategoryRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(createCategoryConfig, requestConfig);
      Request request = buildCreateCategoryRequest(createCategoryRequest, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method listCategories
     * GET /categories
     *
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> listCategories() throws ApiError {
      return this.listCategories(ListCategoriesParameters.builder().build());
    }

    /**
     * Method listCategories
     * GET /categories
     *
     * @param requestParameters {@link ListCategoriesParameters} Request Parameters Object
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> listCategories(
      @NonNull ListCategoriesParameters requestParameters
    ) throws ApiError {
      return this.listCategories(requestParameters, null);
    }

    /**
     * Method listCategories
     * GET /categories
     *
     * @param requestParameters {@link ListCategoriesParameters} Request Parameters Object
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> listCategories(
      @NonNull ListCategoriesParameters requestParameters,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(listCategoriesConfig, requestConfig);
      Request request = buildListCategoriesRequest(requestParameters, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method listCategories
     * GET /categories
     *
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> listCategoriesAsync()
      throws ApiError {
      return this.listCategoriesAsync(ListCategoriesParameters.builder().build());
    }

    /**
     * Method listCategories
     * GET /categories
     *
     * @param requestParameters {@link ListCategoriesParameters} Request Parameters Object
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> listCategoriesAsync(
      @NonNull ListCategoriesParameters requestParameters
    ) throws ApiError {
      return this.listCategoriesAsync(requestParameters, null);
    }

    /**
     * Method listCategories
     * GET /categories
     *
     * @param requestParameters {@link ListCategoriesParameters} Request Parameters Object
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> listCategoriesAsync(
      @NonNull ListCategoriesParameters requestParameters,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(listCategoriesConfig, requestConfig);
      Request request = buildListCategoriesRequest(requestParameters, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method getCategory
     * GET /categories/{id}
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> getCategory(@NonNull String id) throws ApiError {
      return this.getCategory(id, null);
    }

    /**
     * Method getCategory
     * GET /categories/{id}
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> getCategory(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(getCategoryConfig, requestConfig);
      Request request = buildGetCategoryRequest(id, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method getCategory
     * GET /categories/{id}
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> getCategoryAsync(
      @NonNull String id
    ) throws ApiError {
      return this.getCategoryAsync(id, null);
    }

    /**
     * Method getCategory
     * GET /categories/{id}
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> getCategoryAsync(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(getCategoryConfig, requestConfig);
      Request request = buildGetCategoryRequest(id, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method updateCategory
     * PUT /categories/{id}
     *
     * @param id String
     * @param updateCategoryRequest {@link UpdateCategoryRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> updateCategory(
      @NonNull String id,
      @NonNull UpdateCategoryRequest updateCategoryRequest
    ) throws ApiError {
      return this.updateCategory(id, updateCategoryRequest, null);
    }

    /**
     * Method updateCategory
     * PUT /categories/{id}
     *
     * @param id String
     * @param updateCategoryRequest {@link UpdateCategoryRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> updateCategory(
      @NonNull String id,
      @NonNull UpdateCategoryRequest updateCategoryRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(updateCategoryConfig, requestConfig);
      Request request = buildUpdateCategoryRequest(id, updateCategoryRequest, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method updateCategory
     * PUT /categories/{id}
     *
     * @param id String
     * @param updateCategoryRequest {@link UpdateCategoryRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> updateCategoryAsync(
      @NonNull String id,
      @NonNull UpdateCategoryRequest updateCategoryRequest
    ) throws ApiError {
      return this.updateCategoryAsync(id, updateCategoryRequest, null);
    }

    /**
     * Method updateCategory
     * PUT /categories/{id}
     *
     * @param id String
     * @param updateCategoryRequest {@link UpdateCategoryRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> updateCategoryAsync(
      @NonNull String id,
      @NonNull UpdateCategoryRequest updateCategoryRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(updateCategoryConfig, requestConfig);
      Request request = buildUpdateCategoryRequest(id, updateCategoryRequest, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method retireCategory
     * PATCH /categories/{id}/retire
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> retireCategory(@NonNull String id) throws ApiError {
      return this.retireCategory(id, null);
    }

    /**
     * Method retireCategory
     * PATCH /categories/{id}/retire
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> retireCategory(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(retireCategoryConfig, requestConfig);
      Request request = buildRetireCategoryRequest(id, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method retireCategory
     * PATCH /categories/{id}/retire
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> retireCategoryAsync(
      @NonNull String id
    ) throws ApiError {
      return this.retireCategoryAsync(id, null);
    }

    /**
     * Method retireCategory
     * PATCH /categories/{id}/retire
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> retireCategoryAsync(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(retireCategoryConfig, requestConfig);
      Request request = buildRetireCategoryRequest(id, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method createExpense
     * POST /expenses
     *
     * @param createExpenseRequest {@link CreateExpenseRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> createExpense(
      @NonNull CreateExpenseRequest createExpenseRequest
    ) throws ApiError {
      return this.createExpense(createExpenseRequest, null);
    }

    /**
     * Method createExpense
     * POST /expenses
     *
     * @param createExpenseRequest {@link CreateExpenseRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> createExpense(
      @NonNull CreateExpenseRequest createExpenseRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(createExpenseConfig, requestConfig);
      Request request = buildCreateExpenseRequest(createExpenseRequest, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method createExpense
     * POST /expenses
     *
     * @param createExpenseRequest {@link CreateExpenseRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> createExpenseAsync(
      @NonNull CreateExpenseRequest createExpenseRequest
    ) throws ApiError {
      return this.createExpenseAsync(createExpenseRequest, null);
    }

    /**
     * Method createExpense
     * POST /expenses
     *
     * @param createExpenseRequest {@link CreateExpenseRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> createExpenseAsync(
      @NonNull CreateExpenseRequest createExpenseRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(createExpenseConfig, requestConfig);
      Request request = buildCreateExpenseRequest(createExpenseRequest, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method listExpenses
     * GET /expenses
     *
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> listExpenses() throws ApiError {
      return this.listExpenses(ListExpensesParameters.builder().build());
    }

    /**
     * Method listExpenses
     * GET /expenses
     *
     * @param requestParameters {@link ListExpensesParameters} Request Parameters Object
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> listExpenses(
      @NonNull ListExpensesParameters requestParameters
    ) throws ApiError {
      return this.listExpenses(requestParameters, null);
    }

    /**
     * Method listExpenses
     * GET /expenses
     *
     * @param requestParameters {@link ListExpensesParameters} Request Parameters Object
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> listExpenses(
      @NonNull ListExpensesParameters requestParameters,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(listExpensesConfig, requestConfig);
      Request request = buildListExpensesRequest(requestParameters, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method listExpenses
     * GET /expenses
     *
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> listExpensesAsync()
      throws ApiError {
      return this.listExpensesAsync(ListExpensesParameters.builder().build());
    }

    /**
     * Method listExpenses
     * GET /expenses
     *
     * @param requestParameters {@link ListExpensesParameters} Request Parameters Object
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> listExpensesAsync(
      @NonNull ListExpensesParameters requestParameters
    ) throws ApiError {
      return this.listExpensesAsync(requestParameters, null);
    }

    /**
     * Method listExpenses
     * GET /expenses
     *
     * @param requestParameters {@link ListExpensesParameters} Request Parameters Object
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> listExpensesAsync(
      @NonNull ListExpensesParameters requestParameters,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(listExpensesConfig, requestConfig);
      Request request = buildListExpensesRequest(requestParameters, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method getExpense
     * GET /expenses/{id}
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> getExpense(@NonNull String id) throws ApiError {
      return this.getExpense(id, null);
    }

    /**
     * Method getExpense
     * GET /expenses/{id}
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> getExpense(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(getExpenseConfig, requestConfig);
      Request request = buildGetExpenseRequest(id, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method getExpense
     * GET /expenses/{id}
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> getExpenseAsync(
      @NonNull String id
    ) throws ApiError {
      return this.getExpenseAsync(id, null);
    }

    /**
     * Method getExpense
     * GET /expenses/{id}
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> getExpenseAsync(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(getExpenseConfig, requestConfig);
      Request request = buildGetExpenseRequest(id, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method updateExpense
     * PUT /expenses/{id}
     *
     * @param id String
     * @param updateExpenseRequest {@link UpdateExpenseRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> updateExpense(
      @NonNull String id,
      @NonNull UpdateExpenseRequest updateExpenseRequest
    ) throws ApiError {
      return this.updateExpense(id, updateExpenseRequest, null);
    }

    /**
     * Method updateExpense
     * PUT /expenses/{id}
     *
     * @param id String
     * @param updateExpenseRequest {@link UpdateExpenseRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> updateExpense(
      @NonNull String id,
      @NonNull UpdateExpenseRequest updateExpenseRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(updateExpenseConfig, requestConfig);
      Request request = buildUpdateExpenseRequest(id, updateExpenseRequest, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method updateExpense
     * PUT /expenses/{id}
     *
     * @param id String
     * @param updateExpenseRequest {@link UpdateExpenseRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> updateExpenseAsync(
      @NonNull String id,
      @NonNull UpdateExpenseRequest updateExpenseRequest
    ) throws ApiError {
      return this.updateExpenseAsync(id, updateExpenseRequest, null);
    }

    /**
     * Method updateExpense
     * PUT /expenses/{id}
     *
     * @param id String
     * @param updateExpenseRequest {@link UpdateExpenseRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> updateExpenseAsync(
      @NonNull String id,
      @NonNull UpdateExpenseRequest updateExpenseRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(updateExpenseConfig, requestConfig);
      Request request = buildUpdateExpenseRequest(id, updateExpenseRequest, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method deleteExpense
     * DELETE /expenses/{id}
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> deleteExpense(@NonNull String id) throws ApiError {
      return this.deleteExpense(id, null);
    }

    /**
     * Method deleteExpense
     * DELETE /expenses/{id}
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> deleteExpense(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(deleteExpenseConfig, requestConfig);
      Request request = buildDeleteExpenseRequest(id, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method deleteExpense
     * DELETE /expenses/{id}
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> deleteExpenseAsync(
      @NonNull String id
    ) throws ApiError {
      return this.deleteExpenseAsync(id, null);
    }

    /**
     * Method deleteExpense
     * DELETE /expenses/{id}
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> deleteExpenseAsync(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(deleteExpenseConfig, requestConfig);
      Request request = buildDeleteExpenseRequest(id, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method attachReceipt
     * POST /expenses/{id}/receipts
     *
     * @param id String
     * @param attachReceiptRequest {@link AttachReceiptRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> attachReceipt(
      @NonNull String id,
      @NonNull AttachReceiptRequest attachReceiptRequest
    ) throws ApiError {
      return this.attachReceipt(id, attachReceiptRequest, null);
    }

    /**
     * Method attachReceipt
     * POST /expenses/{id}/receipts
     *
     * @param id String
     * @param attachReceiptRequest {@link AttachReceiptRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> attachReceipt(
      @NonNull String id,
      @NonNull AttachReceiptRequest attachReceiptRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(attachReceiptConfig, requestConfig);
      Request request = buildAttachReceiptRequest(id, attachReceiptRequest, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method attachReceipt
     * POST /expenses/{id}/receipts
     *
     * @param id String
     * @param attachReceiptRequest {@link AttachReceiptRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> attachReceiptAsync(
      @NonNull String id,
      @NonNull AttachReceiptRequest attachReceiptRequest
    ) throws ApiError {
      return this.attachReceiptAsync(id, attachReceiptRequest, null);
    }

    /**
     * Method attachReceipt
     * POST /expenses/{id}/receipts
     *
     * @param id String
     * @param attachReceiptRequest {@link AttachReceiptRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> attachReceiptAsync(
      @NonNull String id,
      @NonNull AttachReceiptRequest attachReceiptRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(attachReceiptConfig, requestConfig);
      Request request = buildAttachReceiptRequest(id, attachReceiptRequest, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method removeReceipt
     * DELETE /expenses/{id}/receipts/{receiptId}
     *
     * @param id String
     * @param receiptId String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> removeReceipt(
      @NonNull String id,
      @NonNull String receiptId
    ) throws ApiError {
      return this.removeReceipt(id, receiptId, null);
    }

    /**
     * Method removeReceipt
     * DELETE /expenses/{id}/receipts/{receiptId}
     *
     * @param id String
     * @param receiptId String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> removeReceipt(
      @NonNull String id,
      @NonNull String receiptId,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(removeReceiptConfig, requestConfig);
      Request request = buildRemoveReceiptRequest(id, receiptId, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method removeReceipt
     * DELETE /expenses/{id}/receipts/{receiptId}
     *
     * @param id String
     * @param receiptId String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> removeReceiptAsync(
      @NonNull String id,
      @NonNull String receiptId
    ) throws ApiError {
      return this.removeReceiptAsync(id, receiptId, null);
    }

    /**
     * Method removeReceipt
     * DELETE /expenses/{id}/receipts/{receiptId}
     *
     * @param id String
     * @param receiptId String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> removeReceiptAsync(
      @NonNull String id,
      @NonNull String receiptId,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(removeReceiptConfig, requestConfig);
      Request request = buildRemoveReceiptRequest(id, receiptId, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method createClaim
     * POST /claims
     *
     * @param createClaimRequest {@link CreateClaimRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> createClaim(
      @NonNull CreateClaimRequest createClaimRequest
    ) throws ApiError {
      return this.createClaim(createClaimRequest, null);
    }

    /**
     * Method createClaim
     * POST /claims
     *
     * @param createClaimRequest {@link CreateClaimRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> createClaim(
      @NonNull CreateClaimRequest createClaimRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(createClaimConfig, requestConfig);
      Request request = buildCreateClaimRequest(createClaimRequest, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method createClaim
     * POST /claims
     *
     * @param createClaimRequest {@link CreateClaimRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> createClaimAsync(
      @NonNull CreateClaimRequest createClaimRequest
    ) throws ApiError {
      return this.createClaimAsync(createClaimRequest, null);
    }

    /**
     * Method createClaim
     * POST /claims
     *
     * @param createClaimRequest {@link CreateClaimRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> createClaimAsync(
      @NonNull CreateClaimRequest createClaimRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(createClaimConfig, requestConfig);
      Request request = buildCreateClaimRequest(createClaimRequest, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method listClaims
     * GET /claims
     *
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> listClaims() throws ApiError {
      return this.listClaims(ListClaimsParameters.builder().build());
    }

    /**
     * Method listClaims
     * GET /claims
     *
     * @param requestParameters {@link ListClaimsParameters} Request Parameters Object
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> listClaims(
      @NonNull ListClaimsParameters requestParameters
    ) throws ApiError {
      return this.listClaims(requestParameters, null);
    }

    /**
     * Method listClaims
     * GET /claims
     *
     * @param requestParameters {@link ListClaimsParameters} Request Parameters Object
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> listClaims(
      @NonNull ListClaimsParameters requestParameters,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(listClaimsConfig, requestConfig);
      Request request = buildListClaimsRequest(requestParameters, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method listClaims
     * GET /claims
     *
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> listClaimsAsync()
      throws ApiError {
      return this.listClaimsAsync(ListClaimsParameters.builder().build());
    }

    /**
     * Method listClaims
     * GET /claims
     *
     * @param requestParameters {@link ListClaimsParameters} Request Parameters Object
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> listClaimsAsync(
      @NonNull ListClaimsParameters requestParameters
    ) throws ApiError {
      return this.listClaimsAsync(requestParameters, null);
    }

    /**
     * Method listClaims
     * GET /claims
     *
     * @param requestParameters {@link ListClaimsParameters} Request Parameters Object
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> listClaimsAsync(
      @NonNull ListClaimsParameters requestParameters,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(listClaimsConfig, requestConfig);
      Request request = buildListClaimsRequest(requestParameters, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method getClaim
     * GET /claims/{id}
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> getClaim(@NonNull String id) throws ApiError {
      return this.getClaim(id, null);
    }

    /**
     * Method getClaim
     * GET /claims/{id}
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> getClaim(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(getClaimConfig, requestConfig);
      Request request = buildGetClaimRequest(id, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method getClaim
     * GET /claims/{id}
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> getClaimAsync(
      @NonNull String id
    ) throws ApiError {
      return this.getClaimAsync(id, null);
    }

    /**
     * Method getClaim
     * GET /claims/{id}
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> getClaimAsync(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(getClaimConfig, requestConfig);
      Request request = buildGetClaimRequest(id, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method updateClaim
     * PUT /claims/{id}
     *
     * @param id String
     * @param updateClaimRequest {@link UpdateClaimRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> updateClaim(
      @NonNull String id,
      @NonNull UpdateClaimRequest updateClaimRequest
    ) throws ApiError {
      return this.updateClaim(id, updateClaimRequest, null);
    }

    /**
     * Method updateClaim
     * PUT /claims/{id}
     *
     * @param id String
     * @param updateClaimRequest {@link UpdateClaimRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> updateClaim(
      @NonNull String id,
      @NonNull UpdateClaimRequest updateClaimRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(updateClaimConfig, requestConfig);
      Request request = buildUpdateClaimRequest(id, updateClaimRequest, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method updateClaim
     * PUT /claims/{id}
     *
     * @param id String
     * @param updateClaimRequest {@link UpdateClaimRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> updateClaimAsync(
      @NonNull String id,
      @NonNull UpdateClaimRequest updateClaimRequest
    ) throws ApiError {
      return this.updateClaimAsync(id, updateClaimRequest, null);
    }

    /**
     * Method updateClaim
     * PUT /claims/{id}
     *
     * @param id String
     * @param updateClaimRequest {@link UpdateClaimRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> updateClaimAsync(
      @NonNull String id,
      @NonNull UpdateClaimRequest updateClaimRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(updateClaimConfig, requestConfig);
      Request request = buildUpdateClaimRequest(id, updateClaimRequest, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method addExpenseToClaim
     * POST /claims/{id}/expenses
     *
     * @param id String
     * @param addExpenseToClaimRequest {@link AddExpenseToClaimRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> addExpenseToClaim(
      @NonNull String id,
      @NonNull AddExpenseToClaimRequest addExpenseToClaimRequest
    ) throws ApiError {
      return this.addExpenseToClaim(id, addExpenseToClaimRequest, null);
    }

    /**
     * Method addExpenseToClaim
     * POST /claims/{id}/expenses
     *
     * @param id String
     * @param addExpenseToClaimRequest {@link AddExpenseToClaimRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> addExpenseToClaim(
      @NonNull String id,
      @NonNull AddExpenseToClaimRequest addExpenseToClaimRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(addExpenseToClaimConfig, requestConfig);
      Request request = buildAddExpenseToClaimRequest(id, addExpenseToClaimRequest, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method addExpenseToClaim
     * POST /claims/{id}/expenses
     *
     * @param id String
     * @param addExpenseToClaimRequest {@link AddExpenseToClaimRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> addExpenseToClaimAsync(
      @NonNull String id,
      @NonNull AddExpenseToClaimRequest addExpenseToClaimRequest
    ) throws ApiError {
      return this.addExpenseToClaimAsync(id, addExpenseToClaimRequest, null);
    }

    /**
     * Method addExpenseToClaim
     * POST /claims/{id}/expenses
     *
     * @param id String
     * @param addExpenseToClaimRequest {@link AddExpenseToClaimRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> addExpenseToClaimAsync(
      @NonNull String id,
      @NonNull AddExpenseToClaimRequest addExpenseToClaimRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(addExpenseToClaimConfig, requestConfig);
      Request request = buildAddExpenseToClaimRequest(id, addExpenseToClaimRequest, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method removeExpenseFromClaim
     * DELETE /claims/{id}/expenses/{expenseId}
     *
     * @param id String
     * @param expenseId String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> removeExpenseFromClaim(
      @NonNull String id,
      @NonNull String expenseId
    ) throws ApiError {
      return this.removeExpenseFromClaim(id, expenseId, null);
    }

    /**
     * Method removeExpenseFromClaim
     * DELETE /claims/{id}/expenses/{expenseId}
     *
     * @param id String
     * @param expenseId String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> removeExpenseFromClaim(
      @NonNull String id,
      @NonNull String expenseId,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(removeExpenseFromClaimConfig, requestConfig);
      Request request = buildRemoveExpenseFromClaimRequest(id, expenseId, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method removeExpenseFromClaim
     * DELETE /claims/{id}/expenses/{expenseId}
     *
     * @param id String
     * @param expenseId String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> removeExpenseFromClaimAsync(
      @NonNull String id,
      @NonNull String expenseId
    ) throws ApiError {
      return this.removeExpenseFromClaimAsync(id, expenseId, null);
    }

    /**
     * Method removeExpenseFromClaim
     * DELETE /claims/{id}/expenses/{expenseId}
     *
     * @param id String
     * @param expenseId String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> removeExpenseFromClaimAsync(
      @NonNull String id,
      @NonNull String expenseId,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(removeExpenseFromClaimConfig, requestConfig);
      Request request = buildRemoveExpenseFromClaimRequest(id, expenseId, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method submitClaim
     * POST /claims/{id}/submit
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> submitClaim(@NonNull String id) throws ApiError {
      return this.submitClaim(id, null);
    }

    /**
     * Method submitClaim
     * POST /claims/{id}/submit
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> submitClaim(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(submitClaimConfig, requestConfig);
      Request request = buildSubmitClaimRequest(id, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method submitClaim
     * POST /claims/{id}/submit
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> submitClaimAsync(
      @NonNull String id
    ) throws ApiError {
      return this.submitClaimAsync(id, null);
    }

    /**
     * Method submitClaim
     * POST /claims/{id}/submit
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> submitClaimAsync(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(submitClaimConfig, requestConfig);
      Request request = buildSubmitClaimRequest(id, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method approveClaim
     * POST /claims/{id}/approve
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> approveClaim(@NonNull String id) throws ApiError {
      return this.approveClaim(id, null);
    }

    /**
     * Method approveClaim
     * POST /claims/{id}/approve
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> approveClaim(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(approveClaimConfig, requestConfig);
      Request request = buildApproveClaimRequest(id, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method approveClaim
     * POST /claims/{id}/approve
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> approveClaimAsync(
      @NonNull String id
    ) throws ApiError {
      return this.approveClaimAsync(id, null);
    }

    /**
     * Method approveClaim
     * POST /claims/{id}/approve
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> approveClaimAsync(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(approveClaimConfig, requestConfig);
      Request request = buildApproveClaimRequest(id, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method rejectClaim
     * POST /claims/{id}/reject
     *
     * @param id String
     * @param rejectClaimRequest {@link RejectClaimRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> rejectClaim(
      @NonNull String id,
      @NonNull RejectClaimRequest rejectClaimRequest
    ) throws ApiError {
      return this.rejectClaim(id, rejectClaimRequest, null);
    }

    /**
     * Method rejectClaim
     * POST /claims/{id}/reject
     *
     * @param id String
     * @param rejectClaimRequest {@link RejectClaimRequest} Request Body
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> rejectClaim(
      @NonNull String id,
      @NonNull RejectClaimRequest rejectClaimRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(rejectClaimConfig, requestConfig);
      Request request = buildRejectClaimRequest(id, rejectClaimRequest, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method rejectClaim
     * POST /claims/{id}/reject
     *
     * @param id String
     * @param rejectClaimRequest {@link RejectClaimRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> rejectClaimAsync(
      @NonNull String id,
      @NonNull RejectClaimRequest rejectClaimRequest
    ) throws ApiError {
      return this.rejectClaimAsync(id, rejectClaimRequest, null);
    }

    /**
     * Method rejectClaim
     * POST /claims/{id}/reject
     *
     * @param id String
     * @param rejectClaimRequest {@link RejectClaimRequest} Request Body
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> rejectClaimAsync(
      @NonNull String id,
      @NonNull RejectClaimRequest rejectClaimRequest,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(rejectClaimConfig, requestConfig);
      Request request = buildRejectClaimRequest(id, rejectClaimRequest, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }

    /**
     * Method markAsReimbursed
     * POST /claims/{id}/reimburse
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> markAsReimbursed(@NonNull String id)
      throws ApiError {
      return this.markAsReimbursed(id, null);
    }

    /**
     * Method markAsReimbursed
     * POST /claims/{id}/reimburse
     *
     * @param id String
     * @return response of {@code ExpenseTrackerApiSdkResponse<Object>}
     */
    public ExpenseTrackerApiSdkResponse<Object> markAsReimbursed(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(markAsReimbursedConfig, requestConfig);
      Request request = buildMarkAsReimbursedRequest(id, resolvedConfig);
      Response response = execute(request, resolvedConfig);
      byte[] bodyBytes = ModelConverter.readBytes(response);
      return new ExpenseTrackerApiSdkResponse<>(
        response,
        bodyBytes,
        ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
      );
    }

    /**
     * Method markAsReimbursed
     * POST /claims/{id}/reimburse
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> markAsReimbursedAsync(
      @NonNull String id
    ) throws ApiError {
      return this.markAsReimbursedAsync(id, null);
    }

    /**
     * Method markAsReimbursed
     * POST /claims/{id}/reimburse
     *
     * @param id String
     * @return response of {@code CompletableFuture<ExpenseTrackerApiSdkResponse<Object>>}
     */
    public CompletableFuture<ExpenseTrackerApiSdkResponse<Object>> markAsReimbursedAsync(
      @NonNull String id,
      RequestConfig requestConfig
    ) throws ApiError {
      RequestConfig resolvedConfig = getResolvedConfig(markAsReimbursedConfig, requestConfig);
      Request request = buildMarkAsReimbursedRequest(id, resolvedConfig);
      CompletableFuture<Response> futureResponse = executeAsync(request, resolvedConfig);
      return futureResponse.thenApplyAsync(response -> {
        byte[] bodyBytes = ModelConverter.readBytes(response);
        return new ExpenseTrackerApiSdkResponse<>(
          response,
          bodyBytes,
          ModelConverter.convert(bodyBytes, new TypeReference<Object>() {})
        );
      });
    }
  }
}
