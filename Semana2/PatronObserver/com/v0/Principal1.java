package EjemploObserver.com.v0;



import EjemploObserver.com.v0.Observers.Deposito;
import EjemploObserver.com.v0.Observers.Retiro;
import EjemploObserver.com.v0.Subject.OperacionUsuario;

import java.util.Date;


public class Principal1 {

    public static void main(String[] args) {

        // BUSCAMOS UNA ALTA COHESION Y UN BAJO ACOPLAMIENTO

        OperacionUsuario operacionUsuario = new OperacionUsuario();
        Deposito deposito1 = new Deposito("Alan","18253533",1810,new Date());
        Retiro retiro1 = new Retiro("Alan","18253533",100,new Date());

        operacionUsuario.attach(deposito1);
        operacionUsuario.attach(retiro1);
        operacionUsuario.notificar();

        System.out.println("***********************************************");

        OperacionUsuario operacionUsuario2 = new OperacionUsuario();
        Deposito deposito2 = new Deposito("Fatima","18253563",2000,new Date());
        Retiro retiro2 = new Retiro("Fatima","18253563",800,new Date());

        operacionUsuario2.attach(deposito2);
        operacionUsuario2.attach(retiro2);
        operacionUsuario2.notificar();

        System.out.println("***********************************************");


    }
}
