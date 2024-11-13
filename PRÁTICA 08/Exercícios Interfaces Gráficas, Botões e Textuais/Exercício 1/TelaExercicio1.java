import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaExercicio1 extends JFrame implements ActionListener {
    private JTextField txtTexto;
    private JButton btnMostrar, btnLimpar, btnSair;

    public TelaExercicio1() {
        super("Exercício 1 - Texto e Botões");

        // Inicializando os componentes
        txtTexto = new JTextField(20);
        btnMostrar = new JButton("Mostrar");
        btnLimpar = new JButton("Limpar");
        btnSair = new JButton("Sair");

        // Adicionando ActionListeners para os botões
        btnMostrar.addActionListener(this);
        btnLimpar.addActionListener(this);
        btnSair.addActionListener(this);

        // Configurando o layout e adicionando os componentes
        setLayout(new FlowLayout());
        add(new JLabel("Texto:"));
        add(txtTexto);
        add(btnMostrar);
        add(btnLimpar);
        add(btnSair);

        // Configurações da janela
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centralizar a janela
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnMostrar) {
            // Exibir o conteúdo do campo de texto em um JOptionPane
            JOptionPane.showMessageDialog(this, txtTexto.getText(), "Conteúdo", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == btnLimpar) {
            // Limpar o campo de texto
            txtTexto.setText("");
        } else if (e.getSource() == btnSair) {
            // Fechar o programa
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new TelaExercicio1();
    }
}
