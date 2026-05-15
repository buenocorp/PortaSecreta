<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portas do Saber</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Creepster&family=VT323&family=Courier+Prime:ital,wght@0,400;0,700;1,400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
    <div class="container">
        <div class="home-wrapper">
            <h1 class="titulo">PORTAS DO SABER</h1>
            <p class="subtitulo">Você tem coragem de abrir as portas?</p>

            <div class="regras-box regras-box-home">
                <h3 class="regras-titulo">COMO JOGAR</h3>
                <ul class="regras-lista">
                    <li>50 fases de desafio te aguardam</li>
                    <li>Cada fase possui 3 portas: JavaScript, Classes e SQL</li>
                    <li>Escolha uma porta e responda a pergunta corretamente</li>
                    <li>Errou? Tente novamente até acertar</li>
                    <li>O timer começa na fase 1 e para ao terminar a fase 50</li>
                    <li>O mais rápido domina o Hall da Glória</li>
                </ul>
            </div>

            <div class="home-split home-split-three">

                <!-- PROFESSOR CARD -->
                <div class="home-card">
                    <div class="home-card-titulo">&#127979; PROFESSOR</div>
                    <p class="home-card-desc">Crie uma sala e gere um código único para sua turma</p>
                    <a href="${pageContext.request.contextPath}/criar-sala" class="btn-iniciar-link">
                        &#128281; CRIAR SALA
                    </a>
                </div>

                <!-- ALUNO CARD -->
                <div class="home-card">
                    <div class="home-card-titulo">&#127918; ALUNO</div>
                    <p class="home-card-desc">Entre com o código da sala e comece a jogar</p>

                    <form action="${pageContext.request.contextPath}/iniciar" method="post" class="form-inicio">
                        <div class="input-group">
                            <input type="text" name="codigo" class="input-nome"
                                   placeholder="Código da sala (ex: K4J8MX)"
                                   maxlength="6"
                                   style="text-transform:uppercase; letter-spacing:4px; text-align:center;"
                                   autofocus
                                   oninput="this.value=this.value.toUpperCase()">
                        </div>
                        <div class="input-group">
                            <input type="text" name="nome" class="input-nome"
                                   placeholder="Seu nome..."
                                   maxlength="50">
                        </div>
                        <% String erro = (String) request.getAttribute("erro"); %>
                        <% if (erro != null && !erro.isEmpty()) { %>
                        <div class="erro-msg"><%= erro %></div>
                        <% } %>
                        <button type="submit" class="btn-iniciar btn-full">&#9654; ENTRAR NO JOGO</button>
                    </form>
                </div>

                <!-- RANKING CARD -->
                <div class="home-card">
                    <div class="home-card-titulo">&#9733; RANKING AO VIVO</div>
                    <p class="home-card-desc">Digite o código da sala para ver o placar em tempo real</p>

                    <form action="${pageContext.request.contextPath}/ranking" method="get" class="form-inicio">
                        <div class="input-group">
                            <input type="text" name="sala" class="input-nome"
                                   placeholder="Código da sala (ex: K4J8MX)"
                                   maxlength="6"
                                   style="text-transform:uppercase; letter-spacing:4px; text-align:center;"
                                   oninput="this.value=this.value.toUpperCase()">
                        </div>
                        <button type="submit" class="btn-iniciar btn-full btn-ranking-home">&#9733; VER RANKING</button>
                    </form>
                </div>

            </div>

        </div>
    </div>
</body>
</html>
