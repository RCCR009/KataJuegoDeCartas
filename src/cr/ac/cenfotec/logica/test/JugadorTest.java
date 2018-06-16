package cr.ac.cenfotec.logica.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cr.ac.cenfotec.logica.Jugador;

public class JugadorTest {
	
	Jugador jugador;
	
	@Before
	public void init() {
		jugador = new Jugador();
	}
	
	@Test
	public void test() {
		assertNotNull(jugador);
	}

}
