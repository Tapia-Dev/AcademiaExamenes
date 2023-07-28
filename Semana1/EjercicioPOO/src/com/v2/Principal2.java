package com.v2;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {
    public static void main(String[] args) {


        List<Academia>academias = new ArrayList<>();
        academias.add(new AcademiaJava("Java", "EDOMEX", 15, "160 HRS", "A distancia", true));
        academias.add(new AcademiaCobol("Cobol", "MERIDA", 10, "160 HRS", "Presencial", false));


        for (Academia academia : academias){
            System.out.println(academia);
            academia.numeroDeAlumnos();
            System.out.println(academia.mostrarDisponibilidad());

        }
    }
}