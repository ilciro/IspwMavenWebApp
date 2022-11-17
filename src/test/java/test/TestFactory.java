package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import model.raccolta.Factory;

class TestFactory {
	private Factory f=new Factory();

	@Test
	void testCreateRaccoltaFinaleCompletaL() {
		f.createRaccoltaFinale1("libro","provaL","FUMETTI","prova","it", "prova","FUMETTI");
		f.createRaccoltaFinale2("libro",150,"1426351", 200, 1, (float)1.65, 100);
		assertNotNull(f.createRaccoltaFinaleCompleta("libro",LocalDate.now(), "prova", "prova", 15));
		
	}
	@Test
	void testCreateRaccoltaFinaleCompletaG() {
		f.createRaccoltaFinale1("giornale", "provaG", "quotidiano","prova", "ita","prova","quotidiano");
		f.createRaccoltaFinale2("giornale", 0, "85225", 150, 1, (float)1.80, 50);
		assertNotNull(f.createRaccoltaFinaleCompleta("giornale",LocalDate.now(), "prova", "prova",20));
		
	}
	@Test
	void testCreateRaccoltaFinaleCompletaR() {
		f.createRaccoltaFinale1("rivista","provaR","MENSILE","prova","ita","prova", null);
		f.createRaccoltaFinale2("rivista", 50, null, 100, 1, (float)1.25, 50);
		assertNotNull(f.createRaccoltaFinaleCompleta("rivista",LocalDate.now(), "prova", "prova",30));
		
	}

	
}
