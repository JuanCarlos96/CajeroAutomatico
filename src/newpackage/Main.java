package newpackage;

public class Main {
    
    public static void main(String[] args) {
        
        ListaNumeros arraylist = new ListaNumeros();
        arraylist.AñadirNumerosAlAzar(15, 1, 10);
        System.out.println(arraylist);
        System.out.println("El promedio de los números es: "+arraylist.Promedio());
        System.out.println("El máximo de los números es: "+arraylist.Maximo());
        System.out.println("El segundo más grande es: "+arraylist.SegundoMaximo());
        System.out.println("Pares del arraylist: "+arraylist.Pares());
        System.out.println(arraylist.Existe(7));
        System.out.println("El número introducido está en la posición "+arraylist.PosicionDe(5));
    }
}