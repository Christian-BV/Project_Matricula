
package Acceso;

public class Alumno extends Agente{
    
    private int creditos_Acumulados;

    public Alumno(String codigo, String apellidos, String nombres) {
        super(codigo, apellidos, nombres);
        
    }

    public int getCreditos_Acumulados() {
        return creditos_Acumulados;
    }

    public void setCreditos_Acumulados(int creditos_Acumulados) {
        this.creditos_Acumulados = creditos_Acumulados;
    }
    
    
}
