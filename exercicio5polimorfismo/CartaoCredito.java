
package exercicio5polimorfismo;

public class CartaoCredito extends Pagamento {

    public CartaoCredito(double valor, String data, String descricao) {
        super(valor, data, descricao);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado com Cartão de Crédito no valor de R$ " + getValor());
    }
}