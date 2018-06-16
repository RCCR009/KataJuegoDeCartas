package cr.ac.cenfotec.logica;

import java.util.ArrayList;

public class Jugador {
	
	private String nombre;
	private ArrayList<Carta> mano;
	
	public Jugador() {
		super();
		mano = new ArrayList<>();
	}
		
	public Jugador(String nombre, ArrayList<Carta> mano) {
		super();
		this.nombre = nombre;
		this.mano = mano;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Carta> getMano() {
		return mano;
	}

	public void setMano(Carta carta) {
		this.mano.add(carta);
	}
	
}
