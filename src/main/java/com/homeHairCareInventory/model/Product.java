package com.homeHairCareInventory.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID code;
    private String nome;
    private double preco;
    private int quantidade;
    private int tamanho;
    private LocalDate validade;
    private String localDeCompra;
    @Enumerated(EnumType.STRING)
    private Tipo tipoProduto;
    @Enumerated(EnumType.STRING)
    private Marca marca;
    private String descricao;
    private Boolean ativo;
    private LocalDate dataCompra;

    public UUID getCode() {
        return code;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getTamanho() {
        return tamanho;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public String getLocalDeCompra() {
        return localDeCompra;
    }

    public Tipo getTipoProduto() {
        return tipoProduto;
    }

    public Marca getMarca() {
        return marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }
}
