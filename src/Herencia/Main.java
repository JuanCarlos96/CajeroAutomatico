package Herencia;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrumento> lista = new ArrayList<>();
        
        Clarinete clarinete = new Clarinete("Clarinete");
        Xilofono xilofono = new Xilofono("Xilófono");
        Violin violin = new Violin("Violín");
        
        lista.add(clarinete);
        lista.add(xilofono);
        lista.add(violin);
        
        for(Instrumento instrumento : lista){
            System.out.print(instrumento.getNombre()+" -> ");
            instrumento.afinar(instrumento.getNombre());
            System.out.println();
        }
        
        System.out.println();
        
        for(Instrumento instrumento : lista){
            System.out.print(instrumento.getNombre()+" -> ");
            instrumento.tocar(instrumento.getNombre());
            System.out.println();
        }
        
        System.out.println();
        
        for(Instrumento instrumento : lista){
            System.out.print(instrumento.getNombre()+" -> ");
            
            switch(instrumento.getNombre()){
                case "Clarinete":
                    ((Viento)instrumento).transportar();
                    break;
                case "Xilófono":
                    ((Percusion)instrumento).golpear();
                    break;
                case "Violín":
                    ((Cuerda)instrumento).cambiarCuerda();
                    break;
            }
            //System.out.println();
        }
    }
}