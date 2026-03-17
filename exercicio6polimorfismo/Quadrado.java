
package exercicio6polimorfismo;

public class Quadrado extends Forma {

    public Quadrado(String cor, double lado) {
        super(cor, "Quadrado", lado);
    }

    @Override
    public double calcularArea() {
        return getDimensaoPrincipal() * getDimensaoPrincipal();
    }
}