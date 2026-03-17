
package exercicio6polimorfismo;


    public class Triangulo extends Forma {
    private double altura;

    public Triangulo(String cor, double base, double altura) {
        super(cor, "Triângulo", base);
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (getDimensaoPrincipal() * altura) / 2;
    }
}

