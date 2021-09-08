# Trabalho AP2 2021-1 - Sistema de Bibliotecas

O projeto desenvolvido permitirá o cadastro do catálogo e acesso de todos os livros de um biblioteca, além de todas as movimentações feitas com eles. Será utilizada a linguagem Java e POO para o desenvolvimento.

---

## Escopo

### Livro

- Atributos:

  - `long` ID único;
  - `String` Nome;
  - `String` Autor;
  - `String` Editora;
  - `int` Edição;
  - `int` Período de aluguel;
  - `Date || null` Data de aluguel: null caso não esteja alugado;
  - `int` Dias de atraso;
  - `Boolean` Está alugado?;
  - `Boolean` É para maiores de dezoito anos?;

- Métodos:
  - Getters e setters;
  - Calcular dias de atraso;

### Cliente

- Atributos:

  - `long` ID único;
  - `String` Nome;
  - `String` Telefone;
  - `Date` Data de nascimento;
  - `Double` Multa: R$ 1.00 a cada dia de atraso;
  - `long array` Livros alugados: array de ID's dos livros, sendo que pode estar vazia (nenhum livro alugado) ou até 3 livros;

- Métodos:
  - Getters e setters;
  - Devolver livro;
  - Pegar livro;
  - Calcular multa;

---

### Interfaces

- Checagem de cada entrada de dados;
- Método abstrato de avisar quando está próximo do vencimento da data de aluguel;

### Controller

- CRUD de livros;
- CRUD de clientes;
- Utilização dos métodos de clientes e livros;

---

## Participantes

- Lara Portilho Marques: lara-portilho
- Vitória Mendonça Justino: vitoriamj
- Fernanda de Castro Fernandes: 2timesfer
