
package exercicio4polimorfismo;


 public class Designer extends Funcionario {

    public Designer(String nome, double salario, String setor) {
        super(nome, salario, setor);
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está criando designs.");
    }
}