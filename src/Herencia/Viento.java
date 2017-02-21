package Herencia;

public class Viento extends Instrumento{
    
    public Viento(String nombre) {
        super(nombre);
    }
    
    public void transportar(){
        System.out.println("Transportando");
    }
}