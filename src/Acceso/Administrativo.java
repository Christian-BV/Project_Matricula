
package Acceso;

import java.util.Date;



public class Administrativo extends Agente{
    
    private String cargo;
    private String horarioLaboral;

    public Administrativo(String cargo, String horarioLaboral, String codigo, String apellidos, String nombres) {
        super(codigo, apellidos, nombres);
        this.cargo = cargo;
        this.horarioLaboral = horarioLaboral;
    }
    
    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHorarioLaboral() {
        return horarioLaboral;
    }

    public void setHorarioLaboral(String horarioLaboral) {
        this.horarioLaboral = horarioLaboral;
    }
    
    
    
}
