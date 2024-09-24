 import javax.swing.JOptionPane;

  public class solucao6 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        if (numero > 20) {
            JOptionPane.showMessageDialog(null, "Maior do que 20.");
        } else if (numero == 20) {
            JOptionPane.showMessageDialog(null, "Igual a 20.");
        } else {
            JOptionPane.showMessageDialog(null, "Menor do que 20.");
        }
    }
}
