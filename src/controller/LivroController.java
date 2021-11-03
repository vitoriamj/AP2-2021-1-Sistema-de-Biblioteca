package controller;

import java.util.*;
import java.text.*;

import model.Livro;
import view.LivroMenu;

public class LivroController {
  Scanner sc = new Scanner(System.in);
  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  ArrayList<Livro> estoqueDeLivros = new ArrayList<>();

  public LivroController() {

    do {
      new LivroMenu();
      int choice = sc.nextInt();
      if (choice == 1) {
        // cadastrar
      } else if (choice == 2) {
        System.out.print("Digite o nome do livro: ");
        sc.nextLine();
        String nomePesquisado = sc.nextLine();
        Livro livroEncontrado = searchLivro(nomePesquisado);
        if (livroEncontrado != null) {
          System.out.println(livroEncontrado);
        } else {
          System.out.println("Livro não encontrado.");
        }

      } else if (choice == 3) {
        // deletar
      } else if (choice == 4) {
        sc.close();
        return;
      } else {
        System.out.println("Número inválido, tente novamente");
        choice = sc.nextInt();
      }
    } while (true);

  }

  protected Livro searchLivro(String nomePesquisado) {
    for (int i = 0; i <= estoqueDeLivros.size() - 1; i++) {
      Livro tempLivro = estoqueDeLivros.get(i);
      if (nomePesquisado == tempLivro.getNome()) {
        return tempLivro;
      }
    }
    return null;
  }
  // }

  // public boolean addLivro(Livro livro) {
  // estoqueDeLivros.add(livro);
  // return true;
  // }
}