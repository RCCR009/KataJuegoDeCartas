package cr.ac.cenfotec.logica;

import java.util.ArrayList;

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
	
	
	
}
