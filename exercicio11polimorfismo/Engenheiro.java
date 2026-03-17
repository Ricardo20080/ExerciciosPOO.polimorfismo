
package exercicio11polimorfismo;

public class Engenheiro extends Profissao {

    public Engenheiro(String nome, double salarioMedio) {
        super(nome, salarioMedio, "Engenharia");
    }

    @Override
    public void executarTrabalho() {
        System.out.println(getNome() + " está desenvolvendo projetos.");
    }
}
