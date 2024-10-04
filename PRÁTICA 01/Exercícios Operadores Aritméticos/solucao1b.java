 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;

   public class solucao1 {
      public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Leitura das palavras
            System.out.print("Digite a primeira palavra: ");
            String palavra1 = reader.readLine();

            System.out.print("Digite a segunda palavra: ");
            String palavra2 = reader.readLine();

            System.out.print("Digite a terceira palavra: ");
            String palavra3 = reader.readLine();

            // Apresentação na ordem contrária
            System.out.println(palavra3 + " " + palavra2 + " " + palavra1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
