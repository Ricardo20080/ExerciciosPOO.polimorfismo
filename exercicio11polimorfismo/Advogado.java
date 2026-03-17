
package exercicio11polimorfismo;

public class Advogado extends Profissao {

    public Advogado(String nome, double salarioMedio) {
        super(nome, salarioMedio, "Direito");
    }

    @Override
    public void executarTrabalho() {
        System.out.println(getNome() + " está defendendo um cliente.");
    }
}