 import javax.swing.JOptionPane;

 public class solucao10 {
    public static void main(String[] args) {
        int numero;
        while (true) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (-999 para sair):"));
            if (numero == -999) {
                break;
            }
            StringBuilder sb = new StringBuilder("Divisores de " + numero + ":\n");
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    sb.append(i).append("\n");
                }
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }
}
