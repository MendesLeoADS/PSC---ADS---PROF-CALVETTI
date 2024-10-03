 import javax.swing.JOptionPane;

  public class solucao2c {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        int soma = a + b;

        if (soma <= 20) {
            soma -= 5;
        }
        JOptionPane.showMessageDialog(null, "Resultado: " + soma);
    }
}
