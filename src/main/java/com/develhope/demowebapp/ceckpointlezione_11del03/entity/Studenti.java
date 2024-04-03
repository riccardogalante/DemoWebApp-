package com.develhope.demowebapp.ceckpointlezione_11del03.entity;

import java.util.ArrayList;
import java.util.List;

public class Studenti {
    private Integer studente_id;
    private String nome;
    private String cognome;
    private List<Corsi> listaCorsi;
    public Studenti() {}

    public Studenti(Integer studente_id, String nome, String cognome) {
        this.studente_id = studente_id;
        this.nome = nome;
        this.cognome = cognome;
        this.listaCorsi = new ArrayList<>();
    }

    public Integer getStudente_id() {
        return studente_id;
    }

    public void setStudente_id(Integer studente_id) {
        this.studente_id = studente_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public List<Corsi> getListaCorsi() {
        return listaCorsi;
    }

    public void setListaCorsi(List<Corsi> listaCorsi) {
        this.listaCorsi = listaCorsi;
    }
}
