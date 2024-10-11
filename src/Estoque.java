import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void exibirPrecosComDesconto(double porcentagemDesconto) {
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + 
                " | Preço original: R$ " + produto.getPreco() + 
                " | Preço com desconto: R$ " + produto.calcularDesconto(porcentagemDesconto));
        }
    }
}