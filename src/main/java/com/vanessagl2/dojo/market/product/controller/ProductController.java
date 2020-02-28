package com.vanessagl2.dojo.market.product.controller;

import com.vanessagl2.dojo.market.product.model.Name;
import com.vanessagl2.dojo.market.product.model.Price;
import com.vanessagl2.dojo.market.product.model.Product;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
@RequestMapping(value = "/products")
public class ProductController {


  @GetMapping
  public Product findAllProducts() {
    Name expectedName = Name.builder().fullName("Full Product Name").build();
    Price expectedPrice = Price.builder().amount("10.00").currency("USD").build();

    return new Product("dummy-id", expectedName, expectedPrice, "2007-12-03T10:15:30-05:00");
  }


  @PostMapping(consumes = "application/json")
  @ResponseStatus(HttpStatus.CREATED)
  public void createProduct(@RequestBody ProductDTO productDTO) {
    System.out.println(">>>> ENTERED CREATEPRODUCT API");
    System.out.println(productDTO);
    System.out.println(productDTO.getPurchasedAt().toZonedDateTime());
    System.out.println(productDTO.getPurchasedAt().toString());
    System.out.println(productDTO.getPurchasedAt().toLocalDateTime());
  }
}
