public class solucao7 {
  public static void main(String[] args) { 
  // Definir o ângulo em graus
        double anguloGraus = 45.0; 
        
        // Converter o ângulo para radianos
        double anguloRadianos = Math.toRadians(anguloGraus);
        
        // Calcular seno, cosseno e tangente
        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);
        
        // Calcular secante, cossecante e cotangente
        double secante = 1 / cosseno;
        double cossecante = 1 / seno;
        double cotangente = 1 / tangente;
        
        // Imprimir resultados
        System.out.printf("Ângulo: %.2f graus%n", anguloGraus);
        System.out.printf("Seno: %.4f%n", seno);
        System.out.printf("Cosseno: %.4f%n", cosseno);
        System.out.printf("Tangente: %.4f%n", tangente);
        System.out.printf("Secante: %.4f%n", secante);
        System.out.printf("Cossecante: %.4f%n", cossecante);
        System.out.printf("Cotangente: %.4f%n", cotangente);
    }
}