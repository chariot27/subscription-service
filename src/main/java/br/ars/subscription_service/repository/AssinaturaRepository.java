package br.ars.subscription_service.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ars.subscription_service.models.Assinatura;

public interface AssinaturaRepository extends JpaRepository<Assinatura, UUID> {
    List<Assinatura> findByUserId(UUID userId);
}