public class Main {
    public static void main(String[] args) {
        Produto celular = new Eletronico("Celular", 1500.00);
        Produto laptop = new Eletronico("Laptop", 3500.00);
        Produto livro1 = new Livro("O Senhor dos Anéis", 45.00);
        Produto livro2 = new Livro("Dom Quixote", 35.00);

        Estoque estoque = new Estoque();
        estoque.adicionarProduto(celular);
        estoque.adicionarProduto(laptop);
        estoque.adicionarProduto(livro1);
        estoque.adicionarProduto(livro2);

        System.out.println("Preços com desconto de 5%:");
        estoque.exibirPrecosComDesconto(5.0);
    }
}
