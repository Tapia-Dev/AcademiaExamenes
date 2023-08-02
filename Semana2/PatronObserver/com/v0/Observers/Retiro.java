package EjemploObserver.com.v0.Observers;


import EjemploObserver.com.v0.Observer.Observer;

import java.util.Date;

public class Retiro extends Observer {


    private String nombre;
    private String numeroDeCuenta;
    private double cantidad;
    private Date fecha;

    public Retiro(String nombre, String numeroDeCuenta, double cantidad,Date fecha) {
        this.nombre = nombre;
        this.numeroDeCuenta = numeroDeCuenta;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public void retirar(){
        System.out.println("Retiro " +nombre + " " + numeroDeCuenta
                + " La cantidad de :  " + cantidad + " -------- Fecha ------- : " +fecha);
    }

    @Override
    public void update() {
        retirar();
    }



}
