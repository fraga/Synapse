package synapse.core;

import java.util.ArrayList;
import java.util.List;

import synapse.manager.Managers;

public class UniversalObject {
	private int _ID = 0;
	private List<ISystemObject> _extensions;
	
	public int getID() {
		return _ID;
	}
	
	public void addExtension(ISystemObject object) {
		getExtensions().add(object);
		Managers.getState().addObjectSubject(object);
		for (ISystemObject extension : getExtensions()) {		
			//observes extensions events
			Managers.getState().addObjectObserver(extension, object);
			//being observed by extensions
			Managers.getState().addObjectObserver(object, extension);
		}
	}
	
	public List<ISystemObject> getExtensions() {
		if (_extensions == null)
			_extensions = new ArrayList<ISystemObject>();
		
		return _extensions;
	}
	
	public void destroy() {
		//TODO: Destroy all child objects here
	}
}
