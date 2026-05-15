package com.portas.dao;

import com.portas.model.RankingEntry;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RankingDAO {

    private static final String ARQUIVO = System.getProperty("user.home") + "/.portas_ranking.dat";

    @SuppressWarnings("unchecked")
    public List<RankingEntry> carregar() {
        File f = new File(ARQUIVO);
        if (!f.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            Object obj = ois.readObject();
            if (obj instanceof List) {
                return (List<RankingEntry>) obj;
            }
        } catch (IOException | ClassNotFoundException e) {
            // Return empty list on any error
        }
        return new ArrayList<>();
    }

    public void salvar(RankingEntry entry) {
        List<RankingEntry> lista = carregar();
        lista.add(entry);
        Collections.sort(lista);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARQUIVO))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<RankingEntry> getTop(int n) {
        List<RankingEntry> lista = carregar();
        if (lista.size() <= n) {
            return lista;
        }
        return lista.subList(0, n);
    }
}
