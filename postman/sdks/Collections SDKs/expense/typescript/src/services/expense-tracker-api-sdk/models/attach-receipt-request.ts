import { z } from 'zod';

/**
 * Zod schema for the AttachReceiptRequest model.
 * Defines the structure and validation rules for this data type.
 * This is the shape used in application code - what developers interact with.
 */
export const attachReceiptRequest = z.lazy(() => {
  return z.object({
    receiptUrl: z.string().optional().nullable(),
    fileName: z.string().optional().nullable(),
    contentType: z.string().optional().nullable(),
    sizeBytes: z.number().optional().nullable(),
  });
});

/**
 * @typedef {AttachReceiptRequest} attachReceiptRequest
 * @property {string} receiptUrl
 * @property {string} fileName
 * @property {string} contentType
 * @property {number} sizeBytes
 */
export type AttachReceiptRequest = z.infer<typeof attachReceiptRequest>;

/**
 * Zod schema for mapping API responses to the AttachReceiptRequest application shape.
 * Handles any property name transformations from the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const attachReceiptRequestResponse = z.lazy(() => {
  return z
    .object({
      receiptUrl: z.string().optional().nullable(),
      fileName: z.string().optional().nullable(),
      contentType: z.string().optional().nullable(),
      sizeBytes: z.number().optional().nullable(),
    })
    .transform((data) => ({
      receiptUrl: data['receiptUrl'],
      fileName: data['fileName'],
      contentType: data['contentType'],
      sizeBytes: data['sizeBytes'],
    }));
});

/**
 * Zod schema for mapping the AttachReceiptRequest application shape to API requests.
 * Handles any property name transformations required by the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const attachReceiptRequestRequest = z.lazy(() => {
  return z
    .object({
      receiptUrl: z.string().optional().nullable(),
      fileName: z.string().optional().nullable(),
      contentType: z.string().optional().nullable(),
      sizeBytes: z.number().optional().nullable(),
    })
    .transform((data) => ({
      receiptUrl: data['receiptUrl'],
      fileName: data['fileName'],
      contentType: data['contentType'],
      sizeBytes: data['sizeBytes'],
    }));
});
