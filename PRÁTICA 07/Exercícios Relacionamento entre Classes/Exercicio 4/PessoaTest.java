public class PessoaTest {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("João Silva", 20, "Rua das Flores, 123", "1234-5678");

        // métodos da classe Pessoa
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println("Maior de Idade? " + (pessoa.isMaiorDeIdade() ? "Sim" : "Não"));
        System.out.println("Possui Telefone? " + (pessoa.possuiTelefone() ? "Sim" : "Não"));

        if (!pessoa.getNome().equals("João Silva")) {
            System.out.println("Erro: O nome não está correto.");
        }
        if (pessoa.getIdade() != 20) {
            System.out.println("Erro: A idade não está correta.");
        }
        if (!pessoa.getEndereco().equals("Rua das Flores, 123")) {
            System.out.println("Erro: O endereço não está correto.");
        }
        if (!pessoa.getTelefone().equals("1234-5678")) {
            System.out.println("Erro: O telefone não está correto.");
        }
        if (!pessoa.isMaiorDeIdade()) {
            System.out.println("Erro: A verificação de maioridade está incorreta.");
        }
        if (!pessoa.possuiTelefone()) {
            System.out.println("Erro: A verificação de telefone está incorreta.");
        }
    }
}
