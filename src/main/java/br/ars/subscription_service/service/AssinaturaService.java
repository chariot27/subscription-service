package br.ars.subscription_service.service;

import br.ars.subscription_service.dto.AssinaturaDTO;
import br.ars.subscription_service.dto.AssinaturaRequestDTO;
import br.ars.subscription_service.mappers.AssinaturaMapper;
import br.ars.subscription_service.models.Assinatura;
import br.ars.subscription_service.models.PlanoAssinatura;
import br.ars.subscription_service.repository.AssinaturaRepository;
import br.ars.subscription_service.repository.PlanoAssinaturaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class AssinaturaService {

    private final AssinaturaRepository repo;
    private final PlanoAssinaturaRepository planoRepo;
    private final AssinaturaMapper mapper;

    public AssinaturaService(AssinaturaRepository repo,
                              PlanoAssinaturaRepository planoRepo,
                              AssinaturaMapper mapper) {
        this.repo = repo;
        this.planoRepo = planoRepo;
        this.mapper = mapper;
    }

    public AssinaturaDTO assinar(AssinaturaRequestDTO dto) {
        PlanoAssinatura plano = planoRepo.findById(dto.getPlanoId()).orElseThrow();

        Assinatura assinatura = new Assinatura();
        assinatura.setUserId(dto.getUserId());
        assinatura.setPlano(plano);
        assinatura.setDataInicio(LocalDate.now());
        assinatura.setDataFim(LocalDate.now().plusDays(plano.getDuracaoDias()));
        assinatura.setAtiva(true);
        assinatura.setRenovacaoAutomatica(false);

        return mapper.toDTO(repo.save(assinatura));
    }

    public List<AssinaturaDTO> listarPorUsuario(UUID userId) {
        return repo.findByUserId(userId).stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    public AssinaturaDTO cancelar(UUID assinaturaId) {
        Assinatura a = repo.findById(assinaturaId).orElseThrow();
        a.setAtiva(false);
        return mapper.toDTO(repo.save(a));
    }

    public AssinaturaDTO renovar(UUID assinaturaId) {
        Assinatura a = repo.findById(assinaturaId).orElseThrow();
        a.setDataFim(a.getDataFim().plusDays(a.getPlano().getDuracaoDias()));
        a.setAtiva(true);
        return mapper.toDTO(repo.save(a));
    }
}
