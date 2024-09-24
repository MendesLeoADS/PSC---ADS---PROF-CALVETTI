 import javax.swing.JOptionPane;

  public class solucao6 {
    public static void main(String[] args) {
        double numero;
        while (true) {
            numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número (-999 para sair):"));
            if (numero == -999) {
                break;
            }
            double raiz = Math.sqrt(numero);
            double inverso = 1 / numero;
            JOptionPane.showMessageDialog(null, "Raiz quadrada: " + raiz + "\nInverso: " + inverso);
        }
    }
}
