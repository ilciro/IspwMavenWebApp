package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import controller.ControllerVisualizzaProfilo;
import model.User;

class TestControllerVisualizzaProfilo {
	private ControllerVisualizzaProfilo cVP=new ControllerVisualizzaProfilo();

	@Test
	void testGetCredenziali() throws SQLException {
		User.getInstance().setEmail("baoPublishing@gmail.com");
		assertNotNull(cVP.getCredenziali());
		
	}

	@Test
	void testCancellaUtente() throws SQLException {
		User.getInstance().setEmail("baoPublishing@gmail.com");
		assertTrue(cVP.cancellaUtente());
	}

}
