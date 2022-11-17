package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.itextpdf.text.DocumentException;

import model.raccolta.Libro;

class TestLibro {
	private Libro l=new Libro();

	@Test
	void testGetTitolo() {
		l.setTitolo("prova");
		assertEquals("prova",l.getTitolo());
	}

	@Test
	void testGetCodIsbn() {
		l.setCodIsbn("123456");
		assertEquals("123456",l.getCodIsbn());
	}

	@Test
	void testGetEditore() {
		l.setEditore("prova");
		assertEquals("prova",l.getEditore());
	}

	@Test
	void testGetAutore() {
		l.setAutore("prova");
		assertEquals("prova",l.getAutore());
	}

	@Test
	void testGetLingua() {
		l.setLingua("ita");
		assertEquals("ita",l.getLingua());
	}

	

	@Test
	void testGetDataPubb() {
		l.setDataPubb(LocalDate.now());
		assertNotNull(l.getDataPubb());
	}

	@Test
	void testGetRecensione() {
		l.setRecensione("prova");
		assertEquals("prova",l.getRecensione());
	}

	@Test
	void testGetNrCopie() {
		l.setNrCopie(100);
		assertNotEquals(0,l.getNrCopie());
		}

	@Test
	void testGetDesc() {
		l.setDesc("prova");
		assertEquals("prova",l.getDesc());
	}

	@Test
	void testGetDisponibilita() {
		l.setDisponibilita(1);
		assertEquals(1,l.getDisponibilita());
	}

	@Test
	void testGetPrezzo() {
		l.setPrezzo((float)1.25);
		assertNotEquals(0,l.getPrezzo());
	}

	@Test
	void testGetId() {
		l.setId(25);
		assertNotEquals(0,l.getId());
	}

	
	@ParameterizedTest
	@ValueSource(strings= {"LINGUISTICA_SCRITTURA","ADOLESCENTI_RAGAZZI","CINEMA_FOTOGRAFIA",
			"ECONOMIA" ,"INFORMATICA","WEB_DIGITAL_MEDIA","POLITICA" ,"ROMANZI_ROSA"})
	void testGetCategoria(String strings) {
		l.setCategoria(strings);
		assertEquals(strings,l.getCategoria());
	}

	
      
	@Test
	void testGetNumeroPagine() {
		l.setNumeroPagine(150);
		assertEquals(150,l.getNumeroPagine());
	}
	
	@ParameterizedTest
	@ValueSource(ints= {1,5,6,7})
	void testLeggi(int ints) throws IOException, DocumentException
	{
		l.setId(ints);
		l.leggi(ints);
		assertEquals(ints,l.getId());
	}
	

}
