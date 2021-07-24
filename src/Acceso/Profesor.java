
package Acceso;

import java.util.Date;



public class Profesor extends Agente{
    
    private String especialidad;
    private String condicion;

    public Profesor(String especialidad, String condicion, String codigo, String apellidos, String nombres) {
        super(codigo, apellidos, nombres);
        this.especialidad = especialidad;
        this.condicion = condicion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }
    
    
}
