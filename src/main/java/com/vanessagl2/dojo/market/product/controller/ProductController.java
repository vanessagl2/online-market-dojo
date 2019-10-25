package com.vanessagl2.dojo.market.product.controller;

import com.vanessagl2.dojo.market.product.model.Name;
import com.vanessagl2.dojo.market.product.model.Price;
import com.vanessagl2.dojo.market.product.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

  @GetMapping(value = "/products")
  public Product findAllProducts() {
    Name expectedName = Name.builder().fullName("Full Product Name").build();
    Price expectedPrice = Price.builder().amount("10.00").currency("USD").build();

    return new Product("dummy-id", expectedName, expectedPrice);
  }
}
