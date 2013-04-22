package synapse.core;

import java.util.ArrayList;
import java.util.List;

import synapse.manager.Managers;

public class UniversalScene {
	private List<ISystemScene> _extensions;
	private List<UniversalObject> _universalObjects;
	
	public void addExtension(ISystemScene scene) {
		getExtensions().add(scene);
		Managers.getState().addSceneSubject(scene);
		
		for (ISystemObject object : scene.getObjects()) {
			UniversalObject universalObject = new UniversalObject();
			universalObject.addExtension(object);
			
			addUniversalObject(universalObject);
			//parent scene observes child scenes
			Managers.getState().addObjectObserver(object, scene);
		}
			
	}
	
	public List<ISystemScene> getExtensions() {
		if (_extensions == null)
			_extensions = new ArrayList<ISystemScene>();
		
		return _extensions;
	}
	
	public void addUniversalObject(UniversalObject object) {
		getUniversalObjects().add(object);
	}
	
	public List<UniversalObject> getUniversalObjects() {
		if (_universalObjects == null)
			_universalObjects = new ArrayList<UniversalObject>();
		
		return _universalObjects;
	}
	
	public void destroy() {
		//TODO: Destroy all child scenes here
	}
}
