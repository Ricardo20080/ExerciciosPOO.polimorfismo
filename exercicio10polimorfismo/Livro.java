
package exercicio10polimorfismo;

public class Livro extends Produto {

    public Livro(String nome, double preco) {
        super(nome, preco, "Livro");
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.9; // 10% desconto
    }
}
