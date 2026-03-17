
package exercicio7ppolimorfismo;

public class Computador extends Dispositivo {

    public Computador(String marca, String modelo, double consumoEnergia) {
        super(marca, modelo, consumoEnergia);
    }

    @Override
    public void ligar() {
        System.out.println("Computador " + getModelo() + " iniciando sistema.");
    }
}
