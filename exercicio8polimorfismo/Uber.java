
package exercicio8polimorfismo;

public class Uber extends Transporte {

    public Uber(String nome, int capacidade, String empresa) {
        super(nome, capacidade, empresa);
    }

    @Override
    public double calcularTarifa() {
        return 12.00; // exemplo base
    }
}
