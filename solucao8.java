 import javax.swing.JOptionPane;

  public class solucao8 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        if (a > b) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + a);
        } else {
            JOptionPane.showMessageDialog(null, "O maior número é: " + b);
        }
    }
}
