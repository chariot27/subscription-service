package br.ars.subscription_service.models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "assinaturas")
public class Assinatura {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private UUID id;

    @Column(name = "User_Id")
    private UUID userId;

    @ManyToOne
    @Column(name = "Plano")
    private PlanoAssinatura plano;

    @Column(name = "Data_Inicio")
    private LocalDate dataInicio;

    @Column(name = "Data_Fim")
    private LocalDate dataFim;

    @Column(name = "Ativo")
    private Boolean ativa;

    @Column(name = "Renovacao_Automatica")
    private Boolean renovacaoAutomatica;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public PlanoAssinatura getPlano() {
        return plano;
    }

    public void setPlano(PlanoAssinatura plano) {
        this.plano = plano;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }

    public Boolean getRenovacaoAutomatica() {
        return renovacaoAutomatica;
    }

    public void setRenovacaoAutomatica(Boolean renovacaoAutomatica) {
        this.renovacaoAutomatica = renovacaoAutomatica;
    }

}
