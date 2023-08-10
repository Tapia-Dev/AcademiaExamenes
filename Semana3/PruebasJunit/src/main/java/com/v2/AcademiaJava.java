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
    public String toString() {
        return "Academia Java{" +
                "nombreAcademia='" + getNombreAcademia()+ '\'' +
                ", ubicacion='" + getUbicacion() + '\'' +
                ", alumnosAcademia=" + getAlumnosAcademia() +
                ", duracion='" + getDuracion() + '\'' +
                ", modalidad='" + getModalidad() + '\'' +
                ", disponibilidad=" + isDisponibilidad() +
                '}';
    }
}
