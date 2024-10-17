public class Disciplina {
    // Atributos
    private String nome;
    private boolean pratica;

    // Metódos de acesso
    // Construtor
    public Disciplina(String nome, boolean pratica) {
        this.nome = nome;
        this.pratica = pratica;
    }

    // Metódos de acesso
    public String getNome() {
        return nome;
    }

    public boolean getPratica() {
        return pratica;
    }

    // Metódos modificadores
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPratica(boolean pratica) {
        this.pratica = pratica;
    }

    // Metódo getDados
    public String getDados() {
        return "Disciplina [nome=" + nome + ", pratica=" + pratica + "]";
    }
}
