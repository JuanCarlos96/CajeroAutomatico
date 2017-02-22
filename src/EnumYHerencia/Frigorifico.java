package EnumYHerencia;

public class Frigorifico extends Electrodomestico{
    private int volFrio = 100, volCongelado = 40;
    private boolean noFrost = false;

    public Frigorifico() {
    }
    
    public Frigorifico(int volFrio, int volCongelado, boolean noFrost){
        this.volFrio = volFrio;
        this.volCongelado = volCongelado;
        this.noFrost = noFrost;
    }

    public Frigorifico(int precio, int peso, Categoria consumo, int tiempo, int volFrio, int volCongelado, boolean noFrost) {
        super(precio, peso, consumo, tiempo);
        this.volFrio = volFrio;
        this.volCongelado = volCongelado;
        this.noFrost = noFrost;
    }
    
    public void congelar(){
        
    }
    
    public void enfriar(){
        
    }
    
    @Override
    public void calcularPrecio(){
        
    }

    public int getVolFrio() {
        return volFrio;
    }

    public void setVolFrio(int volFrio) {
        this.volFrio = volFrio;
    }

    public int getVolCongelado() {
        return volCongelado;
    }

    public void setVolCongelado(int volCongelado) {
        this.volCongelado = volCongelado;
    }

    public boolean isNoFrost() {
        return noFrost;
    }

    public void setNoFrost(boolean noFrost) {
        this.noFrost = noFrost;
    }
}