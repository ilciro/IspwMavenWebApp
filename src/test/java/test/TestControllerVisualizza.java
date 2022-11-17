package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import controller.ControllerVisualizza;

class TestControllerVisualizza {
	private ControllerVisualizza cV=new ControllerVisualizza();


	@Test
	void testGetDataL() throws SQLException {
		assertNotNull(cV.getDataL(1));
	}

	@Test
	void testGetDataG() throws SQLException {
		assertNotNull(cV.getDataG(1));
	}

	@Test
	void testGetDataR() throws SQLException {
		assertNotNull(cV.getDataR(1));
	}

}
