
package exercicio10polimorfismo;

public class Roupa extends Produto {

    public Roupa(String nome, double preco) {
        super(nome, preco, "Roupa");
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.8; // 20% desconto
    }
}