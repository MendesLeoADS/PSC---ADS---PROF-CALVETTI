 import javax.swing.JOptionPane;

  public class solucao7 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Múltiplos de 5 entre 1 e 500:\n");
        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0) {
                sb.append(i).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
