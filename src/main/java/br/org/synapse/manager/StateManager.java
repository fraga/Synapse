/*
 * 
 */
package br.org.synapse.manager;

import java.util.Dictionary;
import java.util.Hashtable;

import br.org.synapse.core.ActionObserver;
import br.org.synapse.core.ISystemObject;
import br.org.synapse.core.IObserver;
import br.org.synapse.core.ISystemScene;
import br.org.synapse.core.ISubject;

public class StateManager implements IObserver {
    private static StateManager _stateManager = null;
    private Dictionary<ISystemScene, ActionObserver> _sceneSubjects;
    private Dictionary<ISystemObject, ActionObserver> _objectSubjects;
    
    public static StateManager getStateManager() {
        if (_stateManager == null)
            _stateManager = new StateManager();
        
        return _stateManager;
    }
    
    private StateManager() {
        
    }
    
    public Dictionary<ISystemScene, ActionObserver> getSceneSubjects() {
        if (_sceneSubjects == null)
            _sceneSubjects = new Hashtable<ISystemScene, ActionObserver>();
        
        return _sceneSubjects;
    }
    
    public Dictionary<ISystemObject, ActionObserver> getObjectSubjects() {
        if (_objectSubjects == null)
            _objectSubjects = new Hashtable<ISystemObject, ActionObserver>();
        
        return _objectSubjects;
    }
    
    public void addSceneSubject(ISystemScene subject) {
        if (getSceneSubjects().get(subject) == null) {
            getSceneSubjects().put(subject, new ActionObserver());
            subject.addObserver(this);
        }
    }
    
    public void removeSceneSubject(ISystemScene subject) {
        getSceneSubjects().remove(subject);
    }
    
    public void addSceneObserver(ISystemScene subject, IObserver observer) {
        if (getSceneSubjects().get(subject) == null)
            addSceneSubject(subject);
        
        getSceneSubjects().get(subject).addObserver(observer);
    }
    
    public void removeSceneObserver(ISystemScene subject, IObserver observer) {
        ActionObserver actionObserver = getSceneSubjects().get(subject);
        if (actionObserver != null)
            actionObserver.removeObserver(observer);
    }
    
    public void addObjectSubject(ISystemObject subject) {
        if (getObjectSubjects().get(subject) == null) {
        	//TODO: refactor this so ActionObserver is not created here
            getObjectSubjects().put(subject, new ActionObserver());
            subject.addObserver(this);
        }
    }
    
    public void addObjectObserver(ISystemObject subject, IObserver observer) {
        if (getObjectSubjects().get(subject) == null)
            addObjectSubject(subject);
        
        getObjectSubjects().get(subject).addObserver(observer);
    }
    
    public void removeObjectObserver(ISystemObject subject, IObserver observer) {
        ActionObserver actionObserver = getObjectSubjects().get(subject);
        if (actionObserver != null)
            actionObserver.removeObserver(observer);
    }
    
    public void removeObjectSubject(ISystemObject subject) {
        getObjectSubjects().remove(subject);
    }
    
    public void sceneChangeNotify(ISystemScene sender) {
        ActionObserver actionObserver = getSceneSubjects().get(sender);
        if (actionObserver != null)
            actionObserver.fireChangeEvent(sender);
    }
    
    public void sceneDestroyNotify(ISystemScene sender) {
        ActionObserver actionObserver = getSceneSubjects().get(sender);
        if (actionObserver != null) {
            actionObserver.firedDestroyEvent(sender);
            removeSceneSubject(sender);
        }
    }
    
    public void objectChangeNotify(ISystemObject sender) {
        ActionObserver actionObserver = getObjectSubjects().get(sender);
        if (actionObserver != null)
            actionObserver.fireChangeEvent(sender);
    }
    
    public void objectDestroyNotify(ISystemObject sender) {
        ActionObserver actionObserver = getObjectSubjects().get(sender);
        if (actionObserver != null) {
            actionObserver.firedDestroyEvent(sender);
            removeObjectSubject(sender);
        }
    }
    
    @Override
    public void changeNotify(ISubject sender) {
        ActionObserver actionObserver = getSceneSubjects().get(sender);
        if (actionObserver != null)
            actionObserver.fireChangeEvent(sender);
        else {
            actionObserver = getObjectSubjects().get(sender);
            if (actionObserver != null)
                actionObserver.fireChangeEvent(sender);
        }
    }
    
    @Override
    public void destroyNotify(ISubject sender) {
        ActionObserver actionObserver = getSceneSubjects().get(sender);
        if (actionObserver != null) {
            actionObserver.firedDestroyEvent(sender);
            removeSceneSubject((ISystemScene) sender);
        } else {
            actionObserver = getObjectSubjects().get(sender);
            if (actionObserver != null) {
                actionObserver.firedDestroyEvent(sender);
                removeObjectSubject((ISystemObject) sender);
            }
        }
    }
}
