package Cartas;

public enum Palo {
    ROMBO("ROMBOS"),
    TREBOL("TRÉBOLES"),
    CORAZON("CORAZONES"),
    PICA("PICAS");

    private String palo;

    private Palo() {
    }

    private Palo(String palo) {
        this.palo = palo;
    }

    public String getPalo() {
        return palo;
    }
    
    @Override
    public String toString() {
        return getPalo();
    }
}