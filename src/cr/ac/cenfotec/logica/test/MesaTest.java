package cr.ac.cenfotec.logica.test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

import cr.ac.cenfotec.logica.Carta;
import cr.ac.cenfotec.logica.Jugador;
import cr.ac.cenfotec.logica.Mesa;
import cr.ac.cenfotec.logica.NombreCarta;
import cr.ac.cenfotec.logica.Palo;
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
	
	@Test
	public void Ganadortest() throws Exception {
		Repartidor repartidor = new Repartidor();
		
		for(int i = 0;i<4;i++) {
			repartidor.getNaipe().remove(i);
		}	
		mesa.setRepartidor(repartidor);
		
		Jugador j1 = new Jugador();
		j1.setNombre("Carlos");
		j1.setMano(new Carta(NombreCarta.KA,Palo.ESCUDOS));
		j1.setMano(new Carta(NombreCarta.JOTA,Palo.ESTRELLAS));
		mesa.setJugadores(j1);
		
		Jugador j2 = new Jugador();
		j2.setNombre("Miguel");
		j2.setMano(new Carta(NombreCarta.AS,Palo.ESCUDOS));
		j2.setMano(new Carta(NombreCarta.DOS,Palo.ESTRELLAS));
		mesa.setJugadores(j2);
		
		assertEquals(j1,mesa.getGanador(new Carta()).get(0));
	}
	
	@Test
	public void Empatetest() throws Exception {
		Repartidor repartidor = new Repartidor();
		ArrayList<Jugador> ganadores = new ArrayList<>();
		
		for(int i = 0;i<4;i++) {
			repartidor.getNaipe().remove(i);
		}
		mesa.setRepartidor(repartidor);
		
		Jugador j1 = new Jugador();
		j1.setNombre("Carlos");
		j1.setMano(new Carta(NombreCarta.KA,Palo.ESCUDOS));
		j1.setMano(new Carta(NombreCarta.JOTA,Palo.ESTRELLAS));
		mesa.setJugadores(j1);
		ganadores.add(j1);
		
		Jugador j2 = new Jugador();
		j2.setNombre("Miguel");
		j2.setMano(new Carta(NombreCarta.DIEZ,Palo.FLORES));
		j2.setMano(new Carta(NombreCarta.QUINA,Palo.GOTAS));
		mesa.setJugadores(j2);
		ganadores.add(j2);
		
		Jugador j3 = new Jugador();
		j3.setNombre("Sander");
		j3.setMano(new Carta(NombreCarta.CUATRO,Palo.FLORES));
		j3.setMano(new Carta(NombreCarta.DOS,Palo.GOTAS));
		mesa.setJugadores(j3);
		
		assertEquals(ganadores,mesa.getGanador(new Carta()));
	}
	
	@Test(expected = Exception.class)
	public void noStartGameException() throws Exception {
		Repartidor repartidor = new Repartidor();	
		mesa.setRepartidor(repartidor);
		
		Jugador j1 = new Jugador();
		mesa.setJugadores(j1);
		
		Jugador j2 = new Jugador();
		mesa.setJugadores(j2);
		
		assertEquals(j1,mesa.getGanador(new Carta()));	
	}
	
	@Test
	public void verificarCambioTest() throws Exception {
		Repartidor repartidor = new Repartidor();
		
		for(int i = 0;i<4;i++) {
			repartidor.getNaipe().remove(i);
		}	
		mesa.setRepartidor(repartidor);
		
		Jugador j1 = new Jugador();
		j1.setNombre("Carlos");
		j1.setMano(new Carta(NombreCarta.KA,Palo.ESCUDOS));
		j1.setMano(new Carta(NombreCarta.TRES,Palo.ESTRELLAS));
		mesa.setJugadores(j1);
		
		Jugador j2 = new Jugador();
		j2.setNombre("Miguel");
		j2.setMano(new Carta(NombreCarta.KA,Palo.ESCUDOS));
		j2.setMano(new Carta(NombreCarta.JOTA,Palo.ESTRELLAS));
		mesa.setJugadores(j2);
		
		assertEquals(true,mesa.verificarCambio(j1.getMano()));
		assertEquals(false,mesa.verificarCambio(j2.getMano()));
	}
	
	@Test
	public void veintiunoMediotest() throws Exception {
		Repartidor repartidor = new Repartidor();
		
		for(int i = 0;i<4;i++) {
			repartidor.getNaipe().remove(i);
		}	
		mesa.setRepartidor(repartidor);
		
		Jugador j1 = new Jugador();
		j1.setNombre("Carlos");
		j1.setMano(new Carta(NombreCarta.KA,Palo.ESCUDOS));
		j1.setMano(new Carta(NombreCarta.DOS,Palo.ESTRELLAS));
		mesa.setJugadores(j1);
		
		Jugador j2 = new Jugador();
		j2.setNombre("Miguel");
		j2.setMano(new Carta(NombreCarta.JOTA,Palo.ESCUDOS));
		j2.setMano(new Carta(NombreCarta.QUINA,Palo.ESTRELLAS));
		mesa.setJugadores(j2);
		
		assertEquals(j1,mesa.getGanador(new Carta()).get(0));
	}
	
	@Test
	public void empateVeintiunoMedioContest() throws Exception {
		Repartidor repartidor = new Repartidor();
		ArrayList<Jugador> ganadores = new ArrayList<>();
		
		for(int i = 0;i<4;i++) {
			repartidor.getNaipe().remove(i);
		}
		mesa.setRepartidor(repartidor);
		
		Jugador j1 = new Jugador();
		j1.setNombre("Carlos");
		j1.setMano(new Carta(NombreCarta.KA,Palo.ESCUDOS));
		j1.setMano(new Carta(NombreCarta.DOS,Palo.ESTRELLAS));
		mesa.setJugadores(j1);
		ganadores.add(j1);
		
		Jugador j2 = new Jugador();
		j2.setNombre("Miguel");
		j2.setMano(new Carta(NombreCarta.DIEZ,Palo.FLORES));
		j2.setMano(new Carta(NombreCarta.DOS,Palo.GOTAS));
		mesa.setJugadores(j2);
		ganadores.add(j2);
		
		Jugador j3 = new Jugador();
		j3.setNombre("Sander");
		j3.setMano(new Carta(NombreCarta.QUINA,Palo.FLORES));
		j3.setMano(new Carta(NombreCarta.KA,Palo.GOTAS));
		mesa.setJugadores(j3);
		
		assertEquals(ganadores,mesa.getGanador(new Carta()));
	}
	
	@Test
	public void comodintest() throws Exception {
		Carta comodin = new Carta(NombreCarta.AS, Palo.ESCUDOS);
		Repartidor repartidor = new Repartidor();
		
		for(int i = 0;i<4;i++) {
			repartidor.getNaipe().remove(i);
		}	
		mesa.setRepartidor(repartidor);
		
		Jugador j1 = new Jugador();
		j1.setNombre("Carlos");
		j1.setMano(new Carta(NombreCarta.KA,Palo.ESCUDOS));
		j1.setMano(new Carta(NombreCarta.DOS,Palo.ESTRELLAS));
		mesa.setJugadores(j1);
		
		Jugador j2 = new Jugador();
		j2.setNombre("Miguel");
		j2.setMano(new Carta(NombreCarta.AS, Palo.ESCUDOS));
		j2.setMano(new Carta(NombreCarta.QUINA,Palo.ESTRELLAS));
		mesa.setJugadores(j2);
		
		assertEquals(j2,mesa.getGanador(comodin).get(0));
	}
	
	@Test
	public void empateComodintest() throws Exception {
		Carta comodin = new Carta(NombreCarta.AS, Palo.ESCUDOS);
		Repartidor repartidor = new Repartidor();
		ArrayList<Jugador> ganadores = new ArrayList<>();
		
		for(int i = 0;i<4;i++) {
			repartidor.getNaipe().remove(i);
		}
		mesa.setRepartidor(repartidor);
		
		Jugador j1 = new Jugador();
		j1.setNombre("Carlos");
		j1.setMano(new Carta(NombreCarta.KA,Palo.ESCUDOS));
		j1.setMano(new Carta(NombreCarta.AS, Palo.ESCUDOS));
		mesa.setJugadores(j1);
		ganadores.add(j1);
		
		Jugador j2 = new Jugador();
		j2.setNombre("Miguel");
		j2.setMano(new Carta(NombreCarta.DIEZ,Palo.FLORES));
		j2.setMano(new Carta(NombreCarta.DOS,Palo.GOTAS));
		mesa.setJugadores(j2);
		
		Jugador j3 = new Jugador();
		j3.setNombre("Sander");
		j3.setMano(new Carta(NombreCarta.QUINA,Palo.FLORES));
		j3.setMano(new Carta(NombreCarta.AS, Palo.ESCUDOS));
		mesa.setJugadores(j3);
		ganadores.add(j3);
		
		assertEquals(ganadores,mesa.getGanador(comodin));
	}
	
	@Test
	public void empezarPartidaDeRontest() throws Exception {
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
		
		mesa.empezarPartidaDeRon();
		
		assertEquals(24, repartidor.getNaipe().size());
		assertEquals(7, j1.getMano().size());
		assertEquals(7, j2.getMano().size());
		assertEquals(7, j3.getMano().size());
		assertEquals(7, j4.getMano().size());			
	}
	
	@Test
	public void tomarCartatest() throws Exception {
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
		
		mesa.empezarPartidaDeRon();
		mesa.tomarCarta();
		
		assertEquals(20, mesa.getRepartidor().getNaipe().size());
		
	}
		
	@Test
	public void manotest() throws Exception {
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
		
		mesa.empezarPartidaDeRon();
		mesa.tomarCarta();
		
		assertEquals(7, mesa.getJugadores().get(0).getMano().size());
		assertEquals(7, mesa.getJugadores().get(1).getMano().size());
		assertEquals(7, mesa.getJugadores().get(2).getMano().size());
		assertEquals(7, mesa.getJugadores().get(3).getMano().size());
		
	}
 	
}
