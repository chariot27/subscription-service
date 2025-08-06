package br.ars.subscription_service.dto;

import java.util.UUID;

public class AssinaturaRequestDTO {
    private UUID userId;
    private UUID planoId;

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
}

