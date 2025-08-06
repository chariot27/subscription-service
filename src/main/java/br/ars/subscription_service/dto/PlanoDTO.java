package br.ars.subscription_service.dto;

import java.util.UUID;

public class PlanoDTO {
    private UUID id;
    private String nome;
    private Double preco;
    private String tipoUsuario;
    private String descricao;
    private Integer duracaoDias;
    
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public String getTipoUsuario() {
        return tipoUsuario;
    }
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Integer getDuracaoDias() {
        return duracaoDias;
    }
    public void setDuracaoDias(Integer duracaoDias) {
        this.duracaoDias = duracaoDias;
    }

    
}

