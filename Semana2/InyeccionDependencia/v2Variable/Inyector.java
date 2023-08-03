package InyeccionDependencia.v2Variable;


public class Inyector {


    // Inyectamos por VARIABLE
    static void inyectarRuta(Conductor conductor) {
        conductor.ruta = new RutaImpl("GDL","JAL");

    }



}
