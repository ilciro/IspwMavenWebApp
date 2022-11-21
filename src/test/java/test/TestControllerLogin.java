package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import controller.ControllerLogin;

class TestControllerLogin {
	
	private ControllerLogin cL=new ControllerLogin();

	@Test
	void testControlla() throws SQLException {
		
		assertTrue(cL.controlla("zerocalcare@gmail.com", "Zerocalcare21"));
	}

	@Test
	void testGetRuoloTempUSer() throws SQLException  {
			assertEquals("W",cL.getRuoloTempUSer("zerocalcare@gmail.com"));
	}

}
