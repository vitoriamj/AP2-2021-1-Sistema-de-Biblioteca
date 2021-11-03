package controller;

import java.util.*;
import java.text.*;

import model.Cliente;
import view.ClienteMenu;

public class ClienteController {
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    ArrayList<Cliente> listaClientes = new ArrayList<>();

    public ClienteController() {
        new ClienteMenu();
        int choice = sc.nextInt();

        do {
            if (choice == 1) {
                System.out.print("Digite o ID único do(a) cliente: ");
                sc.nextLine();
                long idCadastrado = sc.nextLong();
                System.out.print("Digite o nome do(a) cliente: ");
                sc.nextLine();
                String nomeCadastrado = sc.nextLine();
                System.out.print("Digite o telefone do(a) cliente: ");
                sc.nextLine();
                String telefoneCadastrado = sc.nextLine();
                System.out.print("Digite a data de nascimento do(a) cliente: ");
                sc.nextLine();
                Date dataNascCadastrada = sdf.parse(sc.next());

                Cliente novoCliente = new Cliente(idCadastrado, nomeCadastrado, telefoneCadastrado, dataNascCadastrada);

                listaClientes.add(novoCliente);
            } else if (choice == 2) {
                System.out.print("Digite o nome do(a) cliente: ");
                sc.nextLine();
                String nomePesquisado = sc.nextLine();
                Cliente clienteEncontrado = searchCliente(nomePesquisado);
                if (clienteEncontrado != null) {
                System.out.println(clienteEncontrado);
                } else {
                System.out.println("Cliente não encontrado.");
                }
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
