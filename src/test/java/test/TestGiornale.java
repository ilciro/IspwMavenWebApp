package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.itextpdf.text.DocumentException;

import model.raccolta.Giornale;

class TestGiornale {
	private Giornale g=new Giornale();

	@Test
	void testGetTitolo() {
		g.setTitolo("giornale 1");
		assertEquals("giornale 1",g.getTitolo());
	}

	@Test
	void testGetTipologia() {
		g.setTipologia("quotidiano");
		assertEquals("quotidiano",g.getTipologia());
	}

	@Test
	void testGetLingua() {
		g.setLingua("ita");
		assertEquals("ita",g.getLingua());
	}

	@Test
	void testGetEditore() {
		g.setEditore("prova");
		assertEquals("prova",g.getEditore());
	}

	@Test
	void testGetDataPubb() {
		g.setDataPubb(LocalDate.now());
		assertNotNull(g.getDataPubb());
	}

	@Test
	void testGetCopieRimanenti() {
		g.setCopieRimanenti(105);
		assertEquals(105,g.getCopieRimanenti());
	}

	@Test
	void testGetDisponibilita() {
		g.setDisponibilita(0);
		assertEquals(0,g.getDisponibilita());
	}

	@Test
	void testGetPrezzo() {
		g.setPrezzo((float)1.36);
		assertNotEquals(0,g.getPrezzo());
	}

	@Test
	void testGetId() {
		g.setId(5);
		assertNotEquals(0,g.getId());
	}

	@Test
	void testScarica() throws DocumentException, IOException
	{
		g.setId(1);
		g.scarica();
		assertEquals(1,g.getId());
	}
	@Test
	void testLeggi() throws IOException, DocumentException
	{
		int id=1;
		g.leggi(id);
		assertEquals(1,id);
	}


}
