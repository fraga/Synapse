package br.org.synapse.manager;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceManagerTestCase {

	@Test
	public void testInstanceNotNull() {
		assertNotNull(ServiceManager.getServiceManager());
	}

}
