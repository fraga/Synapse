package br.org.synapse.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import br.org.synapse.mock.ObserverMock;

public class ClockTestCase {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Clock.getClock().tick();
		Clock.getClock().tick();
	}

	@Test
	public void testGetClock() {
		assertNotNull(Clock.getClock());
	}

	@Test
	public void testGetNumber() {
		assertEquals(2, Clock.getClock().getNumber());
	}

	@Test
	public void testTick() {
		assertEquals(2, Clock.getClock().getNumber());
	}

}
