package EnumYHerencia;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Electrodomestico> lista = new ArrayList<>();
        
        Lavadora lavadora = new Lavadora(80,120,Categoria.B,120,10);
        Frigorifico frigorifico = new Frigorifico(100,200,Categoria.B,200,120,40,true);
        Televisor televisor = new Televisor(250,20,Categoria.A,300,30,Resolucion.FULHD);
        
        lista.add(lavadora);
        lista.add(frigorifico);
        lista.add(televisor);
        
        for(Electrodomestico e : lista){
            System.out.print(e.getClass().getName()+" -> ");
            e.encender();
        }
        
        for(Electrodomestico e : lista){
            System.out.print(e.getClass().getName()+" -> ");
            e.apagar();
        }
    }
}