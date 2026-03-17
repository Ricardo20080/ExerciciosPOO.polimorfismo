
package exercicio10polimorfismo;

public class Eletronico extends Produto {

    public Eletronico(String nome, double preco) {
        super(nome, preco, "Eletrônico");
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.15; // 15% imposto
    }
}
