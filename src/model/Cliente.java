package model;

import java.util.*;
import java.text.*;

import model.interfaces.CheckT;

public class Cliente implements CheckT {
  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  private String nome;
  private String telefone;
  private Date nascimento;
  private long[] livros;

  public Cliente(String nome, String telefone, Date nascimento) {
    this.nome = nome;
    this.telefone = telefone;
    this.nascimento = nascimento;
  }

  // Interface de checagem
  @Override
  public boolean checagemT() {
    if (getTelefone().length() != 11) {
      return false;
    } else {
      for (int i = 0; i < getTelefone().length(); i++) {
        if (!Character.isDigit(getTelefone().charAt(i))) {
          return false;
        }
      }
    }
    return true;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setNascimento(Date nascimento) {
    this.nascimento = nascimento;
  }

  public Date getNascimento() {
    return nascimento;
  }

  public void setLivros(long[] livros) {
    this.livros = livros;
  }

  public long[] getLivros() {
    return livros;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getTelefone() {
    return telefone;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append("\nNome: " + nome + "\n");
    sb.append("Telefone: " + telefone + "\n");
    sb.append("Nascimento: " + sdf.format(nascimento) + "\n");

    if (livros != null) {

      for (int i = 0; i < livros.length - 1; i++) {
        sb.append("ID do " + (i + 1) + " livro: " + livros[i] + "\n");
      }
    } else {
      sb.append("Cliente não alugou livros.\n");
    }
    sb.append("\n");

    return sb.toString();
  }
}