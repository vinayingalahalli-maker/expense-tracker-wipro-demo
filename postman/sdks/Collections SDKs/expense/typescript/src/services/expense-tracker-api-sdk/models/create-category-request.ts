import { z } from 'zod';

/**
 * Zod schema for the CreateCategoryRequest model.
 * Defines the structure and validation rules for this data type.
 * This is the shape used in application code - what developers interact with.
 */
export const createCategoryRequest = z.lazy(() => {
  return z.object({
    name: z.string().optional().nullable(),
    receiptThreshold: z.number().optional().nullable(),
    active: z.boolean().optional().nullable(),
  });
});

/**
 * @typedef {CreateCategoryRequest} createCategoryRequest
 * @property {string} name
 * @property {number} receiptThreshold
 * @property {boolean} active
 */
export type CreateCategoryRequest = z.infer<typeof createCategoryRequest>;

/**
 * Zod schema for mapping API responses to the CreateCategoryRequest application shape.
 * Handles any property name transformations from the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const createCategoryRequestResponse = z.lazy(() => {
  return z
    .object({
      name: z.string().optional().nullable(),
      receiptThreshold: z.number().optional().nullable(),
      active: z.boolean().optional().nullable(),
    })
    .transform((data) => ({
      name: data['name'],
      receiptThreshold: data['receiptThreshold'],
      active: data['active'],
    }));
});

/**
 * Zod schema for mapping the CreateCategoryRequest application shape to API requests.
 * Handles any property name transformations required by the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const createCategoryRequestRequest = z.lazy(() => {
  return z
    .object({
      name: z.string().optional().nullable(),
      receiptThreshold: z.number().optional().nullable(),
      active: z.boolean().optional().nullable(),
    })
    .transform((data) => ({
      name: data['name'],
      receiptThreshold: data['receiptThreshold'],
      active: data['active'],
    }));
});
