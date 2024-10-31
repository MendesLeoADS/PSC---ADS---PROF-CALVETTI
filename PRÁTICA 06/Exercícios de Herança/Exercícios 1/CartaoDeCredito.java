public class CartaoDeCredito extends Pagamento {

    private String numeroDoCartao;

    // Construtor
    public CartaoDeCredito(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoCartao) {
        super(nomeDoPagador, cpf, valorASerPago);
        this.numeroDoCartao = numeroDoCartao;
    }

    // Métodos de acesso
    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    // Métodos modificadores
    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }
}
