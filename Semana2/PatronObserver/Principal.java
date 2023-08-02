package EjemploObserver;

import EjemploObserver.Observers.Deposito;
import EjemploObserver.Observers.Retiro;
import EjemploObserver.Subject.OperacionUsuario;

import java.util.Date;

public class Principal {

    public static void main(String[] args) {

        // BUSCAMOS UNA ALTA COHESION Y UN BAJO ACOPLAMIENTO

        OperacionUsuario operacionUsuario = new OperacionUsuario();
        Deposito deposito1 = new Deposito("Alan","18253533",1810,new Date());
        Retiro retiro1 = new Retiro("Alan","18253533",100,new Date());

        operacionUsuario.attach(deposito1);
        operacionUsuario.attach(retiro1);


        System.out.println("----------------");
        OperacionUsuario operacionUsuario2 = new OperacionUsuario();
        Deposito deposito2 = new Deposito("Fatima","18253563",200,new Date());
        operacionUsuario.attach(deposito2);

        operacionUsuario.notificar();
//        operacionUsuario.detach(retiro);
//        operacionUsuario.notificar();


//        usuario.setDeposito(deposito);
//        usuario.setRetiro(retiro);
//        usuario.operacion();

    }
}
