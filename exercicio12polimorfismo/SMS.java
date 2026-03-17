
package exercicio12polimorfismo;

public class SMS extends Notificacao {

    public SMS(String destinatario, String mensagem, String dataEnvio) {
        super(destinatario, mensagem, dataEnvio);
    }

    @Override
    public void enviar() {
        System.out.println("SMS enviado para " + getDestinatario() + ": " + getMensagem());
    }
}
