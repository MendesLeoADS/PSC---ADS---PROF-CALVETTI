import javax.swing.JOptionPane;

public class TesteTurma {
    public static void main(String[] args) {
        // solicita dados para a turma
        String nome = JOptionPane.showInputDialog("Digite o nome da turma:");
        String curso = JOptionPane.showInputDialog("Digite o curso:");
        String quantidadeStr = JOptionPane.showInputDialog("Digite a quantidade de alunos:");
        int quantidadeDeAlunos = Integer.parseInt(quantidadeStr);
        String serieStr = JOptionPane.showInputDialog("Digite a série:");
        int serie = Integer.parseInt(serieStr);

        // cria um objeto Turma
        Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);

        // exibe os dados da turma
        String mensagem = "Dados da Turma:\n" +
                "Nome: " + turma.getNome() + "\n" +
                "Curso: " + turma.getCurso() + "\n" +
                "Quantidade de Alunos: " + turma.getQuantidadeDeAlunos() + "\n" +
                "Série: " + turma.getSerie();
        JOptionPane.showMessageDialog(null, mensagem);

        // solicita nova quantidade de alunos
        String novaQuantidadeStr = JOptionPane.showInputDialog("Digite a nova quantidade de alunos:");
        int novaQuantidade = Integer.parseInt(novaQuantidadeStr);

        // altera o valor do atributo
        turma.setQuantidadeDeAlunos(novaQuantidade);

        // exibe os dados da turma novamente
        String mensagemAtualizada = "Dados da Turma Atualizados:\n" +
                "Nome: " + turma.getNome() + "\n" +
                "Curso: " + turma.getCurso() + "\n" +
                "Quantidade de Alunos: " + turma.getQuantidadeDeAlunos() + "\n" +
                "Série: " + turma.getSerie();
        JOptionPane.showMessageDialog(null, mensagemAtualizada);
    }
}
