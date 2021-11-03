package controller;

import java.util.*;
import java.text.*;

import view.MainMenu;

public class MainController {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    new MainMenu();
    int choice = sc.nextInt();

    do {
      if (choice == 1) {
        new ClienteController();
      } else if (choice == 2) {
        new LivroController();
      } else if (choice == 3) {
        sc.close();
        return;
      } else {
        System.out.println("Número inválido, tente novamente");
        choice = sc.nextInt();
      }
    } while (choice != 1 && choice != 2 && choice != 3);

    sc.close();

    // Date data = sdf.parse(sc.next());

  }
}
