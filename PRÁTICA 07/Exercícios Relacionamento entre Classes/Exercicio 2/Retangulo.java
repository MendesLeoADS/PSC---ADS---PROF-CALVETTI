public class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double CalculaArea() {
        return largura * altura;
    }

    public double calculaPerimetro() {
        return 2 * (largura + altura);
    }
}
