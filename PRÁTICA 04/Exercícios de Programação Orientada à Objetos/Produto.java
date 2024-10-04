public class Produto {
    // atributos
    private String nome;
    private double preco;
    private int quantidade;

    // construtor
    public Produto(String n, double p, int q) {
        nome = n;
        preco = p;
        quantidade = q;
    }

    // métodos de acesso
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // métodos modificadores
    public void setNome(String n) {
        nome = n;
    }

    public void setPreco(double p) {
        preco = p;
    }

    public void setQuantidade(int q) {
        quantidade = q;
    }
}

import javax.swing.JOptionPane;

class TesteProduto {
    public static void main(String[] args) {
        // solicita dados do produto usando JOptionPane
        String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
        String precoStr = JOptionPane.showInputDialog("Digite o preço do produto:");
        double preco = Double.parseDouble(precoStr); // Converte a entrada para double
        String quantidadeStr = JOptionPane.showInputDialog("Digite a quantidade do produto:");
        int quantidade = Integer.parseInt(quantidadeStr); // Converte a entrada para int

        // cria um objeto Produto
        Produto produto = new Produto(nome, preco, quantidade);

        // exibe os dados do produto
        String mensagem = "Produto Criado:\n" +
                "Nome: " + produto.getNome() + "\n" +
                "Preço: " + produto.getPreco() + "\n" +
                "Quantidade: " + produto.getQuantidade();
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
