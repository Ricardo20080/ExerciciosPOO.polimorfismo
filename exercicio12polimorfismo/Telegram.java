
package exercicio12polimorfismo;

public class Telegram extends Notificacao {

    public Telegram(String destinatario, String mensagem, String dataEnvio) {
        super(destinatario, mensagem, dataEnvio);
    }

    @Override
    public void enviar() {
        System.out.println("Mensagem Telegram enviada para " + getDestinatario() + ": " + getMensagem());
    }
}
