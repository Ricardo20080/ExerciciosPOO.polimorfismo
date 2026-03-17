
package exercicio6polimorfismo;

public class Circulo extends Forma {

    public Circulo(String cor, double raio) {
        super(cor, "Círculo", raio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(getDimensaoPrincipal(), 2);
    }
}