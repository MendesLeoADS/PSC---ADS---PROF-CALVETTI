 import javax.swing.JOptionPane;

  public class solucao22c {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));

        int maior = Math.max(a, Math.max(b, c));
        JOptionPane.showMessageDialog(null, "O maior número armazenado é: " + maior);
    }
}
