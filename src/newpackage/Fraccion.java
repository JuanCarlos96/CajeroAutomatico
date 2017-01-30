package newpackage;

public class Fraccion {
    
    private int numerador,denominador;

    public Fraccion() {
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public Fraccion Sumar(Fraccion fraccion){
        if(denominador==fraccion.denominador){
            numerador += fraccion.numerador;
        }else{
            numerador = numerador*fraccion.denominador + denominador*fraccion.numerador;
            denominador = denominador * fraccion.denominador;
        }
        return this;
    }
    
    public Fraccion Restar(Fraccion fraccion){
        if(denominador==fraccion.denominador){
            numerador -= fraccion.numerador;
        }else{
            numerador = numerador*fraccion.denominador - denominador*fraccion.numerador;
            denominador = denominador * fraccion.denominador;
        }
        return this;
    }
    
    public Fraccion Multiplicar(Fraccion fraccion){
        numerador = numerador * fraccion.numerador;
        denominador = denominador * fraccion.denominador;
        return this;
    }
    
    public Fraccion Dividir(Fraccion fraccion){
        numerador = numerador * fraccion.denominador;
        denominador = denominador * fraccion.numerador;
        return this;
    }

    @Override
    public String toString() {
        String cadena = numerador+"/"+denominador;
        return cadena;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
}