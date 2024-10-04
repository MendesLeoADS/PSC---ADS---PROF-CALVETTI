 import javax.swing.JOptionPane;
  public class solucao26 {
   public static void main(String[] args) {
     double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        int opcao;

        do {
            // Apresenta o menu
            String menu = "Operações Disponíveis:\n" +
                          "1. Adição\n" +
                          "2. Subtração\n" +
                          "3. Multiplicação\n" +
                          "4. Divisão\n" +
                          "9. Sair do Programa\n" +
                          "Digite o número de ordem da opção desejada:";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            double resultado;

            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    JOptionPane.showMessageDialog(null, "Resultado da Adição: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    JOptionPane.showMessageDialog(null, "Resultado da Subtração: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    JOptionPane.showMessageDialog(null, "Resultado da Multiplicação: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        JOptionPane.showMessageDialog(null, "Resultado da Divisão: " + resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não é permitida.");
                    }
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
            }
        } while (opcao != 9);
    }
}