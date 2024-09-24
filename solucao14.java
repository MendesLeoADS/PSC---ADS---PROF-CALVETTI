 import javax.swing.JOptionPane;

  public class solucao14 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro de 4 casas:"));

        int milhar = (numero / 1000) % 10;
        int centena = (numero / 100) % 10;
        int novoNumero = milhar * 10 + centena;

        if (novoNumero % 4 == 0) {
            JOptionPane.showMessageDialog(null, novoNumero + " é múltiplo de 4.");
        } else {
            JOptionPane.showMessageDialog(null, novoNumero + " não é múltiplo de 4.");
        }
    }
}
