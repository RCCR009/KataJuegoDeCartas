package cr.ac.cenfotec.logica.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cr.ac.cenfotec.logica.Naipe;

public class NaipeTest {
	
	Naipe naipe;
	
	@Before
	public void init() {
		naipe = new Naipe();
	}

	@Test
	public void deckNumbertest() {
		assertEquals(52, naipe.getDeck().size());
	}
	

}
