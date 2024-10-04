 import javax.swing.JOptionPane;

  public class solucao14 {
    public static void main(String[] args) {
        int contPrimos = 0;

        while (true) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo (ou um número não positivo para sair):"));
            if (numero <= 0) {
                break;
            }

            if (ehPrimo(numero)) {
                contPrimos++;
            }
        }

        JOptionPane.showMessageDialog(null, "Quantidade de números primos digitados: " + contPrimos);
    }

    public static boolean ehPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
