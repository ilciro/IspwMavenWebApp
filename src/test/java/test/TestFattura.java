package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Fattura;

class TestFattura {
	//String nome, String cognome, String via, String com, String numero, float ammontare
	private Fattura f=new Fattura("pippo","pluto","via paperopoli 12","dopo le 12","14",(float)15.6);
	private Fattura f2=new Fattura();;

	@Test
	void testGetNome() {
		f2.setNome("topolino");
		assertEquals("topolino",f2.getNome());
	}

	@Test
	void testGetCognome() {
		f2.setCognome("paperino");
		assertEquals("paperino",f2.getCognome());
		
	}

	@Test
	void testGetVia() {
		assertNotNull(f.getVia());
	}

	@Test
	void testGetCom() {
		assertNotNull(f.getCom());
	}

	@Test
	void testGetNumero() {
		assertNotEquals("0",f.getNumero());
	}

	@Test
	void testGetAmmontare() {
		assertNotEquals(0,f.getAmmontare());
	}

}
