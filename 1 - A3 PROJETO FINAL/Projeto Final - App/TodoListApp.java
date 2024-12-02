import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TodoListApp extends JFrame {
    // Campos para entrada de dados
    private JTextField tfTitle, tfDescription;
    private JFormattedTextField tfDueDate;
    private JCheckBox cbStatus;

    // Lista e modelo para exibição das tarefas
    private ArrayList<Task> tasks = new ArrayList<>();
    private DefaultListModel<String> taskListModel = new DefaultListModel<>();
    private JList<String> taskList;

    // Botões
    private JButton btnAdd, btnEdit, btnDelete, btnShowAll, btnShowPending, btnShowCompleted;

    public TodoListApp() {
        // Configuração inicial da janela
        setTitle("Sistema de Gerenciamento de Tarefas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Painel de entrada de dados
        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        tfTitle = new JTextField();
        tfDescription = new JTextField();
        tfDueDate = new JFormattedTextField("####-##-##");
        cbStatus = new JCheckBox("Concluída");

        inputPanel.add(new JLabel("Título:"));
        inputPanel.add(tfTitle);
        inputPanel.add(new JLabel("Descrição:"));
        inputPanel.add(tfDescription);
        inputPanel.add(new JLabel("Data de Vencimento:"));
        inputPanel.add(tfDueDate);
        inputPanel.add(new JLabel("Status:"));
        inputPanel.add(cbStatus);

        // Painel de botões
        JPanel controlPanel = new JPanel(new FlowLayout());
        btnAdd = new JButton("Adicionar");
        btnEdit = new JButton("Editar");
        btnDelete = new JButton("Excluir");
        btnShowAll = new JButton("Mostrar Todas");
        btnShowPending = new JButton("Mostrar Pendentes");
        btnShowCompleted = new JButton("Mostrar Concluídas");

        controlPanel.add(btnAdd);
        controlPanel.add(btnEdit);
        controlPanel.add(btnDelete);
        controlPanel.add(btnShowAll);
        controlPanel.add(btnShowPending);
        controlPanel.add(btnShowCompleted);

        // Lista de tarefas
        taskList = new JList<>(taskListModel);
        JScrollPane scrollPane = new JScrollPane(taskList);

        // Adicionar componentes à janela
        add(inputPanel, BorderLayout.NORTH);
        add(controlPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        // Configurar ações dos botões
        btnAdd.addActionListener(e -> addTask());
        btnEdit.addActionListener(e -> editTask());
        btnDelete.addActionListener(e -> deleteTask());
        btnShowAll.addActionListener(e -> showAllTasks());
        btnShowPending.addActionListener(e -> showPendingTasks());
        btnShowCompleted.addActionListener(e -> showCompletedTasks());

        // Carregar tarefas ao iniciar
        loadTasks();
    }

    private Connection connectToDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/todo_list_db";
            String user = "root"; 
            String password = ""; 
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco de dados: " + e.getMessage());
            return null;
        }
    }

    private void addTask() {
        String title = tfTitle.getText();
        String description = tfDescription.getText();
        String dueDate = tfDueDate.getText();
        boolean status = cbStatus.isSelected();

        if (title.isEmpty() || description.isEmpty() || dueDate.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
            return;
        }

        try (Connection conn = connectToDatabase()) {
            if (conn != null) {
                String sql = "INSERT INTO tasks (title, description, due_date, completed) VALUES (?, ?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, title);
                stmt.setString(2, description);
                stmt.setString(3, dueDate);
                stmt.setBoolean(4, status);
                stmt.executeUpdate();

                tasks.add(new Task(title, description, dueDate, status));
                taskListModel.addElement(title + " - " + dueDate + (status ? " [Concluída]" : " [Pendente]"));
                clearFields();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar tarefa: " + e.getMessage());
        }
    }

    
    private void loadTasks() {
        try (Connection conn = connectToDatabase()) {
            if (conn != null) {
                String sql = "SELECT * FROM tasks";
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();

                tasks.clear();
                taskListModel.clear();

                while (rs.next()) {
                    Task task = new Task(
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getString("due_date"),
                        rs.getBoolean("completed")
                    );
                    tasks.add(task);
                    taskListModel.addElement(task.toString());
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar tarefas: " + e.getMessage());
        }
    }

    private void editTask() {
        int index = taskList.getSelectedIndex();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma tarefa para editar.");
            return;
        }

        Task selectedTask = tasks.get(index);
        tfTitle.setText(selectedTask.getTitle());
        tfDescription.setText(selectedTask.getDescription());
        tfDueDate.setText(selectedTask.getDueDate());
        cbStatus.setSelected(selectedTask.isCompleted());

        tasks.remove(index);
        taskListModel.remove(index);
    }

    private void deleteTask() {
        int index = taskList.getSelectedIndex();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma tarefa para excluir.");
            return;
        }

        tasks.remove(index);
        taskListModel.remove(index);
    }

    private void showAllTasks() {
        taskListModel.clear();
        tasks.forEach(task -> taskListModel.addElement(task.toString()));
    }

    private void showPendingTasks() {
        taskListModel.clear();
        tasks.stream().filter(task -> !task.isCompleted()).forEach(task -> taskListModel.addElement(task.toString()));
    }

    private void showCompletedTasks() {
        taskListModel.clear();
        tasks.stream().filter(Task::isCompleted).forEach(task -> taskListModel.addElement(task.toString()));
    }

    private void clearFields() {
        tfTitle.setText("");
        tfDescription.setText("");
        tfDueDate.setText("");
        cbStatus.setSelected(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TodoListApp app = new TodoListApp();
            app.setVisible(true);
        });
    }

    private class Task {
        private final String title, description, dueDate;
        private final boolean completed;

        public Task(String title, String description, String dueDate, boolean completed) {
            this.title = title;
            this.description = description;
            this.dueDate = dueDate;
            this.completed = completed;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public String getDueDate() {
            return dueDate;
        }

        public boolean isCompleted() {
            return completed;
        }

        @Override
        public String toString() {
            return title + " - " + dueDate + (completed ? " [Concluída]" : " [Pendente]");
        }
    }
}
