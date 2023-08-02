package EjemploObserver.com.v1.subjects;

import EjemploObserver.com.v1.observer.Observer;

public interface Subject {
        void attach(Observer o);
        void detach(Observer o);
        void notifyObservers();
}

