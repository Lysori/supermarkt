package supermarkt;

import java.util.ArrayList;

public class Kasse {

	private int zwischenSumme = 0;
	private ArrayList<Produkt> einkaufsWagen = new ArrayList<>(); //leere ArrayList erzeugen
	
	
	public int getZwischenSumme() {
		return zwischenSumme;
	}
	
	public void scan(Produkt produktParam) {	
		this.zwischenSumme += produktParam.getPreis();
		this.einkaufsWagen.add(produktParam);
	}

	public ArrayList<Produkt> getEinkaufswagen() {
		return this.einkaufsWagen;
	}
}
