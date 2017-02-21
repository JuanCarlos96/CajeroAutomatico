package Herencia;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrumento> lista = new ArrayList<>();
        
        Clarinete clarinete = new Clarinete("Clarinete");
        Xilofono xilofono = new Xilofono("Xilofono");
        Violin violin = new Violin("Violin");
        
        lista.add(clarinete);
        lista.add(xilofono);
        lista.add(violin);
        
        for(Instrumento instrumento : lista){
            System.out.println(instrumento.getClass().getName());
        }
    }
}