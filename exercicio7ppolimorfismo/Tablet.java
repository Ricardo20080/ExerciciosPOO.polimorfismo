
package exercicio7ppolimorfismo;
public class Tablet extends Dispositivo {

    public Tablet(String marca, String modelo, double consumoEnergia) {
        super(marca, modelo, consumoEnergia);
    }

    @Override
    public void ligar() {
        System.out.println("Tablet " + getModelo() + " pronto para uso.");
    }
}