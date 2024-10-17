package exercicios3;

public class Usuario {
    public static void main(String[] args) {
        CondicionadorDeAr condicionador = new CondicionadorDeAr();

        // Ligar o ar condicionado
        condicionador.ligar();

        // Aumentar a temperatura além de 28 graus
        for (int i = 0; i < 10; i++) {
            condicionador.aumentarTemperatura();
        }

        // Reduzir a temperatura além de 15 graus
        for (int i = 0; i < 20; i++) {
            condicionador.reduzirTemperatura();
        }

        // Aumentar até 25 graus e imprimir
        while (condicionador.getTermostato().getTemperatura() < 25) {
            condicionador.aumentarTemperatura();
        }

        // Imprimir a temperatura
        condicionador.imprimirTemperatura();
    }
}
