package com.portas.manager;

import com.portas.model.Sala;
import jakarta.servlet.ServletContext;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class SalaManager {
    private static final String CONTEXT_ATTR = "salaManager";
    private final ConcurrentHashMap<String, Sala> salas = new ConcurrentHashMap<>();

    public static SalaManager getInstance(ServletContext ctx) {
        SalaManager mgr = (SalaManager) ctx.getAttribute(CONTEXT_ATTR);
        if (mgr == null) {
            synchronized (SalaManager.class) {
                mgr = (SalaManager) ctx.getAttribute(CONTEXT_ATTR);
                if (mgr == null) {
                    mgr = new SalaManager();
                    ctx.setAttribute(CONTEXT_ATTR, mgr);
                }
            }
        }
        return mgr;
    }

    public Sala criarSala() {
        String codigo = gerarCodigo();
        while (salas.containsKey(codigo)) {
            codigo = gerarCodigo();
        }
        Sala sala = new Sala(codigo);
        salas.put(codigo, sala);
        return sala;
    }

    public Sala getSala(String codigo) {
        if (codigo == null) return null;
        return salas.get(codigo.toUpperCase().trim());
    }

    private String gerarCodigo() {
        // Unambiguous chars (no 0/O, 1/I/L)
        String chars = "ABCDEFGHJKLMNPQRSTUVWXYZ23456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(6);
        for (int i = 0; i < 6; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }
}
