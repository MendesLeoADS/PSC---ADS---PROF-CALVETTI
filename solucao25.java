 import javax.swing.JOptionPane;
  public class solucao25 {
   public static void main(String[] args) {
   int[] votos = new int[4];
        int totalVotos = 0;

        while (true) {
            int voto = Integer.parseInt(JOptionPane.showInputDialog("Vote no candidato (1, 2, 3 ou 4) ou -1 para encerrar:"));
            if (voto == -1) break;

            if (voto >= 1 && voto <= 4) {
                votos[voto - 1]++;
                totalVotos++;
            }
        }

        StringBuilder resultado = new StringBuilder("Resultado da eleição:\n");
        for (int i = 0; i < votos.length; i++) {
            double percentual = (totalVotos > 0) ? (votos[i] * 100.0 / totalVotos) : 0;
            resultado.append("Candidato ").append(i + 1).append(": ").append(votos[i]).append(" votos (").append(percentual).append("%)\n");
        }
        resultado.append("Total de eleitores: ").append(totalVotos);
        
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}