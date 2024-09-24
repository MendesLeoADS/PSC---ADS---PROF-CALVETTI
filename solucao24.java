 import javax.swing.JOptionPane;

  public class solucao24 {
    public static void main(String[] args) {
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= 5; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "º número:"));

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nMenor: " + menor);
    }
}
