from __future__ import annotations
from pydantic import Field
from typing import Optional
from typing import Any
from typing import Union
from .utils.base_model import BaseModel


class AttachReceiptRequest(BaseModel):
    """AttachReceiptRequest

    :param receipt_url: receipt_url, defaults to None
    :type receipt_url: str, optional
    :param file_name: file_name, defaults to None
    :type file_name: str, optional
    :param content_type: content_type, defaults to None
    :type content_type: str, optional
    :param size_bytes: size_bytes, defaults to None
    :type size_bytes: float, optional
    """

    receipt_url: Optional[str] = Field(
        alias="receiptUrl", serialization_alias="receiptUrl", default=None
    )
    file_name: Optional[str] = Field(
        alias="fileName", serialization_alias="fileName", default=None
    )
    content_type: Optional[str] = Field(
        alias="contentType", serialization_alias="contentType", default=None
    )
    size_bytes: Optional[float] = Field(
        alias="sizeBytes", serialization_alias="sizeBytes", default=None
    )
