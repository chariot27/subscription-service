package br.ars.subscription_service.dto;

import java.time.LocalDate;
import java.util.UUID;

public class AssinaturaDTO {
    private UUID id;
    private UUID userId;
    private UUID planoId;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Boolean ativa;
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
    public UUID getPlanoId() {
        return planoId;
    }
    public void setPlanoId(UUID planoId) {
        this.planoId = planoId;
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

