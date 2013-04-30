package br.org.synapse.test.mock;

import br.org.synapse.core.IObserver;
import br.org.synapse.core.ISubject;

public class ObserverMock implements IObserver {
    private int _changeNotifyFired;
    private int _destroyNotifyFired;
    
    public ObserverMock(){
        set_changeNotifyFired(0);
        set_destroyNotifyFired(0);
    }
    
    @Override
    public void changeNotify(ISubject sender) {
        set_changeNotifyFired(get_changeNotifyFired() + 1);
    }
    
    @Override
    public void destroyNotify(ISubject sender) {
        set_destroyNotifyFired(get_destroyNotifyFired() + 1);
    }

    public int get_changeNotifyFired() {
        return _changeNotifyFired;
    }

    public void set_changeNotifyFired(int _changeNotifyFired) {
        this._changeNotifyFired = _changeNotifyFired;
    }

    public int get_destroyNotifyFired() {
        return _destroyNotifyFired;
    }

    public void set_destroyNotifyFired(int _destroyNotifyFired) {
        this._destroyNotifyFired = _destroyNotifyFired;
    }
    
}
