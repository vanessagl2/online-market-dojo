package com.vanessagl2.dojo.market.product.controller;

import com.vanessagl2.dojo.market.product.model.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ProductController.class)
public class ProductControllerIntegrationTest {
  @Autowired
  MockMvc mvc;


  @Test
  public void createProduct() throws Exception {
    String TOKEN_ATTR_NAME = "org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository.CSRF_TOKEN";


    String jsonAsString = "{\n" +
        "    \"name\": {\n" +
        "        \"fullName\": \"string\",\n" +
        "        \"displayName\": \"string\"\n" +
        "    },\n" +
        "    \"purchasedAt\": \"2007-12-03T10:15:30-05:00\"\n" +
        "}";

    mvc.perform(post("/products")
        .contentType(MediaType.APPLICATION_JSON)
        .content(jsonAsString))
        .andExpect(status().isCreated());
  }

}

