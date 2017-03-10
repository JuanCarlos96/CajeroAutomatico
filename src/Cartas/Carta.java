package Cartas;

import javax.swing.*;

public class Carta extends JLabel{
    private Palo palo;
    private String color,numero;
    
    public Carta() {
        JLabel label = new JLabel();
    }
    
    public Carta(Icon icon) {
        JLabel label = new JLabel(icon);
    }

    public Carta(String numero, Palo palo, String color) {
        this.numero = numero;
        this.palo = palo;
        this.color = color;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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
        result = getNumero()+" de "+getPalo()+" de color "+getColor();
        
        return result;
    }
}