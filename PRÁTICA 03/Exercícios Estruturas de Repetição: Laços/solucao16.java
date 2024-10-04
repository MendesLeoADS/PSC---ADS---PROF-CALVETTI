 import javax.swing.JOptionPane;
  public class solucao16 {
   public static void main(String[] args) {
     int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        int a = 0, b = 1;
        StringBuilder resultado = new StringBuilder("Sequência de Fibonacci: ");
        
        while (a <= numero) {
            resultado.append(a).append(" ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}                     
                       
      