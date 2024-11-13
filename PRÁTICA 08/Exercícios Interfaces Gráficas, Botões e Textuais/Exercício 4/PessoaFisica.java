abstract class PessoaFisica {
    protected String nome;

    public PessoaFisica(String nome) {
        this.nome = nome;
    }

    public abstract String obterInformacoes();

    public String toString() {
        return "Nome: " + nome;
    }
}

class Desempregado extends PessoaFisica {
    public Desempregado(String nome) {
        super(nome);
    }

    public String obterInformacoes() {
        return super.toString() + " (Desempregado)";
    }
}

abstract class Empregado extends PessoaFisica {
    protected double salario;

    public Empregado(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public abstract double calcularSalario();

    public String obterInformacoes() {
        return super.toString() + ", Salário: " + calcularSalario();
    }
}

class Mensalista extends Empregado {
    public Mensalista(String nome, double salario) {
        super(nome, salario);
    }

    public double calcularSalario() {
        return salario;
    }
}

class Comissionado extends Empregado {
    private double comissao;

    public Comissionado(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    public double calcularSalario() {
        return salario + comissao;
    }
}

class Horista extends Empregado {
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

class Tarefeiro extends Empregado {
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
