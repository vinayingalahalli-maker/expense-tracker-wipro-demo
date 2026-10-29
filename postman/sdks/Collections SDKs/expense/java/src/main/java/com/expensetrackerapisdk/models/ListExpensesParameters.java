package com.expensetrackerapisdk.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.With;
import lombok.extern.jackson.Jacksonized;
import org.openapitools.jackson.nullable.JsonNullable;

@Data
@Builder
@With
@ToString
@EqualsAndHashCode
@Jacksonized
public class ListExpensesParameters {

  /**
   * Page number (starts at 1)
   */
  @JsonProperty("page")
  private JsonNullable<String> page;

  /**
   * Number of items per page (max 100)
   */
  @JsonProperty("pageSize")
  private JsonNullable<String> pageSize;

  /**
   * Filter by date incurred from (ISO 8601)
   */
  @JsonProperty("dateFrom")
  private JsonNullable<String> dateFrom;

  /**
   * Filter by date incurred to (ISO 8601)
   */
  @JsonProperty("dateTo")
  private JsonNullable<String> dateTo;

  /**
   * Filter by category ID
   */
  @JsonProperty("categoryId")
  private JsonNullable<String> categoryId;

  /**
   * Filter by claim status (true/false)
   */
  @JsonProperty("inClaim")
  private JsonNullable<String> inClaim;

  // FSM-59: capture unknown JSON fields so they round-trip on re-serialize.
  // @Builder.Default keeps the empty-map default in the Lombok-generated builder; without it the
  // builder would leave the map null and the any-setter would NPE on the first unknown field.
  // Deserialization is wired via the builder's @JsonAnySetter (see the Builder below), NOT here:
  // Lombok @Jacksonized deserializes through the builder and does not copy a field-level
  // @JsonAnySetter across, so unknown fields would be silently dropped if it lived on this field.
  @Builder.Default
  private Map<String, Object> additionalProperties = new HashMap<>();

  // @JsonAnyGetter must sit on the getter (not the field) so Jackson inlines the unknown entries on
  // serialize. On the field it double-registers with the Lombok getter and leaks a literal
  // "additionalProperties" property into every request body and object parameter.
  // Declaring the getter here also stops Lombok @Data from generating its own.
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  @JsonIgnore
  public String getPage() {
    return page.orElse(null);
  }

  @JsonIgnore
  public String getPageSize() {
    return pageSize.orElse(null);
  }

  @JsonIgnore
  public String getDateFrom() {
    return dateFrom.orElse(null);
  }

  @JsonIgnore
  public String getDateTo() {
    return dateTo.orElse(null);
  }

  @JsonIgnore
  public String getCategoryId() {
    return categoryId.orElse(null);
  }

  @JsonIgnore
  public String getInClaim() {
    return inClaim.orElse(null);
  }

  // Overwrite lombok builder methods
  public static class ListExpensesParametersBuilder {

    private JsonNullable<String> page = JsonNullable.undefined();

    @JsonProperty("page")
    public ListExpensesParametersBuilder page(String value) {
      this.page = JsonNullable.of(value);
      return this;
    }

    private JsonNullable<String> pageSize = JsonNullable.undefined();

    @JsonProperty("pageSize")
    public ListExpensesParametersBuilder pageSize(String value) {
      this.pageSize = JsonNullable.of(value);
      return this;
    }

    private JsonNullable<String> dateFrom = JsonNullable.undefined();

    @JsonProperty("dateFrom")
    public ListExpensesParametersBuilder dateFrom(String value) {
      this.dateFrom = JsonNullable.of(value);
      return this;
    }

    private JsonNullable<String> dateTo = JsonNullable.undefined();

    @JsonProperty("dateTo")
    public ListExpensesParametersBuilder dateTo(String value) {
      this.dateTo = JsonNullable.of(value);
      return this;
    }

    private JsonNullable<String> categoryId = JsonNullable.undefined();

    @JsonProperty("categoryId")
    public ListExpensesParametersBuilder categoryId(String value) {
      this.categoryId = JsonNullable.of(value);
      return this;
    }

    private JsonNullable<String> inClaim = JsonNullable.undefined();

    @JsonProperty("inClaim")
    public ListExpensesParametersBuilder inClaim(String value) {
      this.inClaim = JsonNullable.of(value);
      return this;
    }

    @JsonAnySetter
    public ListExpensesParametersBuilder additionalProperties(String key, Object value) {
      if (this.additionalProperties$value == null) {
        this.additionalProperties$value = new HashMap<>();
      }
      this.additionalProperties$value.put(key, value);
      this.additionalProperties$set = true;
      return this;
    }
  }
}
