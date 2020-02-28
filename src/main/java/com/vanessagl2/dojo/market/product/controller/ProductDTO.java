package com.vanessagl2.dojo.market.product.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vanessagl2.dojo.market.product.model.Name;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;

@Data
public class ProductDTO {
  @NotNull
  private String id;

  @NotNull
  private Name name;

  @JsonProperty
  private OffsetDateTime purchasedAt;
}
