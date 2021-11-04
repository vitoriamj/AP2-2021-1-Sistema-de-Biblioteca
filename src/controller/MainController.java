package controller;

import java.text.ParseException;
import java.util.*;

import view.MainMenu;

public class MainController {
  public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Seja bem-vindo(a)!");
    do {
      new MainMenu();
      int choice = sc.nextInt();
      if (choice == 1) {
        new ClienteController();
      } else if (choice == 2) {
        new LivroController();
      } else if (choice == 3) {
        new EmprestimosController();
      } else if (choice == 4) {
        sc.close();
        return;
      } else {
        System.out.println("Número inválido, tente novamente");
        choice = sc.nextInt();
      }
    } while (true);
  }
}
