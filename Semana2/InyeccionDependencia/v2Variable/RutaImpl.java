package InyeccionDependencia.v2Variable;

public class RutaImpl implements Ruta {

    private String origen;
    private String destino;

    public RutaImpl(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
    }
    @Override
    public void imprimirRuta() {
        System.out.println(" --- CON ORIGEN --- : " + origen + " " +" --- Y DESTINO A --- : " +destino);

    }


}
