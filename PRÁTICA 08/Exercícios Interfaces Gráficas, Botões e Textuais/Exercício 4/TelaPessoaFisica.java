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

public class TelaPessoaFisica extends JFrame implements ActionListener {
    private JTextField txtNome, txtSalario, txtComissao, txtHoras, txtValorHora, txtTarefas, txtValorTarefa;
    private JButton btnMostrar, btnLimpar, btnSair;
    private JComboBox<String> comboTipoPessoa, comboTipoEmpregado;
    private JTextArea txtResultado;

    public TelaPessoaFisica() {
        super("Exercício 4 - Pessoa Física e Empregado");

        // Campos de entrada
        txtNome = new JTextField(15);
        txtSalario = new JTextField(10);
        txtComissao = new JTextField(10);
        txtHoras = new JTextField(10);
        txtValorHora = new JTextField(10);
        txtTarefas = new JTextField(10);
        txtValorTarefa = new JTextField(10);

        // ComboBox para selecionar o tipo de pessoa
        comboTipoPessoa = new JComboBox<>(new String[] { "Desempregado", "Empregado" });
        comboTipoPessoa.addActionListener(this);

        // ComboBox para selecionar o tipo de empregado
        comboTipoEmpregado = new JComboBox<>(new String[] { "Mensalista", "Comissionado", "Horista", "Tarefeiro" });
        comboTipoEmpregado.addActionListener(this);

        // Botões
        btnMostrar = new JButton("Mostrar Informações");
        btnLimpar = new JButton("Limpar");
        btnSair = new JButton("Sair");

        btnMostrar.addActionListener(this);
        btnLimpar.addActionListener(this);
        btnSair.addActionListener(this);

        // Área de resultado
        txtResultado = new JTextArea(5, 20);
        txtResultado.setEditable(false);

        // Layout
        setLayout(new FlowLayout());
        add(new JLabel("Nome:"));
        add(txtNome);
        add(new JLabel("Tipo de Pessoa:"));
        add(comboTipoPessoa);
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

        add(btnMostrar);
        add(btnLimpar);
        add(btnSair);
        add(new JScrollPane(txtResultado));

        // Configurações da janela
        setSize(300, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        atualizarCampos();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboTipoPessoa) {
            atualizarCampos();
        } else if (e.getSource() == btnMostrar) {
            mostrarInformacoes();
        } else if (e.getSource() == btnLimpar) {
            limparCampos();
        } else if (e.getSource() == btnSair) {
            System.exit(0);
        }
    }

    private void atualizarCampos() {
        boolean isEmpregado = "Empregado".equals(comboTipoPessoa.getSelectedItem());
        comboTipoEmpregado.setEnabled(isEmpregado);
        txtSalario.setEnabled(isEmpregado && "Mensalista".equals(comboTipoEmpregado.getSelectedItem()));
        txtComissao.setEnabled(isEmpregado && "Comissionado".equals(comboTipoEmpregado.getSelectedItem()));
        txtHoras.setEnabled(isEmpregado && "Horista".equals(comboTipoEmpregado.getSelectedItem()));
        txtValorHora.setEnabled(isEmpregado && "Horista".equals(comboTipoEmpregado.getSelectedItem()));
        txtTarefas.setEnabled(isEmpregado && "Tarefeiro".equals(comboTipoEmpregado.getSelectedItem()));
        txtValorTarefa.setEnabled(isEmpregado && "Tarefeiro".equals(comboTipoEmpregado.getSelectedItem()));
    }

    private void mostrarInformacoes() {
        String tipoPessoa = (String) comboTipoPessoa.getSelectedItem();
        String nome = txtNome.getText();

        PessoaFisica pessoa = null;

        if ("Desempregado".equals(tipoPessoa)) {
            pessoa = new Desempregado(nome);
        } else {
            String tipoEmpregado = (String) comboTipoEmpregado.getSelectedItem();
            double salario = txtSalario.getText().isEmpty() ? 0 : Double.parseDouble(txtSalario.getText());

            switch (tipoEmpregado) {
                case "Mensalista":
                    pessoa = new Mensalista(nome, salario);
                    break;
                case "Comissionado":
                    double comissao = Double.parseDouble(txtComissao.getText());
                    pessoa = new Comissionado(nome, salario, comissao);
                    break;
                case "Horista":
                    int horasTrabalhadas = Integer.parseInt(txtHoras.getText());
                    double valorHora = Double.parseDouble(txtValorHora.getText());
                    pessoa = new Horista(nome, horasTrabalhadas, valorHora);
                    break;
                case "Tarefeiro":
                    int tarefasRealizadas = Integer.parseInt(txtTarefas.getText());
                    double valorTarefa = Double.parseDouble(txtValorTarefa.getText());
                    pessoa = new Tarefeiro(nome, tarefasRealizadas, valorTarefa);
                    break;
            }
        }

        txtResultado.setText(pessoa.obterInformacoes());
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
        new TelaPessoaFisica();
    }
}
