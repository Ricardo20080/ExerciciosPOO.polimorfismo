
package exercicio5polimorfismo;

public class TransferenciaBancaria extends Pagamento {

    public TransferenciaBancaria(double valor, String data, String descricao) {
        super(valor, data, descricao);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Transferência bancária realizada: R$ " + getValor());
    }
}