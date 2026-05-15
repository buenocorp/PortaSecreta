# Portas do Saber

Jogo educacional multiplayer para salas de aula, com sistema de salas ao estilo Kahoot. Alunos entram com um código gerado pelo professor e competem em 50 fases de perguntas sobre **JavaScript**, **Programação Orientada a Objetos (Classes)** e **SQL**.

---

## Visão Geral

- **50 fases** de desafio progressivo
- **3 portas por fase**: JavaScript, Classes e SQL
- O aluno escolhe uma porta e responde a pergunta correta para avançar
- **Timer** começa na fase 1 e para ao terminar a fase 50
- **Ranking ao vivo** por sala — o professor projeta na tela enquanto os alunos jogam
- Tema visual sombrio com fontes góticas, portas brilhantes e animações CSS

---

## Tecnologias

| Camada | Tecnologia |
|--------|-----------|
| Servidor | Apache Tomcat 11 |
| Backend | Java 21 + Jakarta Servlet 6.0 (Jakarta EE 10) |
| Frontend | JSP + HTML5 + CSS3 + JavaScript |
| Arquitetura | MVC (Servlet + JSP) |
| Persistência | In-memory (ConcurrentHashMap por sala) |
| IDE | Eclipse Dynamic Web Project |

---

## Estrutura do Projeto

```
Portas/
├── src/main/java/com/portas/
│   ├── model/
│   │   ├── TipoTema.java          # Enum: JAVASCRIPT, CLASSES, SQL
│   │   ├── TipoPergunta.java      # Enum: MULTIPLA_ESCOLHA, SQL_LIVRE
│   │   ├── Opcao.java             # Opção de resposta (id, texto, correta)
│   │   ├── Pergunta.java          # Pergunta com tema, tipo e opções
│   │   ├── JogoSessao.java        # Estado do jogador na sessão HTTP
│   │   ├── Sala.java              # Sala com código e ranking de jogadores
│   │   └── RankingEntry.java      # Entrada do ranking (nome, tempo, data)
│   ├── dao/
│   │   └── PerguntaDAO.java       # Banco de perguntas (160 questões básicas)
│   ├── manager/
│   │   └── SalaManager.java       # Singleton no ServletContext — gerencia salas
│   └── servlet/
│       ├── HomeServlet.java        # GET /home — tela inicial
│       ├── IniciarServlet.java     # POST /iniciar — valida sala e inicia sessão
│       ├── CriarSalaServlet.java   # GET|POST /criar-sala — cria sala (professor)
│       ├── PortasServlet.java      # GET|POST /portas — exibe as 3 portas
│       ├── PerguntaServlet.java    # GET|POST /pergunta — exibe e corrige pergunta
│       ├── ResultadoServlet.java   # GET /resultado — feedback da resposta
│       ├── FinalizarServlet.java   # GET /finalizar — salva resultado e exibe fim
│       └── RankingServlet.java     # GET /ranking — ranking da sala
├── src/main/webapp/
│   ├── css/style.css               # Tema sombrio completo (1300+ linhas)
│   ├── js/timer.js                 # Timer em tempo real (M:SS)
│   ├── index.jsp                   # Redirect para /home
│   └── WEB-INF/
│       ├── web.xml
│       └── views/
│           ├── home.jsp            # Tela inicial (professor / aluno)
│           ├── criar_sala.jsp      # Criação de sala e exibição do código
│           ├── portas.jsp          # As 3 portas da fase atual
│           ├── pergunta.jsp        # Pergunta de múltipla escolha ou SQL livre
│           ├── resultado.jsp       # Feedback: certo/errado + próximo passo
│           ├── fim.jsp             # Fim de jogo + ranking top 10
│           └── ranking.jsp         # Ranking ao vivo da sala
```

---

## Fluxo do Jogo

