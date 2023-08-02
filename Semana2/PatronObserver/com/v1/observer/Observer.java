package EjemploObserver.com.v1.observer;

public interface Observer {

    /*
    * Esta interface es nuestro Observer
    * Aqui declaramos el metodo implementaremos en las clases (deposito,retiro)
    * dichas clases seran observadores
    * */
    void update();
}
