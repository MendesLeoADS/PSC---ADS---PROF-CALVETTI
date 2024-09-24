 import javax.swing.JOptionPane;

  public class solucao15 {
    public static void main(String[] args) {
        int maior = Integer.MIN_VALUE;
        int numero;

        while (true) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (-9999 para sair):"));
            if (numero == -9999) {
                break;
            }
            if (numero > maior) {
                maior = numero;
            }
        }

        if (maior != Integer.MIN_VALUE) {
            JOptionPane.showMessageDialog(null, "O maior número digitado foi: " + maior);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum número válido foi digitado.");
        }
    }
}
