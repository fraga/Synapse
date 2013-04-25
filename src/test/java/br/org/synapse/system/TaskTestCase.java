package br.org.synapse.system;

import static org.junit.Assert.*;

import javax.xml.ws.ServiceMode;

import org.junit.Before;
import org.junit.Test;

public class TaskTestCase {
    private Task _task;
    
    @Before
    public void initializeTask() {
        set_task(new Task());
    }
    
    @Test
    public void testInstanceNotNull() {
        assertNotNull(get_task());
    }
    
    @Test
    public void testHasSubTask() {
        assertFalse(get_task().hasSubTask());
    }
    
    @Test
    public void testGetSubTask() {
        assertNull(get_task().getSubTask());
    }
    
    public Task get_task() {
        return _task;
    }
    
    public void set_task(Task _task) {
        this._task = _task;
    }
    
}
