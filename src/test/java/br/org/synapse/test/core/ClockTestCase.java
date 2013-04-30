package br.org.synapse.test.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.org.synapse.core.Clock;

public class ClockTestCase {
    
    @Before
    public void ResetClock() {
        Clock.getClock().reset();
    }
    
    public void TickNTimes(int n) {
        for (int i = 0; i < n; i++)
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
