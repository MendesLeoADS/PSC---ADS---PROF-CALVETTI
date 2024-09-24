 import javax.swing.JOptionPane;

  public class solucao9 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        if (numero % 3 == 0) {
            JOptionPane.showMessageDialog(null, numero + " é múltiplo de 3.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " não é múltiplo de 3.");
        }
    }
}
