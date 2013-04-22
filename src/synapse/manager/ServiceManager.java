package synapse.manager;

public class ServiceManager {
	private static ServiceManager _serviceManager = null;

	public static ServiceManager getServiceManager() {
		if (_serviceManager == null)
			_serviceManager = new ServiceManager();
		
		return _serviceManager;
	}
	
	private ServiceManager() {
		
	}
	
}
