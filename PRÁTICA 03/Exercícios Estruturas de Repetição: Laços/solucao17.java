 import javax.swing.JOptionPane;
  public class solucao17 {
   public static void main(String[] args) {
   StringBuilder tabela = new StringBuilder("Polegadas\tCentímetros\n");
        for (int i = 1; i <= 20; i++) {
            double cm = i * 2.54;
            tabela.append(i).append("\t\t").append(cm).append("\n");
        }
        JOptionPane.showMessageDialog(null, tabela.toString());
    }
}