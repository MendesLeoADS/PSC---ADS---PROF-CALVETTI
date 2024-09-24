 import javax.swing.JOptionPane;

  public class solucao12 {
    public static void main(String[] args) {
        int idade;
        int contMenor21 = 0;
        int contMaior50 = 0;

        while (true) {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade (0 a 120 anos, valor fora dessa faixa para sair):"));
            if (idade < 0 || idade > 120) {
                break;
            }
            if (idade < 21) {
                contMenor21++;
            } else if (idade > 50) {
                contMaior50++;
            }
        }

        JOptionPane.showMessageDialog(null, "Total de pessoas com menos de 21 anos: " + contMenor21 + "\nTotal de pessoas com mais de 50 anos: " + contMaior50);
    }
}
