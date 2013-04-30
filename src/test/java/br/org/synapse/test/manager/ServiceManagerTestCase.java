package br.org.synapse.test.manager;

import static org.junit.Assert.*;

import org.junit.Test;

import br.org.synapse.manager.ServiceManager;

public class ServiceManagerTestCase {
    
    @Test
    public void testInstanceNotNull() {
        assertNotNull(ServiceManager.getServiceManager());
    }
    
}
