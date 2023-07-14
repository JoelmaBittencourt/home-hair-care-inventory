package com.homeHairCareInventory.model.dto;

import com.homeHairCareInventory.model.Marca;
import com.homeHairCareInventory.model.Produto;
import com.homeHairCareInventory.model.Tipo;

import java.time.LocalDate;

public record ProdutoDto2(
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

}

