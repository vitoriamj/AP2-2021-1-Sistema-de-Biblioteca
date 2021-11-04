package controller;

import java.util.*;
import java.text.*;

import model.*;
import view.EmprestimosMenu;

public class EmprestimosController {
  Scanner sc = new Scanner(System.in);
  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  ArrayList<Emprestimos> livrosEmprestados = new ArrayList<>();

  int idUnica = 0;

  protected Emprestimos searchEmprestimo(Livro livro) {
    for (int i = 0; i <= livrosEmprestados.size() - 1; i++) {
      Emprestimos temporario = livrosEmprestados.get(i);
      if (temporario.getLivro() == livro) {
        return temporario;
      }
    }
    return null;
  }

  protected double gerarMulta(long dias){
    if(dias <= 0){
      return 0.0;
    }else{
      return dias*1.0;
    }
  }

  protected long diasAtraso(Emprestimos emprestimo){
    long diferenca = new Date().getTime() - emprestimo.getData().getTime();
    long dias = (diferenca / (1000 * 60 * 60 * 24)) % 365;
    return dias - emprestimo.getLivro().getPeriodo();
  }
  

  public void run(LivroController livroController, ClienteController clienteController){
     do {
        new EmprestimosMenu();
        int choice = sc.nextInt();
        if (choice == 1) {
          System.out.print("Digite o nome do livro: ");
          sc.nextLine();
          String nomePesquisado = sc.nextLine();
          Livro livroDesejado = livroController.searchLivro(nomePesquisado);
          if (livroDesejado != null && !livroDesejado.getIsAlugado()) {
            System.out.print("Digite seu nome: ");
            String clientePesquisado = sc.nextLine();
            Cliente clienteEmprestimo = clienteController.searchCliente(clientePesquisado);
            if (clienteEmprestimo != null) {
              Emprestimos novo = new Emprestimos(livroDesejado,clienteEmprestimo);
              livrosEmprestados.add(novo);
              livroDesejado.setIsAlugado(true);
              System.out.println("Livro alugado.");
            } else {
              System.out.println("Cliente não encontrado.");
          }
          } else if(livroDesejado != null) {
            System.out.println("Livro não alugado.");
          } else {
            System.out.println("Livro não encontrado.");
          }
          
        } else if (choice == 3) {
          System.out.print("Digite o nome do livro: ");
          sc.nextLine();
          String nomePesquisado = sc.nextLine();
          Livro livroEncontrado = livroController.searchLivro(nomePesquisado);
          if (livroEncontrado != null && livroEncontrado.getIsAlugado()) {
            Emprestimos emprestimoEncontrado = searchEmprestimo(livroEncontrado);
            System.out.println(emprestimoEncontrado);
            double multa = gerarMulta(diasAtraso(emprestimoEncontrado));
            if(multa == 0.0){
              System.out.println("Sem multa. Faltam "+ (-1*diasAtraso(emprestimoEncontrado)) +" dias até a entrega.\n");
            } else{
              System.out.println("Multa: R$"+ multa +". Atraso em "+ diasAtraso(emprestimoEncontrado) +" dias.\n");
            }

          } else if(livroEncontrado != null) {
            System.out.println("Livro não alugado.");
          } else {
            System.out.println("Livro não encontrado.");
          }

        } else if (choice == 2) {
          System.out.print("Digite o nome do livro: ");
          sc.nextLine();
          String nomePesquisado = sc.nextLine();
          Livro livroEncontrado = livroController.searchLivro(nomePesquisado);
          if(livroEncontrado != null && livroEncontrado.getIsAlugado()){
            Emprestimos devolvido = searchEmprestimo(livroEncontrado);
            livrosEmprestados.remove(devolvido);
            livroEncontrado.setIsAlugado(false); 
            System.out.println("Livro devolvido.");
          
          } else if(livroEncontrado != null) {
            System.out.println("Livro não alugado.");
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
}
