from __future__ import annotations
from pydantic import Field
from typing import Optional
from typing import Any
from typing import Union
from .utils.base_model import BaseModel


class UpdateClaimRequest(BaseModel):
    """UpdateClaimRequest

    :param title: title, defaults to None
    :type title: str, optional
    """

    title: Optional[str] = Field(default=None)
