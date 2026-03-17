
package exercicio6polimorfismo;


    public class Forma {
    private String cor;
    private String nome;
    private double dimensaoPrincipal;

    // Construtor
    public Forma(String cor, String nome, double dimensaoPrincipal) {
        this.cor = cor;
        this.nome = nome;
        this.dimensaoPrincipal = dimensaoPrincipal;
    }

    // Getters e Setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDimensaoPrincipal() {
        return dimensaoPrincipal;
    }

    public void setDimensaoPrincipal(double dimensaoPrincipal) {
        this.dimensaoPrincipal = dimensaoPrincipal;
    }

    // Método para calcular area
    public double calcularArea() {
        return 0;
    }
}

