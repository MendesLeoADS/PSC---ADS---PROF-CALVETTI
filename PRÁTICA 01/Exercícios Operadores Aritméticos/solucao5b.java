import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solucao5 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder palavra = new StringBuilder();

        try {
            // Leitura de 10 caracteres
            System.out.println("Digite 10 caracteres:");

            for (int i = 0; i < 10; i++) {
                System.out.print("Caracter " + (i + 1) + ": ");
                String caracterInput = reader.readLine();
                
                // Verifica se foi digitado apenas um caracter
                if (caracterInput.length() == 1) {
                    palavra.append(caracterInput);
                } else {
                    System.out.println("Por favor, digite apenas um caracter.");
                    i--; // Volta uma iteração para que sejam lidos 10 caracteres
                }
            }

            // Exibição da palavra formada
            System.out.println("A palavra formada é: " + palavra.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
