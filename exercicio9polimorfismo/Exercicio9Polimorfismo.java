
package exercicio9polimorfismo;

public class Exercicio9Polimorfismo {

    public static void main(String[] args) {
      
  
         
        Personagem p1 = new Guerreiro("Arthas", 10, 100);
        
        Personagem p2 = new Mago("Merlin", 12, 80);
        Personagem p3 = new Arqueiro("Legolas", 11, 90);
        Personagem p4 = new Ladino("Ezio", 9, 85);
        Personagem p5 = new Paladino("Uther", 13, 110);

        p1.atacar();
        p2.atacar();
        p3.atacar();
        p4.atacar();
        p5.atacar();
        
           }
    
}
