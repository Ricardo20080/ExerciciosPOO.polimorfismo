
package exercicio8polimorfismo;

public class Metro extends Transporte {

    public Metro(String nome, int capacidade, String empresa) {
        super(nome, capacidade, empresa);
    }

    @Override
    public double calcularTarifa() {
        return 5.00;
    }
}
