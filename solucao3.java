  import javax.swing.JOptionPane;
  
   public class solucao3 {
    public static void main(String[] args) {
        String entrada;
        double soma = 0;
        int contador = 0;

        while (true) {
            entrada = JOptionPane.showInputDialog("Digite um número positivo (ou deixe em branco para sair):");
            
            if (entrada == null || entrada.isEmpty()) {
                break; 
                            }
            
            try {
                double numero = Double.parseDouble(entrada);
                
                if (numero > 0) {
                    soma += numero;
                    contador++;
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, insira apenas números positivos.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número válido.");
            }
        }

        if (contador > 0) {
            double media = soma / contador;
            JOptionPane.showMessageDialog(null, "A média dos números digitados é: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum número positivo foi digitado.");
        }
    }
}
