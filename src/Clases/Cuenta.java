package Clases;

public class Cuenta {
    
    private double saldo;
    private int id;

    public Cuenta(int id) {
       this.saldo = 0;
       this.id = id;
    }
    
    public void ingresar(double cantidad){
        saldo = getSaldo()+cantidad;
    }
    
    public void retirar(double cantidad){
        saldo = getSaldo()-cantidad;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public int getId() {
        return id;
    }
}