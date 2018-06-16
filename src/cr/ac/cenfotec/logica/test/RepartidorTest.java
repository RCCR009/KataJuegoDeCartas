package cr.ac.cenfotec.logica.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import cr.ac.cenfotec.logica.Jugador;
import cr.ac.cenfotec.logica.Repartidor;

public class RepartidorTest {
	
	Repartidor repartidor;
	
	@Before
	public void init() {
		repartidor = new Repartidor();
	}

	@Test
	public void naipeCompletotest() {
		assertEquals(52, repartidor.getNaipe().size());
	}
	
	@Test
	public void orderTest() {
		Repartidor rep2 = new Repartidor();
		assertNotEquals(repartidor.getNaipe(), rep2.getNaipe());
	}
	
	@Test
	public void darCartaTest() {
		Jugador jugador = new Jugador();
		assertEquals(0, jugador.getMano().size());
		//51/1
		repartidor.darCarta(jugador);
		assertEquals(51,repartidor.getNaipe().size());
		assertEquals(1, jugador.getMano().size());
		//50/2
		repartidor.darCarta(jugador);
		assertEquals(50,repartidor.getNaipe().size());
		assertEquals(2, jugador.getMano().size());	
	}
	
}
