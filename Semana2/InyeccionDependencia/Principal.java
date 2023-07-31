package InyeccionDependencia;

import InyeccionDependencia.enums.TipoCamion;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Conductor conductor = Inyector.getConductor();
        conductor.imprimirRuta();

        Ruta ruta3 = new RutaImpl("CUATITLAN", "TLALNEPANTLA");
        Ruta ruta4 = new RutaImpl("NAUCALPAN", "ECATEPEC");



        ArrayList<Conductor>listaDeConductores = new ArrayList<>();
            listaDeConductores.add(new Conductor("FATIMA", TipoCamion.CAMION_DE_CARGA, ruta3));
            listaDeConductores.add(new Conductor("ALAN", TipoCamion.CAMION_REFRIGERADO, ruta4));
            listaDeConductores.add(new Conductor("RODOLFO", TipoCamion.CAMION_DOBLE_REMOLQUE, ruta4));
            listaDeConductores.add(new Conductor("RAY", TipoCamion.CAMION_PLATAFORMA, ruta4));
            listaDeConductores.add(new Conductor("PAMELA", TipoCamion.CAMION_DE_REPARTO, ruta4));

        for (Conductor conductores: listaDeConductores) {
             conductores.imprimirRuta();
        }








    }
}
