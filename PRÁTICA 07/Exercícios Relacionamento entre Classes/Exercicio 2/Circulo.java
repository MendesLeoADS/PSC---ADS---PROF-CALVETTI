public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double CalculaArea() {
        return Math.PI * raio * raio;
    }

    public double calculaPerimetro() {
        return 2 * Math.PI * raio;
    }
}
