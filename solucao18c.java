 import javax.swing.JOptionPane;

  public class solucao18c {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        if (a < b) {
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + a + ", " + b);
        } else {
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + b + ", " + a);
        }
    }
}
