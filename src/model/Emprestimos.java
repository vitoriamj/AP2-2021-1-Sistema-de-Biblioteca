package model;

public class Emprestimos {
  private int idLivro;
  private int idCliente;
  private int idEmprestimo;

  public Emprestimos() {
  }

  public Emprestimos(int idLivro, int idCliente, int idEmprestimo) {
    this.idLivro = idLivro;
    this.idCliente = idCliente;
    this.idEmprestimo = idEmprestimo;
  }

  public int getIdCliente() {
    return idCliente;
  }

  public int getIdEmprestimo() {
    return idEmprestimo;
  }

  public int getIdLivro() {
    return idLivro;
  }

  public void setIdEmprestimo(int idEmprestimo) {
    this.idEmprestimo = idEmprestimo;
  }

  public void setIdCliente(int idCliente) {
    this.idCliente = idCliente;
  }

  public void setIdLivro(int idLivro) {
    this.idLivro = idLivro;
  }

}
