package com.email;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        CorreoElectronico correo1 = CorreoElectronico.getInstance();
        CorreoElectronico correo2 = CorreoElectronico.getInstance();
        CorreoElectronico correo3 = CorreoElectronico.getInstance();
        CorreoElectronico correo4 = CorreoElectronico.getInstance();
        CorreoElectronico correoN = CorreoElectronico.getInstance();

        System.out.println(correo1.mostrarInformacionCorreo());
        System.out.println("------");
        System.out.println(CorreoElectronico.getContador());


    }
}