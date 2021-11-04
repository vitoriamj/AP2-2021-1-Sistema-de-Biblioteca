package controller;

import java.util.*;
import java.text.*;

import model.*;
import view.EmprestimosMenu;

public class EmprestimosController {
  Scanner sc = new Scanner(System.in);
  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  ArrayList<Emprestimos> livrosEmprestados = new ArrayList<>();

  public EmprestimosController() {
    do {
      new EmprestimosMenu();
      int choice = sc.nextInt();
      if (choice == 1) {
        // gerar emprestimo

      } else if (choice == 2) {
        // consultar

      } else if (choice == 3) {
        // devolver

      } else if (choice == 4) {
        return;
      } else {
        System.out.println("Número inválido, tente novamente");
      }
    } while (true);
  }

  // protected Integer search(int idLivroPesquisado) {
  // for (int i = 0; i <= livrosEmprestados.size() - 1; i++) {
  // Emprestimos temporario = livrosEmprestados.get(i);
  // int idTemp = temporario.getIdLivro();
  // if (idTemp == idLivroPesquisado) {
  // return idLivroPesquisado;
  // }
  // }
  // return null;
  // }

  // public boolean addEmprestimo(Emprestimos alugado) {
  // int idLivro = alugado.getIdLivro();
  // if (search(idLivro) == null) {
  // livrosEmprestados.add(alugado);
  // return true;
  // }
  // return false;
  // }

}
