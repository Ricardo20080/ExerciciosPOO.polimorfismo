
package exercicio7ppolimorfismo;

public class Exercicio7Ppolimorfismo {

    public static void main(String[] args) {
        
         Dispositivo d1 = new Televisao("Samsung", "SmartTV 50\"", 120);
        Dispositivo d2 = new Computador("Dell", "Inspiron", 300);
        Dispositivo d3 = new Smartphone("Apple", "iPhone", 15);
        Dispositivo d4 = new Tablet("Lenovo", "Tab M10", 25);
        Dispositivo d5 = new Smartwatch("Xiaomi", "Mi Watch", 5);

        d1.ligar();
        d2.ligar();
        d3.ligar();
        d4.ligar();
        d5.ligar();
    }
    
}
