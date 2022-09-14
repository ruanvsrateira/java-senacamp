package com.senac.senacamp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

@Entity
public class Campeonato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String local;
    private String primeiroLugar;
    private String segundoLugar;
    private String terceiroLugar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

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
