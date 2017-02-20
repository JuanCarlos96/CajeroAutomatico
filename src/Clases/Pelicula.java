package Clases;

public class Pelicula {
    private String titulo,director,duracion;
    private Genero genero;

    public Pelicula(String titulo, String director, String duracion, Genero genero) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public String getDuracion() {
        return duracion;
    }

    public Genero getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", genero=" + genero + '}';
    }
}