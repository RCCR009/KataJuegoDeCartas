package cr.ac.cenfotec.logica;

import java.util.Objects;

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
		case DIEZ: case JOTA: case QUINA: case KA: 
			valor = 10;
			break;
		default:
			break;			
		}
	}
	
	public NombreCarta getNombre() {
		return nombre;
	}

	public void setNombreYValor(NombreCarta nombre) {
		this.nombre = nombre;
		
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
		case JOTA: case QUINA: case KA: 
			valor = 10;
			break;
		default:
			break;			
		}
			
	}

	public int getValor() {
		return valor;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		if(getClass() != obj.getClass()) {
			return false;
		}
		
		Carta carta = (Carta) obj;
		 // field comparison
	    return Objects.equals(valor, carta.valor);
	}
		
}
