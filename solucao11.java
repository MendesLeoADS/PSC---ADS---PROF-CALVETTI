  import javax.swing.JOptionPane;

   public class solucao11 {
    public static void main(String[] args) {
        int codigo;
        double totalResidencial = 0, totalComercial = 0, totalIndustrial = 0;
        double somaConsumoResidencial = 0, somaConsumoComercial = 0;
        int contadorResidencial = 0, contadorComercial = 0;

        while (true) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do consumidor (0 para sair):"));
            if (codigo == 0) {
                break;
            }

            double kWhConsumidos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de kWh consumidos:"));
            int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo do consumidor (1 - Residencial, 2 - Comercial, 3 - Industrial):"));

            double custo = 0;
            switch (tipo) {
                case 1:
                    custo = kWhConsumidos * 0.3;
                    totalResidencial += custo;
                    somaConsumoResidencial += kWhConsumidos;
                    contadorResidencial++;
                    break;
                case 2:
                    custo = kWhConsumidos * 0.5;
                    totalComercial += custo;
                    somaConsumoComercial += kWhConsumidos;
                    contadorComercial++;
                    break;
                case 3:
                    custo = kWhConsumidos * 0.7;
                    totalIndustrial += custo;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Tipo inválido. Tente novamente.");
                    continue;
            }

            JOptionPane.showMessageDialog(null, "Custo total para o consumidor " + codigo + ": R$ " + custo);
        }

        // Resultados finais
        StringBuilder sb = new StringBuilder();
        sb.append("Total Residencial: R$ ").append(totalResidencial).append("\n");
        sb.append("Total Comercial: R$ ").append(totalComercial).append("\n");
        sb.append("Total Industrial: R$ ").append(totalIndustrial).append("\n");

        double mediaConsumo = 0;
        if (contadorResidencial > 0) {
            mediaConsumo += somaConsumoResidencial / contadorResidencial;
        }
        if (contadorComercial > 0) {
            mediaConsumo += somaConsumoComercial / contadorComercial;
        }
        if (contadorResidencial > 0 || contadorComercial > 0) {
            mediaConsumo /= (contadorResidencial + contadorComercial > 0 ? 1 : 1);
        }

        sb.append("Média de consumo dos tipos 1 e 2: ").append(mediaConsumo);
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
