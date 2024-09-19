public class solucao9 {
  public static void main(String[] args) {
  //verifica se o número de argumentos foi fornecido corretamente
  if (args.length != 2) {
     System.out.println("Forneça dois argumentos: o número e a base.");
     return;
  }
  
  try {
      //converter para double
      double numero = Double.parseDouble(args[0]);
      double base = Double.parseDouble(args[1]);
      
      //analise se a base e o número estão corretos
      if (numero <= 0 || base <= 0 || base == 1) {
         System.out.println("O número e a base devem ser positivos e a base não pode ser 1.");
     return;
  }
      
      //calcula o logaritmo usando a fórmula de mudança de base
      double logResult = Math.log(numero) / Math.log(base);
      
      //imprimir resultado
      System.out.printf("O logaritmo de %.2f na base %.2f é %.5f\n", numero, base, logResult);

  } catch (NumberFormatException e) {
      System.out.println("Forneça valores númericos válidos.");
  }
 }       
}    
           
  