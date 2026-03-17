
package exercicio11polimorfismo;

public class Medico extends Profissao {

    public Medico(String nome, double salarioMedio) {
        super(nome, salarioMedio, "Saúde");
    }

    @Override
    public void executarTrabalho() {
        System.out.println(getNome() + " está atendendo pacientes.");
    }
}