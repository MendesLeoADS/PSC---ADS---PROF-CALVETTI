  import javax.swing.JOptionPane;

  public class solucao15 {
    public static void main(String[] args) {
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento:"));
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));

        if (anoNascimento > 0 && anoNascimento <= anoAtual) {
            int idade = anoAtual - anoNascimento;
            JOptionPane.showMessageDialog(null, "Idade da pessoa: " + idade);
        } else {
            JOptionPane.showMessageDialog(null, "Ano de nascimento inválido.");
        }
    }
}
