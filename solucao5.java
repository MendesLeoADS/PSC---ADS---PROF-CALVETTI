 import javax.swing.JOptionPane;

  public class solucao5 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        if (numero >= 20 && numero <= 90) {
            JOptionPane.showMessageDialog(null, "O número está entre 20 e 90.");
        } else {
            JOptionPane.showMessageDialog(null, "O número NÃO está entre 20 e 90.");
        }
    }
}
