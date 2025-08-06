package br.ars.subscription_service.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.ars.subscription_service.models.PlanoAssinatura;

import java.util.UUID;

public interface PlanoAssinaturaRepository extends JpaRepository<PlanoAssinatura, UUID> {
}