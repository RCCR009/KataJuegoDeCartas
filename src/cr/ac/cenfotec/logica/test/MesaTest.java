package cr.ac.cenfotec.logica.test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import cr.ac.cenfotec.logica.Jugador;
import cr.ac.cenfotec.logica.Mesa;
import cr.ac.cenfotec.logica.Repartidor;

public class MesaTest {
	
	Mesa mesa;
	
	@Before
	public void init() {
		mesa = new Mesa();
	}

	@Test
	public void Repartidortest() {
		Repartidor repartidor = new Repartidor();
		mesa.setRepartidor(repartidor);
		Repartidor repartidor2 = new Repartidor();
		mesa.setRepartidor(repartidor2);
		
		assertEquals(repartidor2, mesa.getRepartidor());
		
	}

	@Test
	public void jugadoresTest() throws Exception {		
		Jugador j1 = new Jugador();
		mesa.setJugadores(j1);
		Jugador j2 = new Jugador();
		mesa.setJugadores(j2);
		Jugador j3 = new Jugador();
		mesa.setJugadores(j3);
		Jugador j4 = new Jugador();
		mesa.setJugadores(j4);
		
		ArrayList<Jugador> jugadores = new ArrayList<>();
		jugadores.add(j1);
		jugadores.add(j2);
		jugadores.add(j3);
		jugadores.add(j4);
		
		assertEquals(jugadores, mesa.getJugadores());
		
	}
	
	@Test(expected = Exception.class)
	public void more4PlayersTest() throws Exception {		
		Jugador j1 = new Jugador();
		mesa.setJugadores(j1);
		Jugador j2 = new Jugador();
		mesa.setJugadores(j2);
		Jugador j3 = new Jugador();
		mesa.setJugadores(j3);
		Jugador j4 = new Jugador();
		mesa.setJugadores(j4);
		Jugador j5 = new Jugador();
		mesa.setJugadores(j5);
		
		ArrayList<Jugador> jugadores = new ArrayList<>();
		jugadores.add(j1);
		jugadores.add(j2);
		jugadores.add(j3);
		jugadores.add(j4);
		jugadores.add(j5);
		
		assertEquals(jugadores, mesa.getJugadores());
		
	}
	
	@Test
	public void beginWith0() {
		assertEquals(0,mesa.getJugadores().size());
	}
	
	@Test
	public void empezarAJugar21Test() throws Exception {
		Repartidor repartidor = new Repartidor();
		mesa.setRepartidor(repartidor);
		Jugador j1 = new Jugador();
		mesa.setJugadores(j1);
		Jugador j2 = new Jugador();
		mesa.setJugadores(j2);
		Jugador j3 = new Jugador();
		mesa.setJugadores(j3);
		Jugador j4 = new Jugador();
		mesa.setJugadores(j4);
		
		mesa.empezarAJugar21();
		
		assertEquals(44, repartidor.getNaipe().size());
		assertEquals(2, j1.getMano().size());
		assertEquals(2, j2.getMano().size());
		assertEquals(2, j3.getMano().size());
		assertEquals(2, j4.getMano().size());
				
	}
 	
}
