package InyeccionDependencia.v2Variable;

import InyeccionDependencia.v2Variable.enums.TipoCamion;
import InyeccionDependencia.v2Variable.enums.TipoPaqueterias;

public class Conductor {

    private String nombre;
    private TipoCamion tipoCamion;
    private TipoPaqueterias tipoPaqueterias;
    public Ruta ruta;


    public Conductor(String nombre, TipoCamion tipoCamion, TipoPaqueterias tipoPaqueterias) {
        this.nombre = nombre;
        this.tipoCamion = tipoCamion;
        this.tipoPaqueterias = tipoPaqueterias;
    }

    void imprimirRuta(){
        System.out.println(nombre + " Tipo de vehiculo : " + tipoCamion + " Nombre del la paqueteria : " + tipoPaqueterias);
        ruta.imprimirRuta();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoCamion getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(TipoCamion tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    public TipoPaqueterias getTipoPaqueterias() {
        return tipoPaqueterias;
    }

    public void setTipoPaqueterias(TipoPaqueterias tipoPaqueterias) {
        this.tipoPaqueterias = tipoPaqueterias;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
}
