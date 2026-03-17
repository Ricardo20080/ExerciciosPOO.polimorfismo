
package exercicio5polimorfismo;


public class Dinheiro extends Pagamento {

    public Dinheiro(double valor, String data, String descricao) {
        super(valor, data, descricao);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento em dinheiro recebido: R$ " + getValor());
    }
}