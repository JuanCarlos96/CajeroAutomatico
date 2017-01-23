package Contador;

public class Contador {
    private int valor;

    public Contador(int valor) {
        this.valor = valor;
    }
    
    public void incrementar(){
        this.valor = this.valor+1;
    }
    
    public void decrementar(){
        this.valor = this.valor-1;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
