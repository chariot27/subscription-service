package br.ars.subscription_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ars.subscription_service.models.PlanoAssinatura;
import br.ars.subscription_service.service.PlanoService;

@RestController
@RequestMapping("/api/planos")
public class PlanoController {

    private final PlanoService service;

    public PlanoController(PlanoService service) {
        this.service = service;
    }

    @GetMapping
    public List<PlanoAssinatura> listarPlanos() {
        return service.listarTodos();
    }
}
