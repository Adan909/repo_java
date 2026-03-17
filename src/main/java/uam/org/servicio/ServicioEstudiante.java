package uam.org.servicio;

import uam.org.model.Estudiante;

public class ServicioEstudiante {
    public static Estudiante insertarEstudiante(String nombre, String apellido, String correo, String cif)
    {
        Estudiante estudiante = new Estudiante();
        estudiante.setCif(cif);
        estudiante.setNombre(nombre);
        estudiante.setApellido(apellido);
        estudiante.setCorreo(correo);
        return estudiante;
    }
}
