
package exercicio12polimorfismo;

public class WhatsApp extends Notificacao {

    public WhatsApp(String destinatario, String mensagem, String dataEnvio) {
        super(destinatario, mensagem, dataEnvio);
    }

    @Override
    public void enviar() {
        System.out.println("Mensagem WhatsApp enviada para " + getDestinatario() + ": " + getMensagem());
    }
}