public class TesteAtribuicao {
    public static void main(String[] args) {
        // Instanciando um Professor
        Professor professor = new Professor("Léo Mendes", 23);

        // Instanciando uma Disciplina
        Disciplina disciplina = new Disciplina("Programação", true);

        // Instanciando uma Atribuicao
        Atribuicao atribuicao = new Atribuicao(professor, disciplina);

        // Imprimindo os dados da Atribuicao
        System.out.println(atribuicao.getDados());
    }
}
