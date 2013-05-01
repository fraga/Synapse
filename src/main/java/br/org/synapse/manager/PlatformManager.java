/*
 * 
 */
package br.org.synapse.manager;

public class PlatformManager {
    private static PlatformManager _platformManager = null;
    
    public static PlatformManager getPlatformManager() {
        if (_platformManager == null)
            _platformManager = new PlatformManager();
        
        return _platformManager;
    }
    
    private PlatformManager() {
        
    }
    
    public int getTotalProcessors() {
        return Runtime.getRuntime().availableProcessors();
    }
}
