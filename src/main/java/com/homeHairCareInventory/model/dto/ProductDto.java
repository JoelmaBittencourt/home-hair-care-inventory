package com.homeHairCareInventory.model.dto;

import com.homeHairCareInventory.model.Marca;
import com.homeHairCareInventory.model.Tipo;

import java.time.LocalDate;

public record ProductDto(
        String nome,
        double preco,
        int tamanho,
        LocalDate validade,
        String localDeCompra,
        Tipo tipoProduto,
        Marca marca,
        String descricao,
        LocalDate dataCompra
) {
}
