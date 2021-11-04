package controller;

import java.text.ParseException;
import java.util.*;

import view.MainMenu;

public class MainController {
  public static void main(String[] args) throws ParseException, InputMismatchException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    LivroController livroController = new LivroController();
    ClienteController clienteController = new ClienteController();
    EmprestimosController emprestimosController = new EmprestimosController();

    System.out.println("Seja bem-vindo(a)!");
    do {
      new MainMenu();
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          clienteController.run();
          break;
        case 2:
          livroController.run();
          break;
        case 3:
          emprestimosController.run(livroController,clienteController);
          break;
        case 4:
          sc.close();
          return;
        default: 
          System.out.println("Número inválido, tente novamente");
          break;
      }
    } while (true);
  }
}
