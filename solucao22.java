 import javax.swing.JOptionPane;
  public class solucao22 {
   public static void main(String[] args) {
   int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite superior:"));
        StringBuilder resultado = new StringBuilder("Números ímpares: ");
        
        for (int i = 1; i < limite; i += 2) {
            resultado.append(i).append(" ");
        }
        
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}