### Professor
1. Acessa `/criar-sala` → clica em **CRIAR SALA**
2. Recebe um código de 6 caracteres (ex: `K4J8MX`)
3. Projeta o código ou o link `/ranking?sala=K4J8MX` para a turma
4. O ranking atualiza automaticamente a cada 10 segundos

### Aluno
1. Acessa `/home`, digita o código da sala e seu nome → **ENTRAR NO JOGO**
2. Em cada fase, escolhe uma das 3 portas (JavaScript, Classes ou SQL)
3. Responde a pergunta — erra? Tenta novamente. Acertou? Avança de fase
4. Ao completar as 50 fases, o tempo é registrado no ranking da sala

---

## Tipos de Perguntas

### Múltipla Escolha (JavaScript e Classes)
- 4 alternativas com apenas 1 correta
- Alternativas embaralhadas a cada exibição
- Perguntas não se repetem para o mesmo jogador

### SQL Livre (SQL)
- Campo de texto para digitar o comando SQL completo
- Comparação normalizada: `trim + uppercase + espaços simples`
- Exemplos: `SELECT * FROM alunos`, `CREATE TABLE produtos (...)`

---

## Banco de Perguntas

160 questões de nível básico organizadas em 3 temas:

| Tema | Tipo | Quantidade |
|------|------|-----------|
| JavaScript | Múltipla Escolha | 50 |
| Classes (POO) | Múltipla Escolha | 50 |
| SQL | Múltipla Escolha | 30 |
| SQL | Livre (texto) | 30 |
| **Total** | | **160** |

As perguntas são baseadas em conteúdo de nível introdutório de programação.

---

## Sistema de Salas

- Salas criadas em memória via `SalaManager` (Singleton no `ServletContext`)
- Código de 6 caracteres alfanuméricos sem ambiguidade (sem 0/O/1/I/L)
- Thread-safe: `ConcurrentHashMap` para acesso simultâneo de múltiplos alunos
- Rankings por sala com sincronização (`synchronized list`)
- **Atenção**: as salas são perdidas ao reiniciar o servidor (in-memory)

---

## Como Executar

### Pré-requisitos
- Java 21+
- Eclipse IDE for Enterprise Java Developers
- Apache Tomcat 11

### Passos
1. Clone ou copie o projeto para o workspace do Eclipse
2. Clique com botão direito no projeto → **Run As → Run on Server**
3. Selecione o Tomcat 11 configurado
4. Acesse: `http://localhost:8080/Portas/home`

### Deploy no Render (ou outro servidor)
1. Exporte o projeto como `.war`: **File → Export → WAR file**
2. Faça o deploy do `.war` no servidor com Tomcat 11 + Java 21
3. Acesse pela URL do servidor

---

## Rotas da Aplicação

| Método | URL | Descrição |
|--------|-----|-----------|
| GET | `/home` | Tela inicial |
| GET | `/criar-sala` | Formulário de criação de sala |
| POST | `/criar-sala` | Cria nova sala e exibe código |
| POST | `/iniciar` | Valida código e inicia sessão do aluno |
| GET | `/portas` | Exibe as 3 portas da fase atual |
| POST | `/portas` | Seleciona uma porta (tema) |
| GET | `/pergunta` | Exibe a pergunta da porta escolhida |
| POST | `/pergunta` | Submete resposta |
| GET | `/resultado` | Exibe feedback (certo/errado) |
| GET | `/finalizar` | Registra tempo e exibe fim de jogo |
| GET | `/ranking?sala=CODE` | Ranking ao vivo da sala |

---

## Tema Visual

- Fundo preto com gradiente radial e linhas de scan
- Fontes: **Creepster** (títulos), **VT323** (texto), **Courier Prime** (código/SQL)
- Portas com animações de brilho pulsante por tema:
  - JavaScript → amarelo `#f0db4f`
  - Classes → ciano `#4ec9e7`
  - SQL → rosa `#cf6679`
- Efeito de flicker nos títulos, scanlines no body, animações de entrada `fadeInUp`
