
package exercicio3polimorfismo;

public class Bateria extends Instrumento{
    @Override
    public void tocar() {
        System.out.println("a bateria está tocando");
    }
}
