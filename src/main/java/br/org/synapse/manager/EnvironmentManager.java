/*
 * 
 */
package br.org.synapse.manager;

public class EnvironmentManager {
    private static EnvironmentManager _environmentManager = null;
    
    public static EnvironmentManager getEnvironmentManager() {
        if (_environmentManager == null)
            _environmentManager = new EnvironmentManager();
        
        return _environmentManager;
    }
    
    private EnvironmentManager() {
        
    }
    
}
