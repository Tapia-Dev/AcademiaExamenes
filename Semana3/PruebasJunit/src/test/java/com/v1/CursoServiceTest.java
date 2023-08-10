package com.v1;

import com.v1.dto.CursoDTO;
import com.v1.service.CursoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class CursoServiceTest {


    private CursoService cursoService;

    @BeforeEach
    public void setUp(){
        cursoService = new CursoService();
        cursoService.crearCurso(1,"JAVA",1500,"160HRS");
        cursoService.crearCurso(100,"PHP",1200,"180HRS");
        cursoService.actualizarCurso(100,"PHP",1800,"180HRS");
    }

    @DisplayName("se espera que el resultado curso sea igual al curso que estamos esperamos")
    @Test
    public void test1(){
        CursoDTO cursoEsperado = new CursoDTO(1,"JAVA", 2500,"160HRS");
//      CursoService cursoService = new CursoService();
        final CursoDTO resultado = cursoService.crearCurso(1,"JAVA", 2500,"160HRS");
        // ES IGUAL QUE OTRO
        Assertions.assertEquals(cursoEsperado,resultado);
    }


    @DisplayName("Esperamos que el NOMBRE del curso resultaod sea igual al esperado de lo contrario falla")
    @Test
    public void test2(){
        CursoDTO cursoEsperado = new CursoDTO(1,"JAVA", 2500,"160HRS");
//        CursoService cursoService = new CursoService();
        final CursoDTO resultado = cursoService.crearCurso(1,"JAVA", 2500,"160HRS");
        Assertions.assertEquals(cursoEsperado.getNombreCurso(),resultado.getNombreCurso(),"El nombre del curso es difrente");
    }

    @DisplayName("Esperamos que el ID del curso resultado sea igual al del esperado")
    @Test
    public void test3(){
        CursoDTO cursoEsperado = new CursoDTO(1,"JAVA", 2500,"160HRS");
//        CursoService cursoService = new CursoService();
        final CursoDTO resultado = cursoService.crearCurso(1,"PHP", 2500,"160HRS");
        Assertions.assertEquals(cursoEsperado.getIdCurso(),resultado.getIdCurso());
    }

    @DisplayName("OBTENER EL CURSO QUE BUSCAMOS POR ID")
    @Test
    public void test4(){
        CursoDTO cursoEsperado = new CursoDTO(100,"PHP",1500,"160hrs");
//        CursoService cursoService = new CursoService();

        // CREAMOS EL CURSO
//        cursoService.crearCurso(100,"PHP",1500,"160HRS");
        final CursoDTO resultado = cursoService.obtenerCurso(100);
        Assertions.assertEquals(cursoEsperado.getIdCurso(),resultado.getIdCurso());
    }

    @DisplayName("ACTUALIZAR EL CURSO POR ID")
    @Test
    public void test5(){
        CursoDTO cursoEsperado = new CursoDTO(100,"PHP",1800,"180hrs");
//      CursoService cursoService = new CursoService();
//      CREAMOS EL CURSO
//      cursoService.crearCurso(100,"PHP",1500,"160HRS");
        final CursoDTO resultado = cursoService.actualizarCurso(100,"PHP",1800,"180HRS");
        Assertions.assertEquals(cursoEsperado.getIdCurso(),resultado.getIdCurso());
    }




















}