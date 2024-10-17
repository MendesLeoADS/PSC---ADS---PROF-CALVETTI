public class ContaCorrente {
    // Atributos
    private int numero;
    private int digito;
    private Agencia agencia; // Presumindo que você já tem uma classe Agencia
    private double saldo;

    // Construtor
    public ContaCorrente(int numero, int digito, Agencia agencia, double saldo) {
        if (numero < 0 || numero > 9999) {
            throw new IllegalArgumentException("O número da conta deve ser positivo e ter no máximo 4 dígitos.");
        }
        this.numero = numero;
        this.digito = calcularDigito(numero);
        this.agencia = agencia;
        this.saldo = saldo;
    }

    // Métodos de acesso (getters)
    public int getNumero() {
        return numero;
    }

    public int getDigito() {
        return digito;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos modificadores (setters)
    public void setNumero(int numero) {
        if (numero < 0 || numero > 9999) {
            throw new IllegalArgumentException("O número da conta deve ser positivo e ter no máximo 4 dígitos.");
        }
        this.numero = numero;
        this.digito = calcularDigito(numero);
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor do depósito deve ser positivo.");
        }
    }

    // Método sacar
    public double sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return valor;
        } else {
            System.out.println("Saque não efetuado. Saldo insuficiente.");
            return 0;
        }
    }

    // Método consultarSaldo
    public double consultarSaldo() {
        return saldo;
    }

    // Método imprimirSaldo
    public void imprimirSaldo() {
        System.out.println(
                "Conta: " + numero + "-" + digito + " | Agência: " + agencia.getNumero() + " | Saldo: R$ " + saldo);
    }

    // Método para calcular o dígito
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
