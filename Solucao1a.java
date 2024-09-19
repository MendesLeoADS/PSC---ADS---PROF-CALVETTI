public class Solucao1 {
    public static void main(String[] args) {
        //definir idade
        int idade = 22; // substitua este valor pela sua idade

        //calcular dias vividos
        double diasPorAno = 365.0;
        double diasVividos = idade * diasPorAno;

        //imprima o resultado 
        System.out.println("Eu vivi " + Math.round(diasVividos) + " dias.");
    }
}