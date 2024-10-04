 import javax.swing.JOptionPane;

  public class solucao3c {
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
        
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "Raiz quadrada: " + Math.sqrt(numero));
        } else {
            JOptionPane.showMessageDialog(null, "Quadrado: " + (numero * numero));
        }
    }
}
