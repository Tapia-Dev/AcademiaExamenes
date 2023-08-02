package EjemploObserver.com.v0.Subject;


import EjemploObserver.com.v0.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

//    Esta es la clase abstracta que representa el sujeto que será observado.

    List<Observer> listaObservadores;

    public Subject(){
        listaObservadores = new ArrayList<>();
    }

    public void attach(Observer o){
        listaObservadores.add(o);
    }
    public void detach(Observer o){
        listaObservadores.remove(o);
    }

    public void notificar(){
        for (Observer o:listaObservadores) {
            o.update();
        }
    }



}
