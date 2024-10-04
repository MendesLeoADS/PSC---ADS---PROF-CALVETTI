  public class solucao14 {
    public static void main(String[] args) {
    
    // Verifica se exatamente um argumento foi fornecido
        if (args.length != 1) {
            System.out.println("Por favor, forneça o valor do raio do círculo como argumento.");
            return;
        }

        try {
            // Converte o argumento para double
            double raio = Double.parseDouble(args[0]);

            // Define o valor de PI
            final double PI = 3.14159;

            // Calcula a área do círculo
            double area = PI * raio * raio;

            // Imprime o resultado
            System.out.printf("A área do círculo com raio %.2f é %.2f\n", raio, area);

        } catch (NumberFormatException e) {
            System.out.println("O argumento fornecido deve ser um número real válido.");
        }
    }
}