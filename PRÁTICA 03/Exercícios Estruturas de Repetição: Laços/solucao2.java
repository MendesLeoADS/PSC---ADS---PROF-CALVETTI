 import javax.swing.JOptionPane;
 
   public class solucao2 {
    public static void main(String[] args) {
        StringBuilder numerosPares = new StringBuilder();

        for (int i = 0; i < 100; i++) {
            numerosPares.append(i * 2);
            if (i < 99) {
                numerosPares.append(", ");             }
        }

        JOptionPane.showMessageDialog(null, numerosPares.toString(), "100 Primeiros Números Pares", JOptionPane.INFORMATION_MESSAGE);
    }
}