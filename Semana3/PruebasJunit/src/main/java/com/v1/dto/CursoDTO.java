package com.v1.dto;

import java.util.Objects;

public class CursoDTO {

    private Integer idCurso;
    private String nombreCurso;
    private int precioCurso;
    private String duracionCurso;

    public CursoDTO() {

    }

    public CursoDTO(Integer idCurso, String nombreCurso, int precioCurso, String duracionCurso) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.precioCurso = precioCurso;
        this.duracionCurso = duracionCurso;
    }


    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getPrecioCurso() {
        return precioCurso;
    }

    public void setPrecioCurso(int precioCurso) {
        this.precioCurso = precioCurso;
    }

    public String getDuracionCurso() {
        return duracionCurso;
    }

    public void setDuracionCurso(String duracionCurso) {
        this.duracionCurso = duracionCurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CursoDTO cursoDTO = (CursoDTO) o;
        return precioCurso == cursoDTO.precioCurso && Objects.equals(idCurso, cursoDTO.idCurso) && Objects.equals(nombreCurso, cursoDTO.nombreCurso) && Objects.equals(duracionCurso, cursoDTO.duracionCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCurso, nombreCurso, precioCurso, duracionCurso);
    }

    @Override
    public String toString() {
        return "CursosDto{" +
                "idCurso=" + idCurso +
                ", nombreCurso='" + nombreCurso + '\'' +
                ", precioCurso=" + precioCurso +
                ", duracionCurso='" + duracionCurso + '\'' +
                '}';
    }
}
