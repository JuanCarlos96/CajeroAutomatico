package Clases;

public class Libro {
    
    private String ISBN,titulo,autor,genero;

    public Libro() {
        this.ISBN="";
        this.titulo="";
        this.autor="";
        this.genero="";
    }
    
    public Libro(String ISBN, String titulo, String autor, String genero) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }
    
    public String prestamo(Socio socio){
        String prestar = "El libro con título "+this.titulo+" ha sido prestado a "+socio.getNombreYApellidos();
        return prestar;
    }
    
    public String devolucion(Socio socio){
        String devolver = "El libro con titulo "+this.titulo+" ha sido devuelto por "+socio.getNombreYApellidos();
        return devolver;
    }

    @Override
    public String toString() {
        String cadena="El libro "+titulo+" con ISBN "+ISBN+" es del autor/a "+autor+" y del género "+genero;
        return cadena;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
}