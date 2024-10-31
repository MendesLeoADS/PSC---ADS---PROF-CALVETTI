public class PessoaFisica {

    private String nome;
    private String sobrenome;
    private String cpf;

    // Construtor sem parâmetros
    public PessoaFisica() {
        this.nome = "Nome Padrão";
        this.sobrenome = "Sobrenome Padrão";
        this.cpf = "000.000.000-00";
    }

    // Construtor com parâmetros
    public PessoaFisica(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    // Métodos modificadores
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método dados
    public String dados() {
        return "Nome: " + nome + ", Sobrenome: " + sobrenome + ", CPF: " + cpf;
    }
}
