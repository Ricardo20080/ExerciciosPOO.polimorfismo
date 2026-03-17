
package exercicio4polimorfismo;

public class Exercicio4polimorfismo {

    
    public static void main(String[] args) {
        
        
 


        Funcionario gerente = new Gerente("Ana", 8000, "Administração");
        Funcionario vendedor = new Vendedor("Carlos", 3000, "Vendas");
        Funcionario programador = new Programador("João", 6000, "TI");
        Funcionario designer = new Designer("Maria", 4500, "Criação");
        Funcionario suporte = new SuporteTecnico("Lucas", 3500, "TI");

        gerente.trabalhar();
        vendedor.trabalhar();
        programador.trabalhar();
        designer.trabalhar();
        suporte.trabalhar();
    }
}
    
    

