package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import controller.ControllerModificaUtente;
import model.User;

class TestControllerModificaUtente {
	private ControllerModificaUtente cMU=new ControllerModificaUtente();
	private User u=User.getInstance();

	@Test
	void testPrendi() throws SQLException {
		u.setEmail("giannni@gmail.com");
		assertNotNull(cMU.prendi());
	}

	@Test
	void testAggiorna() throws SQLException
	{
		assertTrue(cMU.aggiorna("g", "c","emailProva@gmail.com","provaPass","descProva",LocalDate.of(1952, 6,6) ,"giannni@gmail.com"));
	}
	

	@Test
	void testAggiornaTot() throws SQLException {
		u.setId(2);
		assertTrue(cMU.aggiornaTot("gianni","morandi" ,"gMorandi@gmail.com","71Giannone" ,"un mito" ,LocalDate.of(1952, 6,7),"A"));
	}

}
