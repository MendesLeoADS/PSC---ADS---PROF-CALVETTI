import javax.swing.JOptionPane;

 public class solucao1 {
   public static void main(String[] args) {
     //ler os valores com JOption.Pane
     String valor1Str = JOptionPane.showInputDialog("Digite o primeiro valor inteiro:");
     String valor2Str = JOptionPane.showInputDialog("Digite o segundo valor inteiro:");
     
     //converter as entradas para inteiros
     int valor1 = Integer.parseInt(valor1Str);
     int valor2 = Integer.parseInt(valor2Str);
     
     //calcular a soma dos valores
     int soma = valor1 + valor2;
     
     //verificar se é maior que 10 e imprimir o resultado
     if (soma > 10) {
        JOptionPane.showMessageDialog(null, "A soma dos valores é: " + soma);
     }
   }
 }        
