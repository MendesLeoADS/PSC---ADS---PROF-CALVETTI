import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solucao3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Leitura do dia
            System.out.print("Digite o dia: ");
            String diaInput = reader.readLine();
            int dia = Integer.parseInt(diaInput);

            // Leitura do mês
            System.out.print("Digite o mês: ");
            String mesInput = reader.readLine();
            int mes = Integer.parseInt(mesInput);

            // Leitura do ano
            System.out.print("Digite o ano: ");
            String anoInput = reader.readLine();
            int ano = Integer.parseInt(anoInput);

            // Exibição da data no formato dia/mês/ano
            System.out.println("A data digitada é: " + dia + "/" + mes + "/" + ano);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite números inteiros válidos.");
        }
    }
}
