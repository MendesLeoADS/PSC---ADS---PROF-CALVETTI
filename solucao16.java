 import javax.swing.JOptionPane;

  public class solucao16 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        if (a == b) {
            JOptionPane.showMessageDialog(null, "Os números são iguais.");
        } else {
            JOptionPane.showMessageDialog(null, "Os números são diferentes.");
        }
    }
}
