
package exercicio7ppolimorfismo;

public class Televisao extends Dispositivo {

    public Televisao(String marca, String modelo, double consumoEnergia) {
        super(marca, modelo, consumoEnergia);
    }

    @Override
    public void ligar() {
        System.out.println("TV " + getMarca() + " ligada.");
    }
}