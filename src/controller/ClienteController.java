package controller;

import java.util.*;
import java.text.*;

import model.Cliente;
import view.ClienteMenu;

public class ClienteController {
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    ArrayList<Cliente> listaClientes = new ArrayList<>();

    public void run() throws ParseException{
        do {
            new ClienteMenu();
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Digite o nome do(a) cliente: ");
                sc.nextLine();
                String nomeCadastrado = sc.nextLine();
                System.out.print("Digite o telefone do(a) cliente: ");
                String telefoneCadastrado = sc.nextLine();
                System.out.print("Digite a data de nascimento do(a) cliente (dd/mm/aaaa): ");
                Date dataNascCadastrada = sdf.parse(sc.next());

                Cliente novoCliente = new Cliente(nomeCadastrado, telefoneCadastrado, dataNascCadastrada);
                listaClientes.add(novoCliente);

                System.out.println("Cliente cadastrado!");
                System.out.println();

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
                System.out.print("Digite o nome do(a) cliente: ");
                sc.nextLine();
                String nomePesquisado = sc.nextLine();
                Cliente clienteEncontrado = searchCliente(nomePesquisado);
                if (clienteEncontrado != null) {
                    listaClientes.remove(clienteEncontrado);
                    System.out.println("Cliente deletado.");
                } else {
                    System.out.println("Cliente não encontrado.");
                }
            } else if (choice == 4) {
                return;
            } else {
                System.out.println("Número inválido, tente novamente");
            }
        } while (true);
    }

    protected Cliente searchCliente(String nomePesquisado) {
        for (int i = 0; i <=listaClientes.size() - 1; i++) {
            Cliente tempCliente = listaClientes.get(i);
            if (nomePesquisado.equals(tempCliente.getNome())) {
                return tempCliente;
            }
        }
        return null;
    }
}
