package com.v2;

public abstract class  Academia implements NumeroDeAlumnos {
    private String nombreAcademia;
    private String ubicacion;
    private int alumnosAcademia;
    private String duracion;
    private String modalidad;
    private boolean disponibilidad;

    public Academia(String nombreAcademia, String ubicacion, int alumnosAcademia, String duracion, String modalidad, boolean disponibilidad) {
        this.nombreAcademia = nombreAcademia;
        this.ubicacion = ubicacion;
        this.alumnosAcademia = alumnosAcademia;
        this.duracion = duracion;
        this.modalidad = modalidad;
        this.disponibilidad = disponibilidad;
    }

    abstract String mostrarDisponibilidad();

    public String getNombreAcademia() {
        return nombreAcademia;
    }

    public void setNombreAcademia(String nombreAcademia) {
        this.nombreAcademia = nombreAcademia;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getAlumnosAcademia() {
        return alumnosAcademia;
    }

    public void setAlumnosAcademia(int alumnosAcademia) {
        this.alumnosAcademia = alumnosAcademia;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }



    @Override
    public String toString() {
        return "Academia{" +
                "nombreAcademia='" + nombreAcademia + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", alumnosAcademia=" + alumnosAcademia +
                ", duracion='" + duracion + '\'' +
                ", modalidad='" + modalidad + '\'' +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}
