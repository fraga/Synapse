package br.org.synapse.test.manager;

import static org.junit.Assert.*;

import org.junit.Test;

import br.org.synapse.manager.TaskManager;

public class TaskManagerTestCase {
    
    @Test
    public void testInstanceNotNull() {
        assertNotNull(TaskManager.getTaskManager());
    }
    
}
