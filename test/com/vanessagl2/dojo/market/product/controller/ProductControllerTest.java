package com.vanessagl2.dojo.market.product.controller;

import com.vanessagl2.dojo.market.product.model.Name;
import com.vanessagl2.dojo.market.product.model.Price;
import com.vanessagl2.dojo.market.product.model.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductControllerTest {

  @Test
  void shouldFindAllProducts() {
    ProductController productController = new ProductController();

    Product dummyProduct = productController.findAllProducts();

    Name expectedName = Name.builder().fullName("Full Product Name").build();
    Price expectedPrice = Price.builder().amount("10.00").currency("USD").build();

    Product expectedProduct = Product.builder().id("dummy-id").name(expectedName).price(expectedPrice).build();
    assertEquals(expectedProduct, dummyProduct);
  }
}