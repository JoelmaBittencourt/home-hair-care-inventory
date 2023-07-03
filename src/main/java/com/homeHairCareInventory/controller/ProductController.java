package com.homeHairCareInventory.controller;

import com.homeHairCareInventory.model.Product;
import com.homeHairCareInventory.model.dto.ProductDto;
import com.homeHairCareInventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping
    public void create(@RequestBody ProductDto dto) {
        productRepository.save(new Product(dto));
    }
}
