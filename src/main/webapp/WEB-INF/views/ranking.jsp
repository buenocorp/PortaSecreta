<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.portas.model.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portas do Saber - Ranking</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Creepster&family=VT323&family=Courier+Prime:ital,wght@0,400;0,700;1,400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
<%
    Sala sala = (Sala) request.getAttribute("sala");
    List<RankingEntry> ranking = (List<RankingEntry>) request.getAttribute("ranking");
    String erro = (String) request.getAttribute("erro");
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    if (sala != null) {
%>
    <meta http-equiv="refresh" content="10">
<%
    }
%>
</head>
<body>

    <div class="nav-topo">
        <a href="${pageContext.request.contextPath}/home" class="btn-voltar-home">&#8592; INÍCIO</a>
    </div>

    <div class="container">

<%
    if (sala == null && erro == null) {
        // Case 1: No sala provided — show search form
%>
        <h1 class="titulo">HALL DA GLÓRIA</h1>
        <p class="subtitulo">Digite o código da sala para ver o ranking</p>

        <form action="${pageContext.request.contextPath}/ranking" method="get" class="form-buscar-sala">
            <input type="text" name="sala" class="input-codigo-sala"
                   placeholder="CÓDIGO DA SALA"
                   maxlength="6"
                   autofocus
                   oninput="this.value=this.value.toUpperCase()"
                   style="text-transform:uppercase;">
            <button type="submit" class="btn-iniciar" style="width:100%;">&#9733; VER RANKING</button>
        </form>

        <div class="ranking-botoes">
            <a href="${pageContext.request.contextPath}/home" class="btn-continuar" style="margin-top:20px;">
                &#9654; JOGAR AGORA
            </a>
        </div>

<%
    } else if (erro != null) {
        // Case 3: Sala not found
%>
        <h1 class="titulo">HALL DA GLÓRIA</h1>

        <div class="erro-msg" style="max-width:480px; margin:20px auto;"><%= erro %></div>

        <form action="${pageContext.request.contextPath}/ranking" method="get" class="form-buscar-sala" style="margin-top:20px;">
            <input type="text" name="sala" class="input-codigo-sala"
                   placeholder="CÓDIGO DA SALA"
                   maxlength="6"
                   autofocus
                   oninput="this.value=this.value.toUpperCase()"
                   style="text-transform:uppercase;">
            <button type="submit" class="btn-iniciar" style="width:100%;">&#9733; TENTAR NOVAMENTE</button>
        </form>

        <div class="ranking-botoes">
            <a href="${pageContext.request.contextPath}/home" class="btn-continuar" style="margin-top:20px;">
                &#9654; JOGAR AGORA
            </a>
        </div>

<%
    } else {
        // Case 2: Sala found — show ranking
%>
        <h1 class="titulo">HALL DA GLÓRIA</h1>

        <div class="ranking-sala-codigo">
            SALA: <%= sala.getCodigo() %>
            <span class="ranking-live-badge">AO VIVO</span>
        </div>

        <p class="ranking-subtitulo">Os guerreiros mais rápidos do conhecimento</p>

        <% if (ranking == null || ranking.isEmpty()) { %>
        <div class="ranking-vazio">
            <p>Nenhum jogador concluiu o jogo ainda.</p>
            <p>Seja o primeiro a entrar para o Hall da Glória!</p>
        </div>
        <% } else { %>
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
%>
                <tr>
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
        <% } %>

        <div class="ranking-botoes">
            <a href="${pageContext.request.contextPath}/home" class="btn-continuar">
                &#9654; JOGAR AGORA
            </a>
        </div>

<%
    }
%>

    </div>

</body>
</html>
