
package exercicio6polimorfismo;

public class Trapezio extends Forma {
    private double baseMenor;
    private double altura;

    public Trapezio(String cor, double baseMaior, double baseMenor, double altura) {
        super(cor, "Trapézio", baseMaior);
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ((getDimensaoPrincipal() + baseMenor) * altura) / 2;
    }
}
