public class Agencia {
    // Atributos
    private String nome;
    private int numero;
    private int digito;

    // Construtor
    public Agencia(String nome, int numero, int digito) {
        if (numero < 0 || numero > 9999) {
            throw new IllegalArgumentException("O número da agência deve ser positivo e ter no máximo 4 dígitos.");
        }
        this.nome = nome;
        this.numero = numero;
        this.digito = calcularDigito(numero);
    }

    // Métodos de acesso (getters)
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public int getDigito() {
        return digito;
    }

    // Métodos modificadores (setters)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        if (numero < 0 || numero > 9999) {
            throw new IllegalArgumentException("O número da agência deve ser positivo e ter no máximo 4 dígitos.");
        }
        this.numero = numero;
        this.digito = calcularDigito(numero);
    }

    public void setDigito(int digito) {
        this.digito = digito; // Considerando que o dígito é calculado a partir do número.
    }

    // Método para calcular o dígito da agência (módulo 11)
    private int calcularDigito(int numero) {
        int d1 = (numero / 1000) % 10;
        int d2 = (numero / 100) % 10;
        int d3 = (numero / 10) % 10;
        int d4 = numero % 10;

        int soma = (d1 * 4) + (d2 * 6) + (d3 * 8) + (d4 * 2);
        int digitoCalculado = soma % 11;

        return (digitoCalculado == 10) ? 0 : digitoCalculado;
    }
}
