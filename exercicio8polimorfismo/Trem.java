
package exercicio8polimorfismo;

public class Trem extends Transporte {

    public Trem(String nome, int capacidade, String empresa) {
        super(nome, capacidade, empresa);
    }

    @Override
    public double calcularTarifa() {
        return 6.50;
    }
}
