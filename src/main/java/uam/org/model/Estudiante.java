package uam.org.model;

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
}
