public class CaixaEletronico {
    public static void main(String[] args) {
        // Instanciando a Agência
        Agencia agencia = new Agencia("Agência Central", 7890, 5);

        // Instanciando a Conta Corrente
        ContaCorrente contaCorrente = new ContaCorrente(1234, 4, agencia, 150.00);

        // Instanciando o Cliente
        Cliente cliente = new Cliente("Ademar Apior", "123231518-12", contaCorrente);

        // Operações
        System.out.println("Saldo Inicial: " + contaCorrente.consultarSaldo());

        // 1. Sacar 140.0 (sucesso)
        double valorSacado1 = contaCorrente.sacar(140.0);
        System.out.println("Valor sacado: " + valorSacado1 + " | Saldo atual: " + contaCorrente.consultarSaldo());

        // 2. Consultar saldo (resultado é 10.0)
        System.out.println("Saldo após primeiro saque: " + contaCorrente.consultarSaldo());

        // 3. Sacar 200.0 (falha)
        double valorSacado2 = contaCorrente.sacar(200.0);
        System.out.println("Valor sacado: " + valorSacado2 + " | Saldo atual: " + contaCorrente.consultarSaldo());

        // 4. Consultar saldo (resultado é 10.0)
        System.out.println("Saldo após tentativa de saque falha: " + contaCorrente.consultarSaldo());

        // 5. Depositar 25.45 (sucesso)
        contaCorrente.depositar(25.45);
        System.out.println("Deposito realizado. Saldo atual: " + contaCorrente.consultarSaldo());

        // 6. Imprimir saldo (incluindo dados do cliente, conta e agência)
        imprimirDados(cliente, contaCorrente, agencia);
    }

    // Método para imprimir os dados do cliente, conta e agência
    private static void imprimirDados(Cliente cliente, ContaCorrente conta, Agencia agencia) {
        System.out.println("Cliente: " + cliente.getNome() + " | CPF: " + cliente.getCpf());
        System.out.println("Conta Corrente: " + conta.getNumero() + "-" + conta.getDigito());
        System.out.println("Agência: " + agencia.getNumero() + "-" + agencia.getDigito());
        System.out.println("Saldo: " + conta.consultarSaldo());
    }
}
