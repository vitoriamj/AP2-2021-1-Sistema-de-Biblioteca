package entities;

import java.util.*;

public class Livro {
  private long id;
  private String nome;
  private String autor;
  private String editora;
  private int edicao;
  private int periodo; // periodo em dias
  private int atraso; // dias de atraso na entrega
  private boolean isAlugado;
  private boolean isMaiorDeIdade; // eh para maiores de idade
  private Date data;

  public long diasDeAtraso() {
    long diferenca = new Date().getTime() - data.getTime();

    long dias = (diferenca / (1000 * 60 * 60 * 24)) % 365;
    return dias;
  }

  // CONSTRUTORES

  public Livro() {
  }

  public Livro(long id, String nome, String autor, String editora, int edicao, int periodo, int atraso,
      boolean isAlugado, boolean isMaiorDeIdade, Date data) {
    this.id = id;
    this.nome = nome;
    this.autor = autor;
    this.editora = editora;
    this.edicao = edicao;
    this.periodo = periodo;
    this.atraso = atraso;
    this.isAlugado = isAlugado;
    this.isMaiorDeIdade = isMaiorDeIdade;
    this.data = data;
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

  public void setEditora(String editora) {
    this.editora = editora;
  }

  public String getEditora() {
    return editora;
  }

  public void setEdicao(int edicao) {
    this.edicao = edicao;
  }

  public int getEdicao() {
    return edicao;
  }

  public void setPeriodo(int periodo) {
    this.periodo = periodo;
  }

  public int getPeriodo() {
    return periodo;
  }

  public void setAtraso(int atraso) {
    this.atraso = atraso;
  }

  public int getAtraso() {
    return atraso;
  }

  public void setIsAlugado(boolean isAlugado) {
    this.isAlugado = isAlugado;
  }

  public boolean getIsAlugado() {
    return isAlugado;
  }

  public void setIsMaiorDeIdade(boolean isMaiorDeIdade) {
    this.isMaiorDeIdade = isMaiorDeIdade;
  }

  public boolean getIsMaiorDeIdade() {
    return isMaiorDeIdade;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

}