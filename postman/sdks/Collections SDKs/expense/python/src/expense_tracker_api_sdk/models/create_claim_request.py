from __future__ import annotations
from typing import List
from pydantic import Field
from typing import Optional
from typing import Any
from typing import Union
from .utils.base_model import BaseModel


class CreateClaimRequest(BaseModel):
    """CreateClaimRequest

    :param title: title, defaults to None
    :type title: str, optional
    :param expense_ids: expense_ids, defaults to None
    :type expense_ids: List[Any], optional
    """

    title: Optional[str] = Field(default=None)
    expense_ids: Optional[List[Any]] = Field(
        alias="expenseIds", serialization_alias="expenseIds", default=None
    )
