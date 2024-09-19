  public class solucao18 {
    public static void main(String[] args) {
    
    // Verifica se exatamente dois argumentos foram fornecidos
        if (args.length != 2) {
            System.out.println("Por favor, forneça as duas diagonais do losango como argumentos.");
            return;
        }

        try {
            // Converte os argumentos para double
            double diagonal1 = Double.parseDouble(args[0]);
            double diagonal2 = Double.parseDouble(args[1]);

            // Calcula a área do losango
            double area = (diagonal1 * diagonal2) / 2;

            // Imprime o resultado
            System.out.printf("Diagonal 1: %.2f\n", diagonal1);
            System.out.printf("Diagonal 2: %.2f\n", diagonal2);
            System.out.printf("Área do losango: %.2f\n", area);

        } catch (NumberFormatException e) {
            System.out.println("Os argumentos fornecidos devem ser números reais válidos.");
        }
    }
}