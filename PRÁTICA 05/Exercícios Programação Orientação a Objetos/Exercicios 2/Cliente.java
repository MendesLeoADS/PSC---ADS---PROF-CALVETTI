public class Cliente {
    // Atributos
    private String nome;
    private String cpf;
    private ContaCorrente conta;

    // Construtor
    public Cliente(String nome, String cpf, ContaCorrente conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }

    // Métodos de acesso (getters)
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    // Métodos modificadores (setters)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }
}
