 import javax.swing.JOptionPane;

   public class solucao4 {
    public static void main(String[] args) {
           String entrada;
        int contador = 0;

        while (true) {
            entrada = JOptionPane.showInputDialog("Digite um número (ou 0 para sair):");

            if (entrada == null || entrada.isEmpty()) {
                continue; 
                
       //se a entrada estiver vazia, continua pedindo um número
       
            }

            int numero = Integer.parseInt(entrada);

            if (numero == 0) {
                break; 
                
       //encerra o loop se o usuário digitar 0
            }

            if (numero >= 100 && numero <= 200) {
                contador++; 
                
       //incrementa o contador se o número estiver entre 100 e 200
       
            }
        }

        JOptionPane.showMessageDialog(null, "Você digitou " + contador + " números entre 100 e 200.");
    }
}
