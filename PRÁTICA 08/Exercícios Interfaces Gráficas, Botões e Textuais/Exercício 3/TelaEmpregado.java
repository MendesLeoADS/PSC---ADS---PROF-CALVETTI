import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TelaEmpregado extends JFrame implements ActionListener {
    private JTextField txtNome, txtSalario, txtComissao, txtHoras, txtValorHora, txtTarefas, txtValorTarefa;
    private JButton btnCalcular, btnLimpar, btnSair;
    private JComboBox<String> comboTipoEmpregado;
    private JTextArea txtResultado;

    public TelaEmpregado() {
        super("Exercício 3 - Empregados");

        // Campos de entrada
        txtNome = new JTextField(15);
        txtSalario = new JTextField(10);
        txtComissao = new JTextField(10);
        txtHoras = new JTextField(10);
        txtValorHora = new JTextField(10);
        txtTarefas = new JTextField(10);
        txtValorTarefa = new JTextField(10);

        // ComboBox para selecionar o tipo de empregado
        comboTipoEmpregado = new JComboBox<>(new String[] { "Mensalista", "Comissionado", "Horista", "Tarefeiro" });
        comboTipoEmpregado.addActionListener(this);

        // Botões
        btnCalcular = new JButton("Calcular Salário");
        btnLimpar = new JButton("Limpar");
        btnSair = new JButton("Sair");

        btnCalcular.addActionListener(this);
        btnLimpar.addActionListener(this);
        btnSair.addActionListener(this);

        // Área de resultado
        txtResultado = new JTextArea(5, 20);
        txtResultado.setEditable(false);

        // Layout
        setLayout(new FlowLayout());
        add(new JLabel("Nome:"));
        add(txtNome);
        add(new JLabel("Tipo de Empregado:"));
        add(comboTipoEmpregado);
        add(new JLabel("Salário Base:"));
        add(txtSalario);
        add(new JLabel("Comissão:"));
        add(txtComissao);
        add(new JLabel("Horas Trabalhadas:"));
        add(txtHoras);
        add(new JLabel("Valor Hora:"));
        add(txtValorHora);
        add(new JLabel("Tarefas Realizadas:"));
        add(txtTarefas);
        add(new JLabel("Valor por Tarefa:"));
        add(txtValorTarefa);

        add(btnCalcular);
        add(btnLimpar);
        add(btnSair);
        add(new JScrollPane(txtResultado));

        // Configurações da janela
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        atualizarCampos();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboTipoEmpregado) {
            atualizarCampos();
        } else if (e.getSource() == btnCalcular) {
            calcularSalario();
        } else if (e.getSource() == btnLimpar) {
            limparCampos();
        } else if (e.getSource() == btnSair) {
            System.exit(0);
        }
    }

    private void atualizarCampos() {
        String tipo = (String) comboTipoEmpregado.getSelectedItem();
        txtSalario.setEnabled("Mensalista".equals(tipo) || "Comissionado".equals(tipo));
        txtComissao.setEnabled("Comissionado".equals(tipo));
        txtHoras.setEnabled("Horista".equals(tipo));
        txtValorHora.setEnabled("Horista".equals(tipo));
        txtTarefas.setEnabled("Tarefeiro".equals(tipo));
        txtValorTarefa.setEnabled("Tarefeiro".equals(tipo));
    }

    private void calcularSalario() {
        String tipo = (String) comboTipoEmpregado.getSelectedItem();
        String nome = txtNome.getText();
        double salario = txtSalario.getText().isEmpty() ? 0 : Double.parseDouble(txtSalario.getText());

        EmpregadoEx3 empregado = null;

        switch (tipo) {
            case "Mensalista":
                empregado = new Mensalista(nome, salario);
                break;
            case "Comissionado":
                double comissao = Double.parseDouble(txtComissao.getText());
                empregado = new Comissionado(nome, salario, comissao);
                break;
            case "Horista":
                int horasTrabalhadas = Integer.parseInt(txtHoras.getText());
                double valorHora = Double.parseDouble(txtValorHora.getText());
                empregado = new Horista(nome, horasTrabalhadas, valorHora);
                break;
            case "Tarefeiro":
                int tarefasRealizadas = Integer.parseInt(txtTarefas.getText());
                double valorTarefa = Double.parseDouble(txtValorTarefa.getText());
                empregado = new Tarefeiro(nome, tarefasRealizadas, valorTarefa);
                break;
        }

        txtResultado.setText(empregado.toString());
    }

    private void limparCampos() {
        txtNome.setText("");
        txtSalario.setText("");
        txtComissao.setText("");
        txtHoras.setText("");
        txtValorHora.setText("");
        txtTarefas.setText("");
        txtValorTarefa.setText("");
        txtResultado.setText("");
    }

    public static void main(String[] args) {
        new TelaEmpregado();
    }
}
