package com.vanessagl2.dojo.market.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Product {
  private String id;
  private Name name;
  private Price price;
}