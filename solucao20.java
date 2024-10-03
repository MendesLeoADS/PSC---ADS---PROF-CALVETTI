 import javax.swing.JOptionPane;
  public class solucao20 {
   public static void main(String[] args) {
     int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite superior:"));
        int incremento = Integer.parseInt(JOptionPane.showInputDialog("Digite o incremento:"));

        StringBuilder resultado = new StringBuilder("Números: ");
        for (int i = 0; i <= limite; i += incremento) {
            resultado.append(i).append(" ");
        }
        
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}