 import javax.swing.JOptionPane;

  public class solucao7c {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String sexo = JOptionPane.showInputDialog("Digite seu sexo (f ou m):");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));

        if (sexo.equalsIgnoreCase("f") && idade < 25) {
            JOptionPane.showMessageDialog(null, nome + ": ACEITA.");
        } else {
            JOptionPane.showMessageDialog(null, nome + ": NÃO ACEITA.");
        }
    }
}
