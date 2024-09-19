  public class solucao16 {
    public static void main(String[] args) {
    
    // Verifica se exatamente um argumento foi fornecido
        if (args.length != 1) {
            System.out.println("Por favor, forneça um número como argumento.");
            return;
        }

        try {
            // Converte o argumento para double
            double numero = Double.parseDouble(args[0]);

            // Calcula o quadrado e a raiz quadrada do número
            double quadrado = numero * numero;
            double raizQuadrada = Math.sqrt(numero);

            // Imprime o resultado
            System.out.printf("Número: %.2f\n", numero);
            System.out.printf("Quadrado: %.2f\n", quadrado);
            System.out.printf("Raiz quadrada: %.2f\n", raizQuadrada);

        } catch (NumberFormatException e) {
            System.out.println("O argumento fornecido deve ser um número real válido.");
        }
    }
}