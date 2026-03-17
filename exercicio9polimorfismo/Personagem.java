
package exercicio9polimorfismo;

public class Personagem {
    private String nome;
    private int nivel;
    private int vida;

    // Construtor
    public Personagem(String nome, int nivel, int vida) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    // Método genérico
    public void atacar() {
        System.out.println(nome + " realizou um ataque básico.");
    }
}
