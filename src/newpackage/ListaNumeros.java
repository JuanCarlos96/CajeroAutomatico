package newpackage;

import java.util.ArrayList;
import java.util.Random;

/**
 * Esta clase genera números aleatorios, tantos como se le indique en el constructor, también podemos
 * definir el número mínimo y el máximo entre los que se van a generar los números.
 * @author almc
 * @version 21/03/2017
 */

public class ListaNumeros {
    
    private ArrayList<Integer> lista;
    
    /**
     * Contructor para la lista de números aleatorios que vamos a generar.
     */
    public ListaNumeros() {
        lista = new ArrayList<Integer>();
    }
    
    /**
     * Método para añadir números aleatorios a la lista creada anteriormente.
     * @param cantidad Indica cuantos números va a tener la lista.
     * @param minimo Indica el número mínimo que se podrá generar dentro de la lista.
     * @param maximo Indica el número máximo que se podrá generar dentro de la lista.
     */
    public void AñadirNumerosAlAzar(int cantidad, int minimo, int maximo){
        Random r = new Random();
        for(int i=0; i<cantidad; i++){
            lista.add(r.nextInt((maximo+1)-minimo)+minimo);
        }
    }
    
    /**
     * Método que calcula la media de todos los números de la lista.
     * @return La media de todos los números de la lista.
     */
    public int Promedio(){
        int promedio=0, suma=0;
        
        for(int i : lista){
            suma += i;
        }
        promedio = suma/lista.size();
        
        return promedio;
    }
    
    /**
     * Método que calcula el número máximo que hay en la lista.
     * @return El número más grande de toda la lista.
     */
    public int Maximo(){
        int max=Integer.MIN_VALUE;
        
        for(int i : lista){
            if(i>max){
                max=i;
            }
        }
        
        return max;
    }
    
    /**
     * Método que calcula el segundo máximo de la lista, es decir, el más grande después del máximo.
     * @return El segundo número más grande.
     */
    public int SegundoMaximo(){
        int segmax=Integer.MIN_VALUE;
        
        for(int i : lista){
            if(i>segmax && i<Maximo()){
                segmax = i;
            }
        }
        
        return segmax;
    }
    
    /**
     * Método que devuelve una lista que solo contiene los números pares de la lista original.
     * @return Una lista con los números pares de la lista original.
     */
    public ArrayList<Integer> Pares(){
        ArrayList<Integer> pares = new ArrayList<>();
        
        for(int i : lista){
            if(i%2==0){
                pares.add(i);
            }
        }
        
        return pares;
    }
    
    /**
     * Método que busca un número por toda la lista para ver si existe en la lista o no.
     * @param numero El número que queremos buscar dentro de la lista.
     * @return Devolverá true si el número que estamos buscando está en la lista,
     * en caso contrario devolverá false.
     */
    public boolean Existe(int numero){
        boolean encontrado=false;
        
        for(int i : lista){
            if(numero==i){
                encontrado=true;
            }
        }
        
        return encontrado;
    }
    
    /**
     * Método que saca la posición, o posiciones, de un número que pasemos como parámetro.
     * @param numero El número del que queramos saber la posición dentro de la lista.
     * @return La posición o posiciones en la que se encuentra el número dentro de la lista.
     */
    public int PosicionDe(int numero){
        int posicion = -1;
        
        for(int i : lista){
            if(numero==i){
                posicion=lista.indexOf(i);
            }
        }
        
        return posicion;
    }

    /**
     * 
     * @return 
     */
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