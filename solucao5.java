 import javax.swing.JOptionPane;

  public class solucao5 {
    public static void main(String[] args) {
        String nome;
        while (true) {
            nome = JOptionPane.showInputDialog("Digite um nome (ou 'FIM' para sair):");
            if (nome.equalsIgnoreCase("FIM")) {
                break;
            }
            JOptionPane.showMessageDialog(null, "Nome digitado: " + nome);
        }
    }
}
