public class Disciplina {
    // Atributos
    private String nome;
    private String professor;
    private int semestre;
    private boolean ofertada;

    // Construtor
    public Disciplina(String nome, String professor, int semestre, boolean ofertada) {
        nome = nome;
        professor = professor;
        semestre = semestre;
        ofertada = ofertada;
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }

    public int getSemestre() {
        return semestre;
    }

    public boolean isOfertada() {
        return ofertada;
    }

    // Métodos modificadores
    public void setNome(String nome) {
        nome = nome;
    }

    public void setProfessor(String professor) {
        professor = professor;
    }

    public void setSemestre(int semestre) {
        semestre = semestre;
    }

    public void setOfertada(boolean ofertada) {
        ofertada = ofertada;
    }
}
