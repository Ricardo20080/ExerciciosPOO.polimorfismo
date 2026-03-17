
package exercicio9polimorfismo;

public class Paladino extends Personagem {

    public Paladino(String nome, int nivel, int vida) {
        super(nome, nivel, vida);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " atacou com poder sagrado!");
    }
}