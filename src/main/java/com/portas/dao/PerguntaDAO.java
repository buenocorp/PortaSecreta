package com.portas.dao;

import com.portas.model.Opcao;
import com.portas.model.Pergunta;
import com.portas.model.TipoPergunta;
import com.portas.model.TipoTema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PerguntaDAO {

    private static final List<Pergunta> PERGUNTAS = new ArrayList<>();

    static {
        // ── JAVASCRIPT (ids 1-22) ─────────────────────────────────────────────
        // Correct answers distributed across positions 1-4 in rotation

        // id=1  correct at pos 2
        PERGUNTAS.add(new Pergunta(1, TipoTema.JAVASCRIPT,
                "O que é uma variável em programação?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Executa instruções em sequência", false),
                        new Opcao(2, "Guarda um valor no código. Ex: let nome = 'Ana'", true),
                        new Opcao(3, "Conecta ao banco de dados", false),
                        new Opcao(4, "Define o estilo visual da página", false)
                ), "Guarda um valor no código. Ex: let nome = 'Ana'"));

        // id=2  correct at pos 3
        PERGUNTAS.add(new Pergunta(2, TipoTema.JAVASCRIPT,
                "O que é uma função em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Tipo de dado numérico", false),
                        new Opcao(2, "Conexão com banco de dados", false),
                        new Opcao(3, "Bloco de código com nome que podemos chamar várias vezes", true),
                        new Opcao(4, "Elemento HTML", false)
                ), "Bloco de código com nome que podemos chamar várias vezes"));

        // id=3  correct at pos 4
        PERGUNTAS.add(new Pergunta(3, TipoTema.JAVASCRIPT,
                "O que é um array em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Texto entre aspas", false),
                        new Opcao(2, "Valor verdadeiro ou falso", false),
                        new Opcao(3, "Função assíncrona especial", false),
                        new Opcao(4, "Lista de vários valores em sequência. Ex: [1, 2, 3]", true)
                ), "Lista de vários valores em sequência. Ex: [1, 2, 3]"));

        // id=4  correct at pos 1
        PERGUNTAS.add(new Pergunta(4, TipoTema.JAVASCRIPT,
                "O que é uma string em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Tipo de dado que representa texto entre aspas", true),
                        new Opcao(2, "Lista de números", false),
                        new Opcao(3, "Função sem retorno", false),
                        new Opcao(4, "Tipo lógico", false)
                ), "Tipo de dado que representa texto entre aspas"));

        // id=5  correct at pos 2
        PERGUNTAS.add(new Pergunta(5, TipoTema.JAVASCRIPT,
                "O que é um booleano em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Número decimal", false),
                        new Opcao(2, "Tipo que só pode ser true ou false", true),
                        new Opcao(3, "Texto longo", false),
                        new Opcao(4, "Lista ordenada", false)
                ), "Tipo que só pode ser true ou false"));

        // id=6  correct at pos 3
        PERGUNTAS.add(new Pergunta(6, TipoTema.JAVASCRIPT,
                "O que é um objeto em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Tipo de laço de repetição", false),
                        new Opcao(2, "Função especial sem retorno", false),
                        new Opcao(3, "Agrupamento de dados com chave e valor. Ex: { nome: 'Ana' }", true),
                        new Opcao(4, "Método estático", false)
                ), "Agrupamento de dados com chave e valor. Ex: { nome: 'Ana' }"));

        // id=7  correct at pos 4
        PERGUNTAS.add(new Pergunta(7, TipoTema.JAVASCRIPT,
                "O que faz console.log() em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Salva dados no banco", false),
                        new Opcao(2, "Cria uma variável", false),
                        new Opcao(3, "Apaga elementos da página", false),
                        new Opcao(4, "Mostra mensagens no terminal/console do navegador", true)
                ), "Mostra mensagens no terminal/console do navegador"));

        // id=8  correct at pos 1
        PERGUNTAS.add(new Pergunta(8, TipoTema.JAVASCRIPT,
                "O que é um evento em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Algo que acontece na página: clique, tecla, scroll...", true),
                        new Opcao(2, "Variável global", false),
                        new Opcao(3, "Laço de repetição", false),
                        new Opcao(4, "Função anônima", false)
                ), "Algo que acontece na página: clique, tecla, scroll..."));

        // id=9  correct at pos 2
        PERGUNTAS.add(new Pergunta(9, TipoTema.JAVASCRIPT,
                "O que é escopo de uma variável em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Tipo de dado especial", false),
                        new Opcao(2, "Área do código onde a variável pode ser acessada", true),
                        new Opcao(3, "Método de array", false),
                        new Opcao(4, "Classe abstrata", false)
                ), "Área do código onde a variável pode ser acessada"));

        // id=10  correct at pos 3
        PERGUNTAS.add(new Pergunta(10, TipoTema.JAVASCRIPT,
                "O que faz a palavra-chave return em uma função?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Cria uma variável local", false),
                        new Opcao(2, "Imprime no console", false),
                        new Opcao(3, "Devolve um valor para quem chamou a função", true),
                        new Opcao(4, "Inicia um loop", false)
                ), "Devolve um valor para quem chamou a função"));

        // id=11  correct at pos 4
        PERGUNTAS.add(new Pergunta(11, TipoTema.JAVASCRIPT,
                "Qual palavra-chave declara uma variável que PODE mudar de valor?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "const", false),
                        new Opcao(2, "final", false),
                        new Opcao(3, "static", false),
                        new Opcao(4, "let", true)
                ), "let"));

        // id=12  correct at pos 1
        PERGUNTAS.add(new Pergunta(12, TipoTema.JAVASCRIPT,
                "O que é uma estrutura if/else em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Executa código apenas se uma condição for verdadeira", true),
                        new Opcao(2, "Cria um loop infinito", false),
                        new Opcao(3, "Define uma função", false),
                        new Opcao(4, "Importa um módulo", false)
                ), "Executa código apenas se uma condição for verdadeira"));

        // id=13  correct at pos 2
        PERGUNTAS.add(new Pergunta(13, TipoTema.JAVASCRIPT,
                "O que é iteração em programação?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Criar um objeto", false),
                        new Opcao(2, "Repetir um bloco de código várias vezes (for ou while)", true),
                        new Opcao(3, "Declarar uma variável", false),
                        new Opcao(4, "Importar um módulo", false)
                ), "Repetir um bloco de código várias vezes (for ou while)"));

        // id=14  correct at pos 3
        PERGUNTAS.add(new Pergunta(14, TipoTema.JAVASCRIPT,
                "O que é um parâmetro de função?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Valor que a função retorna", false),
                        new Opcao(2, "Tipo de dado especial", false),
                        new Opcao(3, "Variável que a função recebe ao ser chamada", true),
                        new Opcao(4, "Loop dentro da função", false)
                ), "Variável que a função recebe ao ser chamada"));

        // id=15  correct at pos 4
        PERGUNTAS.add(new Pergunta(15, TipoTema.JAVASCRIPT,
                "O que é um callback em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Tipo de variável numérica", false),
                        new Opcao(2, "Método do DOM", false),
                        new Opcao(3, "Classe herdada", false),
                        new Opcao(4, "Função passada como argumento para outra função", true)
                ), "Função passada como argumento para outra função"));

        // id=16  correct at pos 1
        PERGUNTAS.add(new Pergunta(16, TipoTema.JAVASCRIPT,
                "Qual método percorre cada item de um array executando uma ação?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "forEach()", true),
                        new Opcao(2, "filter()", false),
                        new Opcao(3, "map()", false),
                        new Opcao(4, "sort()", false)
                ), "forEach()"));

        // id=17  correct at pos 2
        PERGUNTAS.add(new Pergunta(17, TipoTema.JAVASCRIPT,
                "Qual método de array retorna somente os itens que passam em uma condição?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "forEach()", false),
                        new Opcao(2, "filter()", true),
                        new Opcao(3, "sort()", false),
                        new Opcao(4, "push()", false)
                ), "filter()"));

        // id=18  correct at pos 3
        PERGUNTAS.add(new Pergunta(18, TipoTema.JAVASCRIPT,
                "Qual método cria um NOVO array transformando cada item do original?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "forEach()", false),
                        new Opcao(2, "filter()", false),
                        new Opcao(3, "map()", true),
                        new Opcao(4, "find()", false)
                ), "map()"));

        // id=19  correct at pos 4
        PERGUNTAS.add(new Pergunta(19, TipoTema.JAVASCRIPT,
                "O que faz o método split() em uma string?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Junta dois textos", false),
                        new Opcao(2, "Remove espaços extras", false),
                        new Opcao(3, "Converte para número", false),
                        new Opcao(4, "Quebra o texto em partes e retorna um array", true)
                ), "Quebra o texto em partes e retorna um array"));

        // id=20  correct at pos 1
        PERGUNTAS.add(new Pergunta(20, TipoTema.JAVASCRIPT,
                "O que faz o método trim() em uma string?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Remove espaços extras do início e do fim", true),
                        new Opcao(2, "Converte para maiúsculas", false),
                        new Opcao(3, "Divide o texto em partes", false),
                        new Opcao(4, "Ordena os caracteres", false)
                ), "Remove espaços extras do início e do fim"));

        // id=21  correct at pos 2
        PERGUNTAS.add(new Pergunta(21, TipoTema.JAVASCRIPT,
                "O que faz o método concat() em arrays/strings?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Divide em partes", false),
                        new Opcao(2, "Junta dois arrays ou duas strings em um só", true),
                        new Opcao(3, "Remove elementos", false),
                        new Opcao(4, "Ordena os elementos", false)
                ), "Junta dois arrays ou duas strings em um só"));

        // id=22  correct at pos 3
        PERGUNTAS.add(new Pergunta(22, TipoTema.JAVASCRIPT,
                "Qual método verifica se um valor existe em um array?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "indexOf()", false),
                        new Opcao(2, "find()", false),
                        new Opcao(3, "includes()", true),
                        new Opcao(4, "some()", false)
                ), "includes()"));

        // ── CLASSES (ids 101-122) ──────────────────────────────────────────────

        // id=101  correct at pos 4
        PERGUNTAS.add(new Pergunta(101, TipoTema.CLASSES,
                "O que é uma classe em programação?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Tipo de variável especial", false),
                        new Opcao(2, "Função de alto nível", false),
                        new Opcao(3, "Comando SQL", false),
                        new Opcao(4, "Molde para criar objetos com propriedades e métodos", true)
                ), "Molde para criar objetos com propriedades e métodos"));

        // id=102  correct at pos 1
        PERGUNTAS.add(new Pergunta(102, TipoTema.CLASSES,
                "O que é um método de uma classe?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Função que fica dentro de uma classe", true),
                        new Opcao(2, "Variável da classe", false),
                        new Opcao(3, "Tipo de dado", false),
                        new Opcao(4, "Palavra-chave reservada", false)
                ), "Função que fica dentro de uma classe"));

        // id=103  correct at pos 2
        PERGUNTAS.add(new Pergunta(103, TipoTema.CLASSES,
                "O que é um atributo de uma classe?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Função da classe", false),
                        new Opcao(2, "Variável que pertence a um objeto da classe", true),
                        new Opcao(3, "Tipo de herança", false),
                        new Opcao(4, "Comando SQL", false)
                ), "Variável que pertence a um objeto da classe"));

        // id=104  correct at pos 3
        PERGUNTAS.add(new Pergunta(104, TipoTema.CLASSES,
                "O que é herança em OOP?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Classe sem métodos", false),
                        new Opcao(2, "Objeto global compartilhado", false),
                        new Opcao(3, "Classe filha reutiliza código de outra usando extends", true),
                        new Opcao(4, "Tipo de array especial", false)
                ), "Classe filha reutiliza código de outra usando extends"));

        // id=105  correct at pos 4
        PERGUNTAS.add(new Pergunta(105, TipoTema.CLASSES,
                "O que é uma instância de classe?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Cópia da classe em si", false),
                        new Opcao(2, "Método estático", false),
                        new Opcao(3, "Variável global", false),
                        new Opcao(4, "Objeto criado a partir de uma classe usando new", true)
                ), "Objeto criado a partir de uma classe usando new"));

        // id=106  correct at pos 1
        PERGUNTAS.add(new Pergunta(106, TipoTema.CLASSES,
                "O que é um construtor em OOP?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Método especial chamado ao usar new para criar o objeto", true),
                        new Opcao(2, "Método que apaga o objeto", false),
                        new Opcao(3, "Variável privada", false),
                        new Opcao(4, "Tipo de herança", false)
                ), "Método especial chamado ao usar new para criar o objeto"));

        // id=107  correct at pos 2
        PERGUNTAS.add(new Pergunta(107, TipoTema.CLASSES,
                "O que é encapsulamento em OOP?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Herdar de outra classe", false),
                        new Opcao(2, "Esconder detalhes internos e expor via métodos de acesso", true),
                        new Opcao(3, "Criar vários objetos iguais", false),
                        new Opcao(4, "Repetir código de outra classe", false)
                ), "Esconder detalhes internos e expor via métodos de acesso"));

        // id=108  correct at pos 3
        PERGUNTAS.add(new Pergunta(108, TipoTema.CLASSES,
                "O que é polimorfismo em OOP?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Criar várias classes iguais", false),
                        new Opcao(2, "Esconder atributos internos", false),
                        new Opcao(3, "Mesmo método se comporta diferente em classes diferentes", true),
                        new Opcao(4, "Herança múltipla obrigatória", false)
                ), "Mesmo método se comporta diferente em classes diferentes"));

        // id=109  correct at pos 4
        PERGUNTAS.add(new Pergunta(109, TipoTema.CLASSES,
                "O que é sobrescrita (override) de método?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Criar novo método com outro nome", false),
                        new Opcao(2, "Apagar método herdado", false),
                        new Opcao(3, "Tornar método privado", false),
                        new Opcao(4, "Classe filha redefine um método que existia na classe pai", true)
                ), "Classe filha redefine um método que existia na classe pai"));

        // id=110  correct at pos 1
        PERGUNTAS.add(new Pergunta(110, TipoTema.CLASSES,
                "O que representa this dentro de uma classe Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Referência ao objeto atual", true),
                        new Opcao(2, "Referência à classe pai", false),
                        new Opcao(3, "Variável global", false),
                        new Opcao(4, "Tipo de dado primitivo", false)
                ), "Referência ao objeto atual"));

        // id=111  correct at pos 2
        PERGUNTAS.add(new Pergunta(111, TipoTema.CLASSES,
                "Qual palavra-chave em Java é usada para herança?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "implements", false),
                        new Opcao(2, "extends", true),
                        new Opcao(3, "inherits", false),
                        new Opcao(4, "override", false)
                ), "extends"));

        // id=112  correct at pos 3
        PERGUNTAS.add(new Pergunta(112, TipoTema.CLASSES,
                "O que torna um atributo acessível apenas dentro da própria classe?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "O modificador public", false),
                        new Opcao(2, "O modificador protected", false),
                        new Opcao(3, "O modificador private", true),
                        new Opcao(4, "O modificador static", false)
                ), "O modificador private"));

        // id=113  correct at pos 4
        PERGUNTAS.add(new Pergunta(113, TipoTema.CLASSES,
                "O que é um método getter?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Método para criar objeto", false),
                        new Opcao(2, "Método herdado automaticamente", false),
                        new Opcao(3, "Método estático da classe", false),
                        new Opcao(4, "Método para LER o valor de um atributo privado", true)
                ), "Método para LER o valor de um atributo privado"));

        // id=114  correct at pos 1
        PERGUNTAS.add(new Pergunta(114, TipoTema.CLASSES,
                "O que é um método setter?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Método para MODIFICAR o valor de um atributo privado", true),
                        new Opcao(2, "Método para ler atributo", false),
                        new Opcao(3, "Construtor de classe", false),
                        new Opcao(4, "Método herdado", false)
                ), "Método para MODIFICAR o valor de um atributo privado"));

        // id=115  correct at pos 2
        PERGUNTAS.add(new Pergunta(115, TipoTema.CLASSES,
                "O que é uma classe abstrata?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Classe sem herança", false),
                        new Opcao(2, "Classe que não pode ser instanciada diretamente", true),
                        new Opcao(3, "Classe com mais métodos que o normal", false),
                        new Opcao(4, "Classe final que ninguém herda", false)
                ), "Classe que não pode ser instanciada diretamente"));

        // id=116  correct at pos 3
        PERGUNTAS.add(new Pergunta(116, TipoTema.CLASSES,
                "O que é uma interface em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Tipo de variável composta", false),
                        new Opcao(2, "Classe com herança completa", false),
                        new Opcao(3, "Contrato que define quais métodos uma classe deve ter", true),
                        new Opcao(4, "Método estático especial", false)
                ), "Contrato que define quais métodos uma classe deve ter"));

        // id=117  correct at pos 4
        PERGUNTAS.add(new Pergunta(117, TipoTema.CLASSES,
                "Como criamos um objeto a partir de uma classe em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Usando create", false),
                        new Opcao(2, "Usando make", false),
                        new Opcao(3, "Usando build", false),
                        new Opcao(4, "Usando a palavra-chave new", true)
                ), "Usando a palavra-chave new"));

        // id=118  correct at pos 1
        PERGUNTAS.add(new Pergunta(118, TipoTema.CLASSES,
                "O que é visibilidade em OOP?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Define se um atributo pode ser acessado de fora da classe", true),
                        new Opcao(2, "Tamanho do objeto em memória", false),
                        new Opcao(3, "Número de métodos da classe", false),
                        new Opcao(4, "Tipo de herança usada", false)
                ), "Define se um atributo pode ser acessado de fora da classe"));

        // id=119  correct at pos 2
        PERGUNTAS.add(new Pergunta(119, TipoTema.CLASSES,
                "Qual modificador permite acesso na própria classe E nas subclasses?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "private", false),
                        new Opcao(2, "protected", true),
                        new Opcao(3, "public", false),
                        new Opcao(4, "static", false)
                ), "protected"));

        // id=120  correct at pos 3
        PERGUNTAS.add(new Pergunta(120, TipoTema.CLASSES,
                "O que é um método static em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Método privado da classe", false),
                        new Opcao(2, "Construtor alternativo", false),
                        new Opcao(3, "Pertence à classe; não precisa de instância para ser chamado", true),
                        new Opcao(4, "Método abstrato sem corpo", false)
                ), "Pertence à classe; não precisa de instância para ser chamado"));

        // id=121  correct at pos 4
        PERGUNTAS.add(new Pergunta(121, TipoTema.CLASSES,
                "O que é responsabilidade única em OOP?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Herança de várias classes", false),
                        new Opcao(2, "Vários construtores na classe", false),
                        new Opcao(3, "Classe sem nenhum método", false),
                        new Opcao(4, "Cada classe deve ter apenas uma responsabilidade bem definida", true)
                ), "Cada classe deve ter apenas uma responsabilidade bem definida"));

        // id=122  correct at pos 1
        PERGUNTAS.add(new Pergunta(122, TipoTema.CLASSES,
                "O que verifica se um objeto é de uma determinada classe em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "O operador instanceof", true),
                        new Opcao(2, "O operador typeof", false),
                        new Opcao(3, "O operador classof", false),
                        new Opcao(4, "O método isInstance()", false)
                ), "O operador instanceof"));

        // ── SQL MULTIPLA_ESCOLHA (ids 201-212) ────────────────────────────────

        // id=201  correct at pos 2
        PERGUNTAS.add(new Pergunta(201, TipoTema.SQL,
                "O que faz o comando SELECT em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Insere novos dados na tabela", false),
                        new Opcao(2, "Busca e recupera dados de uma tabela", true),
                        new Opcao(3, "Apaga dados da tabela", false),
                        new Opcao(4, "Altera dados existentes", false)
                ), "Busca e recupera dados de uma tabela"));

        // id=202  correct at pos 3
        PERGUNTAS.add(new Pergunta(202, TipoTema.SQL,
                "O que faz o comando INSERT em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Busca dados na tabela", false),
                        new Opcao(2, "Apaga linhas da tabela", false),
                        new Opcao(3, "Adiciona uma nova linha em uma tabela", true),
                        new Opcao(4, "Altera valores existentes", false)
                ), "Adiciona uma nova linha em uma tabela"));

        // id=203  correct at pos 4
        PERGUNTAS.add(new Pergunta(203, TipoTema.SQL,
                "O que faz o comando UPDATE em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Busca dados na tabela", false),
                        new Opcao(2, "Adiciona novas linhas", false),
                        new Opcao(3, "Apaga toda a tabela", false),
                        new Opcao(4, "Altera valores já salvos no banco de dados", true)
                ), "Altera valores já salvos no banco de dados"));

        // id=204  correct at pos 1
        PERGUNTAS.add(new Pergunta(204, TipoTema.SQL,
                "O que faz o comando DELETE em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Apaga linhas de uma tabela", true),
                        new Opcao(2, "Busca dados na tabela", false),
                        new Opcao(3, "Altera valores existentes", false),
                        new Opcao(4, "Cria uma nova tabela", false)
                ), "Apaga linhas de uma tabela"));

        // id=205  correct at pos 2
        PERGUNTAS.add(new Pergunta(205, TipoTema.SQL,
                "O que é uma tabela em banco de dados SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Consulta salva no banco", false),
                        new Opcao(2, "Estrutura que organiza dados em linhas e colunas", true),
                        new Opcao(3, "Índice de busca rápida", false),
                        new Opcao(4, "Chave primária do registro", false)
                ), "Estrutura que organiza dados em linhas e colunas"));

        // id=206  correct at pos 3
        PERGUNTAS.add(new Pergunta(206, TipoTema.SQL,
                "O que é uma PRIMARY KEY (chave primária)?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Campo que pode se repetir", false),
                        new Opcao(2, "Índice de busca externo", false),
                        new Opcao(3, "Campo único que identifica cada linha da tabela", true),
                        new Opcao(4, "Coluna de qualquer tipo", false)
                ), "Campo único que identifica cada linha da tabela"));

        // id=207  correct at pos 4
        PERGUNTAS.add(new Pergunta(207, TipoTema.SQL,
                "O que faz a cláusula WHERE em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Ordena os resultados", false),
                        new Opcao(2, "Agrupa as linhas", false),
                        new Opcao(3, "Conta os registros", false),
                        new Opcao(4, "Filtra os resultados da consulta", true)
                ), "Filtra os resultados da consulta"));

        // id=208  correct at pos 1
        PERGUNTAS.add(new Pergunta(208, TipoTema.SQL,
                "O que faz o JOIN em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Une dados de duas tabelas na mesma consulta", true),
                        new Opcao(2, "Ordena os resultados", false),
                        new Opcao(3, "Apaga tabelas relacionadas", false),
                        new Opcao(4, "Cria um índice automático", false)
                ), "Une dados de duas tabelas na mesma consulta"));

        // id=209  correct at pos 2
        PERGUNTAS.add(new Pergunta(209, TipoTema.SQL,
                "O que faz o ORDER BY em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Filtra os resultados", false),
                        new Opcao(2, "Organiza resultados em ordem crescente ou decrescente", true),
                        new Opcao(3, "Agrupa linhas iguais", false),
                        new Opcao(4, "Conta os registros", false)
                ), "Organiza resultados em ordem crescente ou decrescente"));

        // id=210  correct at pos 3
        PERGUNTAS.add(new Pergunta(210, TipoTema.SQL,
                "O que faz o GROUP BY em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Filtra os resultados", false),
                        new Opcao(2, "Ordena a tabela", false),
                        new Opcao(3, "Agrupa linhas com o mesmo valor em uma coluna", true),
                        new Opcao(4, "Remove duplicatas automaticamente", false)
                ), "Agrupa linhas com o mesmo valor em uma coluna"));

        // id=211  correct at pos 4
        PERGUNTAS.add(new Pergunta(211, TipoTema.SQL,
                "O que é uma consulta (query) SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Um INSERT de dados novos", false),
                        new Opcao(2, "Um comando de exclusão", false),
                        new Opcao(3, "Uma criação de tabela", false),
                        new Opcao(4, "Um SELECT escrito para buscar dados no banco", true)
                ), "Um SELECT escrito para buscar dados no banco"));

        // id=212  correct at pos 1
        PERGUNTAS.add(new Pergunta(212, TipoTema.SQL,
                "O que faz o CREATE TABLE em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Cria uma nova tabela no banco de dados", true),
                        new Opcao(2, "Apaga uma tabela existente", false),
                        new Opcao(3, "Altera a estrutura de uma tabela", false),
                        new Opcao(4, "Busca todos os dados de uma tabela", false)
                ), "Cria uma nova tabela no banco de dados"));

        // ── JAVASCRIPT extras (ids 23-50) ─────────────────────────────────────
        // continuing rotation: id22=pos3, so id23=pos4, 24=1, 25=2, 26=3...

        // id=23  correct at pos 4
        PERGUNTAS.add(new Pergunta(23, TipoTema.JAVASCRIPT,
                "O que o operador typeof retorna em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "O valor da variável convertido", false),
                        new Opcao(2, "O tamanho da variável", false),
                        new Opcao(3, "O endereço de memória", false),
                        new Opcao(4, "Uma string com o tipo do valor. Ex: 'number', 'string'", true)
                ), "Uma string com o tipo do valor. Ex: 'number', 'string'"));

        // id=24  correct at pos 1
        PERGUNTAS.add(new Pergunta(24, TipoTema.JAVASCRIPT,
                "Qual é a diferença entre null e undefined em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "null é ausência intencional; undefined é variável não inicializada", true),
                        new Opcao(2, "São exatamente iguais em todos os casos", false),
                        new Opcao(3, "undefined é ausência intencional; null é variável não inicializada", false),
                        new Opcao(4, "null é número e undefined é texto", false)
                ), "null é ausência intencional; undefined é variável não inicializada"));

        // id=25  correct at pos 2
        PERGUNTAS.add(new Pergunta(25, TipoTema.JAVASCRIPT,
                "Qual a diferença entre == e === em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Não há nenhuma diferença", false),
                        new Opcao(2, "=== compara valor E tipo; == compara só o valor com conversão", true),
                        new Opcao(3, "== compara valor E tipo; === compara só o valor", false),
                        new Opcao(4, "=== é usado só para strings", false)
                ), "=== compara valor E tipo; == compara só o valor com conversão"));

        // id=26  correct at pos 3
        PERGUNTAS.add(new Pergunta(26, TipoTema.JAVASCRIPT,
                "O que é o operador ternário em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Um loop especial de 3 etapas", false),
                        new Opcao(2, "Operador que compara três valores", false),
                        new Opcao(3, "Atalho para if/else: condição ? valorSeTrue : valorSeFalse", true),
                        new Opcao(4, "Método de array com três parâmetros", false)
                ), "Atalho para if/else: condição ? valorSeTrue : valorSeFalse"));

        // id=27  correct at pos 4
        PERGUNTAS.add(new Pergunta(27, TipoTema.JAVASCRIPT,
                "O que é uma template literal em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Tipo especial de array", false),
                        new Opcao(2, "Função que gera HTML", false),
                        new Opcao(3, "Método de formatação numérica", false),
                        new Opcao(4, "String com crase que permite interpolação: `Olá, ${nome}!`", true)
                ), "String com crase que permite interpolação: `Olá, ${nome}!`"));

        // id=28  correct at pos 1
        PERGUNTAS.add(new Pergunta(28, TipoTema.JAVASCRIPT,
                "O que é uma arrow function em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Sintaxe reduzida para funções: const soma = (a, b) => a + b", true),
                        new Opcao(2, "Função que aponta para outro arquivo", false),
                        new Opcao(3, "Método exclusivo de arrays", false),
                        new Opcao(4, "Função assíncrona obrigatória", false)
                ), "Sintaxe reduzida para funções: const soma = (a, b) => a + b"));

        // id=29  correct at pos 2
        PERGUNTAS.add(new Pergunta(29, TipoTema.JAVASCRIPT,
                "O que faz o operador spread (...) em arrays?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Remove todos os elementos do array", false),
                        new Opcao(2, "Espalha os elementos de um array dentro de outro", true),
                        new Opcao(3, "Cria uma cópia ordenada", false),
                        new Opcao(4, "Filtra elementos duplicados", false)
                ), "Espalha os elementos de um array dentro de outro"));

        // id=30  correct at pos 3
        PERGUNTAS.add(new Pergunta(30, TipoTema.JAVASCRIPT,
                "O que é desestruturação (destructuring) em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Remover propriedades de um objeto", false),
                        new Opcao(2, "Converter array em objeto", false),
                        new Opcao(3, "Extrair valores de arrays/objetos em variáveis de forma compacta", true),
                        new Opcao(4, "Dividir uma string em partes", false)
                ), "Extrair valores de arrays/objetos em variáveis de forma compacta"));

        // id=31  correct at pos 4
        PERGUNTAS.add(new Pergunta(31, TipoTema.JAVASCRIPT,
                "O que é uma Promise em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Tipo de variável imutável", false),
                        new Opcao(2, "Método de array que verifica condições", false),
                        new Opcao(3, "Estrutura de repetição assíncrona", false),
                        new Opcao(4, "Objeto que representa o resultado futuro de uma operação assíncrona", true)
                ), "Objeto que representa o resultado futuro de uma operação assíncrona"));

        // id=32  correct at pos 1
        PERGUNTAS.add(new Pergunta(32, TipoTema.JAVASCRIPT,
                "O que faz async/await em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Permite escrever código assíncrono com aparência de código síncrono", true),
                        new Opcao(2, "Cria loops de forma automática", false),
                        new Opcao(3, "Declara variáveis assíncronas", false),
                        new Opcao(4, "Cancela Promises em andamento", false)
                ), "Permite escrever código assíncrono com aparência de código síncrono"));

        // id=33  correct at pos 2
        PERGUNTAS.add(new Pergunta(33, TipoTema.JAVASCRIPT,
                "O que faz o bloco try/catch em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Cria uma Promise automaticamente", false),
                        new Opcao(2, "Tenta executar código e captura erros sem travar o programa", true),
                        new Opcao(3, "Pausa a execução até um evento ocorrer", false),
                        new Opcao(4, "Testa se uma variável é undefined", false)
                ), "Tenta executar código e captura erros sem travar o programa"));

        // id=34  correct at pos 3
        PERGUNTAS.add(new Pergunta(34, TipoTema.JAVASCRIPT,
                "O que faz JSON.parse() em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Converte objeto JavaScript em texto JSON", false),
                        new Opcao(2, "Valida a estrutura de um JSON", false),
                        new Opcao(3, "Converte texto JSON em objeto JavaScript", true),
                        new Opcao(4, "Formata um número como JSON", false)
                ), "Converte texto JSON em objeto JavaScript"));

        // id=35  correct at pos 4
        PERGUNTAS.add(new Pergunta(35, TipoTema.JAVASCRIPT,
                "O que faz JSON.stringify() em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Lê um arquivo JSON do servidor", false),
                        new Opcao(2, "Valida se um JSON é válido", false),
                        new Opcao(3, "Converte texto JSON em objeto", false),
                        new Opcao(4, "Converte objeto JavaScript em texto JSON", true)
                ), "Converte objeto JavaScript em texto JSON"));

        // id=36  correct at pos 1
        PERGUNTAS.add(new Pergunta(36, TipoTema.JAVASCRIPT,
                "O que é localStorage em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Armazenamento no navegador que persiste mesmo fechando a aba", true),
                        new Opcao(2, "Banco de dados do servidor", false),
                        new Opcao(3, "Variável global do Node.js", false),
                        new Opcao(4, "Cache de imagens do navegador", false)
                ), "Armazenamento no navegador que persiste mesmo fechando a aba"));

        // id=37  correct at pos 2
        PERGUNTAS.add(new Pergunta(37, TipoTema.JAVASCRIPT,
                "O que é NaN em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Valor equivalente a zero", false),
                        new Opcao(2, "Resultado de operação matemática inválida. Ex: 'abc' / 2", true),
                        new Opcao(3, "Tipo de dado especial para arrays vazios", false),
                        new Opcao(4, "Palavra-chave para declarar constantes", false)
                ), "Resultado de operação matemática inválida. Ex: 'abc' / 2"));

        // id=38  correct at pos 3
        PERGUNTAS.add(new Pergunta(38, TipoTema.JAVASCRIPT,
                "O que faz parseInt() em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Converte número em texto", false),
                        new Opcao(2, "Arredonda um número decimal", false),
                        new Opcao(3, "Converte uma string em número inteiro. Ex: parseInt('42px') → 42", true),
                        new Opcao(4, "Verifica se um valor é inteiro", false)
                ), "Converte uma string em número inteiro. Ex: parseInt('42px') → 42"));

        // id=39  correct at pos 4
        PERGUNTAS.add(new Pergunta(39, TipoTema.JAVASCRIPT,
                "O que faz Math.floor() em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Arredonda para o inteiro mais próximo", false),
                        new Opcao(2, "Retorna o maior de dois números", false),
                        new Opcao(3, "Calcula a raiz quadrada", false),
                        new Opcao(4, "Arredonda sempre para baixo. Ex: Math.floor(4.9) → 4", true)
                ), "Arredonda sempre para baixo. Ex: Math.floor(4.9) → 4"));

        // id=40  correct at pos 1
        PERGUNTAS.add(new Pergunta(40, TipoTema.JAVASCRIPT,
                "O que retorna Math.random() em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Número decimal aleatório entre 0 (incluso) e 1 (excluso)", true),
                        new Opcao(2, "Número inteiro aleatório entre 0 e 100", false),
                        new Opcao(3, "Número aleatório negativo", false),
                        new Opcao(4, "Valor aleatório de um array", false)
                ), "Número decimal aleatório entre 0 (incluso) e 1 (excluso)"));

        // id=41  correct at pos 2
        PERGUNTAS.add(new Pergunta(41, TipoTema.JAVASCRIPT,
                "O que retorna Object.keys() em JavaScript?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Os valores das propriedades do objeto", false),
                        new Opcao(2, "Array com os nomes (chaves) das propriedades do objeto", true),
                        new Opcao(3, "O número de propriedades do objeto", false),
                        new Opcao(4, "Uma cópia profunda do objeto", false)
                ), "Array com os nomes (chaves) das propriedades do objeto"));

        // id=42  correct at pos 3
        PERGUNTAS.add(new Pergunta(42, TipoTema.JAVASCRIPT,
                "O que faz o método reduce() em um array?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Remove elementos duplicados", false),
                        new Opcao(2, "Filtra elementos por condição", false),
                        new Opcao(3, "Acumula todos os elementos em um único valor", true),
                        new Opcao(4, "Inverte a ordem dos elementos", false)
                ), "Acumula todos os elementos em um único valor"));

        // id=43  correct at pos 4
        PERGUNTAS.add(new Pergunta(43, TipoTema.JAVASCRIPT,
                "O que faz o método find() em um array?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Retorna todos os elementos que passam na condição", false),
                        new Opcao(2, "Retorna o índice do primeiro elemento encontrado", false),
                        new Opcao(3, "Retorna true se algum elemento atende a condição", false),
                        new Opcao(4, "Retorna o primeiro elemento que satisfaz a condição", true)
                ), "Retorna o primeiro elemento que satisfaz a condição"));

        // id=44  correct at pos 1
        PERGUNTAS.add(new Pergunta(44, TipoTema.JAVASCRIPT,
                "O que faz o método some() em um array?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Retorna true se pelo menos um elemento atende à condição", true),
                        new Opcao(2, "Retorna true somente se todos atenderem à condição", false),
                        new Opcao(3, "Retorna quantos elementos atendem à condição", false),
                        new Opcao(4, "Remove elementos que não atendem à condição", false)
                ), "Retorna true se pelo menos um elemento atende à condição"));

        // id=45  correct at pos 2
        PERGUNTAS.add(new Pergunta(45, TipoTema.JAVASCRIPT,
                "O que faz o método every() em um array?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Retorna true se ao menos um elemento atende à condição", false),
                        new Opcao(2, "Retorna true somente se TODOS os elementos atendem à condição", true),
                        new Opcao(3, "Executa uma ação em cada elemento", false),
                        new Opcao(4, "Conta quantos elementos existem", false)
                ), "Retorna true somente se TODOS os elementos atendem à condição"));

        // id=46  correct at pos 3
        PERGUNTAS.add(new Pergunta(46, TipoTema.JAVASCRIPT,
                "O que faz o método push() em um array?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Remove o último elemento", false),
                        new Opcao(2, "Adiciona elemento no início do array", false),
                        new Opcao(3, "Adiciona um ou mais elementos no final do array", true),
                        new Opcao(4, "Ordena o array em ordem crescente", false)
                ), "Adiciona um ou mais elementos no final do array"));

        // id=47  correct at pos 4
        PERGUNTAS.add(new Pergunta(47, TipoTema.JAVASCRIPT,
                "O que faz o método pop() em um array?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Adiciona elemento no final", false),
                        new Opcao(2, "Remove o primeiro elemento", false),
                        new Opcao(3, "Inverte a ordem dos elementos", false),
                        new Opcao(4, "Remove e retorna o último elemento do array", true)
                ), "Remove e retorna o último elemento do array"));

        // id=48  correct at pos 1
        PERGUNTAS.add(new Pergunta(48, TipoTema.JAVASCRIPT,
                "Qual método adiciona elemento NO INÍCIO de um array?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "unshift()", true),
                        new Opcao(2, "push()", false),
                        new Opcao(3, "shift()", false),
                        new Opcao(4, "prepend()", false)
                ), "unshift()"));

        // id=49  correct at pos 2
        PERGUNTAS.add(new Pergunta(49, TipoTema.JAVASCRIPT,
                "O que faz o método indexOf() em um array?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Verifica se o elemento existe no array", false),
                        new Opcao(2, "Retorna o índice da primeira ocorrência do elemento (-1 se não existe)", true),
                        new Opcao(3, "Conta quantas vezes o elemento aparece", false),
                        new Opcao(4, "Remove o elemento do array", false)
                ), "Retorna o índice da primeira ocorrência do elemento (-1 se não existe)"));

        // id=50  correct at pos 3
        PERGUNTAS.add(new Pergunta(50, TipoTema.JAVASCRIPT,
                "O que faz o método slice() em um array?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Remove e retorna elementos do array original", false),
                        new Opcao(2, "Divide o array em dois novos arrays", false),
                        new Opcao(3, "Retorna uma cópia de parte do array sem modificar o original", true),
                        new Opcao(4, "Ordena os elementos do array", false)
                ), "Retorna uma cópia de parte do array sem modificar o original"));

        // ── CLASSES extras (ids 123-150) ──────────────────────────────────────
        // continuing rotation: id122=pos1, so id123=pos2, 124=3, 125=4, 126=1...

        // id=123  correct at pos 2
        PERGUNTAS.add(new Pergunta(123, TipoTema.CLASSES,
                "Para que serve a palavra-chave super em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Cria uma nova instância da classe pai", false),
                        new Opcao(2, "Chama o construtor ou método da classe pai", true),
                        new Opcao(3, "Verifica se um objeto é de determinada classe", false),
                        new Opcao(4, "Torna o método público globalmente", false)
                ), "Chama o construtor ou método da classe pai"));

        // id=124  correct at pos 3
        PERGUNTAS.add(new Pergunta(124, TipoTema.CLASSES,
                "O que é sobrecarga de método (overloading) em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Classe filha redefine método da classe pai", false),
                        new Opcao(2, "Método que não retorna nada (void)", false),
                        new Opcao(3, "Mesmo nome de método com parâmetros diferentes na mesma classe", true),
                        new Opcao(4, "Método chamado automaticamente ao criar o objeto", false)
                ), "Mesmo nome de método com parâmetros diferentes na mesma classe"));

        // id=125  correct at pos 4
        PERGUNTAS.add(new Pergunta(125, TipoTema.CLASSES,
                "O que faz a palavra-chave final em uma classe Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Torna todos os atributos privados", false),
                        new Opcao(2, "Impede que métodos sejam sobrescritos", false),
                        new Opcao(3, "Define que a classe não tem construtor", false),
                        new Opcao(4, "Impede que a classe seja herdada por outra", true)
                ), "Impede que a classe seja herdada por outra"));

        // id=126  correct at pos 1
        PERGUNTAS.add(new Pergunta(126, TipoTema.CLASSES,
                "O que é um atributo static em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Pertence à classe e é compartilhado por todas as instâncias", true),
                        new Opcao(2, "Pertence apenas ao objeto criado", false),
                        new Opcao(3, "Atributo imutável de instância", false),
                        new Opcao(4, "Atributo que não pode ser lido de fora", false)
                ), "Pertence à classe e é compartilhado por todas as instâncias"));

        // id=127  correct at pos 2
        PERGUNTAS.add(new Pergunta(127, TipoTema.CLASSES,
                "O que é um enum em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Tipo de interface com métodos abstratos", false),
                        new Opcao(2, "Tipo especial que representa um conjunto fixo de constantes. Ex: DIA.SEGUNDA", true),
                        new Opcao(3, "Classe sem construtor público", false),
                        new Opcao(4, "Variável que não pode ser alterada após criação", false)
                ), "Tipo especial que representa um conjunto fixo de constantes. Ex: DIA.SEGUNDA"));

        // id=128  correct at pos 3
        PERGUNTAS.add(new Pergunta(128, TipoTema.CLASSES,
                "Para que serve sobrescrever o método toString() em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Para comparar dois objetos por valor", false),
                        new Opcao(2, "Para serializar o objeto em JSON", false),
                        new Opcao(3, "Para definir como o objeto é exibido quando impresso", true),
                        new Opcao(4, "Para converter o objeto em array", false)
                ), "Para definir como o objeto é exibido quando impresso"));

        // id=129  correct at pos 4
        PERGUNTAS.add(new Pergunta(129, TipoTema.CLASSES,
                "Por que sobrescrever equals() em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Para ordenar objetos em listas", false),
                        new Opcao(2, "Para imprimir o objeto corretamente", false),
                        new Opcao(3, "Para copiar atributos de outro objeto", false),
                        new Opcao(4, "Para comparar dois objetos pelo conteúdo, não pela referência", true)
                ), "Para comparar dois objetos pelo conteúdo, não pela referência"));

        // id=130  correct at pos 1
        PERGUNTAS.add(new Pergunta(130, TipoTema.CLASSES,
                "O que é um ArrayList em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Lista dinâmica que cresce automaticamente ao adicionar elementos", true),
                        new Opcao(2, "Array de tamanho fixo definido na criação", false),
                        new Opcao(3, "Estrutura de dados do tipo fila", false),
                        new Opcao(4, "Conjunto de pares chave-valor", false)
                ), "Lista dinâmica que cresce automaticamente ao adicionar elementos"));

        // id=131  correct at pos 2
        PERGUNTAS.add(new Pergunta(131, TipoTema.CLASSES,
                "O que é um HashMap em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Lista ordenada de objetos", false),
                        new Opcao(2, "Estrutura que armazena pares chave-valor para acesso rápido", true),
                        new Opcao(3, "Array de tamanho dinâmico", false),
                        new Opcao(4, "Fila com prioridade", false)
                ), "Estrutura que armazena pares chave-valor para acesso rápido"));

        // id=132  correct at pos 3
        PERGUNTAS.add(new Pergunta(132, TipoTema.CLASSES,
                "O que são generics em Java? Ex: ArrayList<String>",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Classes que herdam de Object automaticamente", false),
                        new Opcao(2, "Métodos sem parâmetros", false),
                        new Opcao(3, "Permitem criar classes e métodos que funcionam com qualquer tipo seguro", true),
                        new Opcao(4, "Interfaces sem implementação", false)
                ), "Permitem criar classes e métodos que funcionam com qualquer tipo seguro"));

        // id=133  correct at pos 4
        PERGUNTAS.add(new Pergunta(133, TipoTema.CLASSES,
                "O que é uma exceção (Exception) em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Erro de compilação no código", false),
                        new Opcao(2, "Aviso do compilador ignorado em runtime", false),
                        new Opcao(3, "Tipo especial de classe estática", false),
                        new Opcao(4, "Evento de erro em runtime que pode ser capturado com try/catch", true)
                ), "Evento de erro em runtime que pode ser capturado com try/catch"));

        // id=134  correct at pos 1
        PERGUNTAS.add(new Pergunta(134, TipoTema.CLASSES,
                "O que faz a palavra-chave throws em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Declara que o método pode lançar determinada exceção", true),
                        new Opcao(2, "Captura a exceção dentro do método", false),
                        new Opcao(3, "Cria um objeto de exceção", false),
                        new Opcao(4, "Finaliza o programa ao ocorrer erro", false)
                ), "Declara que o método pode lançar determinada exceção"));

        // id=135  correct at pos 2
        PERGUNTAS.add(new Pergunta(135, TipoTema.CLASSES,
                "Quando usar composição em vez de herança em OOP?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Quando a classe filha é um tipo especial da pai", false),
                        new Opcao(2, "Quando a relação é 'TEM UM' e não 'É UM'. Ex: Carro TEM Motor", true),
                        new Opcao(3, "Quando a classe não tem atributos", false),
                        new Opcao(4, "Quando é necessário usar a palavra super", false)
                ), "Quando a relação é 'TEM UM' e não 'É UM'. Ex: Carro TEM Motor"));

        // id=136  correct at pos 3
        PERGUNTAS.add(new Pergunta(136, TipoTema.CLASSES,
                "O que é acoplamento (coupling) em OOP?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Número de atributos de uma classe", false),
                        new Opcao(2, "Quantidade de métodos públicos", false),
                        new Opcao(3, "Grau de dependência entre classes — menos acoplamento é melhor", true),
                        new Opcao(4, "Nível de herança na hierarquia", false)
                ), "Grau de dependência entre classes — menos acoplamento é melhor"));

        // id=137  correct at pos 4
        PERGUNTAS.add(new Pergunta(137, TipoTema.CLASSES,
                "O que é coesão (cohesion) em OOP?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Capacidade de herdar de múltiplas classes", false),
                        new Opcao(2, "Número de dependências externas da classe", false),
                        new Opcao(3, "Quantidade de interfaces implementadas", false),
                        new Opcao(4, "Medida de o quanto os métodos de uma classe estão relacionados entre si", true)
                ), "Medida de o quanto os métodos de uma classe estão relacionados entre si"));

        // id=138  correct at pos 1
        PERGUNTAS.add(new Pergunta(138, TipoTema.CLASSES,
                "O que é um método abstrato em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Método sem corpo declarado em classe abstrata; subclasses devem implementá-lo", true),
                        new Opcao(2, "Método privado sem parâmetros", false),
                        new Opcao(3, "Método que retorna objeto genérico", false),
                        new Opcao(4, "Método chamado automaticamente pelo Java", false)
                ), "Método sem corpo declarado em classe abstrata; subclasses devem implementá-lo"));

        // id=139  correct at pos 2
        PERGUNTAS.add(new Pergunta(139, TipoTema.CLASSES,
                "Uma classe pode implementar quantas interfaces em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Apenas uma interface por vez", false),
                        new Opcao(2, "Várias interfaces ao mesmo tempo", true),
                        new Opcao(3, "Apenas duas interfaces por classe", false),
                        new Opcao(4, "Nenhuma; interfaces não são implementadas por classes", false)
                ), "Várias interfaces ao mesmo tempo"));

        // id=140  correct at pos 3
        PERGUNTAS.add(new Pergunta(140, TipoTema.CLASSES,
                "O que é o ciclo de vida de um objeto em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "O tempo que o programa fica em execução", false),
                        new Opcao(2, "A hierarquia de herança de uma classe", false),
                        new Opcao(3, "Criação com new, uso e liberação de memória pelo Garbage Collector", true),
                        new Opcao(4, "A sequência de interfaces implementadas", false)
                ), "Criação com new, uso e liberação de memória pelo Garbage Collector"));

        // id=141  correct at pos 4
        PERGUNTAS.add(new Pergunta(141, TipoTema.CLASSES,
                "O que é o Garbage Collector em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Ferramenta que apaga arquivos temporários", false),
                        new Opcao(2, "Método para limpar ArrayLists", false),
                        new Opcao(3, "Plugin que analisa erros no código", false),
                        new Opcao(4, "Mecanismo automático que libera memória de objetos não usados", true)
                ), "Mecanismo automático que libera memória de objetos não usados"));

        // id=142  correct at pos 1
        PERGUNTAS.add(new Pergunta(142, TipoTema.CLASSES,
                "O que é um package em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Agrupamento de classes relacionadas em um mesmo namespace", true),
                        new Opcao(2, "Biblioteca externa baixada pelo Maven", false),
                        new Opcao(3, "Método utilitário da classe Object", false),
                        new Opcao(4, "Arquivo de configuração do projeto", false)
                ), "Agrupamento de classes relacionadas em um mesmo namespace"));

        // id=143  correct at pos 2
        PERGUNTAS.add(new Pergunta(143, TipoTema.CLASSES,
                "O que é uma variável de instância em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Variável compartilhada por todos os objetos da classe", false),
                        new Opcao(2, "Variável que pertence ao objeto; cada instância tem a sua própria cópia", true),
                        new Opcao(3, "Variável local de um método", false),
                        new Opcao(4, "Variável final imutável", false)
                ), "Variável que pertence ao objeto; cada instância tem a sua própria cópia"));

        // id=144  correct at pos 3
        PERGUNTAS.add(new Pergunta(144, TipoTema.CLASSES,
                "Qual é a diferença entre classe e objeto em OOP?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "São a mesma coisa com nomes diferentes", false),
                        new Opcao(2, "Objeto é o código; classe é a instância em memória", false),
                        new Opcao(3, "Classe é o molde/template; objeto é a instância criada a partir dele", true),
                        new Opcao(4, "Classe é instância e objeto é o tipo", false)
                ), "Classe é o molde/template; objeto é a instância criada a partir dele"));

        // id=145  correct at pos 4
        PERGUNTAS.add(new Pergunta(145, TipoTema.CLASSES,
                "O que é o método main em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Construtor padrão de toda classe", false),
                        new Opcao(2, "Método obrigatório em interfaces", false),
                        new Opcao(3, "Método que encerra a JVM", false),
                        new Opcao(4, "Ponto de entrada da aplicação: public static void main(String[] args)", true)
                ), "Ponto de entrada da aplicação: public static void main(String[] args)"));

        // id=146  correct at pos 1
        PERGUNTAS.add(new Pergunta(146, TipoTema.CLASSES,
                "O que é type casting em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Conversão explícita de um tipo para outro. Ex: (int) 3.9 → 3", true),
                        new Opcao(2, "Criação de uma nova classe a partir de outra", false),
                        new Opcao(3, "Verificação do tipo de um objeto em tempo de execução", false),
                        new Opcao(4, "Herança de múltiplas classes ao mesmo tempo", false)
                ), "Conversão explícita de um tipo para outro. Ex: (int) 3.9 → 3"));

        // id=147  correct at pos 2
        PERGUNTAS.add(new Pergunta(147, TipoTema.CLASSES,
                "O que é autoboxing em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Criação automática de construtores", false),
                        new Opcao(2, "Conversão automática entre tipo primitivo e sua classe wrapper. Ex: int → Integer", true),
                        new Opcao(3, "Empacotamento de classes em pacotes", false),
                        new Opcao(4, "Herança automática da classe Object", false)
                ), "Conversão automática entre tipo primitivo e sua classe wrapper. Ex: int → Integer"));

        // id=148  correct at pos 3
        PERGUNTAS.add(new Pergunta(148, TipoTema.CLASSES,
                "O que é uma classe concreta em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Classe que só possui métodos estáticos", false),
                        new Opcao(2, "Classe sem nenhuma herança", false),
                        new Opcao(3, "Classe que pode ser instanciada diretamente com new", true),
                        new Opcao(4, "Classe com todos os atributos privados", false)
                ), "Classe que pode ser instanciada diretamente com new"));

        // id=149  correct at pos 4
        PERGUNTAS.add(new Pergunta(149, TipoTema.CLASSES,
                "O que é um construtor padrão (default) em Java?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Construtor com todos os atributos como parâmetros", false),
                        new Opcao(2, "Construtor static da classe", false),
                        new Opcao(3, "Construtor privado que cria singleton", false),
                        new Opcao(4, "Construtor sem parâmetros, criado automaticamente se nenhum for declarado", true)
                ), "Construtor sem parâmetros, criado automaticamente se nenhum for declarado"));

        // id=150  correct at pos 1
        PERGUNTAS.add(new Pergunta(150, TipoTema.CLASSES,
                "O que é o princípio de Liskov (LSP) em OOP?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Objetos da subclasse devem poder substituir objetos da superclasse sem quebrar o programa", true),
                        new Opcao(2, "Toda classe deve ter apenas um método público", false),
                        new Opcao(3, "Interfaces devem ter o mínimo de métodos possível", false),
                        new Opcao(4, "Classes de alto nível não dependem de classes de baixo nível", false)
                ), "Objetos da subclasse devem poder substituir objetos da superclasse sem quebrar o programa"));

        // ── SQL MULTIPLA_ESCOLHA extras (ids 301-318) ─────────────────────────
        // continuing rotation with fresh start: 301=pos2, 302=3, 303=4, 304=1...

        // id=301  correct at pos 2
        PERGUNTAS.add(new Pergunta(301, TipoTema.SQL,
                "O que faz a cláusula HAVING em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Filtra linhas antes do agrupamento", false),
                        new Opcao(2, "Filtra grupos criados pelo GROUP BY com base em agregações", true),
                        new Opcao(3, "Ordena os resultados de uma consulta", false),
                        new Opcao(4, "Limita o número de linhas retornadas", false)
                ), "Filtra grupos criados pelo GROUP BY com base em agregações"));

        // id=302  correct at pos 3
        PERGUNTAS.add(new Pergunta(302, TipoTema.SQL,
                "O que faz DISTINCT em um SELECT SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Ordena os resultados em ordem crescente", false),
                        new Opcao(2, "Conta apenas registros não nulos", false),
                        new Opcao(3, "Remove linhas duplicadas dos resultados", true),
                        new Opcao(4, "Filtra registros com WHERE automático", false)
                ), "Remove linhas duplicadas dos resultados"));

        // id=303  correct at pos 4
        PERGUNTAS.add(new Pergunta(303, TipoTema.SQL,
                "O que faz LIMIT em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Define o tamanho máximo de uma coluna", false),
                        new Opcao(2, "Filtra resultados por valor máximo", false),
                        new Opcao(3, "Agrupa os resultados", false),
                        new Opcao(4, "Restringe o número máximo de linhas retornadas", true)
                ), "Restringe o número máximo de linhas retornadas"));

        // id=304  correct at pos 1
        PERGUNTAS.add(new Pergunta(304, TipoTema.SQL,
                "O que faz o operador IN em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Verifica se um valor pertence a uma lista de valores", true),
                        new Opcao(2, "Verifica se um valor está dentro de um intervalo", false),
                        new Opcao(3, "Junta duas tabelas pela chave", false),
                        new Opcao(4, "Insere registros em uma tabela", false)
                ), "Verifica se um valor pertence a uma lista de valores"));

        // id=305  correct at pos 2
        PERGUNTAS.add(new Pergunta(305, TipoTema.SQL,
                "O que faz o operador LIKE em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Compara dois campos de tabelas diferentes", false),
                        new Opcao(2, "Busca padrões em texto. Ex: WHERE nome LIKE 'A%'", true),
                        new Opcao(3, "Verifica igualdade exata como o sinal =", false),
                        new Opcao(4, "Ordena resultados alfabeticamente", false)
                ), "Busca padrões em texto. Ex: WHERE nome LIKE 'A%'"));

        // id=306  correct at pos 3
        PERGUNTAS.add(new Pergunta(306, TipoTema.SQL,
                "O que verifica IS NULL em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Se o campo contém o valor zero", false),
                        new Opcao(2, "Se o campo contém texto vazio", false),
                        new Opcao(3, "Se o campo não possui valor (ausência de dado)", true),
                        new Opcao(4, "Se o campo tem tipo diferente do esperado", false)
                ), "Se o campo não possui valor (ausência de dado)"));

        // id=307  correct at pos 4
        PERGUNTAS.add(new Pergunta(307, TipoTema.SQL,
                "O que retorna a função AVG() em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "O valor máximo da coluna", false),
                        new Opcao(2, "A soma de todos os valores", false),
                        new Opcao(3, "O número de registros", false),
                        new Opcao(4, "A média aritmética dos valores de uma coluna", true)
                ), "A média aritmética dos valores de uma coluna"));

        // id=308  correct at pos 1
        PERGUNTAS.add(new Pergunta(308, TipoTema.SQL,
                "O que retorna MIN() em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "O menor valor de uma coluna", true),
                        new Opcao(2, "O maior valor de uma coluna", false),
                        new Opcao(3, "A soma de todos os valores", false),
                        new Opcao(4, "A média dos valores", false)
                ), "O menor valor de uma coluna"));

        // id=309  correct at pos 2
        PERGUNTAS.add(new Pergunta(309, TipoTema.SQL,
                "O que é uma FOREIGN KEY (chave estrangeira) em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Campo único que identifica cada linha da tabela", false),
                        new Opcao(2, "Campo que referencia a chave primária de outra tabela, criando relacionamento", true),
                        new Opcao(3, "Índice automático criado pelo banco", false),
                        new Opcao(4, "Campo obrigatório em toda tabela", false)
                ), "Campo que referencia a chave primária de outra tabela, criando relacionamento"));

        // id=310  correct at pos 3
        PERGUNTAS.add(new Pergunta(310, TipoTema.SQL,
                "O que faz ALTER TABLE em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Apaga a tabela e todos os dados", false),
                        new Opcao(2, "Renomeia o banco de dados", false),
                        new Opcao(3, "Modifica a estrutura de uma tabela existente (adiciona, remove colunas)", true),
                        new Opcao(4, "Copia dados entre tabelas", false)
                ), "Modifica a estrutura de uma tabela existente (adiciona, remove colunas)"));

        // id=311  correct at pos 4
        PERGUNTAS.add(new Pergunta(311, TipoTema.SQL,
                "O que faz DROP TABLE em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Remove todos os dados mas mantém a estrutura", false),
                        new Opcao(2, "Altera as colunas da tabela", false),
                        new Opcao(3, "Cria um backup da tabela", false),
                        new Opcao(4, "Remove completamente a tabela e todos os dados", true)
                ), "Remove completamente a tabela e todos os dados"));

        // id=312  correct at pos 1
        PERGUNTAS.add(new Pergunta(312, TipoTema.SQL,
                "Qual a diferença entre DELETE e TRUNCATE em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "DELETE pode filtrar com WHERE; TRUNCATE remove todos os dados mais rapidamente", true),
                        new Opcao(2, "TRUNCATE pode usar WHERE; DELETE não", false),
                        new Opcao(3, "São equivalentes e fazem exatamente a mesma coisa", false),
                        new Opcao(4, "DELETE remove a tabela; TRUNCATE remove só os dados", false)
                ), "DELETE pode filtrar com WHERE; TRUNCATE remove todos os dados mais rapidamente"));

        // id=313  correct at pos 2
        PERGUNTAS.add(new Pergunta(313, TipoTema.SQL,
                "O que é uma constraint UNIQUE em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Garante que o campo nunca seja nulo", false),
                        new Opcao(2, "Garante que os valores da coluna não se repitam", true),
                        new Opcao(3, "Define o valor padrão de um campo", false),
                        new Opcao(4, "Cria um índice de busca automático", false)
                ), "Garante que os valores da coluna não se repitam"));

        // id=314  correct at pos 3
        PERGUNTAS.add(new Pergunta(314, TipoTema.SQL,
                "O que é a constraint NOT NULL em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Garante que o campo seja único na tabela", false),
                        new Opcao(2, "Define o valor padrão do campo", false),
                        new Opcao(3, "Garante que o campo sempre terá um valor (não pode ser nulo)", true),
                        new Opcao(4, "Cria relacionamento entre tabelas", false)
                ), "Garante que o campo sempre terá um valor (não pode ser nulo)"));

        // id=315  correct at pos 4
        PERGUNTAS.add(new Pergunta(315, TipoTema.SQL,
                "O que é DEFAULT em uma coluna SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Garante que o campo seja único", false),
                        new Opcao(2, "Impede que o campo seja nulo", false),
                        new Opcao(3, "Cria chave estrangeira automática", false),
                        new Opcao(4, "Valor atribuído automaticamente quando não especificado no INSERT", true)
                ), "Valor atribuído automaticamente quando não especificado no INSERT"));

        // id=316  correct at pos 1
        PERGUNTAS.add(new Pergunta(316, TipoTema.SQL,
                "O que é AUTO_INCREMENT em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Gera automaticamente um número inteiro único crescente para cada nova linha", true),
                        new Opcao(2, "Incrementa automaticamente o valor de todas as colunas", false),
                        new Opcao(3, "Atualiza registros automaticamente quando inseridos", false),
                        new Opcao(4, "Cria índice automaticamente ao inserir dados", false)
                ), "Gera automaticamente um número inteiro único crescente para cada nova linha"));

        // id=317  correct at pos 2
        PERGUNTAS.add(new Pergunta(317, TipoTema.SQL,
                "O que é uma subquery (subconsulta) em SQL?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "Uma view salva no banco de dados", false),
                        new Opcao(2, "Um SELECT dentro de outro SELECT", true),
                        new Opcao(3, "Um JOIN entre três tabelas", false),
                        new Opcao(4, "Uma procedure armazenada no banco", false)
                ), "Um SELECT dentro de outro SELECT"));

        // id=318  correct at pos 3
        PERGUNTAS.add(new Pergunta(318, TipoTema.SQL,
                "Qual a diferença entre INNER JOIN e LEFT JOIN?",
                TipoPergunta.MULTIPLA_ESCOLHA,
                Arrays.asList(
                        new Opcao(1, "INNER JOIN retorna tudo da tabela da esquerda; LEFT JOIN só os que combinam", false),
                        new Opcao(2, "São idênticos; apenas nomes diferentes", false),
                        new Opcao(3, "INNER JOIN retorna só linhas com correspondência em ambas; LEFT JOIN inclui todas da esquerda", true),
                        new Opcao(4, "LEFT JOIN é mais lento que INNER JOIN sempre", false)
                ), "INNER JOIN retorna só linhas com correspondência em ambas; LEFT JOIN inclui todas da esquerda"));

        // ── SQL_LIVRE (ids 213-222) ────────────────────────────────────────────
        PERGUNTAS.add(new Pergunta(213, TipoTema.SQL,
                "Escreva um SELECT para buscar todos os registros da tabela 'alunos'",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT * FROM ALUNOS"));

        PERGUNTAS.add(new Pergunta(214, TipoTema.SQL,
                "Escreva uma query para contar todos os registros da tabela 'produtos'",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT COUNT(*) FROM PRODUTOS"));

        PERGUNTAS.add(new Pergunta(215, TipoTema.SQL,
                "Escreva um SELECT para buscar 'nome' onde 'ativo = 1' na tabela 'usuarios'",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT NOME FROM USUARIOS WHERE ATIVO = 1"));

        PERGUNTAS.add(new Pergunta(216, TipoTema.SQL,
                "Escreva uma query para buscar registros de 'vendas' ordenados por 'valor' em ordem decrescente",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT * FROM VENDAS ORDER BY VALOR DESC"));

        PERGUNTAS.add(new Pergunta(217, TipoTema.SQL,
                "Escreva uma query para buscar 'nome' sem duplicatas na tabela 'cidades'",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT DISTINCT NOME FROM CIDADES"));

        PERGUNTAS.add(new Pergunta(218, TipoTema.SQL,
                "Escreva uma query que soma o campo 'preco' de todos os registros da tabela 'produtos'",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT SUM(PRECO) FROM PRODUTOS"));

        PERGUNTAS.add(new Pergunta(219, TipoTema.SQL,
                "Escreva uma query para buscar os 5 primeiros registros da tabela 'clientes'",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT * FROM CLIENTES LIMIT 5"));

        PERGUNTAS.add(new Pergunta(220, TipoTema.SQL,
                "Escreva uma query para buscar 'categoria' e contar quantos produtos há em cada categoria na tabela 'produtos'",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT CATEGORIA, COUNT(*) FROM PRODUTOS GROUP BY CATEGORIA"));

        PERGUNTAS.add(new Pergunta(221, TipoTema.SQL,
                "Escreva uma query para buscar o maior valor do campo 'salario' da tabela 'funcionarios'",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT MAX(SALARIO) FROM FUNCIONARIOS"));

        PERGUNTAS.add(new Pergunta(222, TipoTema.SQL,
                "Escreva uma query para buscar registros de 'pedidos' onde 'total' está entre 100 e 500",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT * FROM PEDIDOS WHERE TOTAL BETWEEN 100 AND 500"));

        // ── SQL_LIVRE extras (ids 323-342) ─────────────────────────────────────
        PERGUNTAS.add(new Pergunta(323, TipoTema.SQL,
                "Escreva uma query para buscar 'nome' e 'email' da tabela 'clientes' onde 'cidade' é 'São Paulo'",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT NOME, EMAIL FROM CLIENTES WHERE CIDADE = 'SÃO PAULO'"));

        PERGUNTAS.add(new Pergunta(324, TipoTema.SQL,
                "Escreva um INSERT para adicionar um produto com nome 'Caneta' e preço 2.50 na tabela 'produtos'",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "INSERT INTO PRODUTOS (NOME, PRECO) VALUES ('CANETA', 2.50)"));

        PERGUNTAS.add(new Pergunta(325, TipoTema.SQL,
                "Escreva um UPDATE para mudar o 'status' para 'inativo' do usuário com id=5 na tabela 'usuarios'",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "UPDATE USUARIOS SET STATUS = 'INATIVO' WHERE ID = 5"));

        PERGUNTAS.add(new Pergunta(326, TipoTema.SQL,
                "Escreva um DELETE para remover todos os registros da tabela 'logs' onde 'data' é anterior a 2023",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "DELETE FROM LOGS WHERE DATA < '2023-01-01'"));

        PERGUNTAS.add(new Pergunta(327, TipoTema.SQL,
                "Escreva uma query para buscar o segundo maior salário da tabela 'funcionarios'",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT MAX(SALARIO) FROM FUNCIONARIOS WHERE SALARIO < (SELECT MAX(SALARIO) FROM FUNCIONARIOS)"));

        PERGUNTAS.add(new Pergunta(328, TipoTema.SQL,
                "Escreva uma query para buscar todos os registros de 'alunos' cujo nome começa com a letra 'M'",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT * FROM ALUNOS WHERE NOME LIKE 'M%'"));

        PERGUNTAS.add(new Pergunta(329, TipoTema.SQL,
                "Escreva uma query para buscar a média do campo 'nota' da tabela 'avaliacoes'",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT AVG(NOTA) FROM AVALIACOES"));

        PERGUNTAS.add(new Pergunta(330, TipoTema.SQL,
                "Escreva uma query para contar quantos clientes existem por 'estado' na tabela 'clientes'",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT ESTADO, COUNT(*) FROM CLIENTES GROUP BY ESTADO"));

        PERGUNTAS.add(new Pergunta(331, TipoTema.SQL,
                "Escreva uma query para buscar 'nome' de 'funcionarios' que NÃO têm departamento (departamento_id é NULL)",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT NOME FROM FUNCIONARIOS WHERE DEPARTAMENTO_ID IS NULL"));

        PERGUNTAS.add(new Pergunta(332, TipoTema.SQL,
                "Escreva uma query para buscar registros de 'pedidos' cujo 'status' seja 'pendente' ou 'processando'",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT * FROM PEDIDOS WHERE STATUS IN ('PENDENTE', 'PROCESSANDO')"));

        PERGUNTAS.add(new Pergunta(333, TipoTema.SQL,
                "Escreva uma query para buscar os 3 produtos mais caros da tabela 'produtos' (campo 'preco')",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT * FROM PRODUTOS ORDER BY PRECO DESC LIMIT 3"));

        PERGUNTAS.add(new Pergunta(334, TipoTema.SQL,
                "Escreva uma query para buscar nome e departamento unindo as tabelas 'funcionarios' e 'departamentos' pelo campo 'departamento_id'",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT FUNCIONARIOS.NOME, DEPARTAMENTOS.NOME FROM FUNCIONARIOS INNER JOIN DEPARTAMENTOS ON FUNCIONARIOS.DEPARTAMENTO_ID = DEPARTAMENTOS.ID"));

        PERGUNTAS.add(new Pergunta(335, TipoTema.SQL,
                "Escreva uma query para buscar todos os nomes distintos de 'cidade' da tabela 'enderecos' em ordem alfabética",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT DISTINCT CIDADE FROM ENDERECOS ORDER BY CIDADE"));

        PERGUNTAS.add(new Pergunta(336, TipoTema.SQL,
                "Escreva um CREATE TABLE para criar a tabela 'categorias' com campos id (inteiro, chave primária) e nome (texto)",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "CREATE TABLE CATEGORIAS (ID INT PRIMARY KEY, NOME VARCHAR(100))"));

        PERGUNTAS.add(new Pergunta(337, TipoTema.SQL,
                "Escreva uma query para buscar a soma do campo 'quantidade' agrupada por 'produto_id' na tabela 'itens_pedido'",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT PRODUTO_ID, SUM(QUANTIDADE) FROM ITENS_PEDIDO GROUP BY PRODUTO_ID"));

        PERGUNTAS.add(new Pergunta(338, TipoTema.SQL,
                "Escreva uma query para buscar todos os dados da tabela 'vendas' ordenados por 'data' do mais recente para o mais antigo",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT * FROM VENDAS ORDER BY DATA DESC"));

        PERGUNTAS.add(new Pergunta(339, TipoTema.SQL,
                "Escreva uma query para atualizar o campo 'preco' multiplicando por 1.1 (reajuste de 10%) em todos os registros da tabela 'produtos'",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "UPDATE PRODUTOS SET PRECO = PRECO * 1.1"));

        PERGUNTAS.add(new Pergunta(340, TipoTema.SQL,
                "Escreva uma query para buscar 'nome' e 'salario' de 'funcionarios' onde o salário é maior que a média salarial da tabela",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT NOME, SALARIO FROM FUNCIONARIOS WHERE SALARIO > (SELECT AVG(SALARIO) FROM FUNCIONARIOS)"));

        PERGUNTAS.add(new Pergunta(341, TipoTema.SQL,
                "Escreva uma query para contar quantos pedidos existem por cliente agrupando por 'cliente_id' na tabela 'pedidos', mostrando só clientes com mais de 2 pedidos",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT CLIENTE_ID, COUNT(*) FROM PEDIDOS GROUP BY CLIENTE_ID HAVING COUNT(*) > 2"));

        PERGUNTAS.add(new Pergunta(342, TipoTema.SQL,
                "Escreva uma query para buscar 'nome' de 'alunos' que estão matriculados (id presente na tabela 'matriculas' no campo 'aluno_id')",
                TipoPergunta.SQL_LIVRE,
                new ArrayList<>(),
                "SELECT NOME FROM ALUNOS WHERE ID IN (SELECT ALUNO_ID FROM MATRICULAS)"));
    }

    public static Pergunta getPerguntaAleatoria(TipoTema tema, List<Integer> usadas) {
        List<Pergunta> disponiveis = new ArrayList<>();
        for (Pergunta p : PERGUNTAS) {
            if (p.getTema() == tema && !usadas.contains(p.getId())) {
                disponiveis.add(p);
            }
        }
        if (disponiveis.isEmpty()) {
            return null;
        }
        Collections.shuffle(disponiveis, new Random());
        Pergunta escolhida = disponiveis.get(0);

        if (escolhida.getTipo() == TipoPergunta.MULTIPLA_ESCOLHA) {
            List<Opcao> opcoes = new ArrayList<>(escolhida.getOpcoes());
            Collections.shuffle(opcoes, new Random());
            return new Pergunta(escolhida.getId(), escolhida.getTema(),
                    escolhida.getEnunciado(), escolhida.getTipo(),
                    opcoes, escolhida.getRespostaCorreta());
        }
        return escolhida;
    }

    public static List<Pergunta> getTodasPerguntas() {
        return Collections.unmodifiableList(PERGUNTAS);
    }
}
