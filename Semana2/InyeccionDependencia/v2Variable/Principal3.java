package InyeccionDependencia.v2Variable;

import InyeccionDependencia.v2Variable.enums.TipoCamion;
import InyeccionDependencia.v2Variable.enums.TipoPaqueterias;

public class Principal3 {

    public static void main(String[] args) {


        Conductor conductor = new Conductor("Dayane", TipoCamion.CAMION_DE_CARGA, TipoPaqueterias.DHL);
        Inyector.inyectarRuta(conductor);

        conductor.imprimirRuta();




    }
}
