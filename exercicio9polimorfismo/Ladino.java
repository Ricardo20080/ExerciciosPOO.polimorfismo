
package exercicio9polimorfismo;

public class Ladino extends Personagem {

    public Ladino(String nome, int nivel, int vida) {
        super(nome, nivel, vida);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " atacou furtivamente!");
    }
}