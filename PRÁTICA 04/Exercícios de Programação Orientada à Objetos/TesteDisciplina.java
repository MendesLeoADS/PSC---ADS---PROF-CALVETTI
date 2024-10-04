import javax.swing.JOptionPane;

public class TesteDisciplina {
    public static void main(String[] args) {
        // Solicita dados da disciplina usando JOptionPane
        String nome = JOptionPane.showInputDialog("Digite o nome da disciplina:");
        String professor = JOptionPane.showInputDialog("Digite o nome do professor:");
        String semestreStr = JOptionPane.showInputDialog("Digite o semestre:");
        int semestre = Integer.parseInt(semestreStr); // Converte a entrada para int
        String ofertadaStr = JOptionPane.showInputDialog("A disciplina é ofertada? (true/false):");
        boolean ofertada = Boolean.parseBoolean(ofertadaStr); // Converte a entrada para boolean

        // Cria um objeto Disciplina
        Disciplina disciplina = new Disciplina(nome, professor, semestre, ofertada);

        // Exibe os dados da disciplina
        String mensagem = "Disciplina Criada:\n" +
                "Nome: " + disciplina.getNome() + "\n" +
                "Professor: " + disciplina.getProfessor() + "\n" +
                "Semestre: " + disciplina.getSemestre() + "\n" +
                "Ofertada: " + (disciplina.isOfertada() ? "Sim" : "Não");
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
