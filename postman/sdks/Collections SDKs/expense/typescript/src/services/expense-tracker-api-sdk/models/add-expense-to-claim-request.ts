import { z } from 'zod';

/**
 * Zod schema for the AddExpenseToClaimRequest model.
 * Defines the structure and validation rules for this data type.
 * This is the shape used in application code - what developers interact with.
 */
export const addExpenseToClaimRequest = z.lazy(() => {
  return z.object({
    expenseId: z.string().optional().nullable(),
  });
});

/**
 * @typedef {AddExpenseToClaimRequest} addExpenseToClaimRequest
 * @property {string} expenseId
 */
export type AddExpenseToClaimRequest = z.infer<typeof addExpenseToClaimRequest>;

/**
 * Zod schema for mapping API responses to the AddExpenseToClaimRequest application shape.
 * Handles any property name transformations from the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const addExpenseToClaimRequestResponse = z.lazy(() => {
  return z
    .object({
      expenseId: z.string().optional().nullable(),
    })
    .transform((data) => ({
      expenseId: data['expenseId'],
    }));
});

/**
 * Zod schema for mapping the AddExpenseToClaimRequest application shape to API requests.
 * Handles any property name transformations required by the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const addExpenseToClaimRequestRequest = z.lazy(() => {
  return z
    .object({
      expenseId: z.string().optional().nullable(),
    })
    .transform((data) => ({
      expenseId: data['expenseId'],
    }));
});
