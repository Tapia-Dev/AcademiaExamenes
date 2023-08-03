package EjemploObserver.com.v0.Observers;


import EjemploObserver.com.v0.Observer.Observer;

import java.time.LocalDate;
import java.util.Date;

public class Deposito extends Observer {

    /*
    * Estas son las clases son observadores que extienden la clase Observer (herencia).
    *
    * */

    private String nombre;
    private String noCuenta;
    private double cantidad;
    private Date fecha;

    public Deposito(String nombre, String noCuenta, double cantidad, Date fecha, LocalDate now) {
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
