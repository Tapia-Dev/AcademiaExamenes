package EjemploObserver.com.v1;

import EjemploObserver.com.v0.Observers.Deposito;
import EjemploObserver.com.v0.Observers.Retiro;
import EjemploObserver.com.v0.Subject.OperacionUsuario;

import java.util.Date;

public class Principal {

    public static void main(String[] args) {

        // BUSCAMOS UNA ALTA COHESION Y UN BAJO ACOPLAMIENTO

        OperacionUsuario operacionUsuario = new OperacionUsuario();
        Deposito deposito1 = new Deposito("Alan","18253533",1810,new Date());
        Retiro retiro1 = new Retiro("Alan","18253533",100,new Date());

        operacionUsuario.attach(deposito1);
        operacionUsuario.attach(retiro1);
        operacionUsuario.notificar();


        System.out.println("----------------");
        OperacionUsuario operacionUsuario2 = new OperacionUsuario();
        Deposito deposito2 = new Deposito("Fatima","18253563",200,new Date());
        Retiro retiro2 = new Retiro("Fatima","18253563",400,new Date());

        operacionUsuario2.attach(deposito2);
        operacionUsuario2.attach(retiro2);
        operacionUsuario2.notificar();

//        operacionUsuario.detach(retiro);
//        operacionUsuario.notificar();


//        usuario.setDeposito(deposito);
//        usuario.setRetiro(retiro);
//        usuario.operacion();

    }
}
