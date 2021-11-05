# Trabalho AP2 2021-1 - Sistema de Bibliotecas

O projeto desenvolvido permitirá o cadastro do catálogo e acesso de todos os livros de um biblioteca, além de todas as movimentações feitas com eles. Será utilizada a linguagem Java e POO para o desenvolvimento.

---

## Escopo

### Livro

- Atributos:

  - `String` Nome;
  - `String` Autor;
  - `int` Edição;
  - `int` Período de aluguel -> Constante para todos os aluguéis;
  - `Date || null` Data de aluguel: null caso não esteja alugado;
  - `Boolean` Está alugado?;

- Métodos:
  - Getters e setters;
  

### Cliente

- Atributos:

  - `String` Nome;
  - `String` Telefone;
  - `Date` Data de nascimento;

- Métodos:
  - Getters e setters;
  - Checagem de telefone;

---
### Empréstimo

- Atributos:

  - `Livro` livro;
  - `Cliente` cliente;
  - `Date` Data do emprestimo;

- Métodos:
  - Getters e setters;
  

---
### Interfaces

- Checagem de telefone;

### Controller

- CRUD de livros;
- CRUD de clientes;
- Utilização dos métodos de clientes e livros;
- Devolver livro;
- Pegar livro;
- Calcular multa;
- Calcular dias de atraso;


---

## Participantes

- Lara Portilho Marques: lara-portilho
- Vitória Mendonça Justino: vitoriamj
- Fernanda de Castro Fernandes: 2timesfer
