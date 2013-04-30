package br.org.synapse.test.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.org.synapse.core.Loader;

public class LoaderTestCase {
    private Loader _loader;
    
    @Before
    public void Setup() {
        this.set_loader(new Loader());
    }
    
    @Test
    public void test() {
        Loader loader = new Loader();
        assertNotNull(loader);
    }
    
    public Loader get_loader() {
        return _loader;
    }
    
    public void set_loader(Loader _loader) {
        this._loader = _loader;
    }
    
}
