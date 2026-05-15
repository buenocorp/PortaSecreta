package com.portas.model;

import java.io.Serializable;
import java.util.Date;

public class RankingEntry implements Serializable, Comparable<RankingEntry> {

    private static final long serialVersionUID = 1L;

    private String nome;
    private long tempoMs;
    private Date dataJogo;

    public RankingEntry(String nome, long tempoMs, Date dataJogo) {
        this.nome = nome;
        this.tempoMs = tempoMs;
        this.dataJogo = dataJogo;
    }

    public String getNome() {
        return nome;
    }

    public long getTempoMs() {
        return tempoMs;
    }

    public Date getDataJogo() {
        return dataJogo;
    }

    public String getTempoFormatado() {
        long totalSegundos = tempoMs / 1000;
        long minutos = totalSegundos / 60;
        long segundos = totalSegundos % 60;
        return minutos + "min " + segundos + "s";
    }

    @Override
    public int compareTo(RankingEntry other) {
        return Long.compare(this.tempoMs, other.tempoMs);
    }
}
