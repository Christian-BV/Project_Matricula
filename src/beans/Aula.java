
package beans;

public class Aula {
    private String codigo;
    private int capacidadMaxima;
    private String tipo;

    public Aula(String codigo, int capacidadMaxima, String tipo) {
        this.codigo             = codigo;
        this.capacidadMaxima    = capacidadMaxima;
        this.tipo               = tipo;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
