package InyeccionDependencia.v0Constructor;


import InyeccionDependencia.v0Constructor.enums.TipoCamion;

public class Inyector {

    static Conductor getConductor() {
        RutaImpl ruta1 = new RutaImpl("GUADALAJARA","CDMX");
        RutaImpl ruta2 = new RutaImpl("TEXAS","MERIDA");

        return new Conductor("RODOLFO", TipoCamion.CAMION_DE_CARGA,ruta1);
    }



}
