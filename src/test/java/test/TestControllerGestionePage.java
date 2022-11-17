package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import controller.ControllerGestionePage;
import controller.ControllerSystemState;

class TestControllerGestionePage {
	private ControllerSystemState vis=ControllerSystemState.getIstance();
	private ControllerGestionePage cGP=new ControllerGestionePage();

	@Test
	void testCancellaL() throws SQLException {
		vis.setId(20);
		vis.setTypeAsBook();
		cGP.cancella(vis.getId());
		assertNotNull(vis.getId());
		
	}
	@Test
	void testCancellaG() throws SQLException {
		vis.setId(11);
		vis.setTypeAsDaily();
		cGP.cancella(vis.getId());
		assertNotNull(vis.getId());
		
	}
	@Test
	void testCancellaR() throws SQLException {
		vis.setId(5);
		vis.setTypeAsMagazine();
		cGP.cancella(vis.getId());
		assertNotNull(vis.getId());
		
	}

	@Test
	void testGetRivistaS() throws SQLException {
		assertNotNull(cGP.getRivistaS());
	}

	@Test
	void testGetLibroS() throws SQLException {
		assertNotNull(cGP.getLibroS());
	}

	@Test
	void testGetGiornaleS() throws SQLException {
		assertNotNull(cGP.getGiornaleS());
	}

}
