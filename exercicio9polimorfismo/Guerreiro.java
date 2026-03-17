
package exercicio9polimorfismo;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome, int nivel, int vida) {
        super(nome, nivel, vida);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " atacou com espada!");
    }
}
