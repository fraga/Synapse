package br.org.synapse.test.core;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.org.synapse.core.ActionObserver;
import br.org.synapse.test.mock.ObserverMock;

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

    @Test
    public void testFireChangeEvent() {
        ObserverMock obsMock1 = new ObserverMock();
        _actionObserver.addObserver(obsMock1);
        _actionObserver.fireChangeEvent(null);
        assertSame(1, obsMock1.get_changeNotifyFired());
    }

    @Test
    public void testFiredDestroyEvent() {
        ObserverMock obsMock1 = new ObserverMock();
        _actionObserver.addObserver(obsMock1);
        _actionObserver.firedDestroyEvent(null);
        assertSame(1, obsMock1.get_destroyNotifyFired());
    }

}
