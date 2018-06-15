package cr.ac.cenfotec.logica.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cr.ac.cenfotec.logica.Carta;
import cr.ac.cenfotec.logica.Palo;
import cr.ac.cenfotec.logica.NombreCarta;

public class CartaTest {
	
	Carta carta;
	
	@Before
	public void init() {
		carta = new Carta();
	}

	@Test
	public void testVerificarDatosCarta() {
		assertNotNull(carta = new Carta(NombreCarta.AS, Palo.ESCUDOS));		
	}

}
