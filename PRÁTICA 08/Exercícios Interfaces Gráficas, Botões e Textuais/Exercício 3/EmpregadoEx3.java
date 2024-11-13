abstract class EmpregadoEx3 {
    protected String nome;
    protected double salario;

    public EmpregadoEx3(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularSalario();

    public String toString() {
        return "Nome: " + nome + ", Salário: " + calcularSalario();
    }
}

class Mensalista extends EmpregadoEx3 {
    public Mensalista(String nome, double salario) {
        super(nome, salario);
    }

    public double calcularSalario() {
        return salario; // Salário mensal fixo
    }
}

class Comissionado extends EmpregadoEx3 {
    private double comissao;

    public Comissionado(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    public double calcularSalario() {
        return salario + comissao; // Salário base + comissão
    }
}

class Horista extends EmpregadoEx3 {
    private int horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, int horasTrabalhadas, double valorHora) {
        super(nome, 0);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }
}

class Tarefeiro extends EmpregadoEx3 {
    private int tarefasRealizadas;
    private double valorTarefa;

    public Tarefeiro(String nome, int tarefasRealizadas, double valorTarefa) {
        super(nome, 0);
        this.tarefasRealizadas = tarefasRealizadas;
        this.valorTarefa = valorTarefa;
    }

    public double calcularSalario() {
        return tarefasRealizadas * valorTarefa;
    }
}
