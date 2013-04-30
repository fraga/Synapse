package br.org.synapse.test.manager;

import junit.framework.TestCase;

import org.junit.Test;

import br.org.synapse.manager.EnvironmentManager;

public class EnvironmentManagerTestCase extends TestCase {
    @Test
    public void testInstanceNotNull() {
        assertNotNull(EnvironmentManager.getEnvironmentManager());
    }
    
}
