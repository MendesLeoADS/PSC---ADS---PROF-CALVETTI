 import javax.swing.JOptionPane;

  public class solucao9 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Números de 1 a 100:\n");
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            sb.append(i).append("\n");
            soma += i;
        }
        sb.append("Soma: ").append(soma);
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
