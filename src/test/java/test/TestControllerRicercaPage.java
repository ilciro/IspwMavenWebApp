package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import controller.ControllerRicercaPage;
import controller.ControllerSystemState;

class TestControllerRicercaPage {
	private ControllerSystemState vis=ControllerSystemState.getIstance();
	private ControllerRicercaPage cRP=new ControllerRicercaPage();

	@Test
	void testCercaPerTipoLAutore() throws SQLException {
		vis.setTypeAsBook();
		assertNotNull(cRP.cercaPerTipo("Zerocalcare"));
	}
	@Test
	void testCercaPerTipoLTitolo() throws SQLException {
		vis.setTypeAsBook();
		assertNotNull(cRP.cercaPerTipo("In cucina con ciccio"));
	}
	@Test
	void testCercaPerTipoGAutore() throws SQLException {
		vis.setTypeAsDaily();
		assertNotNull(cRP.cercaPerTipo("Il Fatto Quotidiano"));
	}
	@Test
	void testCercaPerTipoGTitolo() throws SQLException {
		vis.setTypeAsDaily();
		assertNotNull(cRP.cercaPerTipo("La Republica"));
	}
	@Test
	void testCercaPerTipoRAutore() throws SQLException {
		vis.setTypeAsMagazine();
		assertNotNull(cRP.cercaPerTipo("Focus"));
	}
	@Test
	void testCercaPerTipoRTitolo() throws SQLException {
		vis.setTypeAsMagazine();
		assertNotNull(cRP.cercaPerTipo("Rivista A"));
	}
	

}
