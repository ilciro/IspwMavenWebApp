package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.itextpdf.text.DocumentException;

import model.raccolta.Rivista;

class TestRivista {
	private Rivista r=new Rivista();

	@Test
	void testGetTitolo() {
		r.setTitolo("prova");
		assertEquals("prova",r.getTitolo());
	}

	@Test
	void testGetTipologia() {
		r.setTipologia("MENSILE");
		assertEquals("MENSILE",r.getTipologia());
	}

	@Test
	void testGetAutore() {
		r.setAutore("prova");
		assertEquals("prova",r.getAutore());
	}

	@Test
	void testGetLingua() {
		r.setLingua("ita");
		assertEquals("ita",r.getLingua());
	}

	@Test
	void testGetEditore() throws FileNotFoundException, ClassNotFoundException, SQLException {
		r.setEditore("prova");
		assertEquals("prova",r.getEditore());
	}

	@Test
	void testGetDescrizione() {
		r.setDescrizione("prova");
		assertEquals("prova",r.getDescrizione());
	}

	@Test
	void testGetDataPubb() {
		r.setDataPubb(LocalDate.now());
		assertNotNull(r.getDataPubb());
	}

	@Test
	void testGetDisp() {
		r.setDisp(0);
		assertNotEquals(1,r.getDisp());
	}

	@Test
	void testGetPrezzo() {
		r.setPrezzo((float)1.68);
		assertNotEquals(0,r.getPrezzo());
	}

	@Test
	void testGetCopieRim() {
		r.setCopieRim(0);
		assertEquals(0,r.getCopieRim());
	}

	@Test
	void testGetId() {
		r.setId(1);
		assertNotEquals(0,r.getId());
	}

	@Test
	void testScarica() throws DocumentException, IOException
	{
		r.setId(1);
		r.scarica();
		assertEquals(1,r.getId());
	}
	@Test
	void testLeggi() throws IOException, DocumentException
	{
		int id=1;
		r.leggi(id);
		assertEquals(1,id);
	}

}
