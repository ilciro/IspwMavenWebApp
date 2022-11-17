package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import controller.ControllerLogin;

class TestControllerLogin {
	
	private ControllerLogin cL=new ControllerLogin();

	@Test
	void testControlla() throws SQLException {
		
		assertTrue(cL.controlla("baoPublishing@gmail.com", "BaoPub2021"));
	}

	@Test
	void testGetRuoloTempUSer() throws SQLException  {
			assertEquals("E",cL.getRuoloTempUSer("BaoPublishing@gmail.com"));
	}

}
