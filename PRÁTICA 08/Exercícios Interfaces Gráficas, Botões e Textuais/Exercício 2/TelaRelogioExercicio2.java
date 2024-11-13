import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TelaRelogioExercicio2 extends JFrame implements ActionListener {
    private JLabel lblHora;
    private JButton btnTicTac, btnHora, btnMinuto;
    private int hora = 0;
    private int minuto = 0;

    public TelaRelogioExercicio2() {
        super("Exercício 2 - Relógio");

        // Configurando o JLabel para mostrar a hora e o minuto
        lblHora = new JLabel(formatarHora());
        lblHora.setFont(new Font("Arial", Font.BOLD, 24)); // Alterando fonte e tamanho
        lblHora.setHorizontalAlignment(SwingConstants.CENTER);

        // Configurando os botões
        btnTicTac = new JButton("TicTac");
        btnHora = new JButton("Hora");
        btnMinuto = new JButton("Minuto");

        // Adicionando ActionListeners aos botões
        btnTicTac.addActionListener(this);
        btnHora.addActionListener(this);
        btnMinuto.addActionListener(this);

        // Configurando o layout e adicionando os componentes
        setLayout(new BorderLayout());
        add(lblHora, BorderLayout.CENTER);

        JPanel painelBotoes = new JPanel(new FlowLayout());
        painelBotoes.add(btnTicTac);
        painelBotoes.add(btnHora);
        painelBotoes.add(btnMinuto);
        add(painelBotoes, BorderLayout.SOUTH);

        // Configurações da janela
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnTicTac) {
            // Incrementa um minuto
            minuto++;
            if (minuto >= 60) {
                minuto = 0;
                hora = (hora + 1) % 24; // Garante que a hora vai de 0 a 23
            }
        } else if (e.getSource() == btnHora) {
            // Define a hora entre 0 e 23
            String inputHora = JOptionPane.showInputDialog("Digite a Hora (0-23):");
            if (inputHora != null) {
                try {
                    int novaHora = Integer.parseInt(inputHora);
                    if (novaHora >= 0 && novaHora < 24) {
                        hora = novaHora;
                    } else {
                        JOptionPane.showMessageDialog(this, "Hora inválida.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Entrada inválida.");
                }
            }
        } else if (e.getSource() == btnMinuto) {
            // Define o minuto entre 0 e 59
            String inputMinuto = JOptionPane.showInputDialog("Digite o Minuto (0-59):");
            if (inputMinuto != null) {
                try {
                    int novoMinuto = Integer.parseInt(inputMinuto);
                    if (novoMinuto >= 0 && novoMinuto < 60) {
                        minuto = novoMinuto;
                    } else {
                        JOptionPane.showMessageDialog(this, "Minuto inválido.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Entrada inválida.");
                }
            }
        }
        // Atualiza o JLabel com a hora e minuto
        lblHora.setText(formatarHora());
    }

    // Método auxiliar para formatar a hora e o minuto no formato HH:MM
    private String formatarHora() {
        return String.format("%02d:%02d", hora, minuto);
    }

    public static void main(String[] args) {
        new TelaRelogioExercicio2();
    }
}
