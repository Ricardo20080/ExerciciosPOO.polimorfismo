
package exercicio4polimorfismo;

public class Vendedor extends Funcionario {

    public Vendedor(String nome, double salario, String setor) {
        super(nome, salario, setor);
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está vendendo produtos.");
    }
}
