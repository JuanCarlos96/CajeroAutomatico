package Clases;

public class Prestamo {
    
    private Socio socio;
    private Libro libro;

    public Prestamo() {
    
    }
    
    public Prestamo(Socio socio, Libro libro) {
        this.socio = socio;
        this.libro = libro;
    }
    
    public String prestar(String fechaPrestamo){
        String cadena = "El libro "+libro.getTitulo()+" ha sido prestado a "+socio.getNombreYApellidos()+" en "+fechaPrestamo;
        return cadena;
    }
    
    public String devolver(String fechaDevolucion){
        String cadena = "El libro "+libro.getTitulo()+" ha sido devuelto por "+socio.getNombreYApellidos()+" en "+fechaDevolucion;
        return cadena;
    }
}