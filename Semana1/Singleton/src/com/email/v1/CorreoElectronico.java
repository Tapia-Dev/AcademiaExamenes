package com.email.v1;

public class CorreoElectronico {

    /*SE DEFINE ESTATICO  POR QUE LE VA PERTENECER A LA CLASE NO ALA INSTANCIA
    * Y SE INICIALIZA PARA QUE LA REFERENCIA NO APUNTE A NULL
    * */

    // EL CONTRUCTOR ES PRIVADO POR REGLA  SOLO LA CLASE PUEDE CREAR INSTANCIAS DE LA MISMA
    private static CorreoElectronico correoElectronico = new CorreoElectronico("Publicidad \n",
            "Hola conoce nuestras promocioes  \n",
            "www.marketing.imagen.png");


    private String tituloDelCorreo;
    private String mensajeDelCorreo;
    private String urlImagen;
    public static int contadorDeCorreosEnviados;

    private CorreoElectronico(String tituloDelCorreo,String mensajeDelCorreo, String urlImagen) {
        this.tituloDelCorreo = tituloDelCorreo;
        this.mensajeDelCorreo = mensajeDelCorreo;
        this.urlImagen = urlImagen;
        contadorDeCorreosEnviados++;
    }

    public static  int getContador(){
        return contadorDeCorreosEnviados;
    }

    // METODO PUBLICO ESTATICO PARA OBTENER LA INSTANCIA
    public static CorreoElectronico getInstance(){
        return correoElectronico;
    }


    // COMPORTAMIENTO QUE NOS DEVUEVE INFORMACION
    public String mostrarInformacionCorreo(){
        String informacion = tituloDelCorreo + mensajeDelCorreo + urlImagen;
        return informacion;
    }


}
