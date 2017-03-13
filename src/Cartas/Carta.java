package Cartas;

import javax.swing.*;

public class Carta extends JLabel{
    private Palo palo;
    private Posicion posicion;
    private String color;
    
    public Carta() {
        JLabel label = new JLabel();
    }
    
    public Carta(Icon icon) {
        JLabel label = new JLabel(icon);
    }

    public Carta(Posicion posicion, Palo palo, String color) {
        this.posicion = posicion;
        this.palo = palo;
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String result;
        result = getPosicion()+" de "+getPalo()+" de color "+getColor();
        
        return result;
    }
}