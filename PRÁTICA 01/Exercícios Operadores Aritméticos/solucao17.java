  public class solucao17 {
    public static void main(String[] args) {
    
    // Verifica se exatamente dois argumentos foram fornecidos
        if (args.length != 2) {
            System.out.println("Por favor, forneça a base e a altura do triângulo como argumentos.");
            return;
        }

        try {
            // Converte os argumentos para double
            double base = Double.parseDouble(args[0]);
            double altura = Double.parseDouble(args[1]);

            // Verifica se a base e a altura são positivas
            if (base <= 0 || altura <= 0) {
                System.out.println("A base e a altura devem ser números positivos.");
                return;
            }

            // Calcula a área do triângulo
            double area = (base * altura) / 2;

            // Imprime o resultado
            System.out.printf("Base: %.2f\n", base);
            System.out.printf("Altura: %.2f\n", altura);
            System.out.printf("Área do triângulo: %.2f\n", area);

        } catch (NumberFormatException e) {
            System.out.println("Os argumentos fornecidos devem ser números reais válidos.");
        }
    }
}