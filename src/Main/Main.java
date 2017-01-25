package Main;

import Clases.*;

public class Main {
    public static void main(String[] args){
        
        Libro libro = new Libro("93-3293-2344","La cueva","Ana Rodríguez","Drama");
        System.out.println(libro);
        
        Socio socio = new Socio(01,"Paco","Fernández","paco@gmail.com");
        System.out.println(socio);
        
        Prestamo prestamo = new Prestamo(socio,libro);
        System.out.println(prestamo.prestar("02/11/2015"));
        System.out.println(prestamo.devolver("14/12/2015"));
    }
}