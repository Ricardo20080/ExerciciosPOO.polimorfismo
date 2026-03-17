
package exercicio9polimorfismo;

public class Arqueiro extends Personagem {

    public Arqueiro(String nome, int nivel, int vida) {
        super(nome, nivel, vida);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " disparou uma flecha!");
    }
}
