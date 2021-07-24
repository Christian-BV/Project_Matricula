
package Consola;


import Acceso.Administrativo;
import Acceso.Alumno;
import Acceso.Profesor;
import beans.Aula;
import beans.Curso;
import java.util.Date;
import java.util.Scanner;
import matricula.CursoProgramado;

public class SalidaConsola {
    public static void main(String args[]){
        
        Scanner n = new Scanner(System.in);
        
        //  1) creamos la clase madre agente de heredara sus atributos a las clases hijas alumno, profesor y administrativo.
        //  2) inicializamos objetos de las clases alumno, profesor, administrativo, curso y aula.
        
        String codigo, apellidos, nombres, especialidad, condicion, cargo, horarioLaboral, requisitos,tipo;
        double creditos, nota;
        int horasTeoricas, horasPracticas, ciclo, capacidadmaxima;
        boolean obligatoriedad;

        
        //creamos objeto de la clase alumno:
        
        System.out.println("Ingrese codigo del alumno:");
        codigo = n.nextLine();
        System.out.println("Ingrese apellidos del alumno:");
        apellidos= n.nextLine();
        System.out.println("Ingrese nombres del alumno:");
        nombres=n.nextLine();
        
        Alumno a1 = new Alumno(codigo, apellidos, nombres);
        
        //creamos objeto de la clase profesor:
        
        System.out.println("Ingrese codigo del profesor:");
        codigo = n.nextLine();
        System.out.println("Ingrese apellidos del profesor:");
        apellidos= n.nextLine();
        System.out.println("Ingrese nombres del prefesor:");
        nombres=n.nextLine();
        System.out.println("Ingrese especialidad del prefesor:");
        especialidad=n.nextLine();
        System.out.println("Ingrese condicion del prefesor:");
        condicion=n.nextLine();
        
        Profesor p1 = new Profesor(especialidad, condicion, codigo, apellidos, nombres);
        
        //creamos objeto de la clase administrativo:
        
        
        System.out.println("Ingrese codigo del administrativo:");
        codigo = n.nextLine();
        System.out.println("Ingrese apellidos del administrativo:");
        apellidos= n.nextLine();
        System.out.println("Ingrese nombres del administrativo:");
        nombres=n.nextLine();
        System.out.println("Ingrese cargo del administrativo:");
        cargo=n.nextLine();
        System.out.println("Ingrese horario del administrativo:");
        horarioLaboral=n.nextLine();
        
        Administrativo Ad1 = new Administrativo(cargo, horarioLaboral, codigo, apellidos, nombres);
        
        //creamos objeto de la clase curso:
        
        System.out.println("Ingrese codigo del curso:");
        codigo = n.nextLine();
        System.out.println("Ingrese nombre del curso:");
        nombres=n.nextLine();
        System.out.println("Ingrese creditos del curso:");
        creditos = n.nextDouble();
        System.out.println("Ingrese nota del curso:");
        nota = n.nextDouble();
        System.out.println("Ingrese horas teoricas del curso:");
        horasTeoricas=n.nextInt();
        System.out.println("Ingrese horas practicas del curso:");
        horasPracticas=n.nextInt();
        System.out.println("Ingrese REQUISITOS del curso:");
        requisitos=n.nextLine();
        System.out.println("Ingrese si el curso es OBLIGATORIO:");
        obligatoriedad=n.nextBoolean();
        System.out.println("Ingrese ciclo del curso:");
        ciclo=n.nextInt();
        
        Curso c1 = new Curso(codigo, nombres, creditos, nota, horasTeoricas, horasPracticas, requisitos, obligatoriedad, ciclo);
        
        //creamos objeto de la clase aula:
        
        System.out.println("Ingrese codigo del aula:");
        codigo = n.nextLine();
        System.out.println("Ingrese capacidad maxima del aula:");
        capacidadmaxima=n.nextInt();
        System.out.println("Ingrese tipo del aula:");
        tipo = n.nextLine();
        
        Aula Au1 = new Aula(codigo, capacidadmaxima, tipo);
        
            //  3)Crear un objeto de la clase cursoProgramado.
            
        //CursoProgramado = new CursoProgramado();
    }
}
