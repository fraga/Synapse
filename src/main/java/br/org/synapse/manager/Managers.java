/*
 * 
 */
package br.org.synapse.manager;

public final class Managers {
    public static void loadManagers() {
        
    }
    
    public static TaskManager getTask() {
        return TaskManager.getTaskManager();
    }
    
    public static StateManager getState() {
        return StateManager.getStateManager();
    }
    
    public static ServiceManager getService() {
        return ServiceManager.getServiceManager();
    }
    
    public static EnvironmentManager getEnvironment() {
        return EnvironmentManager.getEnvironmentManager();
    }
    
    public static PlatformManager getPlatform() {
        return PlatformManager.getPlatformManager();
    }
}
