# Sistema de Marcação de Consultas

Um sistema de gerenciamento de consultas via terminal desenvolvido em Java. O projeto tem como objetivo aplicar conceitos fundamentais de Programação Orientada a Objetos (POO), estruturas de controle e manipulação de dados em memória.

## Funcionalidades

O sistema disponibiliza um menu de opções no console com as seguintes operações:

- Marcar consulta: Permite o agendamento informando dia e hora. O sistema realiza validações para garantir que o dia informado seja válido (1 a 31), o horário esteja dentro do expediente (8:00 às 18:00) e que não ocorram conflitos de horários.
- Listar consultas: Exibe todos os agendamentos registrados.
- Cancelar consulta: Permite a remoção de uma consulta específica a partir da lista de agendamentos.
- Sair: Encerra a execução da aplicação.

## Tecnologias Utilizadas

- Java
- java.util.ArrayList (armazenamento de dados em memória)
- java.util.Scanner (leitura de entrada do usuário)

## Estrutura do Projeto

O código está dividido nas seguintes classes principais:

- Main.java: Ponto de entrada do programa. Contém o laço de repetição do menu e gerencia a interação direta com o usuário.
- Agenda.java: Classe responsável pela lógica de negócios, execução das regras de validação e gerenciamento da lista de consultas.
- Consulta.java: Classe de modelo que define a entidade de agendamento e seus respectivos atributos.

## Como Executar

É necessário ter o Java Development Kit (JDK) instalado em seu ambiente.

1. Clone o repositório:
git clone https://github.com/seu-usuario/nome-do-repositorio.git

2. Acesse o diretório do projeto:
cd nome-do-repositorio

3. Compile os arquivos:
javac Main.java

4. Execute a aplicação:
java Main
