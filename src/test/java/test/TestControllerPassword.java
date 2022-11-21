package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import controller.ControllerPassword;

class TestControllerPassword {
	private ControllerPassword cP=new ControllerPassword();

	

	@Test
	void testAggiornaPass() throws SQLException {
		assertTrue(cP.aggiornaPass("baoPublishing@gmail.com","BaoPub2021","BaoPub2022"));
	}

}
