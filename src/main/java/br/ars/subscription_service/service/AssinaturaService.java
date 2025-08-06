package br.ars.subscription_service.service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.ars.subscription_service.models.Assinatura;
import br.ars.subscription_service.models.PlanoAssinatura;
import br.ars.subscription_service.repository.AssinaturaRepository;
import br.ars.subscription_service.repository.PlanoAssinaturaRepository;

@Service
public class AssinaturaService {
    private final AssinaturaRepository repo;
    private final PlanoAssinaturaRepository planoRepo;

    public AssinaturaService(AssinaturaRepository repo, PlanoAssinaturaRepository planoRepo) {
        this.repo = repo;
        this.planoRepo = planoRepo;
    }

    public Assinatura assinar(UUID userId, UUID planoId) {
        PlanoAssinatura plano = planoRepo.findById(planoId).orElseThrow();

        Assinatura assinatura = new Assinatura();
        assinatura.setUserId(userId);
        assinatura.setPlano(plano);
        assinatura.setDataInicio(LocalDate.now());
        assinatura.setDataFim(LocalDate.now().plusDays(plano.getDuracaoDias()));
        assinatura.setAtiva(true);
        assinatura.setRenovacaoAutomatica(false);

        return repo.save(assinatura);
    }

    public List<Assinatura> listarPorUsuario(UUID userId) {
        return repo.findByUserId(userId);
    }

    public Assinatura cancelar(UUID assinaturaId) {
        Assinatura a = repo.findById(assinaturaId).orElseThrow();
        a.setAtiva(false);
        return repo.save(a);
    }

    public Assinatura renovar(UUID assinaturaId) {
        Assinatura a = repo.findById(assinaturaId).orElseThrow();
        a.setDataFim(a.getDataFim().plusDays(a.getPlano().getDuracaoDias()));
        a.setAtiva(true);
        return repo.save(a);
    }
}
