package com.email;

public class CorreoElectronico {

    private static CorreoElectronico correoElectronico = new CorreoElectronico( "Publicidad \n",
            "Hola conoce nuestras promocioes \n",
            "www.marketing.imagen.png");
    public String tituloDelCorreo;
    public String mensajeDelCorreo;
    public String urlImagen;
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

    public static CorreoElectronico getInstance(){
        return correoElectronico;
    }

    public String mostrarInformacionCorreo(){
        String informacion = tituloDelCorreo + mensajeDelCorreo + urlImagen;
        return informacion;
    }


}
