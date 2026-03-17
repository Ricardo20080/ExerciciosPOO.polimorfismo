
package exercicio5polimorfismo;

public class Pix extends Pagamento {

    public Pix(double valor, String data, String descricao) {
        super(valor, data, descricao);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Pix realizado instantaneamente: R$ " + getValor());
    }
}