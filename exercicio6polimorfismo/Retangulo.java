
package exercicio6polimorfismo;

public class Retangulo extends Forma {
    private double altura;

    public Retangulo(String cor, double base, double altura) {
        super(cor, "Retângulo", base);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return getDimensaoPrincipal() * altura;
    }
}