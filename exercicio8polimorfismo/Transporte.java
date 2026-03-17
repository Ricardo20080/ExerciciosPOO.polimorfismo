
package exercicio8polimorfismo;

public class Transporte {
    private String nome;
    private int capacidade;
    private String empresa;

    // Construtor
    public Transporte(String nome, int capacidade, String empresa) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.empresa = empresa;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    // Método genérico
    public double calcularTarifa() {
        return 0;
    }
}