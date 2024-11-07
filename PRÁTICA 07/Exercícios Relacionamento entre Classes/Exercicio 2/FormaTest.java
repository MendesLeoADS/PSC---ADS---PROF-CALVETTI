public class FormaTest {
    public static void main(String[] args) {
        testRetangulo();

        testCirculo();
    }

    public static void testRetangulo() {

        Retangulo retangulo = new Retangulo(5, 10);

        double areaEsperada = 50.0;
        double areaCalculada = retangulo.CalculaArea();
        if (areaCalculada == areaEsperada) {
            System.out.println("Teste de área do Retângulo passou!");
        } else {
            System.out.println(
                    "Teste de área do Retângulo falhou! Esperado: " + areaEsperada + ", mas obteve: " + areaCalculada);
        }

        double perimetroEsperado = 30.0;
        double perimetroCalculado = retangulo.calculaPerimetro();
        if (perimetroCalculado == perimetroEsperado) {
            System.out.println("Teste de perímetro do Retângulo passou!");
        } else {
            System.out.println("Teste de perímetro do Retângulo falhou! Esperado: " + perimetroEsperado
                    + ", mas obteve: " + perimetroCalculado);
        }
    }

    public static void testCirculo() {

        Circulo circulo = new Circulo(7);

        double areaEsperada = 153.938;
        double areaCalculada = circulo.CalculaArea();
        if (Math.abs(areaCalculada - areaEsperada) < 0.001) {
            System.out.println("Teste de área do Círculo passou!");
        } else {
            System.out.println(
                    "Teste de área do Círculo falhou! Esperado: " + areaEsperada + ", mas obteve: " + areaCalculada);
        }

        double perimetroEsperado = 43.982;
        double perimetroCalculado = circulo.calculaPerimetro();
        if (Math.abs(perimetroCalculado - perimetroEsperado) < 0.001) {
            System.out.println("Teste de perímetro do Círculo passou!");
        } else {
            System.out.println("Teste de perímetro do Círculo falhou! Esperado: " + perimetroEsperado + ", mas obteve: "
                    + perimetroCalculado);
        }
    }
}
