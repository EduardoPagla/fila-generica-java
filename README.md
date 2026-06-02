# Fila Genérica em Java

## Descrição

Projeto desenvolvido para praticar o uso de **Generics (Tipos Genéricos)** em Java através da implementação de uma estrutura de dados do tipo fila.

A aplicação permite armazenar objetos de diferentes tipos utilizando uma única classe genérica, garantindo reutilização de código e segurança de tipos (*Type Safety*).

## Tecnologias Utilizadas

* Java
* VS Code

## Estrutura do Projeto

```text
src/
├── Main.java
├── Fila.java
└── entities/
    ├── Cliente.java
    ├── Chamado.java
    └── Pedido.java
```

## Funcionalidades

A classe genérica `Fila<T>` possui os seguintes métodos:

* `adicionar(T item)` → adiciona um elemento ao final da fila;
* `proximo()` → remove e retorna o primeiro elemento da fila;
* `primeiro()` → retorna o primeiro elemento sem removê-lo;
* `vazia()` → verifica se a fila está vazia;
* `quantidade()` → retorna a quantidade de elementos armazenados;
* `listar()` → exibe todos os elementos da fila.

## Classes de Teste

Foram criadas as seguintes classes para demonstrar o funcionamento da fila genérica:

* Cliente
* Chamado
* Pedido

## Testes Realizados

Para cada tipo de fila foram realizados os seguintes testes:

1. Adição de dois objetos;
2. Listagem dos elementos;
3. Exibição do primeiro elemento;
4. Remoção do próximo elemento;
5. Nova listagem dos elementos restantes;
6. Exibição da quantidade de elementos armazenados.

## Conceitos Aplicados

* Programação Orientada a Objetos (POO)
* Generics
* Encapsulamento
* Reutilização de código
* Estruturas de dados
* Type Safety

## Autor

Eduardo P. H.
Curso de Ciência da Computação
