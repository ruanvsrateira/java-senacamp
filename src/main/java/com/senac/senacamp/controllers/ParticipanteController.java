package com.senac.senacamp.controllers;

import com.senac.senacamp.dao.CampeonatoDAO;
import com.senac.senacamp.dao.ParticipanteDAO;
import com.senac.senacamp.model.Campeonato;
import com.senac.senacamp.model.Participante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.Optional;

@Controller
public class ParticipanteController {
    @Autowired
    ParticipanteDAO participanteDAO;

    @Autowired
    CampeonatoDAO campeonatoDAO;

    @GetMapping("/participantes")
    String listarParticipantes(Model model,  @RequestParam("idCamp") Integer idCamp) {
        model.addAttribute("participantes", participanteDAO.findAllById(Collections.singleton(idCamp)));
        return "participantes";
    }

    @GetMapping("/cadastrar-participante")
    String cadastrarParticipante(Model model, Participante participante, @RequestParam(name = "idCamp") Integer idCamp) {
        Campeonato camp = campeonatoDAO.findById(idCamp).get();
        model.addAttribute("campeonato", camp);
        return "cadastrar-participantes";
    }

    @GetMapping("/salvar-participante")
    public String salvarParticipante(Model model, Participante participante,
                                     @RequestParam(name = "nome") String nome,
                                     @RequestParam(name = "timePreferencia") String timePreferencia,
                                     @RequestParam(name = "mensagem") String mensagem,
                                     @RequestParam(name = "id") Integer id){
        Campeonato camp = campeonatoDAO.findById(id).get();
        participante = new Participante(nome, timePreferencia, mensagem, camp);
        participanteDAO.save(participante);
        return listarParticipantes(model, id);
    }
}
