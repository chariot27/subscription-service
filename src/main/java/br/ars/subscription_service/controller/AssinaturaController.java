package br.ars.subscription_service.controller;

import br.ars.subscription_service.dto.AssinaturaDTO;
import br.ars.subscription_service.dto.AssinaturaRequestDTO;
import br.ars.subscription_service.service.AssinaturaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/assinaturas")
public class AssinaturaController {

    private final AssinaturaService assinaturaService;

    public AssinaturaController(AssinaturaService assinaturaService) {
        this.assinaturaService = assinaturaService;
    }

    @PostMapping
    public ResponseEntity<AssinaturaDTO> assinar(@RequestBody AssinaturaRequestDTO dto) {
        return ResponseEntity.ok(assinaturaService.assinar(dto));
    }

    @GetMapping("/usuario/{userId}")
    public ResponseEntity<List<AssinaturaDTO>> listarPorUsuario(@PathVariable UUID userId) {
        return ResponseEntity.ok(assinaturaService.listarPorUsuario(userId));
    }

    @PostMapping("/cancelar/{assinaturaId}")
    public ResponseEntity<AssinaturaDTO> cancelar(@PathVariable UUID assinaturaId) {
        return ResponseEntity.ok(assinaturaService.cancelar(assinaturaId));
    }

    @PostMapping("/renovar/{assinaturaId}")
    public ResponseEntity<AssinaturaDTO> renovar(@PathVariable UUID assinaturaId) {
        return ResponseEntity.ok(assinaturaService.renovar(assinaturaId));
    }
}
