
package exercicio3polimorfismo;

public class Piano extends Instrumento{
    
    @Override
    public void tocar() {
        System.out.println("O piano está tocando");
    }
    
}
