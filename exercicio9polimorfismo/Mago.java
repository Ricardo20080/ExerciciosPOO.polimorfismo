
package exercicio9polimorfismo;

public class Mago extends Personagem {

    public Mago(String nome, int nivel, int vida) {
        super(nome, nivel, vida);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " lançou uma magia!");
    }
}
