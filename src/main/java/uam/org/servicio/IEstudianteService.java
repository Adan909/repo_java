package uam.org.servicio;

import uam.org.model.Estudiante;

import javax.print.attribute.standard.Destination;

public interface IEstudianteService {
    Double calcularBeca(Estudiante e);

    void enviarCorreo(Estudiante e);





}
