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
	public void VerificarDatosCartatest() {
		assertNotNull(carta = new Carta(NombreCarta.AS, Palo.ESCUDOS));		
	}
	
	@Test
	public void equalstest() {
		carta = new Carta(NombreCarta.JOTA, Palo.ESCUDOS);
		Carta carta2 = new Carta(NombreCarta.QUINA, Palo.GOTAS);
		Carta carta3 = new Carta(NombreCarta.AS, Palo.ESCUDOS);
		
		assertEquals(true, carta.equals(carta2));
		assertEquals(false, carta.equals(carta3));
		
	}

}
