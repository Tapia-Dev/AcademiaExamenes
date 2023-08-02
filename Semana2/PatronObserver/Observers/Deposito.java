package EjemploObserver.Observers;


import EjemploObserver.Observer.Observer;

import java.util.Date;

public class Deposito extends Observer {

    private String nombre;
    private String noCuenta;
    private double cantidad;
    private Date fecha;

    public Deposito(String nombre,String noCuenta,double cantidad, Date fecha) {
        this.nombre = nombre;
        this.noCuenta = noCuenta;
        this.cantidad = cantidad;
        this.fecha = fecha;

    }

    public void depositar(){
        System.out.println("Deposito " +nombre + " " + noCuenta
        + " La cantidad de :  " + cantidad + " -------- Fecha ------- : " +fecha);
    }

    @Override
    public void update() {
        depositar();
    }
}
