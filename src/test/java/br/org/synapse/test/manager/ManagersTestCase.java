package br.org.synapse.test.manager;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import br.org.synapse.manager.EnvironmentManager;
import br.org.synapse.manager.Managers;
import br.org.synapse.manager.PlatformManager;
import br.org.synapse.manager.ServiceManager;
import br.org.synapse.manager.StateManager;
import br.org.synapse.manager.TaskManager;

public class ManagersTestCase {

    @Ignore
    public void testLoadManagers() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetTask() {
        assertNotNull(Managers.getTask());
        assertEquals(TaskManager.class, Managers.getTask().getClass());
    }

    @Test
    public void testGetState() {
        assertNotNull(Managers.getState());
        assertEquals(StateManager.class, Managers.getState().getClass());
    }

    @Test
    public void testGetService() {
        assertNotNull(Managers.getService());
        assertEquals(ServiceManager.class, Managers.getService().getClass());
    }

    @Test
    public void testGetEnvironment() {
        assertNotNull(Managers.getEnvironment());
        assertEquals(EnvironmentManager.class, Managers.getEnvironment().getClass());
    }

    @Test
    public void testGetPlatform() {
        assertNotNull(Managers.getPlatform());
        assertEquals(PlatformManager.class, Managers.getPlatform().getClass());
    }

}
