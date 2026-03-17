
package exercicio6polimorfismo;

public class Exercicio6Polimorfismo {

    public static void main(String[] args) {

        Forma f1 = new Quadrado("Azul", 4);
        Forma f2 = new Retangulo("Vermelho", 5, 3);
        Forma f3 = new Circulo("Verde", 2.5);
        Forma f4 = new Triangulo("Amarelo", 6, 4);
        Forma f5 = new Trapezio("Roxo", 8, 5, 3);

        System.out.println(f1.getNome() + " área: " + f1.calcularArea());
        System.out.println(f2.getNome() + " área: " + f2.calcularArea());
        System.out.println(f3.getNome() + " área: " + f3.calcularArea());
        System.out.println(f4.getNome() + " área: " + f4.calcularArea());
        System.out.println(f5.getNome() + " área: " + f5.calcularArea());
    }
}