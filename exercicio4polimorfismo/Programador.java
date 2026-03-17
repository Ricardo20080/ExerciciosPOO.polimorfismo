
package exercicio4polimorfismo;


 public class Programador extends Funcionario {

    public Programador(String nome, double salario, String setor) {
        super(nome, salario, setor);
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está programando.");
    }
}