package com.service;

import com.dto.CursoDTO;

import java.util.ArrayList;
import java.util.List;

public class CursosService2 {

    List<CursoDTO> cursos = new ArrayList<>();
    public CursoDTO crearCurso (Integer idCurso, String nombreCurso, int precioCurso,
                                String duracionCurso){
        cursos.add(idCurso, new CursoDTO(idCurso,nombreCurso, precioCurso,duracionCurso));
        return cursos.get(idCurso);
    }

    public CursoDTO obtenerCurso (Integer idCurso){
        return cursos.get(idCurso);
    }

    public CursoDTO actualizarCurso(Integer idCurso, String nombreCurso, int precioCurso,
                                    String duracionCurso){
        for (CursoDTO cursoDTO:cursos) {
            cursoDTO.setNombreCurso(nombreCurso);
            cursoDTO.setPrecioCurso(precioCurso);
            cursoDTO.setDuracionCurso(duracionCurso);
            return cursoDTO;
        }
        return null;
    }


}
