
package exercicio8polimorfismo;

public class Taxi extends Transporte {

    public Taxi(String nome, int capacidade, String empresa) {
        super(nome, capacidade, empresa);
    }

    @Override
    public double calcularTarifa() {
        return 15.00;
    }
}