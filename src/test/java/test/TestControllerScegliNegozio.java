package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import controller.ControllerScegliNegozio;
import controller.ControllerSystemState;

class TestControllerScegliNegozio {
	private ControllerSystemState vis=ControllerSystemState.getIstance();
	private ControllerScegliNegozio cSN=new ControllerScegliNegozio();

	
	@Test
	void testGetNegozi() throws SQLException {
		assertNotNull(cSN.getNegozi());
	}

	@Test
	void testIsLoggedT() {
		vis.setIsLogged(true);
		assertTrue(cSN.isLogged());
	}
	@Test
	void testIsLoggedF() {
		vis.setIsLogged(false);
		assertFalse(cSN.isLogged());
	}

}
