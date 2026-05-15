<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.portas.model.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portas do Saber - Fim de Jogo</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Creepster&family=VT323&family=Courier+Prime:ital,wght@0,400;0,700;1,400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<%
    RankingEntry entry = (RankingEntry) request.getAttribute("entry");
    List<RankingEntry> ranking = (List<RankingEntry>) request.getAttribute("ranking");
    String tempoFormatado = (String) request.getAttribute("tempoFormatado");
    String codigoSala = (String) request.getAttribute("codigoSala");
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
%>

    <div class="container">
        <h1 class="titulo titulo-fim">JOGO CONCLUÍDO!</h1>

        <div class="fim-resultado-box">
            <div class="fim-jogador">&#128123; <%= entry.getNome() %></div>
            <% if (codigoSala != null && !codigoSala.isEmpty()) { %>
            <div class="fim-sala-codigo">
                Sala: <span><%= codigoSala %></span>
            </div>
            <% } %>
            <div class="fim-tempo-label">Seu tempo:</div>
            <div class="fim-tempo"><%= tempoFormatado %></div>
        </div>

        <h2 class="ranking-header">&#9733; HALL DA GLÓRIA &#9733;</h2>
        <p class="ranking-subtitulo">Top 10 Mais Rápidos</p>

        <table class="ranking-table">
            <thead>
                <tr>
                    <th>#</th>
                    <th>JOGADOR</th>
                    <th>TEMPO</th>
                    <th>DATA</th>
                </tr>
            </thead>
            <tbody>
<%
    int pos = 1;
    for (RankingEntry r : ranking) {
        boolean isCurrentPlayer = r.getNome().equals(entry.getNome()) && r.getTempoMs() == entry.getTempoMs();
        String rowClass = isCurrentPlayer ? "ranking-row-atual" : "";
%>
                <tr class="<%= rowClass %>">
                    <td class="ranking-pos">
                        <% if (pos == 1) { %>&#129351;<% } else if (pos == 2) { %>&#129352;<% } else if (pos == 3) { %>&#129353;<% } else { %><%= pos %><% } %>
                    </td>
                    <td><%= r.getNome() %></td>
                    <td class="ranking-tempo"><%= r.getTempoFormatado() %></td>
                    <td class="ranking-data"><%= sdf.format(r.getDataJogo()) %></td>
                </tr>
<%
        pos++;
    }
%>
            </tbody>
        </table>

        <div class="fim-botoes">
            <a href="${pageContext.request.contextPath}/home" class="btn-continuar btn-jogar-novamente">
                &#9654; JOGAR NOVAMENTE
            </a>
            <a href="${pageContext.request.contextPath}/ranking?sala=<%= codigoSala != null ? codigoSala : "" %>" class="btn-continuar btn-ranking-link">
                &#9733; RANKING COMPLETO
            </a>
        </div>
    </div>

</body>
</html>
