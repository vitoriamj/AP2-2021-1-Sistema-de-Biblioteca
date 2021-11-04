package model;

import java.util.*;
import java.text.*;

public class Emprestimos {
  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  private Livro livro;
  private Cliente cliente;
  private int idEmprestimo;
  private Date data;

  public Emprestimos() {
  }

  public Emprestimos(Livro livro, Cliente cliente, int idEmprestimo) {
    this.livro = livro;
    this.cliente = cliente;
    this.idEmprestimo = idEmprestimo;
    this.data = new Date();
  }

  public Cliente getCliente() {
    return cliente;
  }

  public int getIdEmprestimo() {
    return idEmprestimo;
  }

  public Livro getLivro() {
    return livro;
  }

  public void setIdEmprestimo(int idEmprestimo) {
    this.idEmprestimo = idEmprestimo;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public void setLivro(Livro livro) {
    this.livro = livro;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append("\nID do empréstimo: " + idEmprestimo + "\n");
    sb.append("Data do empréstimo: " + sdf.format(data) + "\n\n");
    sb.append("Nome do livro: " + livro.getNome() + "\n");
    sb.append("Autor: " + livro.getAutor() + "\n");
    sb.append("Edição: " + livro.getEdicao() + "\n");

    sb.append("\n");

    return sb.toString();
  }

}
