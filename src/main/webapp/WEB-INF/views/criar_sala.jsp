<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.portas.model.Sala" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portas do Saber - Criar Sala</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Creepster&family=VT323&family=Courier+Prime:ital,wght@0,400;0,700;1,400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<%
    Sala sala = (Sala) request.getAttribute("sala");
%>
    <div class="container">
        <div class="home-wrapper">
            <h1 class="titulo">CRIAR SALA</h1>

            <% if (sala == null) { %>
            <p class="subtitulo">Gere um código para sua turma</p>

            <div class="regras-box">
                <p class="regras-titulo" style="margin-bottom:10px;">COMO FUNCIONA</p>
                <ul class="regras-lista" style="text-align:left;">
                    <li>Clique em "GERAR CÓDIGO DA SALA" abaixo</li>
                    <li>Compartilhe o código gerado com seus alunos</li>
                    <li>Os alunos acessam o site e digitam o código</li>
                    <li>Cada aluno joga independentemente</li>
                    <li>Todos os resultados ficam no ranking da sala</li>
                </ul>
            </div>

            <form action="${pageContext.request.contextPath}/criar-sala" method="post" class="form-inicio">
                <button type="submit" class="btn-iniciar btn-full">&#128281; GERAR CÓDIGO DA SALA</button>
            </form>

            <div class="home-links" style="margin-top:25px;">
                <a href="${pageContext.request.contextPath}/home" class="link-ranking">&#8592; VOLTAR</a>
            </div>

            <% } else { %>
            <p class="subtitulo">Compartilhe este código com seus alunos</p>

            <div class="codigo-sala-wrapper">
                <div class="sala-codigo-label">CÓDIGO DA SALA</div>
                <div class="codigo-sala" id="codigoSala" onclick="copiarCodigo()" title="Clique para copiar">
                    <%= sala.getCodigo() %>
                </div>
                <button class="btn-copiar" onclick="copiarCodigo()">&#128203; COPIAR CÓDIGO</button>
                <div id="msg-copiado" class="msg-copiado">
                    &#10003; Código copiado!
                </div>
            </div>

            <p class="sala-instrucao">
                Os alunos acessam o site, clicam em <strong style="color:var(--text);">ALUNO</strong> e digitam este código para entrar no jogo.
            </p>

            <div class="sala-acoes">
                <a href="${pageContext.request.contextPath}/ranking?sala=<%= sala.getCodigo() %>" class="btn-continuar btn-ranking-link">
                    &#9733; ACOMPANHAR RANKING
                </a>
                <a href="${pageContext.request.contextPath}/criar-sala" class="btn-continuar">
                    &#8635; CRIAR OUTRA SALA
                </a>
            </div>

            <div class="home-links" style="margin-top:25px;">
                <a href="${pageContext.request.contextPath}/home" class="link-ranking">&#8592; VOLTAR AO INÍCIO</a>
            </div>

            <script>
                function copiarCodigo() {
                    var codigo = '<%= sala.getCodigo() %>';
                    navigator.clipboard.writeText(codigo).then(function() {
                        var msg = document.getElementById('msg-copiado');
                        msg.style.opacity = '1';
                        setTimeout(function() {
                            msg.style.opacity = '0';
                        }, 2000);
                    }).catch(function() {
                        // Fallback: select text
                        var el = document.getElementById('codigoSala');
                        var range = document.createRange();
                        range.selectNode(el);
                        window.getSelection().removeAllRanges();
                        window.getSelection().addRange(range);
                    });
                }
            </script>
            <% } %>
        </div>
    </div>
</body>
</html>
