
package beans;

public class Curso {
    private String codigo;
    private String nombre;
    private double creditos;
    private double nota;
    private int horasTeoricas;
    private int horasPracticas;
    private String requisitos;
    private boolean obligatoriedad;
    private int ciclo;

    public Curso(String codigo, String nombre, double creditos, double nota, int horasTeoricas, int horasPracticas, String requisitos, boolean obligatoriedad, int ciclo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.nota = nota;
        this.horasTeoricas = horasTeoricas;
        this.horasPracticas = horasPracticas;
        this.requisitos = requisitos;
        this.obligatoriedad = obligatoriedad;
        this.ciclo = ciclo;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCreditos() {
        return creditos;
    }

    public void setCreditos(double creditos) {
        this.creditos = creditos;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getHorasTeoricas() {
        return horasTeoricas;
    }

    public void setHorasTeoricas(int horasTeoricas) {
        this.horasTeoricas = horasTeoricas;
    }

    public int getHorasPracticas() {
        return horasPracticas;
    }

    public void setHorasPracticas(int horasPracticas) {
        this.horasPracticas = horasPracticas;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public boolean isObligatoriedad() {
        return obligatoriedad;
    }

    public void setObligatoriedad(boolean obligatoriedad) {
        this.obligatoriedad = obligatoriedad;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }
    
    
}
