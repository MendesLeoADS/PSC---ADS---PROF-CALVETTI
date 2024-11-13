import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculadoraBasica extends JFrame implements ActionListener {
    private JTextField txtDisplay;
    private String operacao;
    private int primeiroNumero;

    public CalculadoraBasica() {
        super("Exercício 5 - Calculadora");

        // Campo de exibição
        txtDisplay = new JTextField();
        txtDisplay.setEditable(false);
        txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDisplay.setFont(new Font("Arial", Font.BOLD, 24));

        // Painel dos botões
        JPanel painelBotoes = new JPanel(new GridLayout(4, 4, 5, 5));

        // Botões de números e operações
        String[] botoes = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "*",
                "0", "C", "=", "/"
        };

        for (String texto : botoes) {
            JButton btn = new JButton(texto);
            btn.setFont(new Font("Arial", Font.BOLD, 20));
            btn.addActionListener(this);
            painelBotoes.add(btn);
        }

        // Configuração do layout
        setLayout(new BorderLayout());
        add(txtDisplay, BorderLayout.NORTH);
        add(painelBotoes, BorderLayout.CENTER);

        // Configurações da janela
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.matches("[0-9]")) {
            // Número pressionado
            txtDisplay.setText(txtDisplay.getText() + comando);
        } else if (comando.equals("C")) {
            // Limpar o display
            txtDisplay.setText("");
            operacao = null;
            primeiroNumero = 0;
        } else if (comando.equals("=")) {
            // Realizar o cálculo
            int segundoNumero = Integer.parseInt(txtDisplay.getText());
            int resultado = calcular(primeiroNumero, segundoNumero, operacao);
            txtDisplay.setText(String.valueOf(resultado));
            operacao = null;
        } else {
            // Operação pressionada (+, -, *, /)
            primeiroNumero = Integer.parseInt(txtDisplay.getText());
            operacao = comando;
            txtDisplay.setText("");
        }
    }

    private int calcular(int num1, int num2, String operacao) {
        switch (operacao) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num2 != 0 ? num1 / num2 : 0; // Evita divisão por zero
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        new CalculadoraBasica();
    }
}
