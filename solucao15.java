  public class solucao15 {
    public static void main(String[] args) {
    
    // Verifica se exatamente dois argumentos foram fornecidos
        if (args.length != 2) {
            System.out.println("Por favor, forneça dois números inteiros como argumentos.");
            return;
        }

        try {
            // Converte os argumentos para inteiros
            int dividendo = Integer.parseInt(args[0]);
            int divisor = Integer.parseInt(args[1]);

            // Verifica se o divisor é zero para evitar divisão por zero
            if (divisor == 0) {
                System.out.println("O divisor não pode ser zero.");
                return;
            }

            // Calcula o quociente e o resto
            int quociente = dividendo / divisor;
            int resto = dividendo % divisor;

            // Imprime o resultado
            System.out.println("Dividendo: " + dividendo);
            System.out.println("Divisor: " + divisor);
            System.out.println("Quociente: " + quociente);
            System.out.println("Resto: " + resto);

        } catch (NumberFormatException e) {
            System.out.println("Os argumentos fornecidos devem ser números inteiros válidos.");
        }
    }
}