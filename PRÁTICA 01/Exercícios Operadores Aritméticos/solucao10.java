public class solucao10 {
  public static void main(String[] args) {

    // Verifica se o número de argumentos foi fornecido corretamente
    if (args.length != 3) {
         System.out.println("Forneça três frases como argumentos.");
     return;
     }

     // Recebe as três frases dos argumentos
      String frase1 = args[0];
      String frase2 = args[1];
      String frase3 = args[2];

     // Divide cada frase ao meio
     String metade1_1 = frase1.substring(0, frase1.length() / 2);
     String metade1_2 = frase1.substring(frase1.length() / 2);
     String metade2_1 = frase2.substring(0, frase2.length() / 2);
     String metade2_2 = frase2.substring(frase2.length() / 2);
     String metade3_1 = frase3.substring(0, frase3.length() / 2);
     String metade3_2 = frase3.substring(frase3.length() / 2);

     // Cria a frase embaralhada
     String fraseEmbaralhada = metade2_1 + metade3_2 + metade2_2 + metade1_1 + metade3_1 + metade1_2;

     // Concatena as frases originais
     String frasesConcatenadas = frase1 + " " + frase2 + " " + frase3;

     // Imprime o resultado
     System.out.println("Frases concatenadas:");
     System.out.println(frasesConcatenadas);
     System.out.println("Frase embaralhada:");
     System.out.println(fraseEmbaralhada);
    }
}
