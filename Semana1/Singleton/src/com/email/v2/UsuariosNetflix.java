package com.email.v2;

public class UsuariosNetflix {

    // Paso  1 :
    // Declaración de la variable estática privada que almacenará la única instancia

    private static UsuariosNetflix usuariosNetflix;
    public static int contadorDeUsuarios;

    // Datos de la serie deseada
    private String serieDeseada;

    // Paso 3: Constructor privado para evitar la instanciación directa desde fuera de la clase
    private UsuariosNetflix() {
        contadorDeUsuarios++;
        // Por simplicidad, no realizamos ninguna inicialización especial aquí
    }

    public static  int getContador(){

        return contadorDeUsuarios;
    }

    // Paso 3: Método público y estático para obtener la instancia única
    public static UsuariosNetflix getInstance() {
        if (usuariosNetflix == null) {
            usuariosNetflix = new UsuariosNetflix();
        }
        return usuariosNetflix;
    }

    // Método para recibir el deseo de un personaje y cumplirlo
    public void mostrarSerie(String serie) {
        System.out.println("¡Netflix esta cargando tu serie favorita !");
        System.out.println("Tu serie: " + serie);
        serieDeseada = serie;
    }






}
