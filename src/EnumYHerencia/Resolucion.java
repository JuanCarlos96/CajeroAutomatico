package EnumYHerencia;

public enum Resolucion {
    HD("HD"),
    FULHD("FULLHD"),
    _4K("4K");
    
    private String resolucion;

    private Resolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return this.resolucion;
    }
}