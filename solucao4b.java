import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solucao4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Leitura do peso
            System.out.print("Digite seu peso (em kg): ");
            String pesoInput = reader.readLine();
            double peso = Double.parseDouble(pesoInput); // Converte a string para double

            // Exibição do peso
            System.out.println("O peso informado foi " + peso + " kg.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um peso válido.");
        }
    }
}
