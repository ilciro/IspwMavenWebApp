package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import controller.ControllerVisualizzaOrdine;
import model.User;

class TestControllerVisualizzaOrdine {
	private ControllerVisualizzaOrdine cVO=new ControllerVisualizzaOrdine();

	@Test
	void testGetDati() throws SQLException {
		User.getInstance().setEmail(null);
		assertNotNull(cVO.getDati());
	}

}
