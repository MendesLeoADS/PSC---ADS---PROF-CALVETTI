import java.util.Scanner;

public class AppBloco {
    public static void main(String[] args) {
        BlocoDeNotas bloco = new BlocoDeNotas();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Inserir uma nota");
            System.out.println("2. Remover uma nota");
            System.out.println("3. Alterar uma nota");
            System.out.println("4. Listar todas as notas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite a nota a ser adicionada: ");
                    String novaNota = scanner.nextLine();
                    bloco.inserirNota(novaNota);
                    System.out.println("Nota adicionada!");
                    break;

                case 2:
                    System.out.print("Digite a nota a ser removida: ");
                    String notaRemover = scanner.nextLine();
                    if (bloco.removerNota(notaRemover)) {
                        System.out.println("Nota removida!");
                    } else {
                        System.out.println("Nota não encontrada.");
                    }
                    break;

                case 3:
                    System.out.print("Digite a nota antiga: ");
                    String notaAntiga = scanner.nextLine();
                    System.out.print("Digite a nova nota: ");
                    String notaNova = scanner.nextLine();
                    if (bloco.alterarNota(notaAntiga, notaNova)) {
                        System.out.println("Nota alterada!");
                    } else {
                        System.out.println("Nota antiga não encontrada.");
                    }
                    break;

                case 4:
                    bloco.listarNotas();
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
