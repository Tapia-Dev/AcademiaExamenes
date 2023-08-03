package InyeccionDependencia.v0Constructor;

import InyeccionDependencia.v0Constructor.enums.TipoCamion;

public class Conductor {

    private String nombre;
    private TipoCamion tipoCamion;
    private Ruta ruta;


    public Conductor(String nombre, TipoCamion tipoCamion, Ruta ruta) {
        this.nombre = nombre;
        this.tipoCamion = tipoCamion;
        this.ruta = ruta;
    }

    void imprimirRuta(){
        System.out.println(nombre + " " + tipoCamion);
        ruta.imprimirRuta();
    }

}
