package com.portas.model;

public class Opcao {

    private int id;
    private String texto;
    private boolean correta;

    public Opcao(int id, String texto, boolean correta) {
        this.id = id;
        this.texto = texto;
        this.correta = correta;
    }

    public int getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public boolean isCorreta() {
        return correta;
    }
}
