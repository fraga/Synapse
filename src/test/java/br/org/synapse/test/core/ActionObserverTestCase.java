package br.org.synapse.test.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import br.org.synapse.core.ActionObserver;
import br.org.synapse.test.mock.*;

public class ActionObserverTestCase {
    private ActionObserver _actionObserver;
    
    @Before
    public void Setup(){
        _actionObserver = new ActionObserver();
    }
    
    @Test
    public void testGetObservers() {
        assertNotNull(_actionObserver.getObservers());
    }

    @Test
    public void testAddObserver() {
        ObserverMock obsMock1 = new ObserverMock();
        _actionObserver.addObserver(obsMock1);
        assertFalse(_actionObserver.getObservers().isEmpty());
        assertTrue(_actionObserver.getObservers().contains(obsMock1));
    }

    @Test
    public void testRemoveObserver() {
        ObserverMock obsMock1 = new ObserverMock();
        _actionObserver.addObserver(obsMock1);
        assertTrue(_actionObserver.getObservers().contains(obsMock1));
        _actionObserver.removeObserver(obsMock1);
        assertTrue(_actionObserver.getObservers().isEmpty());
    }

    @Ignore
    public void testFireChangeEvent() {
        fail("Not yet implemented");
    }

    @Ignore
    public void testFiredDestroyEvent() {
        fail("Not yet implemented");
    }

}
