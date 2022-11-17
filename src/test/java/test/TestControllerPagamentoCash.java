package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import controller.ControllerPagamentoCash;
import controller.ControllerSystemState;

class TestControllerPagamentoCash {
	private ControllerPagamentoCash cPC = new ControllerPagamentoCash();
	private ControllerSystemState vis=ControllerSystemState.getIstance();

	
	@Test
	void testControllaL() throws SQLException {
		vis.setTypeAsBook();
		vis.setId(1);
		vis.setSpesaT((float)11.25);
		cPC.controlla("pippo","pluto","via paperopoli 12","");
		assertEquals(1,vis.getId());
	}
	@Test
	void testControllaG() throws SQLException {
		vis.setTypeAsDaily();
		vis.setId(1);
		vis.setSpesaT((float)5.50);
		cPC.controlla("franco","rossi", "via rossi 8","dopo le 12");
		assertEquals(1,vis.getId());

	}
	@Test
	void testControllaR() throws SQLException {
		vis.setId(3);
		vis.setTypeAsMagazine();
		vis.setSpesaT((float)6.25);
		cPC.controlla("franco","rossi", "via rossi 8","dopo le 12");
		assertEquals(3,vis.getId());

		
	}

}
