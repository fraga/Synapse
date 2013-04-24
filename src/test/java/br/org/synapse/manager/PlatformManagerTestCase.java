package br.org.synapse.manager;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlatformManagerTestCase {
	@Test
	public void testInstanceNotNull(){
		assertNotNull(PlatformManager.getPlatformManager());
	}
	@Test
	public void testGetTotalProcessors() {
		assertEquals(2, PlatformManager.getPlatformManager().getTotalProcessors());
	}

}
