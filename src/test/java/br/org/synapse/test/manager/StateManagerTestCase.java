package br.org.synapse.test.manager;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.org.synapse.manager.StateManager;
import br.org.synapse.test.mock.ObserverMock;
import br.org.synapse.test.mock.SystemObjectMock;

public class StateManagerTestCase {
    
    @Before
    public void setUp() throws Exception {
    }
    
    @Test
    public void testInstanceNotNull() {
        assertNotNull(StateManager.getStateManager());
    }
    
    @Test
    public void testGetSceneSubjectsNotNull() {
        assertNotNull(StateManager.getStateManager().getSceneSubjects());
    }
    
    @Test
    public void testGetObjectSubjectsNotNull() {
        assertNotNull(StateManager.getStateManager().getObjectSubjects());
    }
    
    @Test
    public void testAddObjectObserver() {
        ObserverMock observerMock = new ObserverMock();
        SystemObjectMock systemObjectMock = new SystemObjectMock();
        
        StateManager.getStateManager().addObjectObserver(systemObjectMock, observerMock);
        assertTrue(StateManager.getStateManager().getObjectSubjects().get(systemObjectMock).getObservers().contains(observerMock));
    }
    
}
