 public class solucao13 {
   public static void main(String[] args) {
   
   // Verifica se exatamente três argumentos foram fornecidos
        if (args.length != 3) {
            System.out.println("Por favor, forneça três números reais como argumentos.");
            return;
        }

        try {
            // Converte os argumentos para double
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);

            // Calcula o valor de x usando a fórmula fornecida
            double x = 2 * ((a - c) / 8) - b * 5;

            // Imprime o resultado
            System.out.printf("O resultado da expressão é: %.2f\n", x);

        } catch (NumberFormatException e) {
            System.out.println("Todos os argumentos devem ser números reais válidos.");
        }
    }
}