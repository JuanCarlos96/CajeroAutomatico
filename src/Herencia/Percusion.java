package Herencia;

public class Percusion extends Instrumento{

    public Percusion(String nombre) {
        super(nombre);
    }
    
    public void golpear(){
        System.out.println("Golpeando");
    }
}