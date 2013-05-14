package br.org.synapse.test.mock;

import java.util.List;

import br.org.synapse.core.IObserver;
import br.org.synapse.core.ISubject;
import br.org.synapse.core.ISystemObject;
import br.org.synapse.core.ISystemScene;
import br.org.synapse.core.ITask;
import br.org.synapse.system.Scene;

public class SceneMock extends Scene implements ISystemScene{
    private int _destroyNotifiedFired;
    private int _changeNotifyFired;
    
    public SceneMock() {
    	_destroyNotifiedFired = 0;
    	_changeNotifyFired = 0;
    }
    
    @Override
    public void addObserver(IObserver observer) {
        
    }

    @Override
    public void removeObserver(IObserver observer) {
        
    }

    @Override
    public void changeNotify(ISubject sender) {
        _changeNotifyFired++;
    }

    @Override
    public void destroyNotify(ISubject sender) {
        _destroyNotifiedFired++;
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

	public int get_destroyNotifiedFired() {
	    return _destroyNotifiedFired;
    }

	public void set_destroyNotifiedFired(int _destroyNotifiedFired) {
	    this._destroyNotifiedFired = _destroyNotifiedFired;
    }

	public int get_changeNotifyFired() {
	    return _changeNotifyFired;
    }

	public void set_changeNotifyFired(int _changeNotifyFired) {
	    this._changeNotifyFired = _changeNotifyFired;
    }

}
