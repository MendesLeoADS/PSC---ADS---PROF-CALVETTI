 import javax.swing.JOptionPane;
  public class solucao23 {
   public static void main(String[] args) {
   int quantos = Integer.parseInt(JOptionPane.showInputDialog("Quantos números pares deseja imprimir?"));
        StringBuilder resultado = new StringBuilder("Números pares: ");
        
        for (int i = 1; i <= quantos; i++) {
            resultado.append(i * 2).append(" ");
        }
        
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
} 