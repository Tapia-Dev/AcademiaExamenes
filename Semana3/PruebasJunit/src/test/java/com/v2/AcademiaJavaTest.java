package com.v2;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcademiaJavaTest {

    // Esto nos ayudara a no realizar n cantidad de instancias en nuestros test
    private AcademiaJava academiaJava;

    // Trabaja junto con este
    @BeforeEach
    void setUp() {
        academiaJava = new AcademiaJava("Java", "CDMX", 10,
                "160", "HO", true);
    }

    @DisplayName("Esta prueba verifica si hay disponibilidad o no en nuestro metodo de disponibilidad")
    @Test
    public void mostrarDisponibilidad() {
        if (academiaJava.isDisponibilidad())
            System.out.println("Acadeia disponible");
        else
            System.out.println("Academia no diaponible");
        assertTrue(academiaJava.isDisponibilidad());
    }


    @DisplayName("Nos ayuda a identificar si el nombre setedo es igual al que esperamos")
    @Test
    public void llenarDatos(){
        academiaJava.setNombreAcademia("Java");
        assertEquals("Java",academiaJava.getNombreAcademia(),"El nombre NO es igual NO pasa el test");
    }

    @Test
    void verificarAlumnos() {
        academiaJava.setAlumnosAcademia(15);
        assertFalse(academiaJava.getAlumnosAcademia()<10,"Hay menos de 10 alumnos " +
                "no puedes iniciar la academia");
    }


}