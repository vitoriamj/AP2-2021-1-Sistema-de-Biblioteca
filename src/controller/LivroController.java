package controller;

import java.util.*;

import model.Livro;
import view.LivroMenu;

public class LivroController {
  Scanner sc = new Scanner(System.in);

  public LivroController() {
    new LivroMenu();
    int choice = sc.nextInt();

    do {
      if (choice == 1) {
        // cadastrar
      } else if (choice == 2) {
        // pesquisar
      } else if (choice == 3) {
        // deletar
      } else if (choice == 4) {
        sc.close();
        return;
      } else {
        System.out.println("Número inválido, tente novamente");
        choice = sc.nextInt();
      }
    } while (choice != 1 && choice != 2 && choice != 3 && choice != 4);

    sc.close();
  }
  // ArrayList<Livro> estoqueDeLivros = new ArrayList<>();

  // protected String searchLivro(long livroPedidoId) {
  // for (int i = 0; i <= estoqueDeLivros.size() - 1; i++) {
  // Livro tempLivro = estoqueDeLivros.get(i);
  // if (livroPedidoId == tempLivro) {
  // return "Livro encontrado";
  // } else {
  // return "Livro não encontrado";
  // }
  // }
  // }

  // public boolean addLivro(Livro livro) {
  // estoqueDeLivros.add(livro);
  // return true;
  // }
}