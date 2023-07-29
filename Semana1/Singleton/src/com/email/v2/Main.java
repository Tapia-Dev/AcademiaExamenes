package com.email.v2;

import com.email.v1.CorreoElectronico;

public class Main {
    public static void main(String[] args) {


        UsuariosNetflix usuarioNetflix1 = UsuariosNetflix.getInstance();
        usuarioNetflix1.mostrarSerie("Serie de soldados en reproduccion");

        System.out.println("\n");
        System.out.println("*****************************************");

        UsuariosNetflix usuarioNetflix2 = UsuariosNetflix.getInstance();
        usuarioNetflix1.mostrarSerie("Serie de negocios en reproduccion");

        System.out.println(UsuariosNetflix.getContador());
// ...


    }
}
