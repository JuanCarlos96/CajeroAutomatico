package EnumYHerencia;

public class Lavadora extends Electrodomestico{
    private static int CARGA = 5;

    public Lavadora() {
    }
    
    public Lavadora(int carga){
        CARGA = carga;
    }

    public Lavadora(int precio, int peso, Categoria consumo, int tiempo, int carga) {
        super(precio, peso, consumo, tiempo);
        CARGA = carga;
    }
    
    public void lavar(int carga){
        
    }
    
    @Override
    public void calcularPrecio(){
        super.calcularPrecio();
        
    }

    public static int getCARGA() {
        return CARGA;
    }

    public static void setCARGA(int CARGA) {
        Lavadora.CARGA = CARGA;
    }
}