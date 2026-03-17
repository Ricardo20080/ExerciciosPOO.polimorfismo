
package exercicio12polimorfismo;

public class Email extends Notificacao {

    public Email(String destinatario, String mensagem, String dataEnvio) {
        super(destinatario, mensagem, dataEnvio);
    }

    @Override
    public void enviar() {
        System.out.println("Email enviado para " + getDestinatario() + ": " + getMensagem());
    }
}
