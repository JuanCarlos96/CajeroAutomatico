package newpackage;

public class Main {
    
    public static void main(String[] args) {
        
        ListaNumeros arraylist = new ListaNumeros();
        arraylist.AñadirNumerosAlAzar(5, 5, 10);
        System.out.println(arraylist);
        System.out.print("El promedio de los números es: "+arraylist.Promedio()+"\n");
        System.out.print("El máximo de los números es: "+arraylist.Maximo()+"\n");
    }
}