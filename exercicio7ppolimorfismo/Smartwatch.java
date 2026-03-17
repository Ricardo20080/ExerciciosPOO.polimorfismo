
package exercicio7ppolimorfismo;

public class Smartwatch extends Dispositivo {

    public Smartwatch(String marca, String modelo, double consumoEnergia) {
        super(marca, modelo, consumoEnergia);
    }

    @Override
    public void ligar() {
        System.out.println("Smartwatch " + getModelo() + " ligado e sincronizando.");
    }
}