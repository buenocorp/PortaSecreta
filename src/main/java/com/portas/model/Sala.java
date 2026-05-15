package com.portas.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Sala {
    private final String codigo;
    private final Date criadaEm;
    private final List<RankingEntry> ranking;

    public Sala(String codigo) {
        this.codigo = codigo;
        this.criadaEm = new Date();
        this.ranking = Collections.synchronizedList(new ArrayList<>());
    }

    public void adicionarResultado(RankingEntry entry) {
        synchronized (ranking) {
            ranking.add(entry);
            Collections.sort(ranking);
        }
    }

    public List<RankingEntry> getRanking() {
        synchronized (ranking) {
            return new ArrayList<>(ranking);
        }
    }

    public String getCodigo() { return codigo; }
    public Date getCriadaEm() { return criadaEm; }
}
