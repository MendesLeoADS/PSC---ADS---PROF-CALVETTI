package exercicios3;

public class CondicionadorDeAr {
    private Termostato termostato;
    private boolean ligado;

    // Construtor que inicializa o termostato e define 'ligado' como false
    public CondicionadorDeAr() {
        this.termostato = new Termostato();
        this.ligado = false;
    }

    // Método de acesso para verificar se está ligado
    public boolean isLigado() {
        return this.ligado;
    }

    // Método de acesso para o termostato
    public Termostato getTermostato() {
        return this.termostato;
    }

    // Método para ligar o condicionador de ar
    public void ligar() {
        this.ligado = true;
        System.out.println("Condicionador de ar ligado.");
    }

    // Método para desligar o condicionador de ar
    public void desligar() {
        this.ligado = false;
        System.out.println("Condicionador de ar desligado.");
    }

    // Método para aumentar a temperatura até o limite de 28 graus
    public void aumentarTemperatura() {
        if (ligado) {
            if (termostato.getTemperatura() < 28) {
                termostato.setTemperatura(termostato.getTemperatura() + 1);
                System.out.println("Temperatura aumentada para: " + termostato.getTemperatura() + " graus.");
            } else {
                System.out.println("Erro: A temperatura não pode exceder 28 graus.");
            }
        } else {
            System.out.println("Erro: O condicionador de ar está desligado.");
        }
    }

    // Método para reduzir a temperatura até o limite de 15 graus
    public void reduzirTemperatura() {
        if (ligado) {
            if (termostato.getTemperatura() > 15) {
                termostato.setTemperatura(termostato.getTemperatura() - 1);
                System.out.println("Temperatura reduzida para: " + termostato.getTemperatura() + " graus.");
            } else {
                System.out.println("Erro: A temperatura não pode ser inferior a 15 graus.");
            }
        } else {
            System.out.println("Erro: O condicionador de ar está desligado.");
        }
    }

    // Método para imprimir a temperatura atual
    public void imprimirTemperatura() {
        if (ligado) {
            System.out.println("A temperatura atual é: " + termostato.getTemperatura() + " graus.");
        } else {
            System.out.println("Erro: O condicionador de ar está desligado.");
        }
    }
}
