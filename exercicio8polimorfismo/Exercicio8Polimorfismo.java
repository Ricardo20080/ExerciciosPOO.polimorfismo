
package exercicio8polimorfismo;

public class Exercicio8Polimorfismo {

    public static void main(String[] args) {
      
         Transporte t1 = new Onibus("Ônibus Urbano", 40, "Empresa A");
        Transporte t2 = new Metro("Metrô Linha 1", 200, "Empresa B");
        Transporte t3 = new Trem("Trem Regional", 300, "Empresa C");
        Transporte t4 = new Uber("UberX", 4, "Uber");
        Transporte t5 = new Taxi("Táxi Comum", 4, "Cooperativa Táxi");

        System.out.println(t1.getNome() + " tarifa: R$ " + t1.calcularTarifa());
        System.out.println(t2.getNome() + " tarifa: R$ " + t2.calcularTarifa());
        System.out.println(t3.getNome() + " tarifa: R$ " + t3.calcularTarifa());
        System.out.println(t4.getNome() + " tarifa: R$ " + t4.calcularTarifa());
        System.out.println(t5.getNome() + " tarifa: R$ " + t5.calcularTarifa());
        
        
    }
    
}
