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
	
	@Before
	public void ResetClock(){
	    Clock.getClock().reset();
	}
	
	public void TickNTimes(int n){
	    for(int i =0;i<n;i++)
	        Clock.getClock().tick();
	}

	@Test
	public void testGetClock() {
		assertNotNull(Clock.getClock());
	}

	@Test
	public void testGetNumber() {
		assertEquals(0, Clock.getClock().getNumber());
		Clock.getClock().tick();
		assertEquals(1, Clock.getClock().getNumber());
	}

	@Test
	public void testTick() {
	    assertEquals(0, Clock.getClock().getNumber());
	    TickNTimes(10);
		assertEquals(10, Clock.getClock().getNumber());
	}
	
	@Test
	public void testReset() {
	    TickNTimes(20);
	    Clock.getClock().reset();
	    assertEquals(0, Clock.getClock().getNumber());
	}

}
