package Herencia;

public class Instrumento {
    protected String nombre;

    public Instrumento() {
    }

    public Instrumento(String nombre) {
        this.nombre = nombre;
    }
    
    public void tocar(String nombre){
        System.out.print("Tocando "+nombre);
    }
    
    public void afinar(String nombre){
        System.out.print("Afinando "+nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}