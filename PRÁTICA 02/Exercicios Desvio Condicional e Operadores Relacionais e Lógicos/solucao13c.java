 import javax.swing.JOptionPane;

  public class solucao13c {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro de 3 casas:"));

        int dezenas = (numero / 10) % 10;

        if (dezenas % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O algarismo das dezenas é par.");
        } else {
            JOptionPane.showMessageDialog(null, "O algarismo das dezenas é ímpar.");
        }
    }
}
