
package exercicio7ppolimorfismo;

public class Dispositivo {
    private String marca;
    private String modelo;
    private double consumoEnergia;

    // Construtor
    public Dispositivo(String marca, String modelo, double consumoEnergia) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumoEnergia = consumoEnergia;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    // Método genérico
    public void ligar() {
        System.out.println("Ligando dispositivo...");
    }
}
