package br.org.synapse.manager;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StateManagerTestCase {
    
    @Before
    public void setUp() throws Exception {
    }
    
    @Test
    public void testInstanceNotNull() {
        assertNotNull(StateManager.getStateManager());
    }
    
}
