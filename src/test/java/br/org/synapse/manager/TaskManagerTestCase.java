package br.org.synapse.manager;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaskManagerTestCase {

	@Test
	public void testInstanceNotNull() {
		assertNotNull(TaskManager.getTaskManager());
	}

}
