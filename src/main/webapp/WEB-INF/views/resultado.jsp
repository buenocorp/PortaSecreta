<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.portas.model.*" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portas do Saber - Resultado</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Creepster&family=VT323&family=Courier+Prime:ital,wght@0,400;0,700;1,400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<%
    JogoSessao jogo = (JogoSessao) request.getAttribute("jogo");
    Boolean feedbackCorreto = (Boolean) request.getAttribute("feedbackCorreto");
    String feedbackRespostaCorreta = (String) request.getAttribute("feedbackRespostaCorreta");
    boolean correto = Boolean.TRUE.equals(feedbackCorreto);
    int fase = jogo.getFase();
    boolean jogoFinalizado = correto && fase > 50;
%>

    <% if (!jogoFinalizado) { %>
    <div class="timer-wrapper">
        <div id="timer" class="timer">0:00</div>
    </div>
    <% } %>

    <div class="container">
        <div class="game-header">
            <% if (!jogoFinalizado) { %>
            <span class="fase-badge">FASE <%= fase <= 50 ? fase : 50 %>/50</span>
            <% } %>
            <span class="jogador-nome">&#128123; <%= jogo.getNomeJogador() %></span>
        </div>

        <div class="resultado-box">
            <% if (correto) { %>
            <div class="resultado-icone correto-icone">&#10003;</div>
            <h2 class="resultado-titulo correto">CORRETO!</h2>
            <p class="resultado-msg correto-msg">
                <% if (jogoFinalizado) { %>
                Você completou todas as 50 fases! Parabéns, guerreiro!
                <% } else { %>
                Excelente! Avance para a próxima fase!
                <% } %>
            </p>
            <% } else { %>
            <div class="resultado-icone incorreto-icone">&#10007;</div>
            <h2 class="resultado-titulo incorreto">INCORRETO!</h2>
            <p class="resultado-msg incorreto-msg">Não desista! Tente novamente.</p>
            <div class="resposta-correta-box">
                <span class="resposta-correta-label">Resposta correta:</span>
                <span class="resposta-correta-valor"><%= feedbackRespostaCorreta %></span>
            </div>
            <% } %>

            <div class="resultado-botoes">
                <% if (jogoFinalizado) { %>
                <a href="${pageContext.request.contextPath}/finalizar" class="btn-continuar btn-finalizar">
                    &#9654; VER RESULTADO FINAL
                </a>
                <% } else if (correto) { %>
                <a href="${pageContext.request.contextPath}/portas" class="btn-continuar">
                    &#9654; PRÓXIMA FASE
                </a>
                <% } else { %>
                <a href="${pageContext.request.contextPath}/pergunta" class="btn-continuar btn-tentar">
                    &#9654; TENTAR NOVAMENTE
                </a>
                <% } %>
            </div>
        </div>
    </div>

    <% if (!jogoFinalizado) { %>
    <script>
        window.timerStartMs = <%= jogo.getTempoInicio() %>;
    </script>
    <script src="${pageContext.request.contextPath}/js/timer.js"></script>
    <% } %>
</body>
</html>
