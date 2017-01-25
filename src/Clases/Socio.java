package Clases;

public class Socio {
    
    private int id;
    private String nombre, apellidos, email;

    public Socio() {
        this.id = 0;
        this.nombre = "";
        this.apellidos = "";
        this.email = "";
    }

    public Socio(int id, String nombre, String apellidos, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    @Override
    public String toString() {
        String cadena = "El socio "+this.nombre+" "+this.apellidos+" tiene el ID "+this.id+" y el email "+this.email;
        return cadena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreYApellidos() {
        return this.nombre+" "+this.apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}