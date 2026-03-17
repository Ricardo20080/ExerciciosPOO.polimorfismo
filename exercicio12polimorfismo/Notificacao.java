
package exercicio12polimorfismo;

public class Notificacao {
    private String destinatario;
    private String mensagem;
    private String dataEnvio;

    // Construtor
    public Notificacao(String destinatario, String mensagem, String dataEnvio) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.dataEnvio = dataEnvio;
    }

    // Getters e Setters
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(String dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    // Método genérico
    public void enviar() {
        System.out.println("Enviando notificação...");
    }
}
