package EjemploObserver.com.v1.observers;

import EjemploObserver.com.v1.observer.Observer;

import java.time.LocalDate;
import java.util.Date;

public class Deposito implements Observer {
    /*
    * Esta es mi clase observadora implementa de Observer
    * */
    private String nombre;
    private String noCuenta;
    private double cantidad;
    private Date fecha;
    private LocalDate fecha2;

    public Deposito(String nombre, String noCuenta, double cantidad, Date fecha,LocalDate fecha2) {
        this.nombre = nombre;
        this.noCuenta = noCuenta;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.fecha2 = fecha2;
    }

    public void depositar() {
        System.out.println("Deposito " + nombre + " " + noCuenta
                + " La cantidad de: " + cantidad + " -------- Fecha ------- : " + fecha);
    }

    @Override
    public void update() {
        depositar();
    }
}
