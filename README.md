# Projeto TeamTime

## Entrega 0: apresentação no dia 17/09

* [x] Criar um projeto Java contendo as classes do domínio acadêmico (com seus respectivos atributos, construtores, getters e setters, considerando a visibilidade apropriada para cada membro), além de um diagrama de classes representando as classes do projeto.
* [x] No diagrama de classes, omita os getters e setters para melhorar a legibilidade. Use boas práticas de codificação e de modelagem.
* [x] O projeto deve estar no repositório do GitHub antes da apresentação. O diagrama de classes deve estar em um arquivo chamado `classes.png` ou `classes.pdf`, no diretório raiz do projeto.
* [x] Na sua modelagem, considere que uma universidade possui um nome, uma sigla, um conjunto de cursos e um conjunto de disciplinas.
* [x] Um curso possui um conjunto de disciplinas de natureza obrigatória (que são organizadas em semestres sugeridos - ex.: disciplinas do 2º semestre) e um conjunto de disciplinas de natureza optativa, dentre as disciplinas da universidade.
* [x] Uma disciplina possui um código alfanumérico, um nome, uma carga horária semestral (em horas), e zero ou mais pré-requisitos. Note que os pré-requisitos de uma disciplina podem variar de um curso para outro.

Para testar (parcialmente) se sua modelagem está correta, verifique se é possível instanciar três cursos, `CC`, `SI` e `LC`, e uma disciplina, `Engenharia de Software II (MATA63)`, de 68 h, de tal forma que essa disciplina seja obrigatória de 6º semestre em `CC`, obrigatória de 5º semestre em `SI` e optativa em `LC`.



## Entrega 1: entrega e apresentação no dia 22/10

* [ ] **Leitura de dados** do sistema a partir de [arquivo texto](/aulas/mata37/web/dados.txt) fornecido pelo professor. Ver [código de exemplo](le-dados.java) 
* [ ] Criação de **alunos** da universidade, com nome, número de matrícula (é um identificador único) e senha. Cada aluno pertence a apenas um curso.
* [ ] Criação de **histórico** de um aluno: lista de componentes curriculares cursados por semestre, indicando código, nome, carga horária, natureza, nota e conceito (aprovado, reprovado por nota, reprovado por falta, dispensa, trancamento). Só existe nota quando o conceito é aprovado ou reprovado por nota.
    * [x] Impressão do histórico, com cálculo da carga horária total (optativa e obrigatória) e CR (nota média) do aluno. Considere que o CR é calculado através da média simples das notas.
    * [x] A impressão dos histórico deve poder ser feita em dois formatos diferentes: TXT e HTML
* [ ] Impressão do **currículo** do curso, que lista disciplinas obrigatórias, por semestre, e optativas, informando, para cada disciplina, o código, o nome, e a carga horária.

Neste momento não é necessário criar nenhuma interface com o usuário. No entanto, você deve seguir princípios de projeto orientado a objetos. Alguns aspectos a observar (note que a lista não é completa):

* [ ] Certas classes devem ser imutáveis
* [ ] Defina o critério de igualidade das classes quando isso for relevante
* [ ] Use conjuntos ou listas de acordo com a situação



## Entrega 2

* [ ] Criar uma interface gráfica com o usuário usando o Java Swing, o JavaFX ou o Android SDK. Se optar por usar o Java Swing, você pode usar a extensão WindowBuilder para Eclipse.

Considere que a interface gráfica será usada exclusivamente pelo coordenador do curso, que possui todas as permissões. Conside os seguintes casos:
* [ ] Coordenador cadastra aluno, informando nome, número de matrícula e semestre de ingresso
    * [ ] Sistema exibe mensagem de erro se alguma das informações estiver em branco ou se o aluno já foi cadastrado
* [ ] Coordenador lista alunos
* [ ] Coordenador seleciona aluno para visualizar informações sobre ele
* [ ] Coordenador visualiza histórico de um aluno (o formato pode ser HTML ou TXT)
* [ ] Coordenador lista currículo do curso
* [ ] Coordenador visualiza escalonamento de matrícula do curso
    * Há dois critérios: por ordem decrescente de CR (desempatando por ordem crescente de semestre) ou por ordem crescente de semestre (desempatando por ordem decrescente de CR)

Considere uma arquitetura da seguinte forma:
* [ ] As classes que representam entidades do sistema (ex.: aluno, universidade, curso…) devem estar em um pacote chamado `*.domain `(onde * é o nome do pacote principal de sua aplicação, como br.ufba.mata62.team1)
* [ ] As telas do sistema devem estar em um pacote chamado `*.controller`, com sufixo Controller (ex.: CurriculoController)
* [ ] As operações do sistema devem estar em classes do pacote `*.service`, com sufixo Service (ex.: AlunoService)
* [ ] Código de acesso a arquivo deve estar em classes do pacote `*.repository`, com sufixo Repository
* [ ] Controller, Service e Repository devem ser estruturados em camadas
* [ ] Todos os pacotes podem acessar o pacote `*.domain`
* [ ] Não deve haver lógica de negócio nos controllers; use os services para isso
* [ ] Cenários de erro devem resultar em uma exceção customizada sendo lançada pelo service e tratada pelo controller
* [ ] A visualização do histórico em diferentes formatos deve ser implementada com o padrão de projeto Template Method
* [ ] A escolha do critério de escalonamento deve ser implementada com o padrão de projeto Strategy
* [ ] Siga a lei de Demeter

No dia da entrega, atualize o repositório Git antes da aula.

## Entrega 3

A definir.

<!-- - Projeto completo, com testes de unidade
- Critério: cobertura de testes
- Apresentação: demonstração do sistema -->
