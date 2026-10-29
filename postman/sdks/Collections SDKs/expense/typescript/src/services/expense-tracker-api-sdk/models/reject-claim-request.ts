import { z } from 'zod';

/**
 * Zod schema for the RejectClaimRequest model.
 * Defines the structure and validation rules for this data type.
 * This is the shape used in application code - what developers interact with.
 */
export const rejectClaimRequest = z.lazy(() => {
  return z.object({
    rejectionReason: z.string().optional().nullable(),
  });
});

/**
 * @typedef {RejectClaimRequest} rejectClaimRequest
 * @property {string} rejectionReason
 */
export type RejectClaimRequest = z.infer<typeof rejectClaimRequest>;

/**
 * Zod schema for mapping API responses to the RejectClaimRequest application shape.
 * Handles any property name transformations from the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const rejectClaimRequestResponse = z.lazy(() => {
  return z
    .object({
      rejectionReason: z.string().optional().nullable(),
    })
    .transform((data) => ({
      rejectionReason: data['rejectionReason'],
    }));
});

/**
 * Zod schema for mapping the RejectClaimRequest application shape to API requests.
 * Handles any property name transformations required by the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const rejectClaimRequestRequest = z.lazy(() => {
  return z
    .object({
      rejectionReason: z.string().optional().nullable(),
    })
    .transform((data) => ({
      rejectionReason: data['rejectionReason'],
    }));
});
