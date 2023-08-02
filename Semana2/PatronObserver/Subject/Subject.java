package EjemploObserver.Subject;


import EjemploObserver.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

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
