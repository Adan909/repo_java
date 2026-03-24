package uam.org.model;

public class EstudianteBecado extends Estudiante{
    private double promedio;
    public EstudianteBecado(double promedio){
        super(promedio);

    }

    public void calcularBeca1(){
        this.promedio = super.promedio*0.1;

    }

}
