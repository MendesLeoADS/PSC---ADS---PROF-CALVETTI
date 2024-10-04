 import javax.swing.JOptionPane;

  public class solucao23c {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));

        int maior, menor, intermediario;

        if (a > b && a > c) {
            maior = a;
            if (b > c) {
                intermediario = b;
                menor = c;
            } else {
                intermediario = c;
                menor = b;
            }
        } else if (b > a && b > c) {
            maior = b;
            if (a > c) {
                intermediario = a;
                menor = c;
            } else {
                intermediario = c;
                menor = a;
            }
        } else {
            maior = c;
            if (a > b) {
                intermediario = a;
                menor = b;
            } else {
                intermediario = b;
                menor = a;
            }
        }

        JOptionPane.showMessageDialog(null, "Maior: " + maior + ", Intermediário: " + intermediario + ", Menor: " + menor);
    }
}
