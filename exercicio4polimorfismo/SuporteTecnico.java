
package exercicio4polimorfismo;

public class SuporteTecnico extends Funcionario {

    public SuporteTecnico(String nome, double salario, String setor) {
        super(nome, salario, setor);
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está prestando suporte técnico.");
    }
}