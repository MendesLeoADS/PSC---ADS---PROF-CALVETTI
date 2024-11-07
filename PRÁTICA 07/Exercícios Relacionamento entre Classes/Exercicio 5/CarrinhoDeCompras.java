import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<ItemCarrinho> itens = new ArrayList<>();

    public void adicionarItem(ItemCarrinho item) {
        itens.add(item);
    }

    public void removerItem(ItemCarrinho item) {
        itens.remove(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }
}
