package cr.ac.cenfotec.logica;

public class Repartidor {
	private Naipe naipe;
	
	public Repartidor() {
		naipe = new Naipe();
	}

	public Naipe getNaipe() {
		return naipe;
	}

	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}
	
}
