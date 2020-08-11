package supermarkt;

import org.junit.Assert;
import org.junit.Test;

public class ProduktTest {

	//1. Produkt wird mit Name und Preis konstruiert -> Test für Produktkonstruktor
	@Test
	public void testProduktNamePreis() {
		
		//1. Vorbereitung Testdaten und 2. Ausführung Programmlogik
		String name = "Apfel";
		int preis = 50;
		
		Produkt produkt = new Produkt(name, preis);

		//3. Ergebnisse mit den zu erwartenden Werten vergleichen
		
		Assert.assertEquals(name, produkt.getNameProdukt());
		Assert.assertEquals(50,  produkt.getPreis(), 0.01);
	
		
	}
	
}

