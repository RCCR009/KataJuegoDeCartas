package cr.ac.cenfotec.logica;

import java.util.ArrayList;
import java.util.Collections;

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
	
	public ArrayList<Jugador> GetGanador() throws Exception {
		
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
				}
				lpuntos.add(puntosJugador);
			}
			
			for(int i = 0;i<jugadores.size();i++) {		
				if(lpuntos.get(i) == Collections.max(lpuntos)) {
					ganadores.add(jugadores.get(i));
				}			
			}
			return ganadores;			
		}
		
	}
	
	
		
}
