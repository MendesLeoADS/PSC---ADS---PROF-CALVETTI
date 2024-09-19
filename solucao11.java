public class solucao11 {
  public static void main(String[] args) {
  // Verifica se exatamente um argumento foi fornecido
        if (args.length != 1) {
            System.out.println("Por favor, forneça uma data no formato ddmmaa.");
            return;
        }

        try {
            // Recebe o argumento e o converte para um número inteiro
            int dataInteiro = Integer.parseInt(args[0]);

            // Converte o número inteiro para uma string
            String dataString = String.format("%06d", dataInteiro);

            // Extrai o dia, o mês e o ano
            String diaString = dataString.substring(0, 2);
            String mesString = dataString.substring(2, 4);
            String anoString = dataString.substring(4, 6);

            // Imprime o resultado
            System.out.println("Dia: " + diaString);
            System.out.println("Mês: " + mesString);
            System.out.println("Ano: " + anoString);

        } catch (NumberFormatException e) {
            System.out.println("O argumento fornecido deve ser um número inteiro no formato ddmmaa.");
        }
    }
}