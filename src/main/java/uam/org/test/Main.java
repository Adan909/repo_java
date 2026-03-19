package uam.org.test;

import uam.org.model.Estudiante;
import uam.org.servicio.ClaseBecaA;
import uam.org.servicio.ClaseBecaB;
import uam.org.servicio.ServicioEstudiante;
import uam.org.servicio.ServicioEstudianteDB;

public class Main {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("24013449", "Jorge", "Ortega", "jorgeot@uamv.edu.ni", 90.00);
        ServicioEstudianteDB.insertarEstudiante(estudiante);
        Estudiante estudiante1 = new Estudiante("37287320", "Pepe", "Perico", "pp@uamv.edu.ni", 80.00);
        ServicioEstudianteDB.insertarEstudiante(estudiante1);
        ServicioEstudianteDB.listarEstudiantes();
        calcularBeca(estudiante);
    }

    public static void calcularBeca(Estudiante estudiante) {
       if(estudiante.getPromedio() >= 90){
           System.out.println("Su beca es" + ServicioEstudiante.calcularBeca(new ClaseBecaA(), estudiante ) * 100 + "%");
       }
       if (estudiante.getPromedio() >= 80){
           System.out.println("Su beca es" + ServicioEstudiante.calcularBeca(new ClaseBecaB(), estudiante) * 100 + "%");
       }
    }
}
