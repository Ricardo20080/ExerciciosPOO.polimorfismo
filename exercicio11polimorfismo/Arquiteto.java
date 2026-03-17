
package exercicio11polimorfismo;

public class Arquiteto extends Profissao {

    public Arquiteto(String nome, double salarioMedio) {
        super(nome, salarioMedio, "Arquitetura");
    }

    @Override
    public void executarTrabalho() {
        System.out.println(getNome() + " está criando projetos arquitetônicos.");
    }
}
