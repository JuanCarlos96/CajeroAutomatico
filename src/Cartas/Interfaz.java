package Cartas;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class Interfaz extends JFrame implements ActionListener{
    private JButton boton;
    private FlowLayout flayout = new FlowLayout();
    private Carta label,info;
    private JLabel texto;
    private final String ruta = "/Cartas/baraja/";

    public Interfaz() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(flayout);
        
        boton = new JButton("Generar carta");
        add(boton);
        boton.addActionListener(this);
        
        label = new Carta();
        label.setIcon(null);
        add(label);
        
        texto = new JLabel();
        add(texto);
    }
    
    public static void main(String[] args) {
        Interfaz g = new Interfaz();
        g.setVisible(true);
        g.setBounds(300, 300, 300, 430);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random r = new Random();
        int a = r.nextInt(4);
        
        if(a==0){
            Random aleatorio = new Random();
            int num = aleatorio.nextInt(13);
            switch(num) {
                case 0:
                    info = new Carta(Posicion.AS,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"rombos/as.jpg")));
                    break;
                case 1:
                    info = new Carta(Posicion.DOS,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"rombos/dos.jpg")));
                    break;
                case 2:
                    info = new Carta(Posicion.TRES,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"rombos/tres.jpg")));
                    break;
                case 3:
                    info = new Carta(Posicion.CUATRO,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"rombos/cuatro.jpg")));
                    break;
                case 4:
                    info = new Carta(Posicion.CINCO,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"rombos/cinco.jpg")));
                    break;
                case 5:
                    info = new Carta(Posicion.SEIS,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"rombos/seis.jpg")));
                    break;
                case 6:
                    info = new Carta(Posicion.SIETE,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"rombos/siete.jpg")));
                    break;
                case 7:
                    info = new Carta(Posicion.OCHO,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"rombos/ocho.jpg")));
                    break;
                case 8:
                    info = new Carta(Posicion.NUEVE,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"rombos/nueve.jpg")));
                    break;
                case 9:
                    info = new Carta(Posicion.DIEZ,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"rombos/diez.jpg")));
                    break;
                case 10:
                    info = new Carta(Posicion.JOTA,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"rombos/jota.jpg")));
                    break;
                case 11:
                    info = new Carta(Posicion.REINA,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"rombos/reina.jpg")));
                    break;
                case 12:
                    info = new Carta(Posicion.REY,Palo.ROMBO,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"rombos/rey.jpg")));
                    break;
            }
        }
        
        if(a==1){
            Random aleatorio = new Random();
            int num = aleatorio.nextInt(13);
            switch(num) {
                case 0:
                    info = new Carta(Posicion.AS,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"corazones/as.jpg")));
                    break;
                case 1:
                    info = new Carta(Posicion.DOS,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"corazones/dos.jpg")));
                    break;
                case 2:
                    info = new Carta(Posicion.TRES,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"corazones/tres.jpg")));
                    break;
                case 3:
                    info = new Carta(Posicion.CUATRO,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"corazones/cuatro.jpg")));
                    break;
                case 4:
                    info = new Carta(Posicion.CINCO,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"corazones/cinco.jpg")));
                    break;
                case 5:
                    info = new Carta(Posicion.SEIS,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"corazones/seis.jpg")));
                    break;
                case 6:
                    info = new Carta(Posicion.SIETE,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"corazones/siete.jpg")));
                    break;
                case 7:
                    info = new Carta(Posicion.OCHO,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"corazones/ocho.jpg")));
                    break;
                case 8:
                    info = new Carta(Posicion.NUEVE,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"corazones/nueve.jpg")));
                    break;
                case 9:
                    info = new Carta(Posicion.DIEZ,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"corazones/diez.jpg")));
                    break;
                case 10:
                    info = new Carta(Posicion.JOTA,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"corazones/jota.jpg")));
                    break;
                case 11:
                    info = new Carta(Posicion.REINA,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"corazones/reina.jpg")));
                    break;
                case 12:
                    info = new Carta(Posicion.REY,Palo.CORAZON,"ROJA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"corazones/rey.jpg")));
                    break;
            }
        }
        
        if(a==2){
            Random aleatorio = new Random();
            int num = aleatorio.nextInt(13);
            switch(num) {
                case 0:
                    info = new Carta(Posicion.AS,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"picas/as.jpg")));
                    break;
                case 1:
                    info = new Carta(Posicion.DOS,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"picas/dos.jpg")));
                    break;
                case 2:
                    info = new Carta(Posicion.TRES,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"picas/tres.jpg")));
                    break;
                case 3:
                    info = new Carta(Posicion.CUATRO,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"picas/cuatro.jpg")));
                    break;
                case 4:
                    info = new Carta(Posicion.CINCO,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"picas/cinco.jpg")));
                    break;
                case 5:
                    info = new Carta(Posicion.SEIS,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"picas/seis.jpg")));
                    break;
                case 6:
                    info = new Carta(Posicion.SIETE,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"picas/siete.jpg")));
                    break;
                case 7:
                    info = new Carta(Posicion.OCHO,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"picas/ocho.jpg")));
                    break;
                case 8:
                    info = new Carta(Posicion.NUEVE,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"picas/nueve.jpg")));
                    break;
                case 9:
                    info = new Carta(Posicion.DIEZ,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"picas/diez.jpg")));
                    break;
                case 10:
                    info = new Carta(Posicion.JOTA,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"picas/jota.jpg")));
                    break;
                case 11:
                    info = new Carta(Posicion.REINA,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"picas/reina.jpg")));
                    break;
                case 12:
                    info = new Carta(Posicion.REY,Palo.PICA,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"picas/rey.jpg")));
                    break;
            }
        }
        
        if(a==3){
            Random aleatorio = new Random();
            int num = aleatorio.nextInt(13);
            switch(num) {
                case 0:
                    info = new Carta(Posicion.AS,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"treboles/as.jpg")));
                    break;
                case 1:
                    info = new Carta(Posicion.DOS,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"treboles/dos.jpg")));
                    break;
                case 2:
                    info = new Carta(Posicion.TRES,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"treboles/tres.jpg")));
                    break;
                case 3:
                    info = new Carta(Posicion.CUATRO,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"treboles/cuatro.jpg")));
                    break;
                case 4:
                    info = new Carta(Posicion.CINCO,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"treboles/cinco.jpg")));
                    break;
                case 5:
                    info = new Carta(Posicion.SEIS,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"treboles/seis.jpg")));
                    break;
                case 6:
                    info = new Carta(Posicion.SIETE,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"treboles/siete.jpg")));
                    break;
                case 7:
                    info = new Carta(Posicion.OCHO,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"treboles/ocho.jpg")));
                    break;
                case 8:
                    info = new Carta(Posicion.NUEVE,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"treboles/nueve.jpg")));
                    break;
                case 9:
                    info = new Carta(Posicion.DIEZ,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"treboles/diez.jpg")));
                    break;
                case 10:
                    info = new Carta(Posicion.JOTA,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"treboles/jota.jpg")));
                    break;
                case 11:
                    info = new Carta(Posicion.REINA,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"treboles/reina.jpg")));
                    break;
                case 12:
                    info = new Carta(Posicion.REY,Palo.TREBOL,"NEGRA");
                    label.setIcon(new ImageIcon(getClass().getResource(ruta+"treboles/rey.jpg")));
                    break;
            }
        }
        
        texto.setText(info.toString());
///        JOptionPane.showMessageDialog(this, info.toString());
    }
}