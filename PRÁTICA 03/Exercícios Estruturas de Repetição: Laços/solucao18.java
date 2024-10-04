 import javax.swing.JOptionPane;
  public class solucao18 {
   public static void main(String[] args) {
    int limiteInferior = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite inferior:"));
        int limiteSuperior = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite superior:"));
        int incremento = Integer.parseInt(JOptionPane.showInputDialog("Digite o incremento:"));

        StringBuilder tabela = new StringBuilder("Celsius\tFahrenheit\n");
        for (int c = limiteInferior; c <= limiteSuperior; c += incremento) {
            double f = (c * 9/5) + 32;
            tabela.append(c).append("\t").append(f).append("\n");
        }
        JOptionPane.showMessageDialog(null, tabela.toString());
    }
}