package uam.org.model;

public class EstudianteEx extends Estudiante{

    public EstudianteEx(double promedio){
        super(promedio);

    }

    public EstudianteEx(String cif, String nombre, String apellido, String correo, Double promedio) {
        super(cif, nombre, apellido, correo, promedio);
    }

    @Override
    public double calcularBeca() {
        return 0.9;
    }


}
