public class Empregado extends PessoaFisica {

    private double salario;

    // Construtor sem parâmetros
    public Empregado() {
        super(); // Chama o construtor da superclasse
        this.salario = 0.0;
    }

    // Construtor com parâmetros
    public Empregado(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }

    // Métodos de acesso
    public double getSalario() {
        return salario;
    }

    // Métodos modificadores
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método dados sobrescrito
    public String dados() {
        return super.dados() + ", Salário: R$" + salario;
    }
}
