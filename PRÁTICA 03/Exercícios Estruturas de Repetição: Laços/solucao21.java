 import javax.swing.JOptionPane;
  public class solucao21 {
   public static void main(String[] args) {
     StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < 20; i++) {
            String nome = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i + 1) + ":");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de " + nome + ":"));
            String sexo = JOptionPane.showInputDialog("Digite o sexo de " + nome + " (M/F):");

            if (sexo.equalsIgnoreCase("M") && idade > 21) {
                resultado.append(nome).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}