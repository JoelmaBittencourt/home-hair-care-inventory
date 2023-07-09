package com.homeHairCareInventory.controller;

import com.homeHairCareInventory.model.Produto;
import com.homeHairCareInventory.model.dto.ProdutoDto;
import com.homeHairCareInventory.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @PostMapping("post")
    public void create(@RequestBody ProdutoDto dto) {
        produtoRepository.save(new Produto(dto));
    }

    @PostMapping
    public ResponseEntity<Produto> saveProduct(@RequestBody @Valid ProdutoDto produtoDto) {
        var product = new Produto();
        BeanUtils.copyProperties(produtoDto, product);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(product));
    }

    @GetMapping
    public List<ProdutoDto> listar() {
        return produtoRepository.findAll().stream().map(ProdutoDto::new).toList();
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid ProdutoDto dados) {
        var medico = produtoRepository.getReferenceById(dados.code());
        medico.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Integer code) {
        produtoRepository.deleteById(code);
    }
}
