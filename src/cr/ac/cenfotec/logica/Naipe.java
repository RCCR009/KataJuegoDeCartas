package cr.ac.cenfotec.logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;

public class Naipe {
	
	private ArrayList<Carta> deck = new ArrayList<>();
	
	public Naipe() {
		createDeck();
	}

	public ArrayList<Carta> getDeck() {
		return deck;
	}
	
	private void createDeck(){		
		ArrayList<Palo> paloValues = new ArrayList<Palo>(EnumSet.allOf(Palo.class));
		ArrayList<NombreCarta> nombreValues = new ArrayList<NombreCarta>(EnumSet.allOf(NombreCarta.class));

		for(Palo p:paloValues) {
			for(NombreCarta n:nombreValues) {
				deck.add(new Carta(n,p));
			}
		}
		
		Collections.shuffle(deck);	
	}

}
