package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Negozio;

class TestNegozio {
	private Negozio n1=new Negozio();
	
	
	@Test
	void testGetNome() {
		n1.setNome("Negozio E");
		assertEquals("Negozio E",n1.getNome());
	}

	@Test
	void testGetVia() {
		n1.setVia("via papaveri 15");
		assertEquals("via papaveri 15",n1.getVia());
	}

	@Test
	void testGetIsValid() {
		n1.setIsValid(false);
		assertNotEquals(true,n1.getIsValid());
	}

	@Test
	void testGetIsOpen() {
		n1.setIsOpen(true);
		assertNotEquals(false,n1.getIsOpen());
	}

}
