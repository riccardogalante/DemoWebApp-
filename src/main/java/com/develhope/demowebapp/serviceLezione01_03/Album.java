package com.develhope.demowebapp.serviceLezione01_03;

public class Album {
    private String nome;
    private int anno;

    public Album(String nome, int anno) {
        this.nome = nome;
        this.anno = anno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }
}
