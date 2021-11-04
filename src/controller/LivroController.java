package controller;

import java.util.*;

import model.Livro;
import view.LivroMenu;

public class LivroController {
  Scanner sc = new Scanner(System.in);
  ArrayList<Livro> estoqueDeLivros = new ArrayList<>();

  public LivroController() {

    do {
      new LivroMenu();
      int choice = sc.nextInt();
      if (choice == 1) {
        System.out.print("Digite o ID único do livro (apenas inteiros): ");
        sc.nextLine();
        long idCadastrado = sc.nextLong();
        System.out.print("Digite o nome do livro: ");
        sc.nextLine();
        String nomeCadastrado = sc.nextLine();
        System.out.print("Digite o(a) autor(a) do livro: ");
        String autorCadastrado = sc.nextLine();
        System.out.print("Digite a edição do livro (apenas inteiros): ");
        int edicaoCadastrada = sc.nextInt();

        Livro novoLivro = new Livro(idCadastrado, nomeCadastrado, autorCadastrado, edicaoCadastrada);
        estoqueDeLivros.add(novoLivro);

        System.out.println("Livro cadastrado!");
        System.out.println();

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
        System.out.print("Digite o nome do livro: ");
        sc.nextLine();
        String nomePesquisado = sc.nextLine();
        Livro livroEncontrado = searchLivro(nomePesquisado);
        if (livroEncontrado != null) {
          estoqueDeLivros.remove(livroEncontrado);
          System.out.println("Livro deletado.");
        } else {
          System.out.println("Livro não encontrado.");
        }

      } else if (choice == 4) {
        return;
      } else {
        System.out.println("Número inválido, tente novamente");
      }
    } while (true);
  }

  protected Livro searchLivro(String nomePesquisado) {
    for (int i = 0; i <= estoqueDeLivros.size() - 1; i++) {
      Livro tempLivro = estoqueDeLivros.get(i);
      if (nomePesquisado.equals(tempLivro.getNome())) {
        return tempLivro;
      }
    }
    return null;
  }
}