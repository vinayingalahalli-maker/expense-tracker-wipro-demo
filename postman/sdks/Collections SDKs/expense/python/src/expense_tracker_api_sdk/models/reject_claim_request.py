from __future__ import annotations
from pydantic import Field
from typing import Optional
from typing import Any
from typing import Union
from .utils.base_model import BaseModel


class RejectClaimRequest(BaseModel):
    """RejectClaimRequest

    :param rejection_reason: rejection_reason, defaults to None
    :type rejection_reason: str, optional
    """

    rejection_reason: Optional[str] = Field(
        alias="rejectionReason", serialization_alias="rejectionReason", default=None
    )
