package supermarkt;

public class Produkt   {
	
	private String nameProdukt;
	private int preis;
	
	public Produkt (String nameProduktParam, int preisParam) {
		
		this.nameProdukt = nameProduktParam;
		this.preis = preisParam;
	}

	public int getPreis() {
		return preis;
	}

	public String getNameProdukt() {
		return nameProdukt;
	}
	
}
