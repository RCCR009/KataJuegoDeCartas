package cr.ac.cenfotec.logica.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import cr.ac.cenfotec.logica.Repartidor;

public class RepartidorTest {
	
	Repartidor repartidor;
	
	@Before
	public void init() {
		repartidor = new Repartidor();
	}

	@Test
	public void naipeCompletotest() {
		assertEquals(52, repartidor.getNaipe().getDeck().size());
	}
	
	@Test
	public void orderTest() {
		Repartidor rep2 = new Repartidor();
		assertNotEquals(repartidor.getNaipe().getDeck(), rep2.getNaipe().getDeck());
	}
	
}
