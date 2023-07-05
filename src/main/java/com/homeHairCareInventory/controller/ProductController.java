package com.homeHairCareInventory.controller;

import com.homeHairCareInventory.model.Product;
import com.homeHairCareInventory.model.dto.ProductDto;
import com.homeHairCareInventory.repository.ProductRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping("post")
    public void create(@RequestBody ProductDto dto) {
        productRepository.save(new Product(dto));
    }

    @PostMapping
    public ResponseEntity<Product> saveProduct(@RequestBody @Valid ProductDto productDto) {
        var product = new Product();
        BeanUtils.copyProperties(productDto, product);
        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(product));
    }


    @GetMapping
    public List<ProductDto> listar() {
        return productRepository.findAll().stream().map(ProductDto::new).toList();
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid ProductDto dados) {
        var medico = productRepository.getReferenceById(dados.code());
        medico.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Integer code) {
        productRepository.deleteById(code);
    }
}
