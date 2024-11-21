import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Deposito deposito = new Deposito();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar caixa");
            System.out.println("2. Remover caixa");
            System.out.println("3. Procurar caixa");
            System.out.println("4. Alterar corredor e posição");
            System.out.println("5. Listar caixas mais pesadas que um valor");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Dono da caixa: ");
                    String dono = scanner.nextLine();
                    System.out.print("Corredor: ");
                    String corredor = scanner.nextLine();
                    System.out.print("Posição: ");
                    int posicao = scanner.nextInt();
                    System.out.print("Peso (kg): ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine(); // Limpa o buffer
                    deposito.adicionarCaixa(new Caixa(corredor, posicao, peso, dono));
                    System.out.println("Caixa adicionada!");
                    break;

                case 2:
                    System.out.print("Digite o nome do dono para remover a caixa: ");
                    dono = scanner.nextLine();
                    if (deposito.removerCaixa(dono)) {
                        System.out.println("Caixa removida!");
                    } else {
                        System.out.println("Caixa não encontrada.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do dono para procurar a caixa: ");
                    dono = scanner.nextLine();
                    int pos = deposito.buscarCaixa(dono);
                    if (pos != -1) {
                        System.out.println("Caixa encontrada na posição: " + pos);
                    } else {
                        System.out.println("Caixa não encontrada.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do dono para alterar a caixa: ");
                    dono = scanner.nextLine();
                    System.out.print("Novo corredor: ");
                    String novoCorredor = scanner.nextLine();
                    System.out.print("Nova posição: ");
                    int novaPosicao = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    if (deposito.alterarCaixa(dono, novoCorredor, novaPosicao)) {
                        System.out.println("Caixa alterada!");
                    } else {
                        System.out.println("Caixa não encontrada.");
                    }
                    break;

                case 5:
                    System.out.print("Digite o peso mínimo: ");
                    double pesoMinimo = scanner.nextDouble();
                    scanner.nextLine(); // Limpa o buffer
                    System.out.println("Caixas mais pesadas que " + pesoMinimo + "kg:");
                    deposito.listarCaixasPesadas(pesoMinimo);
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
