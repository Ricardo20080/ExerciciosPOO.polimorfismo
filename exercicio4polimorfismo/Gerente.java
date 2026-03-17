
package exercicio4polimorfismo;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario, setor);
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está gerenciando a equipe.");
    }
}