package br.ars.subscription_service.service;

import br.ars.subscription_service.dto.PlanoDTO;
import br.ars.subscription_service.mappers.PlanoMapper;
import br.ars.subscription_service.repository.PlanoAssinaturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlanoService {

    private final PlanoAssinaturaRepository repo;
    private final PlanoMapper mapper;

    public PlanoService(PlanoAssinaturaRepository repo, PlanoMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    public List<PlanoDTO> listarTodos() {
        return repo.findAll().stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }
}
