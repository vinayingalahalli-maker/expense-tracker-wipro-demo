from __future__ import annotations
from pydantic import Field
from typing import Optional
from typing import Any
from typing import Union
from .utils.base_model import BaseModel


class AddExpenseToClaimRequest(BaseModel):
    """AddExpenseToClaimRequest

    :param expense_id: expense_id, defaults to None
    :type expense_id: str, optional
    """

    expense_id: Optional[str] = Field(
        alias="expenseId", serialization_alias="expenseId", default=None
    )
