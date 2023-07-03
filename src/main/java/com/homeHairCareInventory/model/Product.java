package com.homeHairCareInventory.model;

import com.homeHairCareInventory.model.dto.ProductDto;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;
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


    public Product() {
    }

    public Product(ProductDto dto) {
        this.nome = dto.nome();
        this.preco = dto.preco();
        this.quantidade = dto.quantidade();
        this.tamanho = dto.tamanho();
        this.validade = dto.validade();
        this.localDeCompra = dto.localDeCompra();
        this.tipoProduto = dto.tipoProduto();
        this.marca = dto.marca();
        this.descricao = dto.descricao();
        this.dataCompra = dto.dataCompra();
    }


    public Integer getCode() {
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
