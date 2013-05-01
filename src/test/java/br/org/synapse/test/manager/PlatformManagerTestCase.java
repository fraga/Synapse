package br.org.synapse.test.manager;

import static org.junit.Assert.*;

import org.junit.Test;

import br.org.synapse.manager.PlatformManager;

public class PlatformManagerTestCase {
    @Test
    public void testInstanceNotNull() {
        assertNotNull(PlatformManager.getPlatformManager());
    }
    
    @Test
    public void testGetTotalProcessors() {
        //TODO: Runtime could be extracted to an interface and then we can inject it into a platform
        int expectedProcessors = Runtime.getRuntime().availableProcessors();
        
        assertEquals(expectedProcessors, PlatformManager.getPlatformManager()
                .getTotalProcessors());
    }
    
}
