import { z } from 'zod';

/**
 * Zod schema for the UpdateClaimRequest model.
 * Defines the structure and validation rules for this data type.
 * This is the shape used in application code - what developers interact with.
 */
export const updateClaimRequest = z.lazy(() => {
  return z.object({
    title: z.string().optional().nullable(),
  });
});

/**
 * @typedef {UpdateClaimRequest} updateClaimRequest
 * @property {string} title
 */
export type UpdateClaimRequest = z.infer<typeof updateClaimRequest>;

/**
 * Zod schema for mapping API responses to the UpdateClaimRequest application shape.
 * Handles any property name transformations from the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const updateClaimRequestResponse = z.lazy(() => {
  return z
    .object({
      title: z.string().optional().nullable(),
    })
    .transform((data) => ({
      title: data['title'],
    }));
});

/**
 * Zod schema for mapping the UpdateClaimRequest application shape to API requests.
 * Handles any property name transformations required by the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const updateClaimRequestRequest = z.lazy(() => {
  return z
    .object({
      title: z.string().optional().nullable(),
    })
    .transform((data) => ({
      title: data['title'],
    }));
});
