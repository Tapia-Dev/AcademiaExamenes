package EjemploObserver.Subject;


import EjemploObserver.Observer.Observer;
import EjemploObserver.Observers.Deposito;
import EjemploObserver.Observers.Retiro;

public class OperacionUsuario extends Subject {
    // Esta clase va ser mi observador

//    private Deposito deposito;
//    private Retiro retiro;

    public void operacion(){
        System.out.println("Operacion exitosa");
        notificar();
//        deposito.depositar();
//   retiro.retirar();
    }





}
