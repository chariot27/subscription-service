package br.ars.subscription_service.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.ars.subscription_service.models.Assinatura;
import br.ars.subscription_service.service.AssinaturaService;

@RestController
@RequestMapping("/api/assinaturas")
public class AssinaturaController {

    private final AssinaturaService service;

    public AssinaturaController(AssinaturaService service) {
        this.service = service;
    }

    @PostMapping
    public Assinatura assinar(@RequestParam UUID userId, @RequestParam UUID planoId) {
        return service.assinar(userId, planoId);
    }

    @GetMapping("/{userId}")
    public List<Assinatura> listarPorUsuario(@PathVariable UUID userId) {
        return service.listarPorUsuario(userId);
    }

    @PatchMapping("/{id}/cancelar")
    public Assinatura cancelar(@PathVariable UUID id) {
        return service.cancelar(id);
    }

    @PatchMapping("/{id}/renovar")
    public Assinatura renovar(@PathVariable UUID id) {
        return service.renovar(id);
    }
}
