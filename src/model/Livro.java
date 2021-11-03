package model;

import java.util.*;

public class Livro {
  private long id;
  private String nome;
  private String autor;
  private int edicao;
  private boolean isAlugado;
  private Date data; // data em que foi alugado
  private final int periodo = 30; // periodo que o livro pode ser alugado em dias

  public long diasDeAtraso() {
    long diferenca = new Date().getTime() - data.getTime();
    return (diferenca / (1000 * 60 * 60 * 24)) % 365;
  }

  // CONSTRUTORES

  public Livro(long id, String nome, String autor, int edicao) {
    this.id = id;
    this.nome = nome;
    this.autor = autor;
    this.edicao = edicao;
  }

  // GETTERS E SETTERS

  public long getId() {
    return id;
  }

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

}