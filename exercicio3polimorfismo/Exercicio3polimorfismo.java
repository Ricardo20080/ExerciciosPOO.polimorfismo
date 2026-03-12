
package exercicio3polimorfismo;

public class Exercicio3polimorfismo {

    public static void main(String[] args) {
        
         Instrumento violao = new Violao();
        Instrumento piano = new Piano();
        Instrumento bateria = new Bateria();
        Instrumento flauta = new Flauta();
        Instrumento guitarra = new Guitarra();

        violao.tocar();
        piano.tocar();
        bateria.tocar();
        flauta.tocar();
        guitarra.tocar();
        
    }
    
}
