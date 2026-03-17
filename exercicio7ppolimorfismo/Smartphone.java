
package exercicio7ppolimorfismo;

public class Smartphone extends Dispositivo {

    public Smartphone(String marca, String modelo, double consumoEnergia) {
        super(marca, modelo, consumoEnergia);
    }

    @Override
    public void ligar() {
        System.out.println("Smartphone " + getModelo() + " ligado.");
    }
}
