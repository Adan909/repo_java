package uam.org.model;

import java.util.Objects;

public class Estudiante {
    private String cif;
    private String nombre;
    private String apellido;
    private String correo;

    public Estudiante() {
    }

    public Estudiante(String cif, String nombre, String apellido, String correo) {
        this.cif = cif;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Estudiante that)) return false;
        return Objects.equals(cif, that.cif);
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Estudiante{" +
                "cif='" + cif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                '}';


    }

}
