package uam.org.test;

import uam.org.model.Estudiante;
import uam.org.servicio.ServicioEstudiante;

public class Main {

    public static void main(String[] args) {
        Estudiante estudiante = ServicioEstudiante.insertarEstudiante("Jorge", "Ortega", "jorgeot@uamv.edu.ni", "24013449");
        System.out.println(estudiante);
    }
}
