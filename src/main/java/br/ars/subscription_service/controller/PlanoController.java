package br.ars.subscription_service.controller;

import br.ars.subscription_service.dto.PlanoDTO;
import br.ars.subscription_service.service.PlanoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/planos")
public class PlanoController {

    private final PlanoService planoService;

    public PlanoController(PlanoService planoService) {
        this.planoService = planoService;
    }

    @GetMapping
    public ResponseEntity<List<PlanoDTO>> listarPlanos() {
        return ResponseEntity.ok(planoService.listarTodos());
    }
}
