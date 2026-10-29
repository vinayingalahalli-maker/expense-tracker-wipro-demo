from __future__ import annotations
from pydantic import Field
from typing import Optional
from typing import Any
from typing import Union
from .utils.base_model import BaseModel


class CreateCategoryRequest(BaseModel):
    """CreateCategoryRequest

    :param name: name, defaults to None
    :type name: str, optional
    :param receipt_threshold: receipt_threshold, defaults to None
    :type receipt_threshold: float, optional
    :param active: active, defaults to None
    :type active: bool, optional
    """

    name: Optional[str] = Field(default=None)
    receipt_threshold: Optional[float] = Field(
        alias="receiptThreshold", serialization_alias="receiptThreshold", default=None
    )
    active: Optional[bool] = Field(default=None)
