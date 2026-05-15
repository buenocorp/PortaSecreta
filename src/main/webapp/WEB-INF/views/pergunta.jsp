<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.portas.model.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portas do Saber - Pergunta</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Creepster&family=VT323&family=Courier+Prime:ital,wght@0,400;0,700;1,400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<%
    JogoSessao jogo = (JogoSessao) request.getAttribute("jogo");
    Pergunta pergunta = jogo.getPerguntaAtual();
    TipoTema tema = pergunta.getTema();

    String temaCss = "";
    String temaNome = "";
    if (tema == TipoTema.JAVASCRIPT) {
        temaCss = "js";
        temaNome = "JAVASCRIPT";
    } else if (tema == TipoTema.CLASSES) {
        temaCss = "classes";
        temaNome = "CLASSES";
    } else {
        temaCss = "sql";
        temaNome = "SQL";
    }
%>

    <div class="timer-wrapper">
        <div id="timer" class="timer">0:00</div>
    </div>

    <div class="container">
        <div class="game-header">
            <span class="fase-badge">FASE <%= jogo.getFase() %>/50</span>
            <span class="tema-badge tema-<%= temaCss %>"><%= temaNome %></span>
            <span class="jogador-nome">&#128123; <%= jogo.getNomeJogador() %></span>
        </div>

        <div class="progress-wrapper">
            <div class="progress-track">
                <div class="progress-fill" style="width: <%= (int)((jogo.getFase()-1) * 100.0 / 50) %>%;"></div>
            </div>
        </div>

        <div class="pergunta-box">
            <h2 class="pergunta-titulo">PERGUNTA</h2>
            <p class="pergunta-enunciado"><%= pergunta.getEnunciado() %></p>

            <form action="${pageContext.request.contextPath}/pergunta" method="post" class="form-resposta">
                <% if (pergunta.getTipo() == TipoPergunta.MULTIPLA_ESCOLHA) { %>
                <div class="opcoes-container">
                    <% for (Opcao opcao : pergunta.getOpcoes()) { %>
                    <label class="opcao">
                        <input type="radio" name="resposta" value="<%= opcao.getTexto().replace("\"", "&quot;") %>" required>
                        <span class="opcao-texto"><%= opcao.getTexto() %></span>
                    </label>
                    <% } %>
                </div>
                <% } else { %>
                <div class="sql-container">
                    <label class="sql-label">Digite seu comando SQL:</label>
                    <textarea name="resposta" class="sql-textarea"
                              placeholder="SELECT ..." rows="4" required
                              spellcheck="false" autocomplete="off"></textarea>
                    <p class="sql-hint">Dica: use letras maiúsculas ou minúsculas, ambas são aceitas.</p>
                </div>
                <% } %>

                <button type="submit" class="btn-responder">&#9654; RESPONDER</button>
            </form>
        </div>
    </div>

    <script>
        window.timerStartMs = <%= jogo.getTempoInicio() %>;
    </script>
    <script src="${pageContext.request.contextPath}/js/timer.js"></script>
</body>
</html>
