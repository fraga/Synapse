package br.org.synapse.core;

import java.util.ArrayList;
import java.util.List;

public class ActionObserver {
    private List<IObserver> _observers = null;
    
    public List<IObserver> getObservers() {
        if (_observers == null)
            _observers = new ArrayList<IObserver>();
        
        return _observers;
    }
    
    public void addObserver(IObserver observer) {
        getObservers().add(observer);
    }
    
    public void removeObserver(IObserver observer) {
        getObservers().remove(observer);
    }
    
    public void fireChangeEvent(ISubject sender) {
        for (IObserver observer : getObservers())
            observer.changeNotify(sender);
    }
    
    public void firedDestroyEvent(ISubject sender) {
        for (IObserver observer : getObservers())
            observer.destroyNotify(sender);
    }
}
