package controller;

import java.util.*;

import model.Cliente;
import view.ClienteMenu;

public class ClienteController {
    Scanner sc = new Scanner(System.in);

    public ClienteController() {
        new ClienteMenu();
        int choice = sc.nextInt();

        do {
            if (choice == 1) {
                // cadastrar
            } else if (choice == 2) {
                // pesquisar
            } else if (choice == 3) {
                // deletar
            } else if (choice == 4) {
                // emprestimo
            } else if (choice == 5) {
                sc.close();
                return;
            } else {
                System.out.println("Número inválido, tente novamente");
                choice = sc.nextInt();
            }
        } while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5);

        sc.close();
    }
}
