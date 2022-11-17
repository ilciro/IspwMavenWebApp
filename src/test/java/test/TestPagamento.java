package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Pagamento;

class TestPagamento {
	private Pagamento p=new Pagamento(5, "cash", 0, "pippo", (float)12.35, "cash");
	private Pagamento p2=new Pagamento(6, "cc", 0, "franco", (float)11.25, "cc", 5);

	

	@Test
	void testGetId() {
		assertNotEquals(0,p2.getId());
	}

	@Test
	void testGetMetodo() {
		assertEquals("cash",p.getMetodo());
	}

	@Test
	void testGetEsito() {
		assertEquals(0,p.getEsito());
	}

	@Test
	void testGetNomeUtente() {
		assertNotNull(p2.getNomeUtente());
	}

	@Test
	void testGetAmmontare() {
		assertNotEquals(0,p.getAmmontare());
	}

	@Test
	void testGetTipo() {
		assertEquals("cc",p2.getTipo());
	}

	@Test
	void testGetIdOggetto() {
		assertNotEquals(0,p2.getId());
	}

}
