package newpackage;

public class Main {
    
    public static void main(String[] args) {
        
        ListaNumeros arraylist = new ListaNumeros();
        arraylist.AñadirNumerosAlAzar(15, 1, 10);
        System.out.println(arraylist);
        System.out.print("El promedio de los números es: "+arraylist.Promedio()+"\n");
        System.out.print("El máximo de los números es: "+arraylist.Maximo()+"\n");
        System.out.print("El segundo más grande es: "+arraylist.SegundoMaximo()+"\n");
        System.out.print("Pares del arraylist: "+arraylist.Pares()+"\n");
    }
}