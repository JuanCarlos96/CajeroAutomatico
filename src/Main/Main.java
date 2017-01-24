package Main;

import Clases.*;

public class Main {
    public static void main(String[] args){
        
        Libro libro = new Libro("93-3293-2344","La cueva","Ana Rodríguez","Drama");
        System.out.println(libro);
        
        System.out.println(libro.prestamo("Juan"));
        System.out.println(libro.devolucion("Jose"));
    }
}