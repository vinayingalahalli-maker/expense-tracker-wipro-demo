from typing import Awaitable, Optional, Any, Union
from .utils.to_async import to_async
from ..expense_tracker_api_sdk import ExpenseTrackerApiSdkService
from ...net.sdk_config import SdkConfig
from ...models.utils.sentinel import SENTINEL
from ...models import (
    CreateCategoryRequest,
    UpdateCategoryRequest,
    CreateExpenseRequest,
    UpdateExpenseRequest,
    AttachReceiptRequest,
    CreateClaimRequest,
    UpdateClaimRequest,
    AddExpenseToClaimRequest,
    RejectClaimRequest,
)


class ExpenseTrackerApiSdkServiceAsync(ExpenseTrackerApiSdkService):
    """
    Async Wrapper for ExpenseTrackerApiSdkServiceAsync
    """

    def create_category(
        self,
        request_body: CreateCategoryRequest,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:
        return to_async(super().create_category)(
            request_body, request_config=request_config
        )

    def list_categories(
        self,
        page: Union[str, None] = SENTINEL,
        page_size: Union[str, None] = SENTINEL,
        active: Union[str, None] = SENTINEL,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:
        return to_async(super().list_categories)(
            **{
                k: v
                for k, v in {
                    "page": page,
                    "page_size": page_size,
                    "active": active,
                }.items()
                if v is not SENTINEL
            },
            request_config=request_config,
        )

    def get_category(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:
        return to_async(super().get_category)(id_, request_config=request_config)

    def update_category(
        self,
        request_body: UpdateCategoryRequest,
        id_: str,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:
        return to_async(super().update_category)(
            request_body, id_, request_config=request_config
        )

    def retire_category(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:
        return to_async(super().retire_category)(id_, request_config=request_config)

    def create_expense(
        self,
        request_body: CreateExpenseRequest,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:
        return to_async(super().create_expense)(
            request_body, request_config=request_config
        )

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
    ) -> Awaitable[Any]:
        return to_async(super().list_expenses)(
            **{
                k: v
                for k, v in {
                    "page": page,
                    "page_size": page_size,
                    "date_from": date_from,
                    "date_to": date_to,
                    "category_id": category_id,
                    "in_claim": in_claim,
                }.items()
                if v is not SENTINEL
            },
            request_config=request_config,
        )

    def get_expense(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:
        return to_async(super().get_expense)(id_, request_config=request_config)

    def update_expense(
        self,
        request_body: UpdateExpenseRequest,
        id_: str,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:
        return to_async(super().update_expense)(
            request_body, id_, request_config=request_config
        )

    def delete_expense(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:
        return to_async(super().delete_expense)(id_, request_config=request_config)

    def attach_receipt(
        self,
        request_body: AttachReceiptRequest,
        id_: str,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:
        return to_async(super().attach_receipt)(
            request_body, id_, request_config=request_config
        )

    def remove_receipt(
        self, id_: str, receipt_id: str, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:
        return to_async(super().remove_receipt)(
            id_, receipt_id, request_config=request_config
        )

    def create_claim(
        self,
        request_body: CreateClaimRequest,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:
        return to_async(super().create_claim)(
            request_body, request_config=request_config
        )

    def list_claims(
        self,
        page: Union[str, None] = SENTINEL,
        page_size: Union[str, None] = SENTINEL,
        status: Union[str, None] = SENTINEL,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:
        return to_async(super().list_claims)(
            **{
                k: v
                for k, v in {
                    "page": page,
                    "page_size": page_size,
                    "status": status,
                }.items()
                if v is not SENTINEL
            },
            request_config=request_config,
        )

    def get_claim(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:
        return to_async(super().get_claim)(id_, request_config=request_config)

    def update_claim(
        self,
        request_body: UpdateClaimRequest,
        id_: str,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:
        return to_async(super().update_claim)(
            request_body, id_, request_config=request_config
        )

    def add_expense_to_claim(
        self,
        request_body: AddExpenseToClaimRequest,
        id_: str,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:
        return to_async(super().add_expense_to_claim)(
            request_body, id_, request_config=request_config
        )

    def remove_expense_from_claim(
        self, id_: str, expense_id: str, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:
        return to_async(super().remove_expense_from_claim)(
            id_, expense_id, request_config=request_config
        )

    def submit_claim(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:
        return to_async(super().submit_claim)(id_, request_config=request_config)

    def approve_claim(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:
        return to_async(super().approve_claim)(id_, request_config=request_config)

    def reject_claim(
        self,
        request_body: RejectClaimRequest,
        id_: str,
        *,
        request_config: Optional[SdkConfig] = None,
    ) -> Awaitable[Any]:
        return to_async(super().reject_claim)(
            request_body, id_, request_config=request_config
        )

    def mark_as_reimbursed(
        self, id_: str, *, request_config: Optional[SdkConfig] = None
    ) -> Awaitable[Any]:
        return to_async(super().mark_as_reimbursed)(id_, request_config=request_config)
