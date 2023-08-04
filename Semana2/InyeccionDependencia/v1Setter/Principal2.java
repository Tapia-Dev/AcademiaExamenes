package InyeccionDependencia.v1Setter;

import InyeccionDependencia.v1Setter.enums.TipoCamion;
import InyeccionDependencia.v1Setter.enums.TipoPaqueterias;

import java.util.ArrayList;

public class Principal2 {

    public static void main(String[] args) {


        Conductor conductor = new Conductor("Alfredo", TipoCamion.CAMION_DE_CARGA,TipoPaqueterias.DHL);
        Inyector.inyectarRuta(conductor);

        conductor.imprimirRuta();


        // Creamos rutas
        Ruta ruta1 = new RutaImpl("CUATITLAN", "TLALNEPANTLA");
        Ruta ruta2 = new RutaImpl("NAUCALPAN", "ECATEPEC");


        Conductor conductor1 = new Conductor("FATIMA", TipoCamion.CAMION_DE_REPARTO, TipoPaqueterias.FEDEX);
        conductor1.setRuta(ruta2);
        conductor1.imprimirRuta();



//





    }
}
