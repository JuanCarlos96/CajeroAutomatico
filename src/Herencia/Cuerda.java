package Herencia;

public class Cuerda extends Instrumento{
    
    public Cuerda(String nombre) {
        super(nombre);
    }
    
    public void cambiarCuerda(){
        System.out.println("Cambiando cuerda");
    }
}