public class Professor {
    // Atributos
    private String nome;
    private int idade;

    // Construtor
    public Professor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Metódos de acesso
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Metódos modificadores
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Metódo getDados
    public String getDados() {
        return "Professor [nome=" + nome + ", idade=" + idade + "]";
    }
}
