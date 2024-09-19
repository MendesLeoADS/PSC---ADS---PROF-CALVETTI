public class solucao3 {
  public static void main(String[] args) {
  //número que será elevado
  int numero = 3;
  
  //converter o número 
  double base = (double) numero;
  double expoente = 2.0; //elevando ao quadrado
  
  //calcular o resultado usando o Math.pow
  double resultado = Math.pow(base, expoente);  

  //imprimir o resultado
  System.out.println("O quadrado de " + numero + " é:" + resultado);
 }
}