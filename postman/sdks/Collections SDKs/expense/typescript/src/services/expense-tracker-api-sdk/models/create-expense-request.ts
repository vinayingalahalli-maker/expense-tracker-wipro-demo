import { z } from 'zod';

/**
 * Zod schema for the CreateExpenseRequest model.
 * Defines the structure and validation rules for this data type.
 * This is the shape used in application code - what developers interact with.
 */
export const createExpenseRequest = z.lazy(() => {
  return z.object({
    amount: z.number().optional().nullable(),
    currency: z.string().optional().nullable(),
    amountEur: z.number().optional().nullable(),
    dateIncurred: z.string().optional().nullable(),
    categoryId: z.string().optional().nullable(),
    description: z.string().optional().nullable(),
    paymentMethod: z.string().optional().nullable(),
    clientReference: z.string().optional().nullable(),
  });
});

/**
 * @typedef {CreateExpenseRequest} createExpenseRequest
 * @property {number} amount
 * @property {string} currency
 * @property {number} amountEur
 * @property {string} dateIncurred
 * @property {string} categoryId
 * @property {string} description
 * @property {string} paymentMethod
 * @property {string} clientReference
 */
export type CreateExpenseRequest = z.infer<typeof createExpenseRequest>;

/**
 * Zod schema for mapping API responses to the CreateExpenseRequest application shape.
 * Handles any property name transformations from the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const createExpenseRequestResponse = z.lazy(() => {
  return z
    .object({
      amount: z.number().optional().nullable(),
      currency: z.string().optional().nullable(),
      amountEur: z.number().optional().nullable(),
      dateIncurred: z.string().optional().nullable(),
      categoryId: z.string().optional().nullable(),
      description: z.string().optional().nullable(),
      paymentMethod: z.string().optional().nullable(),
      clientReference: z.string().optional().nullable(),
    })
    .transform((data) => ({
      amount: data['amount'],
      currency: data['currency'],
      amountEur: data['amountEur'],
      dateIncurred: data['dateIncurred'],
      categoryId: data['categoryId'],
      description: data['description'],
      paymentMethod: data['paymentMethod'],
      clientReference: data['clientReference'],
    }));
});

/**
 * Zod schema for mapping the CreateExpenseRequest application shape to API requests.
 * Handles any property name transformations required by the API schema.
 * If property names match the API schema exactly, this is identical to the application shape.
 */
export const createExpenseRequestRequest = z.lazy(() => {
  return z
    .object({
      amount: z.number().optional().nullable(),
      currency: z.string().optional().nullable(),
      amountEur: z.number().optional().nullable(),
      dateIncurred: z.string().optional().nullable(),
      categoryId: z.string().optional().nullable(),
      description: z.string().optional().nullable(),
      paymentMethod: z.string().optional().nullable(),
      clientReference: z.string().optional().nullable(),
    })
    .transform((data) => ({
      amount: data['amount'],
      currency: data['currency'],
      amountEur: data['amountEur'],
      dateIncurred: data['dateIncurred'],
      categoryId: data['categoryId'],
      description: data['description'],
      paymentMethod: data['paymentMethod'],
      clientReference: data['clientReference'],
    }));
});
