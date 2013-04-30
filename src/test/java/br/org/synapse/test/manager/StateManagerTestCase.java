package br.org.synapse.test.manager;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.org.synapse.manager.StateManager;

public class StateManagerTestCase {
    
    @Before
    public void setUp() throws Exception {
    }
    
    @Test
    public void testInstanceNotNull() {
        assertNotNull(StateManager.getStateManager());
    }
    
}
