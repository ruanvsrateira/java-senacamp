package com.senac.senacamp.model;

public class Campeonato {
    private String titulo;
    private String primeiroLugar;
    private String segundoLugar;
    private String terceiroLugar;

    public String getNome() {
        return titulo;
    }

    public void setNome(String nome) {
        this.titulo = nome;
    }

    public String getPrimeiroLugar() {
        return primeiroLugar;
    }

    public void setPrimeiroLugar(String primeiroLugar) {
        this.primeiroLugar = primeiroLugar;
    }

    public String getSegundoLugar() {
        return segundoLugar;
    }

    public void setSegundoLugar(String segundoLugar) {
        this.segundoLugar = segundoLugar;
    }

    public String getTerceiroLugar() {
        return terceiroLugar;
    }

    public void setTerceiroLugar(String terceiroLugar) {
        this.terceiroLugar = terceiroLugar;
    }
}
