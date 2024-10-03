 import javax.swing.JOptionPane;
  public class solucao19 {
   public static void main(String[] args) {
     int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        long fatorial = 1;
        
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        
        JOptionPane.showMessageDialog(null, "Fatorial de " + numero + " é: " + fatorial);
    }
}