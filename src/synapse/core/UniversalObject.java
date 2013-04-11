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
			//Inclui ele como observador de eventos de todas as outras extensoes
			Managers.getState().addObjectObserver(extension, object);
			//Coloca todas as outras extencoes como observador dele
			Managers.getState().addObjectObserver(object, extension);
		}
	}
	
	public List<ISystemObject> getExtensions() {
		if (_extensions == null)
			_extensions = new ArrayList<ISystemObject>();
		
		return _extensions;
	}
	
	public void destroy() {
		//TODO: destruir todos as objetos filhos
	}
}
