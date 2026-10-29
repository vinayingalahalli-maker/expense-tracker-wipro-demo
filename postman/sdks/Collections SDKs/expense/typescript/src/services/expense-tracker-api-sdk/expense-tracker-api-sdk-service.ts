import { z } from 'zod';
import { BaseService } from '../base-service';
import { ContentType, HttpResponse, SdkConfig } from '../../http/types';
import { RequestBuilder } from '../../http/transport/request-builder';
import { SerializationStyle } from '../../http/serialization/base-serializer';
import { ThrowableError } from '../../http/errors/throwable-error';
import { Environment } from '../../http/environment';
import {
  CreateCategoryRequest,
  createCategoryRequestRequest,
} from './models/create-category-request';
import { ListCategoriesParams, ListClaimsParams, ListExpensesParams } from './request-params';
import {
  UpdateCategoryRequest,
  updateCategoryRequestRequest,
} from './models/update-category-request';
import { CreateExpenseRequest, createExpenseRequestRequest } from './models/create-expense-request';
import { UpdateExpenseRequest, updateExpenseRequestRequest } from './models/update-expense-request';
import { AttachReceiptRequest, attachReceiptRequestRequest } from './models/attach-receipt-request';
import { CreateClaimRequest, createClaimRequestRequest } from './models/create-claim-request';
import { UpdateClaimRequest, updateClaimRequestRequest } from './models/update-claim-request';
import {
  AddExpenseToClaimRequest,
  addExpenseToClaimRequestRequest,
} from './models/add-expense-to-claim-request';
import { RejectClaimRequest, rejectClaimRequestRequest } from './models/reject-claim-request';

/**
 * Service class for ExpenseTrackerApiSdkService operations.
 * Provides methods to interact with ExpenseTrackerApiSdkService-related API endpoints.
 * All methods return promises and handle request/response serialization automatically.
 */
export class ExpenseTrackerApiSdkService extends BaseService {
  protected createCategoryConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected listCategoriesConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected getCategoryConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected updateCategoryConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected retireCategoryConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected createExpenseConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected listExpensesConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected getExpenseConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected updateExpenseConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected deleteExpenseConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected attachReceiptConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected removeReceiptConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected createClaimConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected listClaimsConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected getClaimConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected updateClaimConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected addExpenseToClaimConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected removeExpenseFromClaimConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected submitClaimConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected approveClaimConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected rejectClaimConfig: Partial<SdkConfig> = { environment: Environment.API };

  protected markAsReimbursedConfig: Partial<SdkConfig> = { environment: Environment.API };

  /**
   * Sets method-level configuration for createCategory.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setCreateCategoryConfig(config: Partial<SdkConfig>): this {
    this.createCategoryConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for listCategories.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setListCategoriesConfig(config: Partial<SdkConfig>): this {
    this.listCategoriesConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for getCategory.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setGetCategoryConfig(config: Partial<SdkConfig>): this {
    this.getCategoryConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for updateCategory.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setUpdateCategoryConfig(config: Partial<SdkConfig>): this {
    this.updateCategoryConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for retireCategory.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setRetireCategoryConfig(config: Partial<SdkConfig>): this {
    this.retireCategoryConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for createExpense.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setCreateExpenseConfig(config: Partial<SdkConfig>): this {
    this.createExpenseConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for listExpenses.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setListExpensesConfig(config: Partial<SdkConfig>): this {
    this.listExpensesConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for getExpense.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setGetExpenseConfig(config: Partial<SdkConfig>): this {
    this.getExpenseConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for updateExpense.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setUpdateExpenseConfig(config: Partial<SdkConfig>): this {
    this.updateExpenseConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for deleteExpense.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setDeleteExpenseConfig(config: Partial<SdkConfig>): this {
    this.deleteExpenseConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for attachReceipt.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setAttachReceiptConfig(config: Partial<SdkConfig>): this {
    this.attachReceiptConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for removeReceipt.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setRemoveReceiptConfig(config: Partial<SdkConfig>): this {
    this.removeReceiptConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for createClaim.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setCreateClaimConfig(config: Partial<SdkConfig>): this {
    this.createClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for listClaims.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setListClaimsConfig(config: Partial<SdkConfig>): this {
    this.listClaimsConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for getClaim.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setGetClaimConfig(config: Partial<SdkConfig>): this {
    this.getClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for updateClaim.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setUpdateClaimConfig(config: Partial<SdkConfig>): this {
    this.updateClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for addExpenseToClaim.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setAddExpenseToClaimConfig(config: Partial<SdkConfig>): this {
    this.addExpenseToClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for removeExpenseFromClaim.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setRemoveExpenseFromClaimConfig(config: Partial<SdkConfig>): this {
    this.removeExpenseFromClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for submitClaim.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setSubmitClaimConfig(config: Partial<SdkConfig>): this {
    this.submitClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for approveClaim.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setApproveClaimConfig(config: Partial<SdkConfig>): this {
    this.approveClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for rejectClaim.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setRejectClaimConfig(config: Partial<SdkConfig>): this {
    this.rejectClaimConfig = config;
    return this;
  }

  /**
   * Sets method-level configuration for markAsReimbursed.
   * @param config - Partial configuration to override service-level defaults
   * @returns This service instance for method chaining
   */
  setMarkAsReimbursedConfig(config: Partial<SdkConfig>): this {
    this.markAsReimbursedConfig = config;
    return this;
  }

