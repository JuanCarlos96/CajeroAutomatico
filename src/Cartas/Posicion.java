package Cartas;

public enum Posicion {
    AS("AS"),
    DOS("DOS"),
    TRES("TRES"),
    CUATRO("CUATRO"),
    CINCO("CINCO"),
    SEIS("SEIS"),
    SIETE("SIETE"),
    OCHO("OCHO"),
    NUEVE("NUEVE"),
    DIEZ("DIEZ"),
    JOTA("JOTA"),
    REINA("REINA"),
    REY("REY");
    
    private String posicion;

    private Posicion() {
    }

    private Posicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return getPosicion();
    }
}