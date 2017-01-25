package newpackage;

import java.util.ArrayList;
import java.util.Random;

public class ListaNumeros {
    
    private ArrayList<Integer> lista;

    public ListaNumeros() {
        lista = new ArrayList<Integer>();
    }
    
    public void AñadirNumerosAlAzar(int cantidad, int minimo, int maximo){
        Random r = new Random();
        for(int i=0; i<cantidad; i++){
            lista.add(r.nextInt(cantidad)+minimo);
        }
        
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}