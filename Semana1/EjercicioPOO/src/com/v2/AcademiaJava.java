package com.v2;

public class AcademiaJava extends Academia {
    public AcademiaJava(String nombreAcademia, String ubicacion, int alumnosAcademia, String duracion, String modalidad, boolean disponibilidad) {
        super(nombreAcademia, ubicacion, alumnosAcademia, duracion, modalidad, disponibilidad);
    }

    @Override
    String mostrarDisponibilidad() {
        if (isDisponibilidad()) {
            return "La academia Java está disponible.";
        } else {
            return "La academia Java no está disponible.";
        }
    }

    @Override
    public void ingresarAcademias(String nombreAcademia) {

    }

    @Override
    public void numeroDeAlumnos() {
        System.out.println("El numero de ALumnos  es:" + " " + getAlumnosAcademia() + " " +  " en la Academia" + " " + getNombreAcademia());
    }
}
