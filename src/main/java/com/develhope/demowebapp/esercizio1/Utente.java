package com.develhope.demowebapp.esercizio1;

public class Utente {
    private String nome;
    private String provincia;

    public Utente(String nome, String luogoDiNascita) {
        this.nome = nome;
        this.provincia = luogoDiNascita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
