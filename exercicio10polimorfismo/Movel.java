
package exercicio10polimorfismo;

public class Movel extends Produto {

    public Movel(String nome, double preco) {
        super(nome, preco, "Móvel");
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.10; // 10% frete
    }
}
