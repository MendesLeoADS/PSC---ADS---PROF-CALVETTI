import java.util.Scanner;

public class CadastroApp {
    public static void main(String[] args) {
        BancoDeClientes banco = new BancoDeClientes();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Inserir cliente");
            System.out.println("2. Remover cliente");
            System.out.println("3. Alterar cliente");
            System.out.println("4. Listar dados de um cliente");
            System.out.println("5. Listar todos os clientes");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do cliente: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o telefone do cliente: ");
                    String fone = scanner.nextLine();
                    banco.inserirCliente(new Cliente(nome, fone, id));
                    System.out.println("Cliente inserido!");
                    break;

                case 2:
                    System.out.print("Digite o ID do cliente para remover: ");
                    id = scanner.nextInt();
                    if (banco.removerCliente(id)) {
                        System.out.println("Cliente removido!");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID do cliente para alterar: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    System.out.print("Digite o novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Digite o novo telefone: ");
                    String novoFone = scanner.nextLine();
                    if (banco.alterarCliente(id, novoNome, novoFone)) {
                        System.out.println("Cliente alterado!");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o ID do cliente para listar: ");
                    id = scanner.nextInt();
                    Cliente cliente = banco.listarCliente(id);
                    if (cliente != null) {
                        System.out.println(cliente);
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 5:
                    banco.listarTodosClientes();
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}
