package br.org.synapse.test.mock;

import java.util.List;

import br.org.synapse.core.IObserver;
import br.org.synapse.core.ISubject;
import br.org.synapse.core.ISystemObject;
import br.org.synapse.core.ISystemScene;
import br.org.synapse.core.ITask;
import br.org.synapse.system.Scene;

public class SceneMock extends Scene implements ISystemScene{
    
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
        return 1234567;
    }

    @Override
    public ISystemObject createObject() {
        return null;
    }

    @Override
    public void destroyObject(ISystemObject obj) {
        
    }

    @Override
    public List<ISystemObject> getObjects() {
        return null;
    }

    @Override
    public ITask getPrimaryTask() {
        return null;
    }

}
