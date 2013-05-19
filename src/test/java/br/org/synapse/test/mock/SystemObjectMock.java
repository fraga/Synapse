package br.org.synapse.test.mock;

import br.org.synapse.core.IObserver;
import br.org.synapse.core.ISubject;
import br.org.synapse.core.ISystemObject;

public class SystemObjectMock implements ISystemObject{

    @Override
    public void addObserver(IObserver observer) {
        
    }

    @Override
    public void removeObserver(IObserver observer) {
        
    }

    @Override
    public void changeNotify(ISubject sender) {
        
    }

    @Override
    public void destroyNotify(ISubject sender) {
        
    }

    @Override
    public int getID() {
        return 987654321;
    }

}
