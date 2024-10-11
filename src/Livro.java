public class Livro extends Produto {

    public Livro(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        
        if (porcentagem > 5) {
            porcentagem = 5;
        }
        return preco - (preco * porcentagem / 100);
    }
}