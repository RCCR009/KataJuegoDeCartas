package cr.ac.cenfotec.logica;

public class Carta {
	private NombreCarta nombre;
	private int valor;
	private Palo palo;
	
	public Carta() {
		super();
	}
	
	public Carta(NombreCarta nombre, Palo palo) {
		this.nombre = nombre;
		this.palo = palo;
		
		switch(nombre){
		case AS:
			valor = 1;
			break;
		case DOS:
			valor = 2;
			break;
		case TRES:
			valor = 3;
			break;
		case CUATRO:
			valor = 4;
			break;
		case CINCO:
			valor = 5;
			break;
		case SEIS:
			valor = 6;
			break;
		case SIETE:
			valor = 7;
			break;
		case OCHO:
			valor = 8;
			break;
		case NUEVE:
			valor = 9;
			break;
		case JOTA:
			valor = 10;
			break;
		case KA:
			valor = 10;
			break;
		case QUINA:
			valor = 10;
			break;
		default:
			break;			
		}
	}
	
	public NombreCarta getNombre() {
		return nombre;
	}

	public void setNombre(NombreCarta nombre) {
		this.nombre = nombre;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	@Override
	public boolean equals(Object obj) {
		return false;
	}
	
	

}
