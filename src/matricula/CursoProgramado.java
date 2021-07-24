
package matricula;

import Acceso.Profesor;
import beans.Aula;
import beans.Curso;

public class CursoProgramado {
    private String semestreAcademico;
    private Curso datocurso;
    private Profesor profesor;
    private int vacantes;
    private String horario;
    private Aula aula;

    public CursoProgramado(String semestreAcademico, Curso datocurso, Profesor profesor, int vacantes, String horario, Aula aula) {
        this.semestreAcademico = semestreAcademico;
        this.datocurso = datocurso;
        this.profesor = profesor;
        this.vacantes = vacantes;
        this.horario = horario;
        this.aula = aula;
    }
    
    

    public String getSemestreAcademico() {
        return semestreAcademico;
    }

    public void setSemestreAcademico(String semestreAcademico) {
        this.semestreAcademico = semestreAcademico;
    }

    public Curso getDatocurso() {
        return datocurso;
    }

    public void setDatocurso(Curso datocurso) {
        this.datocurso = datocurso;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public int getVacantes() {
        return vacantes;
    }

    public void setVacantes(int vacantes) {
        this.vacantes = vacantes;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }
    
    
    
}
