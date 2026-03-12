
package exercicio3polimorfismo;

public class Instrumento {
    
    
    //atributos
    private String nome;
    private String tipo;
    private String fabricante;

    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    
    
    public void tocar() {
        System.out.println("O instrumento está tocando");
    }

}
    
    
    

