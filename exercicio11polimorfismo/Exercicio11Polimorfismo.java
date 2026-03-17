
package exercicio11polimorfismo;

public class Exercicio11Polimorfismo {

    public static void main(String[] args) {
            Profissao p1 = new Medico("Dr. João", 15000);
        Profissao p2 = new Professor("Maria", 4000);
        Profissao p3 = new Engenheiro("Carlos", 8000);
        Profissao p4 = new Advogado("Ana", 10000);
        Profissao p5 = new Arquiteto("Lucas", 7000);

        p1.executarTrabalho();
        p2.executarTrabalho();
        p3.executarTrabalho();
        p4.executarTrabalho();
        p5.executarTrabalho();
        
    }
    
}
