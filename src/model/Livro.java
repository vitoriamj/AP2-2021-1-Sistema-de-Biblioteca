package model;

import java.util.*;
import java.text.*;

public class Livro {
  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  private String nome;
  private String autor;
  private int edicao;
  private boolean isAlugado;
  private Date data; // data em que foi alugado
  private final int periodo = 30; // periodo que o livro pode ser alugado em dias

  // CONSTRUTORES

  public Livro(String nome, String autor, int edicao) {
    this.nome = nome;
    this.autor = autor;
    this.edicao = edicao;
  }

  // GETTERS E SETTERS

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getAutor() {
    return autor;
  }

  public void setEdicao(int edicao) {
    this.edicao = edicao;
  }

  public int getEdicao() {
    return edicao;
  }

  public int getPeriodo() {
    return periodo;
  }

  public void setIsAlugado(boolean isAlugado) {
    this.isAlugado = isAlugado;
  }

  public boolean getIsAlugado() {
    return isAlugado;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append("\nNome: " + nome + "\n");
    sb.append("Autor: " + autor + "\n");
    sb.append("Edição: " + edicao + "\n");

    if (isAlugado) {
      sb.append("Livro alugado em: " + sdf.format(data) + "\n");
    } else {
      sb.append("Livro não alugado.\n");
    }
    sb.append("\n");

    return sb.toString();
  }

}