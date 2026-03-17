
package exercicio10polimorfismo;

public class Exercicio10Polimorfismo {

    public static void main(String[] args) {
        
        Produto p1 = new Livro("Java Básico", 100);
        Produto p2 = new Eletronico("Notebook", 3000);
        Produto p3 = new Roupa("Camiseta", 80);
        Produto p4 = new Alimento("Maçã", 10);
        Produto p5 = new Movel("Mesa", 500);

        System.out.println(p1.getNome() + " preço final: R$ " + p1.calcularPrecoFinal());
        System.out.println(p2.getNome() + " preço final: R$ " + p2.calcularPrecoFinal());
        System.out.println(p3.getNome() + " preço final: R$ " + p3.calcularPrecoFinal());
        System.out.println(p4.getNome() + " preço final: R$ " + p4.calcularPrecoFinal());
        System.out.println(p5.getNome() + " preço final: R$ " + p5.calcularPrecoFinal());
    }
    
}
