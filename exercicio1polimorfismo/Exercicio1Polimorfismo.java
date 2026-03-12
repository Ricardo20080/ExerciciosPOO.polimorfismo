
package exercicio1polimorfismo;

public class Exercicio1Polimorfismo {

    public static void main(String[] args) {
      
    

        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal vaca = new Vaca();
        Animal cavalo = new Cavalo();
        Animal leao = new Leão();

        cachorro.emitirSom();
        gato.emitirSom();
        vaca.emitirSom();
        cavalo.emitirSom();
        leao.emitirSom();

    }

}
        
        
                