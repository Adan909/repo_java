package uam.org.test;

import uam.org.model.Estudiante;
import uam.org.servicio.ServicioEstudiante;

public class Main {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("24013449", "Jorge", "Ortega", "jorgeot@uamv.edu.ni");
        ServicioEstudiante.insertarEstudiante(estudiante);
        Estudiante estudiante1 = new Estudiante("37287320", "Pepe", "Perico", "pp@uamv.edu.ni");
        ServicioEstudiante.insertarEstudiante(estudiante1);
        ServicioEstudiante.listarEstudiantes();
    }
}
