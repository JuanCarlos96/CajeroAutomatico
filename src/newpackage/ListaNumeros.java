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
    
    public int Promedio(){
        int promedio=0, suma=0;
        
        for(int i : lista){
            suma += i;
        }
        promedio = suma/lista.size();
        
        return promedio;
    }
    
    public int Maximo(){
        int max=Integer.MIN_VALUE;
        
        for(int i : lista){
            if(i>max){
                max=i;
            }
        }
        
        return max;
    }
    
    public int SegundoMaximo(){
        int segmax=Integer.MIN_VALUE;
        
        for(int i : lista){
            if(i>segmax && i<Maximo()){
                segmax = i;
            }
        }
        
        return segmax;
    }
    
    public ArrayList<Integer> Pares(){
        ArrayList<Integer> pares = new ArrayList<Integer>();
        
        for(int i : lista){
            if(i%2==0){
                pares.add(i);
            }
        }
        
        return pares;
    }
    
    public boolean Existe(int numero){
        boolean encontrado=false;
        
        for(int i : lista){
            if(numero==i){
                encontrado=true;
            }
        }
        
        return encontrado;
    }
    
    public int PosicionDe(int numero){
        int posicion = -1;
        
        for(int i : lista){
            if(numero==i){
                posicion=lista.indexOf(i);
            }
        }
        
        return posicion;
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