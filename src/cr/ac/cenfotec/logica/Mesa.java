package cr.ac.cenfotec.logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Mesa {
	
	Repartidor repartidor;
	ArrayList<Jugador> jugadores = new ArrayList<>();

	public Mesa() {
		
	}
	
	public Mesa(Repartidor repartidor, ArrayList<Jugador> jugadores ) {
		this.repartidor = repartidor;
		this.jugadores = jugadores;
	}

	public Repartidor getRepartidor() {
		return repartidor;
	}

	public void setRepartidor(Repartidor repartidor) {
		this.repartidor = repartidor;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador jugador) throws Exception {
		if(jugadores.size() < 4) {
			this.jugadores.add(jugador);
		}else {
			throw new Exception("This game is only for 4 players");
		}
	}
	
	public void empezarAJugar21() {
		for(int i = 0; i<2; i++) {
			for(Jugador j: jugadores) {
				repartidor.darCarta(j);
			}
		}
	}
	
	public ArrayList<Jugador> getGanador(Carta comodin) throws Exception {
		
		if(this.repartidor.getNaipe().size() == 52) {
			throw new Exception("No game");
		}else {
			ArrayList<Integer> lpuntos = new ArrayList<>();
			ArrayList<Jugador> ganadores = new ArrayList<>();
			int puntosJugador;
			
			for(Jugador j:jugadores) {
				puntosJugador = 0;
				for(Carta c:j.getMano()) {
					puntosJugador += c.getValor();
					
					if(c.equals(comodin)) {
						ganadores.add(j);
					}	
				}
				lpuntos.add(puntosJugador);
			}		
			
			winWith12(lpuntos, ganadores);				
			morePointsToWin(lpuntos, ganadores);
				
			return ganadores;			
		}		
	}

	private void winWith12(ArrayList<Integer> lpuntos, ArrayList<Jugador> ganadores) {
		if(ganadores.isEmpty()) {
			for(int i = 0;i<jugadores.size();i++) {		
				if(lpuntos.get(i) == 12) {
					ganadores.add(jugadores.get(i));
				}			
			}
		}
	}
	
	private void morePointsToWin(ArrayList<Integer> lpuntos, ArrayList<Jugador> ganadores) {
		if(ganadores.isEmpty()) {
			for(int i = 0;i<jugadores.size();i++) {		
				if(lpuntos.get(i) == Collections.max(lpuntos)) {
					ganadores.add(jugadores.get(i));
				}			
			}				
		}
	}

	public boolean verificarCambio(ArrayList<Carta> mano) {
		int puntos = 0;
		boolean cambio = false;
		
		for(Carta c:mano) {
			if(c.getNombre() == NombreCarta.JOTA || c.getNombre() == NombreCarta.QUINA || 
					c.getNombre() == NombreCarta.KA || c.getNombre() == NombreCarta.TRES) {
				puntos += c.getValor();
			}
		}
		
		if(puntos == 13) {
			cambio = true;
		}
		
		return cambio;
	}

	public void empezarPartidaDeRon() {
		for(int i = 0; i<7; i++) {
			for(Jugador j: jugadores) {
				repartidor.darCarta(j);
			}
		}	
	}
	
	public void tomarCarta() throws Exception {
		if(this.repartidor.getNaipe().size() == 52) {
			throw new Exception("No game");
		}else {
			ArrayList<Carta> deck = repartidor.getNaipe();
			Random randomGenerator = new Random();
			int index;		
			
			for(Jugador j:jugadores) {
				index = randomGenerator.nextInt(j.getMano().size());
				j.getMano().remove(index);
				j.getMano().add(deck.get(0));
				deck.remove(0);
			}
			repartidor.setNaipe(deck);	
		}
	}

	public void resetGame() {
		this.jugadores = new ArrayList<>();
		this.repartidor = new Repartidor();
	}
		
}
