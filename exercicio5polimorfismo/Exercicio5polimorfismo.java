
package exercicio5polimorfismo;

public class Exercicio5polimorfismo {

    public static void main(String[] args) {
       
         Pagamento pagamento1 = new CartaoCredito(150.0, "17/03/2026", "Compra na internet");
        Pagamento pagamento2 = new Pix(75.5, "17/03/2026", "Pagamento rápido");
        Pagamento pagamento3 = new Dinheiro(30.0, "17/03/2026", "Pagamento presencial");
        Pagamento pagamento4 = new Boleto(200.0, "17/03/2026", "Conta de luz");
        Pagamento pagamento5 = new TransferenciaBancaria(500.0, "17/03/2026", "Transferência entre contas");

        // Processando pagamentos
        pagamento1.processarPagamento();
        pagamento2.processarPagamento();
        pagamento3.processarPagamento();
        pagamento4.processarPagamento();
        pagamento5.processarPagamento();
        
    }
    
}
