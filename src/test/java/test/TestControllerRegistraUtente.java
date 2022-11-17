package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import controller.ControllerRegistraUtente;

class TestControllerRegistraUtente {
	private ControllerRegistraUtente cRU=new ControllerRegistraUtente();

	

	@Test
	void testRegistra() throws SQLException {
		assertTrue(cRU.registra("nuovoUtenteN", "nuovoUtenteC", "nuovoUtente@gmail.com", "nuovo152","nuovo152",LocalDate.of(1985, 02,24)));
	}

	
	

	

}
