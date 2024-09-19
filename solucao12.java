public class solucao12 {
  public static void main(String[] args) {
  // Verifica se exatamente um argumento foi fornecido
        if (args.length != 1) {
            System.out.println("Por favor, forneça uma data no formato dd/mm/aa.");
            return;
        }

        // Recebe o argumento e assume que é uma string no formato dd/mm/aa
        String data = args[0];

        // Verifica se a data está no formato correto
        if (data.length() != 8 || data.charAt(2) != '/' || data.charAt(5) != '/') {
            System.out.println("Formato da data inválido. Use o formato dd/mm/aa.");
            return;
        }

        try {
            // Extrai o dia, o mês e o ano da string
            String dia = data.substring(0, 2);
            String mes = data.substring(3, 5);
            String ano = data.substring(6, 8);

            // Imprime o resultado
            System.out.println("Dia: " + dia);
            System.out.println("Mês: " + mes);
            System.out.println("Ano: " + ano);

        } catch (Exception e) {
            System.out.println("Erro ao processar a data. Certifique-se de que a data está no formato dd/mm/aa.");
        }
    }
}
