package com.v2;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Principal1 {
    public static void main(String[] args) {


        List<Academia> academias = new ArrayList<>();
        academias.add(new AcademiaJava("Java", "CDMX", 10, "160 HRS", "A distancia", true));
        academias.add(new AcademiaJava("Java", "EDOMEX", 15, "160 HRS", "A distancia", false));
        academias.add(new AcademiaCobol("Java", "GUADALAJARA", 10, "160 HRS", "A distancia", true));
        academias.add(new AcademiaCobol("Cobol", "MERIDA", 10, "160 HRS", "Presencial", false));

        for (Academia academia : academias) {
            System.out.println(academia);
            System.out.println(academia.mostrarDisponibilidad());
            System.out.println("-----");
        }

    }
}