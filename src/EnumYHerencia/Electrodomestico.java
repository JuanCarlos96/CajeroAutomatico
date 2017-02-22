package EnumYHerencia;

import static EnumYHerencia.Categoria.*;

public class Electrodomestico {
    protected static int PRECIO_BASE = 100,PESO = 5;
    protected static Categoria CONSUMO_ENERGETICO = F;
    protected int tiempoCiclo;

    public Electrodomestico() {
        
    }
    
    public Electrodomestico(int precio, int peso){
        PRECIO_BASE = precio;
        PESO = peso;
    }
    
    public Electrodomestico(int precio, int peso, Categoria consumo, int tiempo){
        PRECIO_BASE = precio;
        PESO = peso;
        CONSUMO_ENERGETICO = consumo;
        this.tiempoCiclo = tiempo;
    }
    
    public void encender(){
        System.out.println("El electrodoméstico estará encendido durante "+tiempoCiclo+" minutos");
    }
    
    public void apagar(){
        System.out.println("El electrodoméstico está apagado");
    }
    
    public void calcularPrecio(){
        switch(CONSUMO_ENERGETICO){
            case A:
                PRECIO_BASE += 100;
                break;
            case B:
                PRECIO_BASE += 80;
                break;
            case C:
                PRECIO_BASE += 60;
                break;
            case D:
                PRECIO_BASE += 50;
                break;
            case E:
                PRECIO_BASE += 30;
                break;
            case F:
                PRECIO_BASE += 10;
                break;
        }
        
        if(PESO>=0 && PESO<=19){
            PRECIO_BASE += 10;
        }else if(PESO>=20 && PESO<=49){
            PRECIO_BASE += 50;
        }else if(PESO>=50 && PESO<=79){
            PRECIO_BASE += 80;
        }else if(PESO>=80){
            PRECIO_BASE += 100;
        }
    }

    public static int getPRECIO_BASE() {
        return PRECIO_BASE;
    }

    public static void setPRECIO_BASE(int PRECIO_BASE) {
        Electrodomestico.PRECIO_BASE = PRECIO_BASE;
    }

    public static int getPESO() {
        return PESO;
    }

    public static void setPESO(int PESO) {
        Electrodomestico.PESO = PESO;
    }

    public static Categoria getCONSUMO_ENERGETICO() {
        return CONSUMO_ENERGETICO;
    }

    public static void setCONSUMO_ENERGETICO(Categoria CONSUMO_ENERGETICO) {
        Electrodomestico.CONSUMO_ENERGETICO = CONSUMO_ENERGETICO;
    }

    public int getTiempoCiclo() {
        return tiempoCiclo;
    }

    public void setTiempoCiclo(int tiempoCiclo) {
        this.tiempoCiclo = tiempoCiclo;
    }
    
    
}