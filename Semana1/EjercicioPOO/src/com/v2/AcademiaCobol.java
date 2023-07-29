package com.v2;

import java.util.List;

public  class AcademiaCobol extends Academia  {

    private List<Academia> academias;


    public AcademiaCobol(String nombreAcademia, String ubicacion, int alumnosAcademia, String duracion, String modalidad, boolean disponibilidad) {
        super(nombreAcademia, ubicacion, alumnosAcademia, duracion, modalidad, disponibilidad);
    }
    @Override
    String mostrarDisponibilidad() {
        if (isDisponibilidad()) {
            return "La academia Cobol está disponible.";
        } else {
            return "La academia Cobol no está disponible.";
        }
    }






    public void numeroDeAlumnos() {
        System.out.println("El numero de ALumnos  es:" + " " + getAlumnosAcademia() + " " +  " en la Academia" + " " + getNombreAcademia());
    }




    @Override
    public String toString() {
        return "Academia Cobol{" +
                "nombreAcademia='" + getNombreAcademia()+ '\'' +
                ", ubicacion='" + getUbicacion() + '\'' +
                ", alumnosAcademia=" + getAlumnosAcademia() +
                ", duracion='" + getDuracion() + '\'' +
                ", modalidad='" + getModalidad() + '\'' +
                ", disponibilidad=" + isDisponibilidad() +
                '}';
    }



}
