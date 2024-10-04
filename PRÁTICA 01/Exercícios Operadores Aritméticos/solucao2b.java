import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solucao2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Leitura do número
            System.out.print("Digite um número inteiro: ");
            String input = reader.readLine();
            int numero = Integer.parseInt(input); // Converte a string para inteiro

            // Exibição do número
            System.out.println("O valor do número digitado é: " + numero);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número inteiro válido.");
        }
    }
}
