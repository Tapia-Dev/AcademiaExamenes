package InyeccionDependencia.v1Setter;


import InyeccionDependencia.v1Setter.enums.TipoCamion;

public class Inyector {


    // Inyectamos por setter
    static void inyectarRuta(Conductor conductor) {
        conductor.setRuta(new RutaImpl("Tlalnepantla","Cuatitlan"));
    }



}
