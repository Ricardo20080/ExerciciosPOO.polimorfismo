
package exercicio11polimorfismo;

public class Professor extends Profissao {

    public Professor(String nome, double salarioMedio) {
        super(nome, salarioMedio, "Educação");
    }

    @Override
    public void executarTrabalho() {
        System.out.println(getNome() + " está dando aula.");
    }
}
