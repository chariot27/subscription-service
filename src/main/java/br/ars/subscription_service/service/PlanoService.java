package br.ars.subscription_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.ars.subscription_service.models.PlanoAssinatura;
import br.ars.subscription_service.repository.PlanoAssinaturaRepository;

@Service
public class PlanoService {
    private final PlanoAssinaturaRepository repo;

    public PlanoService(PlanoAssinaturaRepository repo) {
        this.repo = repo;
    }

    public List<PlanoAssinatura> listarTodos() {
        return repo.findAll();
    }
}
