public class Atribuicao {
    // Atributos
    private Professor professor;
    private Disciplina disciplina;

    // Metódos de acesso
    // Construtor
    public Atribuicao(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
    }

    // Metódos de acesso
    public Professor getProfessor() {
        return professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    // Metódos modificadores
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    // Metódo getDados
    public String getDados() {
        return "Professor: " + professor.getNome() + ", Disciplina: " + disciplina.getNome();
    }
}
