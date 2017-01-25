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
            lista.add(r.nextInt((maximo+1)-minimo)+minimo);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("---------------LISTA DE NÚMEROS---------------\n");
        
        for(int i=0; i<lista.size(); i++){
            sb.append(lista.get(i)+"  ");
        };
        
        return sb.toString();
    }
}