package uam.org.test;

import uam.org.model.Estudiante;
import uam.org.model.EstudianteBecado;
import uam.org.model.EstudianteEx;
import uam.org.model.EstudianteRe;
import uam.org.servicio.ClaseBecaA;
import uam.org.servicio.ClaseBecaB;
import uam.org.servicio.ServicioEstudiante;
import uam.org.servicio.ServicioEstudianteDB;

public class Main {

    public static void main(String[] args) {
        Estudiante estudiante = new EstudianteBecado("24013449", "Jorge", "Ortega", "jorgeot@uamv.edu.ni", 90.00);
        Double becaBecado = estudiante.calcularBeca();
        Estudiante estudianteEx = new EstudianteEx("24013449", "Jorge", "Ortega", "jorgeot@uamv.edu.ni", 90.00);
        Double becaEx = estudianteEx.calcularBeca();
        Estudiante estudianteRe = new EstudianteRe("24013449", "Jorge", "Ortega", "jorgeot@uamv.edu.ni", 90.00);
        Double becaRe = estudianteRe.calcularBeca();

        System.out.println("Beca becado: " + becaBecado);
        System.out.println("Beca Ex: " + becaEx);
        System.out.println("Beca Re: " + becaRe);


    }

    public static void calcularBeca(Estudiante estudiante) {
       if(estudiante.getPromedio() >= 90){
           System.out.println("Su beca es " + ServicioEstudiante.calcularBeca(new ClaseBecaA(), estudiante ) * 100 + "%");
       }
       if (estudiante.getPromedio() >= 80){
           System.out.println("Su beca es " + ServicioEstudiante.calcularBeca(new ClaseBecaB(), estudiante) * 100 + "%");
       }
    }
}
