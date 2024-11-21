import java.util.ArrayList;

public class Deposito {
    private ArrayList<Caixa> caixas;

    public Deposito() {
        caixas = new ArrayList<>();
    }

    // Método para adicionar caixa
    public void adicionarCaixa(Caixa caixa) {
        caixas.add(caixa);
    }

    // Método para remover caixa pelo dono
    public boolean removerCaixa(String dono) {
        int index = buscarCaixa(dono);
        if (index != -1) {
            caixas.remove(index);
            return true;
        }
        return false;
    }

    // Método para buscar a posição da caixa pelo dono
    public int buscarCaixa(String dono) {
        for (int i = 0; i < caixas.size(); i++) {
            if (caixas.get(i).getDono().equalsIgnoreCase(dono)) {
                return i;
            }
        }
        return -1; // Não encontrou
    }

    // Método para alterar corredor e posição da caixa
    public boolean alterarCaixa(String dono, String novoCorredor, int novaPosicao) {
        int index = buscarCaixa(dono);
        if (index != -1) {
            Caixa caixa = caixas.get(index);
            caixa.setCorredor(novoCorredor);
            caixa.setPosicao(novaPosicao);
            return true;
        }
        return false;
    }

    // Método para listar caixas com peso acima de um valor
    public void listarCaixasPesadas(double pesoMinimo) {
        for (Caixa caixa : caixas) {
            if (caixa.getPeso() > pesoMinimo) {
                System.out.println(caixa);
            }
        }
    }

    // Listar todas as caixas (para depuração ou testes)
    public void listarTodasCaixas() {
        if (caixas.isEmpty()) {
            System.out.println("Nenhuma caixa cadastrada.");
        } else {
            for (Caixa caixa : caixas) {
                System.out.println(caixa);
            }
        }
    }
}
