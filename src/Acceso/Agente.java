
package Acceso;

import java.util.Date;

public abstract class Agente {
    private String codigo;
    private String apellidos;
    private String nombres;
    private Date fechaNacimiento;

    public Agente(String codigo, String apellidos, String nombres) {
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombres = nombres;
        
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
