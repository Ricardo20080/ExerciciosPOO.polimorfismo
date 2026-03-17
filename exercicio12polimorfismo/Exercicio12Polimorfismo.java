
package exercicio12polimorfismo;

public class Exercicio12Polimorfismo {

    public static void main(String[] args) {
        Notificacao n1 = new Email("joao@email.com", "Olá João!", "17/03/2026");
        Notificacao n2 = new SMS("+5511999999999", "Mensagem de teste", "17/03/2026");
        Notificacao n3 = new Push("AppUser123", "Notificação push!", "17/03/2026");
        Notificacao n4 = new WhatsApp("+5511988888888", "Oi via WhatsApp!", "17/03/2026");
        Notificacao n5 = new Telegram("@usuario123", "Olá via Telegram!", "17/03/2026");

        n1.enviar();
        n2.enviar();
        n3.enviar();
        n4.enviar();
        n5.enviar(); 
    }
    
}