  /**
   *
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async createCategory(
    body: CreateCategoryRequest,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.createCategoryConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('POST')
      .setPath('/categories')
      .setRequestSchema(createCategoryRequestRequest)
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addHeaderParam({ key: 'Content-Type', value: 'application/json' })
      .addBody(body)
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} [params.page] - Page number (starts at 1)
   * @param {string} [params.pageSize] - Number of items per page (max 100)
   * @param {string} [params.active] - Filter by active status (true/false)
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async listCategories(
    params?: ListCategoriesParams,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.listCategoriesConfig, requestConfig);
    z.object({
      page: z.string().optional().nullable(),
      pageSize: z.string().optional().nullable(),
      active: z.string().optional().nullable(),
    }).parse(params ?? {});
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('GET')
      .setPath('/categories')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addQueryParam({
        key: 'page',
        value: params?.page,
      })
      .addQueryParam({
        key: 'pageSize',
        value: params?.pageSize,
      })
      .addQueryParam({
        key: 'active',
        value: params?.active,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async getCategory(id: string, requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.getCategoryConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('GET')
      .setPath('/categories/{id}')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async updateCategory(
    id: string,
    body: UpdateCategoryRequest,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.updateCategoryConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('PUT')
      .setPath('/categories/{id}')
      .setRequestSchema(updateCategoryRequestRequest)
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .addHeaderParam({ key: 'Content-Type', value: 'application/json' })
      .addBody(body)
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async retireCategory(id: string, requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.retireCategoryConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('PATCH')
      .setPath('/categories/{id}/retire')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async createExpense(
    body: CreateExpenseRequest,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.createExpenseConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('POST')
      .setPath('/expenses')
      .setRequestSchema(createExpenseRequestRequest)
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addHeaderParam({ key: 'Content-Type', value: 'application/json' })
      .addBody(body)
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} [params.page] - Page number (starts at 1)
   * @param {string} [params.pageSize] - Number of items per page (max 100)
   * @param {string} [params.dateFrom] - Filter by date incurred from (ISO 8601)
   * @param {string} [params.dateTo] - Filter by date incurred to (ISO 8601)
   * @param {string} [params.categoryId] - Filter by category ID
   * @param {string} [params.inClaim] - Filter by claim status (true/false)
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async listExpenses(
    params?: ListExpensesParams,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.listExpensesConfig, requestConfig);
    z.object({
      page: z.string().optional().nullable(),
      pageSize: z.string().optional().nullable(),
      dateFrom: z.string().optional().nullable(),
      dateTo: z.string().optional().nullable(),
      categoryId: z.string().optional().nullable(),
      inClaim: z.string().optional().nullable(),
    }).parse(params ?? {});
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('GET')
      .setPath('/expenses')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addQueryParam({
        key: 'page',
        value: params?.page,
      })
      .addQueryParam({
        key: 'pageSize',
        value: params?.pageSize,
      })
      .addQueryParam({
        key: 'dateFrom',
        value: params?.dateFrom,
      })
      .addQueryParam({
        key: 'dateTo',
        value: params?.dateTo,
      })
      .addQueryParam({
        key: 'categoryId',
        value: params?.categoryId,
      })
      .addQueryParam({
        key: 'inClaim',
        value: params?.inClaim,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async getExpense(id: string, requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.getExpenseConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('GET')
      .setPath('/expenses/{id}')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async updateExpense(
    id: string,
    body: UpdateExpenseRequest,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.updateExpenseConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('PUT')
      .setPath('/expenses/{id}')
      .setRequestSchema(updateExpenseRequestRequest)
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .addHeaderParam({ key: 'Content-Type', value: 'application/json' })
      .addBody(body)
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async deleteExpense(id: string, requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.deleteExpenseConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('DELETE')
      .setPath('/expenses/{id}')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async attachReceipt(
    id: string,
    body: AttachReceiptRequest,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.attachReceiptConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('POST')
      .setPath('/expenses/{id}/receipts')
      .setRequestSchema(attachReceiptRequestRequest)
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .addHeaderParam({ key: 'Content-Type', value: 'application/json' })
      .addBody(body)
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {string} receiptId -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async removeReceipt(
    id: string,
    receiptId: string,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.removeReceiptConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('DELETE')
      .setPath('/expenses/{id}/receipts/{receiptId}')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .addPathParam({
        key: 'receiptId',
        value: receiptId,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async createClaim(body: CreateClaimRequest, requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.createClaimConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('POST')
      .setPath('/claims')
      .setRequestSchema(createClaimRequestRequest)
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addHeaderParam({ key: 'Content-Type', value: 'application/json' })
      .addBody(body)
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} [params.page] - Page number (starts at 1)
   * @param {string} [params.pageSize] - Number of items per page (max 100)
   * @param {string} [params.status] - Filter by status (draft, submitted, approved, rejected, reimbursed)
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async listClaims(params?: ListClaimsParams, requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.listClaimsConfig, requestConfig);
    z.object({
      page: z.string().optional().nullable(),
      pageSize: z.string().optional().nullable(),
      status: z.string().optional().nullable(),
    }).parse(params ?? {});
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('GET')
      .setPath('/claims')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addQueryParam({
        key: 'page',
        value: params?.page,
      })
      .addQueryParam({
        key: 'pageSize',
        value: params?.pageSize,
      })
      .addQueryParam({
        key: 'status',
        value: params?.status,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async getClaim(id: string, requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.getClaimConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('GET')
      .setPath('/claims/{id}')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async updateClaim(
    id: string,
    body: UpdateClaimRequest,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.updateClaimConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('PUT')
      .setPath('/claims/{id}')
      .setRequestSchema(updateClaimRequestRequest)
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .addHeaderParam({ key: 'Content-Type', value: 'application/json' })
      .addBody(body)
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async addExpenseToClaim(
    id: string,
    body: AddExpenseToClaimRequest,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.addExpenseToClaimConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('POST')
      .setPath('/claims/{id}/expenses')
      .setRequestSchema(addExpenseToClaimRequestRequest)
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .addHeaderParam({ key: 'Content-Type', value: 'application/json' })
      .addBody(body)
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {string} expenseId -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async removeExpenseFromClaim(
    id: string,
    expenseId: string,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.removeExpenseFromClaimConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('DELETE')
      .setPath('/claims/{id}/expenses/{expenseId}')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .addPathParam({
        key: 'expenseId',
        value: expenseId,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async submitClaim(id: string, requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.submitClaimConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('POST')
      .setPath('/claims/{id}/submit')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async approveClaim(id: string, requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.approveClaimConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('POST')
      .setPath('/claims/{id}/approve')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async rejectClaim(
    id: string,
    body: RejectClaimRequest,
    requestConfig?: Partial<SdkConfig>,
  ): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.rejectClaimConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('POST')
      .setPath('/claims/{id}/reject')
      .setRequestSchema(rejectClaimRequestRequest)
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .addHeaderParam({ key: 'Content-Type', value: 'application/json' })
      .addBody(body)
      .build();
    return this.client.callDirect<any>(request);
  }

  /**
   *
   * @param {string} id -
   * @param {Partial<SdkConfig>} [requestConfig] - The request configuration for retry and validation.
   * @returns {Promise<HttpResponse<any>>} - OK
   */
  async markAsReimbursed(id: string, requestConfig?: Partial<SdkConfig>): Promise<any> {
    const resolvedConfig = this.getResolvedConfig(this.markAsReimbursedConfig, requestConfig);
    const request = new RequestBuilder()
      .setConfig(resolvedConfig)
      .setBaseUrl(resolvedConfig)
      .setMethod('POST')
      .setPath('/claims/{id}/reimburse')
      .setRequestSchema(z.any())
      .addAccessTokenAuth(resolvedConfig?.token)
      .setRequestContentType(ContentType.Json)
      .addResponse({
        schema: z.any(),
        contentType: ContentType.Json,
        status: 200,
      })
      .addPathParam({
        key: 'id',
        value: id,
      })
      .build();
    return this.client.callDirect<any>(request);
  }
}
