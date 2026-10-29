export interface ListCategoriesParams {
  page?: string | null;
  pageSize?: string | null;
  active?: string | null;
}

export interface ListExpensesParams {
  page?: string | null;
  pageSize?: string | null;
  dateFrom?: string | null;
  dateTo?: string | null;
  categoryId?: string | null;
  inClaim?: string | null;
}

export interface ListClaimsParams {
  page?: string | null;
  pageSize?: string | null;
  status?: string | null;
}
