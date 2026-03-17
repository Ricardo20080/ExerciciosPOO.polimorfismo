
package exercicio12polimorfismo;

public class Push extends Notificacao {

    public Push(String destinatario, String mensagem, String dataEnvio) {
        super(destinatario, mensagem, dataEnvio);
    }

    @Override
    public void enviar() {
        System.out.println("Push enviado para " + getDestinatario() + ": " + getMensagem());
    }
}
