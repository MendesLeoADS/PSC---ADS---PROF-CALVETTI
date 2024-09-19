public class solucao8 {
  public static void main(String[] args) {
  //definir número
  double numero = 100.0;
  
  //verificar se é positivo
  if (numero <= 0) {
      System.out.println("O número deve ser maior que zero.");
      return;
  }
 
  //calcular logaritmo na base 10
  double logaritmo = Math.log10(numero);
  
  //imprimir resultado
  System.out.printf("O logaritmo de %.2f na base 10 é: %.4f%n", numero, logaritmo);
 }
}  