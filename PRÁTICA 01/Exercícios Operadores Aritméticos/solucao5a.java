public class solucao5 {
  public static void main(String[] args) {
  //valores fornecidos
  double valorInicial = 100.00; //valor da dívida
  double taxaJuros = 10.0; //porcentagem da taxa de juros
  int numeroMeses = 8; //meses
  
  //calcular resultado com juros compostos
  double valorFinal = valorInicial * Math.pow((1 + taxaJuros / 100), numeroMeses);
  
  //imprimir o resultado
  System.out.printf("Após %d meses, o valor da dívida será: R$ %.2f%n", numeroMeses, valorFinal);
 }
}
  