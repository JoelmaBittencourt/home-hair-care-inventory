package com.homeHairCareInventory.model.dto;

import com.homeHairCareInventory.model.Marca;
import com.homeHairCareInventory.model.Product;
import com.homeHairCareInventory.model.Tipo;

import java.time.LocalDate;

public record ProductDto(
        Integer code,
        String nome,
        double preco,
        int tamanho,
        int quantidade,
        LocalDate validade,
        String localDeCompra,
        Tipo tipoProduto,
        Marca marca,
        String descricao,
        LocalDate dataCompra
) {
    public ProductDto(Product product) {
        this(product.getCode(),
                product.getNome(),
                product.getPreco(),
                product.getTamanho(),
                product.getQuantidade(),
                product.getValidade(),
                product.getLocalDeCompra(),
                product.getTipoProduto(),
                product.getMarca(),
                product.getDescricao(),
                product.getDataCompra());
    }

}

