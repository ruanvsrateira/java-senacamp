package com.senac.senacamp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CampeonatoController {

    @GetMapping("/campeonatos")
    String listarContatos() {
        return "campeonatos";
    };

    @GetMapping("/cadastrar-campeonato")
    String cadastrarCampeonato() {
        return "cadastrar-campeonato";
    };
}
