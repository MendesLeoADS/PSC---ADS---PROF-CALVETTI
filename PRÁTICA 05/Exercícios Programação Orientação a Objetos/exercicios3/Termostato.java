package exercicios3;

public class Termostato {
    private int temperatura;

    // Construtor que inicializa a temperatura em 20 graus
    public Termostato() {
        this.temperatura = 20;
    }

    // Método de acesso para a temperatura
    public int getTemperatura() {
        return this.temperatura;
    }

    // Método modificador para a temperatura
    public void setTemperatura(int temperatura) {
        if (temperatura >= 15 && temperatura <= 28) {
            this.temperatura = temperatura;
        } else {
            System.out.println("Erro: A temperatura deve estar entre 15 e 28 graus.");
        }
    }
}
