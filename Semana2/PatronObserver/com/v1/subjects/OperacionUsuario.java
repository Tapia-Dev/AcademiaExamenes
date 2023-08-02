package EjemploObserver.com.v1.subjects;

import EjemploObserver.com.v1.observer.Observer;
import EjemploObserver.com.v1.subjects.Subject;

import java.util.ArrayList;
import java.util.List;

public class OperacionUsuario implements Subject {

    // Actúa como el sujeto que será observado.
    private List<Observer> listaObservadores;

    public OperacionUsuario() {
        listaObservadores = new ArrayList<>();
    }

    @Override
    public void attach(Observer o) {
        listaObservadores.add(o);
    }

    @Override
    public void detach(Observer o) {
        listaObservadores.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : listaObservadores) {
            o.update();
        }
    }

}
