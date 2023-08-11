package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Declaramos un flujo de cadenas de texto que utilizaremos para realizar
        // algunas operaciones

        Stream<String> palabras = Stream.of("STACK"," OOOVVVER");

        List<String> palabrasRefactorizadas = palabras
                //map nos ayuda a dividir el flujo ejemplo [S][T][A][K]
                .map(p -> p.split(""))
                // flatmap nos ayuda a unir lo que anteriormente [S][T][A][K] en uno solo
                .flatMap(Arrays::stream)
                //  Esto nos ayuda a remover los caracteres repetidos
                .distinct()
                // Por ultimo se unen los caracteres y se almacenan en palabrarRefactorizadas
                .collect(Collectors.toList());

        palabrasRefactorizadas.forEach(resul -> System.out.print(resul));



    }
}