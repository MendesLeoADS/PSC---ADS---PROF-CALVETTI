public class CarrinhoDeComprasTest {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // produtos
        Produto produto1 = new Produto(20.0, "Produto A");
        Produto produto2 = new Produto(30.0, "Produto B");

        // adição de itens
        carrinho.adicionarItem(produto1);
        carrinho.adicionarItem(produto2);

        // Exibe itens e total do carrinho
        System.out.println("Itens no Carrinho:");
        for (ItemCarrinho item : carrinho.getItens()) {
            System.out.println("- " + item.getDescricao() + ": " + item.getPreco());
        }

        // Verifica o total
        double totalEsperado = 50.0;
        double totalCalculado = carrinho.calcularTotal();
        System.out.println("Total calculado: " + totalCalculado);

        // Verificação
        if (totalCalculado == totalEsperado) {
            System.out.println("Teste de cálculo do total passou!");
        } else {
            System.out.println(
                    "Teste de cálculo do total falhou! Esperado: " + totalEsperado + ", obtido: " + totalCalculado);
        }

        // remoção de item
        carrinho.removerItem(produto1);
        System.out.println("Total após remover Produto A: " + carrinho.calcularTotal());
    }
}
