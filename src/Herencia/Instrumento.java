package Herencia;

public class Instrumento {
    protected String nombre;

    public Instrumento() {
    }

    public Instrumento(String nombre) {
        this.nombre = nombre;
    }
    
    public void tocar(){
        System.out.println("Tocando instrumento");
    }
    
    public void afinar(){
        System.out.println("Afinando instrumento");
    }
}