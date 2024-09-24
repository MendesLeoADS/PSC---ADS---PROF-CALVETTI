 import javax.swing.JOptionPane;

  public class solucao12 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        if (numero % 10 == 0) {
            JOptionPane.showMessageDialog(null, numero + " é divisível por 10.");
        } else if (numero % 5 == 0) {
            JOptionPane.showMessageDialog(null, numero + " é divisível por 5.");
        } else if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, numero + " é divisível por 2.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " não é divisível por 10, 5 ou 2.");
        }
    }
}
