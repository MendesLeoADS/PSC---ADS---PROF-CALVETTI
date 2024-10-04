 import javax.swing.JOptionPane;

  public class solucao4c {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));

        int menor, medio, maior;

        if (a < b && a < c) {
            menor = a;
            if (b < c) {
                medio = b;
                maior = c;
            } else {
                medio = c;
                maior = b;
            }
        } else if (b < a && b < c) {
            menor = b;
            if (a < c) {
                medio = a;
                maior = c;
            } else {
                medio = c;
                maior = a;
            }
        } else {
            menor = c;
            if (a < b) {
                medio = a;
                maior = b;
            } else {
                medio = b;
                maior = a;
            }
        }

        JOptionPane.showMessageDialog(null, "Ordem crescente: " + menor + ", " + medio + ", " + maior);
    }
}
