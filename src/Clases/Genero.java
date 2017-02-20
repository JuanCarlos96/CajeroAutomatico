package Clases;

public enum Genero {
    DRAMA("Drama"),
    COMEDIA("Comedia"),
    MUSICAL("Musical"),
    ACCION("Acción"),
    TERROR("Terror");
    
    private String tipoPeli;

    private Genero(String tipoPeli) {
        this.tipoPeli = tipoPeli;
    }

    @Override
    public String toString() {
        return this.tipoPeli;
    }
}