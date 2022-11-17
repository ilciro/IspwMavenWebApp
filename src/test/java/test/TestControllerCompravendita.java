package test;

import static org.junit.jupiter.api.Assertions.*;


import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import controller.ControllerCompravendita;
import model.User;

class TestControllerCompravendita {
	private ControllerCompravendita cC=new ControllerCompravendita();
	
	

	@Test
	void testDisponibilitaLibro() throws SQLException {
		assertTrue(cC.disponibilitaLibro("1"));
	}

	@Test
	void testDisponibilitaGiornale() throws SQLException {
		assertFalse(cC.disponibilitaGiornale("1"));
	}

	@Test
	void testDisponibilitaRivista() throws SQLException {
		assertTrue(cC.disponibilitaRivista("1"));
	}

	@Test
	void testGetLibri() throws SQLException {
		assertNotNull(cC.getLibri());
	}

	@Test
	void testGetGiornali() throws SQLException {
		
		assertNotNull(cC.getGiornali());
	}

	@Test
	void testGetRiviste() throws SQLException {
		assertNotNull(cC.getRiviste());
	}

	@Test
	void testRetTipoUser() {
		User.getInstance().setIdRuolo("ADMIN");
		assertEquals("ADMIN",User.getInstance().getIdRuolo());
	}

}
