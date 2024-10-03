 import javax.swing.JOptionPane;
  public class solucao24 {
   public static void main(String[] args) {
    double total = 0;
        
        while (true) {
            double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do item (ou 0 para finalizar):"));
            if (preco == 0) break;
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do item:"));
            
            while (quantidade < 0) {
                quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade inválida! Digite novamente:"));
            }

            total += preco * quantidade;
        }

        JOptionPane.showMessageDialog(null, "Total a ser pago: " + total);
    }
}