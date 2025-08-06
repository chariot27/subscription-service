package br.ars.subscription_service.models;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "planos")
public class PlanoAssinatura {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private UUID id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Tipo")
    private String tipoUsuario; // PROFISSIONAL, CONSULTOR, EMPRESA
    
    @Column(name = "Preco")
    private Double preco;

    @Column(name = "DiasDuracao")
    private Integer duracaoDias; // validade
    
    @Column(name = "Descricao")
    private String descricao;

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

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getDuracaoDias() {
        return duracaoDias;
    }

    public void setDuracaoDias(Integer duracaoDias) {
        this.duracaoDias = duracaoDias;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}