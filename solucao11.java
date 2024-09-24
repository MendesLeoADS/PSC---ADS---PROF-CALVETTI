 import javax.swing.JOptionPane;

  public class solucao11 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        if (numero % 3 == 0 && numero % 7 == 0) {
            JOptionPane.showMessageDialog(null, numero + " é divisível por 3 e por 7.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " não é divisível por 3 e por 7.");
        }
    }
}
