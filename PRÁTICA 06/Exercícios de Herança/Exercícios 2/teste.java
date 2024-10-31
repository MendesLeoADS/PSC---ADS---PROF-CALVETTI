public class teste {
    public class Main {
        public static void main(String[] args) {
            // Testando a classe PessoaFisica
            PessoaFisica pessoa = new PessoaFisica("Léo", "Mendes", "111.222.333-44");
            System.out.println("Pessoa Física: " + pessoa.dados());

            // Testando a classe Desempregado
            Desempregado desempregado = new Desempregado("Julio", "Silva", "123.456.789-00", 1200.0);
            System.out.println("Desempregado: " + desempregado.dados());

            // Testando a classe Empregado
            Empregado empregado = new Empregado("Carlos", "Lima", "234.567.890-11", 3000.0);
            System.out.println("Empregado: " + empregado.dados());

            // Testando a classe Mensalista
            Mensalista mensalista = new Mensalista("Marcos", "Pereira", "345.678.901-22", 3500.0, 500.0);
            System.out.println("Mensalista: " + mensalista.dados());

            // Testando a classe Horista
            Horista horista = new Horista("Ana", "Silveira", "456.789.012-33", 20.0, 160);
            System.out.println("Horista: " + horista.dados());

            // Testando a classe Tarefeiro
            Tarefeiro tarefeiro = new Tarefeiro("Paulo", "Santos", "567.890.123-44", 30.0, 15);
            System.out.println("Tarefeiro: " + tarefeiro.dados());

            // Testando a classe Vendedor
            Vendedor vendedor = new Vendedor("Clara", "Costa", "678.901.234-55", 2000.0, 500.0);
            System.out.println("Vendedor: " + vendedor.dados());

        }
    }

}
