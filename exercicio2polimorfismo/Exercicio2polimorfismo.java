
package exercicio2polimorfismo;

public class Exercicio2polimorfismo {

    public static void main(String[] args) {
        
        Veiculo moto = new Moto();
        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();
        Veiculo barco = new Barco();
        Veiculo aviao = new Aviao();
                
                
        
        
        moto.mover();
        carro.mover();
        bicicleta.mover();
        barco.mover();
        aviao.mover();
        
    }
    
}
