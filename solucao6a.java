public class solucao6 {
  public static void main(String[] args) {
  //número de 3 casas decimais
  int numero = 500;
  
  //verificar se está dentro do intervalo decimal
  if (numero < 100 || numero > 999) {
     System.out.println("O número deverá ter 3 dígitos.");
     return;
  }
  
  //calcular algarismo
  int dezenas = (numero / 10) % 10;
  
  //imprimir o resultado
  System.out.println("O algarismo é: " + dezenas);
 }
} 