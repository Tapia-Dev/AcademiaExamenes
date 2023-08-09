package com.service;

import com.dto.CursoDTO;

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
