package model;

import java.util.*;

import model.interfaces.CheckT;

public class Cliente implements CheckT {
  private long idUnico;
  private String nome;
  private String telefone;
  private Date nascimento;
  private Double multa;
  private long[] livros;

  public Cliente(long idUnico, String nome, String telefone, Date nascimento) {
    this.idUnico = idUnico;
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

  public long getIdUnico() {
    return idUnico;
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

  public double getMulta() {
    return multa;
  }

  public void setMulta(double multa) {
    this.multa = multa;
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

}