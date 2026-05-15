<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.portas.model.*" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portas do Saber - Fase <%= ((JogoSessao)request.getAttribute("jogo")).getFase() %></title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Creepster&family=VT323&family=Courier+Prime:ital,wght@0,400;0,700;1,400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<%
    JogoSessao jogo = (JogoSessao) request.getAttribute("jogo");
    TipoTema[] temasOrdem = (TipoTema[]) request.getAttribute("temasOrdem");
    String erro = (String) request.getAttribute("erro");
%>

    <div class="timer-wrapper">
        <div id="timer" class="timer">0:00</div>
    </div>

    <div class="container">
        <div class="game-header">
            <span class="fase-badge">FASE <%= jogo.getFase() %>/50</span>
            <span class="jogador-nome">&#128123; <%= jogo.getNomeJogador() %></span>
        </div>

        <div class="progress-wrapper">
            <div class="progress-track">
                <div class="progress-fill" style="width: <%= (int)((jogo.getFase()-1) * 100.0 / 50) %>%;"></div>
            </div>
        </div>

        <h1 class="titulo titulo-pequeno">ESCOLHA SUA PORTA</h1>
        <p class="subtitulo-portas">Cada porta esconde um desafio. Escolha com sabedoria...</p>

        <% if (erro != null) { %>
        <div class="erro-msg"><%= erro %></div>
        <% } %>

        <div class="porta-container">
<%
    String[] cssClasses = {"porta-js", "porta-classes", "porta-sql"};
    String[] nomesPorta = {"JAVASCRIPT", "CLASSES", "SQL"};
    String[] icones = {"&#60;/&#62;", "&#9670;", "&#128200;"};

    for (int i = 0; i < temasOrdem.length; i++) {
        TipoTema tema = temasOrdem[i];
        String cssClass = "";
        String nomePorta = "";
        String icone = "";
        if (tema == TipoTema.JAVASCRIPT) {
            cssClass = "porta-js";
            nomePorta = "JAVASCRIPT";
            icone = "</>";
        } else if (tema == TipoTema.CLASSES) {
            cssClass = "porta-classes";
            nomePorta = "CLASSES";
            icone = "{ }";
        } else {
            cssClass = "porta-sql";
            nomePorta = "SQL";
            icone = "DB";
        }
%>
            <div class="porta-wrapper">
                <div class="placa placa-<%= cssClass.replace("porta-", "") %>"><%= nomePorta %></div>
                <form action="${pageContext.request.contextPath}/portas" method="post" style="display:inline;">
                    <input type="hidden" name="tema" value="<%= tema.name() %>">
                    <button type="submit" class="porta <%= cssClass %>">
                        <div class="porta-painel">
                            <div class="porta-icone"><%= icone %></div>
                        </div>
                        <div class="porta-knob"></div>
                    </button>
                </form>
            </div>
<%
    }
%>
        </div>
    </div>

    <script>
        window.timerStartMs = <%= jogo.getTempoInicio() %>;
    </script>
    <script src="${pageContext.request.contextPath}/js/timer.js"></script>
</body>
</html>
