
package exercicio10polimorfismo;

public class Alimento extends Produto {

    public Alimento(String nome, double preco) {
        super(nome, preco, "Alimento");
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.05; // 5% taxa
    }
}