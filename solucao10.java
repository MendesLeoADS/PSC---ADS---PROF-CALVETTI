 import javax.swing.JOptionPane;

  public class solucao10 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        if (numero % 5 == 0) {
            JOptionPane.showMessageDialog(null, numero + " é divisível por 5.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " não é divisível por 5.");
        }
    }
}
