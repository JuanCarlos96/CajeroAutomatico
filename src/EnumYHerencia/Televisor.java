package EnumYHerencia;

import static EnumYHerencia.Resolucion.*;

public class Televisor extends Electrodomestico{
    private int pulgadas = 30;
    private Resolucion resolucion = HD;

    public Televisor() {
    }
    
    public Televisor(int pulg, Resolucion res){
        this.pulgadas = pulg;
        this.resolucion = res;
    }

    public Televisor(int precio, int peso, Categoria consumo, int tiempo, int pulg, Resolucion res) {
        super(precio, peso, consumo, tiempo);
        this.pulgadas = pulg;
        this.resolucion = res;
    }
    
    @Override
    public void calcularPrecio(){
        
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Resolucion getResolucion() {
        return resolucion;
    }

    public void setResolucion(Resolucion resolucion) {
        this.resolucion = resolucion;
    }
}