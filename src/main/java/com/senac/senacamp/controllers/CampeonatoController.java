package com.senac.senacamp.controllers;

import com.senac.senacamp.dao.CampeonatoDAO;
import com.senac.senacamp.model.Campeonato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CampeonatoController {

    @Autowired
    CampeonatoDAO dao;

    @GetMapping("/campeonatos")
    String listarCampeonatos(Model model) {
        model.addAttribute("campeonatos", dao.findAll());
        return "campeonatos";
    }

    @GetMapping("/cadastrar-campeonato")
    String cadastrarCampeonato(Campeonato campeonato) {
        return "cadastrar-campeonato";
    }

    @PostMapping("/cadastrar-campeonato")
    public String salvarCampeonato(Model model, Campeonato campeonato){
        dao.save(campeonato);
        return listarCampeonatos(model);
    }
}
