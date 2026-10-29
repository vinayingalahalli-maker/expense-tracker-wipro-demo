from typing import Any, Optional, Union
from .utils.validator import Validator
from .utils.base_service import BaseService
from ..net.transport.serializer import Serializer
from ..net.sdk_config import SdkConfig
from ..net.environment.environment import Environment
from ..models.utils.sentinel import SENTINEL
from ..models.utils.cast_models import cast_models
from ..models import (
    AddExpenseToClaimRequest,
    AttachReceiptRequest,
    CreateCategoryRequest,
    CreateClaimRequest,
    CreateExpenseRequest,
    RejectClaimRequest,
    UpdateCategoryRequest,
    UpdateClaimRequest,
    UpdateExpenseRequest,
)


class ExpenseTrackerApiSdkService(BaseService):
    """
    Service class for ExpenseTrackerApiSdkService operations.
    Provides methods to interact with ExpenseTrackerApiSdkService-related API endpoints.
    Inherits common functionality from BaseService including authentication and request handling.
    """

    def __init__(self, *args, **kwargs):
        """Initialize the service and method-level configurations."""
        super().__init__(*args, **kwargs)
        self._create_category_config: SdkConfig = {"environment": Environment.API}
        self._list_categories_config: SdkConfig = {"environment": Environment.API}
        self._get_category_config: SdkConfig = {"environment": Environment.API}
        self._update_category_config: SdkConfig = {"environment": Environment.API}
        self._retire_category_config: SdkConfig = {"environment": Environment.API}
        self._create_expense_config: SdkConfig = {"environment": Environment.API}
        self._list_expenses_config: SdkConfig = {"environment": Environment.API}
        self._get_expense_config: SdkConfig = {"environment": Environment.API}
        self._update_expense_config: SdkConfig = {"environment": Environment.API}
        self._delete_expense_config: SdkConfig = {"environment": Environment.API}
        self._attach_receipt_config: SdkConfig = {"environment": Environment.API}
        self._remove_receipt_config: SdkConfig = {"environment": Environment.API}
        self._create_claim_config: SdkConfig = {"environment": Environment.API}
        self._list_claims_config: SdkConfig = {"environment": Environment.API}
        self._get_claim_config: SdkConfig = {"environment": Environment.API}
        self._update_claim_config: SdkConfig = {"environment": Environment.API}
        self._add_expense_to_claim_config: SdkConfig = {"environment": Environment.API}
        self._remove_expense_from_claim_config: SdkConfig = {
            "environment": Environment.API
        }
        self._submit_claim_config: SdkConfig = {"environment": Environment.API}
        self._approve_claim_config: SdkConfig = {"environment": Environment.API}
        self._reject_claim_config: SdkConfig = {"environment": Environment.API}
        self._mark_as_reimbursed_config: SdkConfig = {"environment": Environment.API}

    def set_create_category_config(self, config: SdkConfig):
        """
        Sets method-level configuration for create_category.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._create_category_config = config
        return self

    def set_list_categories_config(self, config: SdkConfig):
        """
        Sets method-level configuration for list_categories.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._list_categories_config = config
        return self

    def set_get_category_config(self, config: SdkConfig):
        """
        Sets method-level configuration for get_category.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._get_category_config = config
        return self

    def set_update_category_config(self, config: SdkConfig):
        """
        Sets method-level configuration for update_category.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._update_category_config = config
        return self

    def set_retire_category_config(self, config: SdkConfig):
        """
        Sets method-level configuration for retire_category.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._retire_category_config = config
        return self

    def set_create_expense_config(self, config: SdkConfig):
        """
        Sets method-level configuration for create_expense.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._create_expense_config = config
        return self

    def set_list_expenses_config(self, config: SdkConfig):
        """
        Sets method-level configuration for list_expenses.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._list_expenses_config = config
        return self

    def set_get_expense_config(self, config: SdkConfig):
        """
        Sets method-level configuration for get_expense.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._get_expense_config = config
        return self

    def set_update_expense_config(self, config: SdkConfig):
        """
        Sets method-level configuration for update_expense.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._update_expense_config = config
        return self

    def set_delete_expense_config(self, config: SdkConfig):
        """
        Sets method-level configuration for delete_expense.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._delete_expense_config = config
        return self

    def set_attach_receipt_config(self, config: SdkConfig):
        """
        Sets method-level configuration for attach_receipt.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._attach_receipt_config = config
        return self

    def set_remove_receipt_config(self, config: SdkConfig):
        """
        Sets method-level configuration for remove_receipt.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._remove_receipt_config = config
        return self

    def set_create_claim_config(self, config: SdkConfig):
        """
        Sets method-level configuration for create_claim.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._create_claim_config = config
        return self

    def set_list_claims_config(self, config: SdkConfig):
        """
        Sets method-level configuration for list_claims.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._list_claims_config = config
        return self

    def set_get_claim_config(self, config: SdkConfig):
        """
        Sets method-level configuration for get_claim.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._get_claim_config = config
        return self

    def set_update_claim_config(self, config: SdkConfig):
        """
        Sets method-level configuration for update_claim.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._update_claim_config = config
        return self

    def set_add_expense_to_claim_config(self, config: SdkConfig):
        """
        Sets method-level configuration for add_expense_to_claim.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._add_expense_to_claim_config = config
        return self

    def set_remove_expense_from_claim_config(self, config: SdkConfig):
        """
        Sets method-level configuration for remove_expense_from_claim.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._remove_expense_from_claim_config = config
        return self

    def set_submit_claim_config(self, config: SdkConfig):
        """
        Sets method-level configuration for submit_claim.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._submit_claim_config = config
        return self

    def set_approve_claim_config(self, config: SdkConfig):
        """
        Sets method-level configuration for approve_claim.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._approve_claim_config = config
        return self

    def set_reject_claim_config(self, config: SdkConfig):
        """
        Sets method-level configuration for reject_claim.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._reject_claim_config = config
        return self

    def set_mark_as_reimbursed_config(self, config: SdkConfig):
        """
        Sets method-level configuration for mark_as_reimbursed.

        :param SdkConfig config: Configuration dictionary to override service-level defaults.
        :return: The service instance for method chaining.
        """
        self._mark_as_reimbursed_config = config
        return self

    @cast_models
    def create_category(
        self,
        request_body: CreateCategoryRequest,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """create_category

        :param request_body: The request body.
        :type request_body: CreateCategoryRequest
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(CreateCategoryRequest).is_nullable().validate(
            request_body, "request_body"
        )

        resolved_config = self._get_resolved_config(
            self._create_category_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/categories",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .serialize()
            .set_method("POST")
            .set_body(request_body)
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def list_categories(
        self,
        page: Union[str, None] = SENTINEL,
        page_size: Union[str, None] = SENTINEL,
        active: Union[str, None] = SENTINEL,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """list_categories

        :param page: Page number (starts at 1), defaults to None
        :type page: str, optional
        :param page_size: Number of items per page (max 100), defaults to None
        :type page_size: str, optional
        :param active: Filter by active status (true/false), defaults to None
        :type active: str, optional
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).is_optional().is_nullable().validate(page, "page")
        Validator(str).is_optional().is_nullable().validate(page_size, "page_size")
        Validator(str).is_optional().is_nullable().validate(active, "active")

        resolved_config = self._get_resolved_config(
            self._list_categories_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/categories",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_query("page", page, nullable=True)
            .add_query("pageSize", page_size, nullable=True)
            .add_query("active", active, nullable=True)
            .serialize()
            .set_method("GET")
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def get_category(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Any:
        """get_category

        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._get_category_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/categories/{{id}}",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("GET")
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def update_category(
        self,
        request_body: UpdateCategoryRequest,
        id_: str,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """update_category

        :param request_body: The request body.
        :type request_body: UpdateCategoryRequest
        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(UpdateCategoryRequest).is_nullable().validate(
            request_body, "request_body"
        )
        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._update_category_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/categories/{{id}}",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("PUT")
            .set_body(request_body)
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def retire_category(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Any:
        """retire_category

        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._retire_category_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/categories/{{id}}/retire",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("PATCH")
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def create_expense(
        self,
        request_body: CreateExpenseRequest,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """create_expense

        :param request_body: The request body.
        :type request_body: CreateExpenseRequest
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(CreateExpenseRequest).is_nullable().validate(
            request_body, "request_body"
        )

        resolved_config = self._get_resolved_config(
            self._create_expense_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/expenses",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .serialize()
            .set_method("POST")
            .set_body(request_body)
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def list_expenses(
        self,
        page: Union[str, None] = SENTINEL,
        page_size: Union[str, None] = SENTINEL,
        date_from: Union[str, None] = SENTINEL,
        date_to: Union[str, None] = SENTINEL,
        category_id: Union[str, None] = SENTINEL,
        in_claim: Union[str, None] = SENTINEL,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """list_expenses

        :param page: Page number (starts at 1), defaults to None
        :type page: str, optional
        :param page_size: Number of items per page (max 100), defaults to None
        :type page_size: str, optional
        :param date_from: Filter by date incurred from (ISO 8601), defaults to None
        :type date_from: str, optional
        :param date_to: Filter by date incurred to (ISO 8601), defaults to None
        :type date_to: str, optional
        :param category_id: Filter by category ID, defaults to None
        :type category_id: str, optional
        :param in_claim: Filter by claim status (true/false), defaults to None
        :type in_claim: str, optional
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).is_optional().is_nullable().validate(page, "page")
        Validator(str).is_optional().is_nullable().validate(page_size, "page_size")
        Validator(str).is_optional().is_nullable().validate(date_from, "date_from")
        Validator(str).is_optional().is_nullable().validate(date_to, "date_to")
        Validator(str).is_optional().is_nullable().validate(category_id, "category_id")
        Validator(str).is_optional().is_nullable().validate(in_claim, "in_claim")

        resolved_config = self._get_resolved_config(
            self._list_expenses_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/expenses",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_query("page", page, nullable=True)
            .add_query("pageSize", page_size, nullable=True)
            .add_query("dateFrom", date_from, nullable=True)
            .add_query("dateTo", date_to, nullable=True)
            .add_query("categoryId", category_id, nullable=True)
            .add_query("inClaim", in_claim, nullable=True)
            .serialize()
            .set_method("GET")
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def get_expense(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Any:
        """get_expense

        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._get_expense_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/expenses/{{id}}",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("GET")
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def update_expense(
        self,
        request_body: UpdateExpenseRequest,
        id_: str,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """update_expense

        :param request_body: The request body.
        :type request_body: UpdateExpenseRequest
        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(UpdateExpenseRequest).is_nullable().validate(
            request_body, "request_body"
        )
        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._update_expense_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/expenses/{{id}}",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("PUT")
            .set_body(request_body)
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def delete_expense(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Any:
        """delete_expense

        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._delete_expense_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/expenses/{{id}}",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("DELETE")
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def attach_receipt(
        self,
        request_body: AttachReceiptRequest,
        id_: str,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """attach_receipt

        :param request_body: The request body.
        :type request_body: AttachReceiptRequest
        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(AttachReceiptRequest).is_nullable().validate(
            request_body, "request_body"
        )
        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._attach_receipt_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/expenses/{{id}}/receipts",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("POST")
            .set_body(request_body)
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def remove_receipt(
        self, id_: str, receipt_id: str, *, request_config: Optional[SdkConfig] = None
    ) -> Any:
        """remove_receipt

        :param id_: id_
        :type id_: str
        :param receipt_id: receipt_id
        :type receipt_id: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).validate(id_, "id_")
        Validator(str).validate(receipt_id, "receipt_id")

        resolved_config = self._get_resolved_config(
            self._remove_receipt_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/expenses/{{id}}/receipts/{{receiptId}}",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .add_path("receiptId", receipt_id)
            .serialize()
            .set_method("DELETE")
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def create_claim(
        self,
        request_body: CreateClaimRequest,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """create_claim

        :param request_body: The request body.
        :type request_body: CreateClaimRequest
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(CreateClaimRequest).is_nullable().validate(
            request_body, "request_body"
        )

        resolved_config = self._get_resolved_config(
            self._create_claim_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/claims",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .serialize()
            .set_method("POST")
            .set_body(request_body)
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def list_claims(
        self,
        page: Union[str, None] = SENTINEL,
        page_size: Union[str, None] = SENTINEL,
        status: Union[str, None] = SENTINEL,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """list_claims

        :param page: Page number (starts at 1), defaults to None
        :type page: str, optional
        :param page_size: Number of items per page (max 100), defaults to None
        :type page_size: str, optional
        :param status: Filter by status (draft, submitted, approved, rejected, reimbursed), defaults to None
        :type status: str, optional
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).is_optional().is_nullable().validate(page, "page")
        Validator(str).is_optional().is_nullable().validate(page_size, "page_size")
        Validator(str).is_optional().is_nullable().validate(status, "status")

        resolved_config = self._get_resolved_config(
            self._list_claims_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/claims",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_query("page", page, nullable=True)
            .add_query("pageSize", page_size, nullable=True)
            .add_query("status", status, nullable=True)
            .serialize()
            .set_method("GET")
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def get_claim(self, id_: str, *, request_config: Optional[SdkConfig] = None) -> Any:
        """get_claim

        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._get_claim_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/claims/{{id}}",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("GET")
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def update_claim(
        self,
        request_body: UpdateClaimRequest,
        id_: str,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """update_claim

        :param request_body: The request body.
        :type request_body: UpdateClaimRequest
        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(UpdateClaimRequest).is_nullable().validate(
            request_body, "request_body"
        )
        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._update_claim_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/claims/{{id}}",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("PUT")
            .set_body(request_body)
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def add_expense_to_claim(
        self,
        request_body: AddExpenseToClaimRequest,
        id_: str,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """add_expense_to_claim

        :param request_body: The request body.
        :type request_body: AddExpenseToClaimRequest
        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(AddExpenseToClaimRequest).is_nullable().validate(
            request_body, "request_body"
        )
        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._add_expense_to_claim_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/claims/{{id}}/expenses",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("POST")
            .set_body(request_body)
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def remove_expense_from_claim(
        self, id_: str, expense_id: str, *, request_config: Optional[SdkConfig] = None
    ) -> Any:
        """remove_expense_from_claim

        :param id_: id_
        :type id_: str
        :param expense_id: expense_id
        :type expense_id: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).validate(id_, "id_")
        Validator(str).validate(expense_id, "expense_id")

        resolved_config = self._get_resolved_config(
            self._remove_expense_from_claim_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/claims/{{id}}/expenses/{{expenseId}}",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .add_path("expenseId", expense_id)
            .serialize()
            .set_method("DELETE")
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def submit_claim(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Any:
        """submit_claim

        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._submit_claim_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/claims/{{id}}/submit",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("POST")
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def approve_claim(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Any:
        """approve_claim

        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._approve_claim_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/claims/{{id}}/approve",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("POST")
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def reject_claim(
        self,
        request_body: RejectClaimRequest,
        id_: str,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Any:
        """reject_claim

        :param request_body: The request body.
        :type request_body: RejectClaimRequest
        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(RejectClaimRequest).is_nullable().validate(
            request_body, "request_body"
        )
        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._reject_claim_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/claims/{{id}}/reject",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("POST")
            .set_body(request_body)
        )

        response, _, _ = self.send_request(serialized_request)
        return response

    @cast_models
    def mark_as_reimbursed(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Any:
        """mark_as_reimbursed

        :param id_: id_
        :type id_: str
        ...
        :raises RequestError: Raised when a request fails, with optional HTTP status code and details.
        ...
        :return: The parsed response data.
        :rtype: Any
        """

        Validator(str).validate(id_, "id_")

        resolved_config = self._get_resolved_config(
            self._mark_as_reimbursed_config, request_config
        )

        serialized_request = (
            Serializer(
                f"{self._resolve_base_url(resolved_config) or Environment.API.url or Environment.DEFAULT.url}/claims/{{id}}/reimburse",
                [self.get_access_token(resolved_config)],
                resolved_config,
            )
            .add_path("id", id_)
            .serialize()
            .set_method("POST")
        )

        response, _, _ = self.send_request(serialized_request)
        return response
