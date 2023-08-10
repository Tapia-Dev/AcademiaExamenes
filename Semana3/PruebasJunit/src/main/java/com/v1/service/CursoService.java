package com.v1.service;

import com.v1.dto.CursoDTO;

import java.util.HashMap;

public class CursoService {
    HashMap<Integer, CursoDTO> cursos = new HashMap<>();


    public CursoDTO crearCurso (Integer idCurso, String nombreCurso, int precioCurso,
                               String duracionCurso){
        cursos.put(idCurso, new CursoDTO(idCurso,nombreCurso, precioCurso,duracionCurso));
        return cursos.get(idCurso);
    }

    public CursoDTO obtenerCurso(Integer idCurso){
        return cursos.get(idCurso);
    }

    public CursoDTO actualizarCurso(Integer idCurso, String nombreCurso, int precioCurso,
                                    String duracionCurso){
        return cursos.put(idCurso, new CursoDTO(idCurso, nombreCurso, precioCurso,duracionCurso));
    }



}
