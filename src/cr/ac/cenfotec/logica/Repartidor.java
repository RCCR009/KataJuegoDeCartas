package cr.ac.cenfotec.logica;

import java.util.ArrayList;

public class Repartidor {
	private ArrayList<Carta> naipe;
	
	public Repartidor() {
		naipe = new Naipe().getDeck();
	}
	
	public ArrayList<Carta> getNaipe() {
		return naipe;
	}

	public void setNaipe(ArrayList<Carta> naipe) {
		this.naipe = naipe;
	}

	public Jugador darCarta(Jugador jugador) {
		jugador.setMano(this.naipe.get(0));
		this.naipe.remove(0);
		return jugador;
	}
	
}
