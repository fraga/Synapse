package synapse.core;

import java.util.List;

public interface ISystemScene extends ISubject, IObserver {
	int getID();
	ISystemObject createObject();
	void destroyObject(ISystemObject obj);
	List<ISystemObject> getObjects();
	ITask getPrimaryTask();
}
