package com.portas.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JogoSessao {

    private String nomeJogador;
    private String codigoSala;
    private int fase;
    private long tempoInicio;
    private ArrayList<Integer> perguntasUsadas;
    private Pergunta perguntaAtual;
    private TipoTema[] temasPortas;
    private int tentativasAtual;

    public JogoSessao(String nomeJogador, String codigoSala, long tempoInicio) {
        this.nomeJogador = nomeJogador;
        this.codigoSala = codigoSala;
        this.fase = 1;
        this.tempoInicio = tempoInicio;
        this.perguntasUsadas = new ArrayList<>();
        this.temasPortas = new TipoTema[3];
        embaralharTemasPortas();
    }

    public void embaralharTemasPortas() {
        List<TipoTema> temas = new ArrayList<>(Arrays.asList(TipoTema.values()));
        Collections.shuffle(temas);
        temasPortas = temas.toArray(new TipoTema[3]);
    }

    public void incrementarFase() {
        this.fase++;
    }

    public int getTentativasAtual() {
        return tentativasAtual;
    }

    public void incrementarTentativa() {
        this.tentativasAtual++;
    }

    public void resetarTentativas() {
        this.tentativasAtual = 0;
    }

    public void resetarJogo() {
        this.fase = 1;
        this.tempoInicio = System.currentTimeMillis();
        this.perguntasUsadas = new ArrayList<>();
        this.perguntaAtual = null;
        this.tentativasAtual = 0;
        embaralharTemasPortas();
    }

    public void marcarPerguntaUsada(int id) {
        if (!perguntasUsadas.contains(id)) {
            perguntasUsadas.add(id);
        }
    }

    public long tempoDecorrido() {
        return System.currentTimeMillis() - tempoInicio;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(String codigoSala) {
        this.codigoSala = codigoSala;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public long getTempoInicio() {
        return tempoInicio;
    }

    public void setTempoInicio(long tempoInicio) {
        this.tempoInicio = tempoInicio;
    }

    public ArrayList<Integer> getPerguntasUsadas() {
        return perguntasUsadas;
    }

    public void setPerguntasUsadas(ArrayList<Integer> perguntasUsadas) {
        this.perguntasUsadas = perguntasUsadas;
    }

    public Pergunta getPerguntaAtual() {
        return perguntaAtual;
    }

    public void setPerguntaAtual(Pergunta perguntaAtual) {
        this.perguntaAtual = perguntaAtual;
    }

    public TipoTema[] getTemasPortas() {
        return temasPortas;
    }

    public void setTemasPortas(TipoTema[] temasPortas) {
        this.temasPortas = temasPortas;
    }
}
