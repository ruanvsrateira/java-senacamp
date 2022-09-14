package com.senac.senacamp.model;

import javax.persistence.*;

@Entity
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String timePreferencia;
    private String mensagem;

    @ManyToOne
    @JoinColumn(name = "campeonato_id", nullable = false)
    private Campeonato campeonato;

    public Participante() {
    }

    public Participante(String nome, String timePreferencia, String mensagem, Campeonato campeonato) {
        this.nome = nome;
        this.timePreferencia = timePreferencia;
        this.mensagem = mensagem;
        this.campeonato = campeonato;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTimePreferencia() {
        return timePreferencia;
    }

    public void setTimePreferencia(String timePreferencia) {
        this.timePreferencia = timePreferencia;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }
}
