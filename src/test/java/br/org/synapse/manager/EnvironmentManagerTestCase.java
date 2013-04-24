package br.org.synapse.manager;

import junit.framework.TestCase;

import org.junit.Test;

public class EnvironmentManagerTestCase extends TestCase {
	@Test
	public void testInstanceNotNull(){
		assertNotNull(EnvironmentManager.getEnvironmentManager());
	}

}
