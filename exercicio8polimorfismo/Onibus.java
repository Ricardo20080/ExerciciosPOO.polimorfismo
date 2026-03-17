
package exercicio8polimorfismo;

public class Onibus extends Transporte {

    public Onibus(String nome, int capacidade, String empresa) {
        super(nome, capacidade, empresa);
    }

    @Override
    public double calcularTarifa() {
        return 4.50; // tarifa fixa
    }
}