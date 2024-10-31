public class Tarefeiro extends Empregado {
    private double bonus;

    // Construtor sem parâmetros
    public Tarefeiro() {
        super(); // Chama o construtor da superclasse
        this.bonus = 0.0;
    }

    // Construtor com parâmetros
    public Tarefeiro(String nome, String sobrenome, String cpf, double salario, double bonus) {
        super(nome, sobrenome, cpf, salario);
        this.bonus = bonus;
    }

    // Métodos de acesso
    public double getBonus() {
        return bonus;
    }

    // Métodos modificadores
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Método dados sobrescrito
    public String dados() {
        return super.dados() + ", Bônus: R$" + bonus;
    }
}
