
package exercicio2polimorfismo;

public class Veiculo {
   
    //atributos
    private String marca;
    private String modelo;
    private int ano;
    
    
    
    
    
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
    
    
    public void mover() {
        System.out.println("O veículo está se movendo");
    }

}
    
    
    
