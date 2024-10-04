import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solucao6 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder numero = new StringBuilder();

        try {
            // Leitura dos dígitos
            System.out.print("Digite o dígito da milhar: ");
            String milhar = reader.readLine();
            if (milhar.length() != 1) {
                System.out.println("Por favor, digite apenas um caracter.");
                return;
            }
            numero.append(milhar);

            System.out.print("Digite o dígito da centena: ");
            String centena = reader.readLine();
            if (centena.length() != 1) {
                System.out.println("Por favor, digite apenas um caracter.");
                return;
            }
            numero.append(centena);

            System.out.print("Digite o dígito da dezena: ");
            String dezena = reader.readLine();
            if (dezena.length() != 1) {
                System.out.println("Por favor, digite apenas um caracter.");
                return;
            }
            numero.append(dezena);

            System.out.print("Digite o dígito da unidade: ");
            String unidade = reader.readLine();
            if (unidade.length() != 1) {
                System.out.println("Por favor, digite apenas um caracter.");
                return;
            }
            numero.append(unidade);

            // Exibição do número concatenado
            System.out.println("O número formado é: " + numero.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
