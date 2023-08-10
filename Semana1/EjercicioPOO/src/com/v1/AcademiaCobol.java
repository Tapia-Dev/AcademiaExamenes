package com.v1;

public class AcademiaCobol extends Academia {

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
