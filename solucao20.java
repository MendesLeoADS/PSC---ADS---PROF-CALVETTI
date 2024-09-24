 import javax.swing.JOptionPane;

  public class solucao20 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        if (a < b) {
            JOptionPane.showMessageDialog(null, "Quadrado do menor: " + (a * a) + "\nRaiz do maior: " + Math.sqrt(b));
        } else {
            JOptionPane.showMessageDialog(null, "Quadrado do menor: " + (b * b) + "\nRaiz do maior: " + Math.sqrt(a));
        }
    }
}
