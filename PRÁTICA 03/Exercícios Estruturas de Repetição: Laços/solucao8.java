 import javax.swing.JOptionPane;

  public class solucao8 {
    public static void main(String[] args) {
        long produto = 1;
        for (int i = 120; i <= 300; i++) {
            produto *= i;
        }
        JOptionPane.showMessageDialog(null, "Produto de 120 a 300: " + produto);
    }
}
