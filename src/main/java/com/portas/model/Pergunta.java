package com.portas.model;

import java.util.List;

public class Pergunta {

    private int id;
    private TipoTema tema;
    private String enunciado;
    private TipoPergunta tipo;
    private List<Opcao> opcoes;
    private String respostaCorreta;

    public Pergunta(int id, TipoTema tema, String enunciado, TipoPergunta tipo,
                    List<Opcao> opcoes, String respostaCorreta) {
        this.id = id;
        this.tema = tema;
        this.enunciado = enunciado;
        this.tipo = tipo;
        this.opcoes = opcoes;
        this.respostaCorreta = respostaCorreta;
    }

    public int getId() {
        return id;
    }

    public TipoTema getTema() {
        return tema;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public TipoPergunta getTipo() {
        return tipo;
    }

    public List<Opcao> getOpcoes() {
        return opcoes;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }
}
