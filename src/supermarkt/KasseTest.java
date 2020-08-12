package supermarkt;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class KasseTest {
	//2. Produkt wird von der Kasse gescannt -> korrekte Werte für getZwischenSumme testen
	
		@Test
		public void mehrereProdukteScannen() {
			
			//1. Vorbereitung Testdaten
			
			Kasse kasse = new Kasse();
			Produkt apfel = new Produkt ("Apfel", 30);
			Produkt banane = new Produkt ("Banane", 80);
			Produkt schokoladenEis = new Produkt ("schokoladenEis" , 499);
			Produkt pistazienEis = new Produkt ("Pistazieneis", 950);
			
			//2. Ausführung Programmlogik
			kasse.scan(apfel);
			kasse.scan(banane);
			kasse.scan(banane);
			kasse.scan(schokoladenEis);
			kasse.scan(pistazienEis);
			
			
			//3.Ergebnisse mit den zu erwartenden Werten vergleichen
			Assert.assertEquals((apfel.getPreis() + 2 * banane.getPreis()) + schokoladenEis.getPreis()
			+ pistazienEis.getPreis(), kasse.getZwischenSumme(), 0.01);
			
		}
		
		@Test
		public void nichtsGescannt() {
			
			//1. Vorbereitung Testdaten
			Kasse kasse = new Kasse();
			
			Assert.assertEquals(0, kasse.getZwischenSumme(), 0.01);
		}
		
		@Test
		public void einkaufswagen() {
			
			//1. Vorbereitung Testdaten
			
			Kasse kasse = new Kasse();
			Produkt apfel = new Produkt ("Apfel", 30);
			Produkt banane = new Produkt ("Banane", 80);
			
			//2. Ausführung Programmlogik
			kasse.scan(apfel);
			kasse.scan(banane);
			kasse.scan(banane);
			
			ArrayList<Produkt> produkte = kasse.getEinkaufswagen();

			
			//3. Erwartungswerte vergleichen
			Assert.assertEquals(3, produkte.size());
			
			for(Produkt p : produkte) {
				System.out.println(p.getNameProdukt() + " " + p.getPreis() + " cent");
				
			}
			System.out.println("Versteckte Nachricht an Lisa");
			System.out.println("Versteckte Nachricht an Lisa: HUHU");
}
}