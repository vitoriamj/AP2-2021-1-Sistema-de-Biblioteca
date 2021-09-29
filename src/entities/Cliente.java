package entities;

import java.util.*;
import entities.Livro;

public class Cliente {
  private long idUnico;
  private String nome;
  private String telefone;
  private Date nascimento;
  private Double multa;
  private long[] livros;

  public Cliente(long idUnico, String nome, String telefone, Date nascimento, Double multa, long[] livros) {
    this.idUnico = idUnico;
    this.nome = nome;
    this.telefone = telefone;
    this.nascimento = nascimento;
    this.multa = multa;
    this.livros = livros;
  }

  public long getIdUnico() {
    return idUnico;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getTelefone() {
    return telefone;
  }

  public void emprestimo(/* Livro livro.id */) {

  }

}