package br.org.synapse.test.system;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import br.org.synapse.system.Task;

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
