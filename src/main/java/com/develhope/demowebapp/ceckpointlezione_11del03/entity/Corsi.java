package com.develhope.demowebapp.ceckpointlezione_11del03.entity;

import java.util.List;

public class Corsi {
    private Integer corso_id;
    private String nomeCorso;
    private Integer crediti;
    public Corsi() {}

    public Corsi(Integer corso_id, String nomeCorso, Integer crediti) {
        this.corso_id = corso_id;
        this.nomeCorso = nomeCorso;
        this.crediti = crediti;
    }

    public Integer getCorso_id() {
        return corso_id;
    }

    public void setCorso_id(Integer corso_id) {
        this.corso_id = corso_id;
    }

    public String getNomeCorso() {
        return nomeCorso;
    }

    public void setNomeCorso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }

    public Integer getCrediti() {
        return crediti;
    }

    public void setCrediti(Integer crediti) {
        this.crediti = crediti;
    }
}
