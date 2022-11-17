package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import controller.ControllerPagamentoCC;
import controller.ControllerSystemState;

class TestControllerPagamentoCC {
	private ControllerSystemState vis=ControllerSystemState.getIstance();
	private ControllerPagamentoCC cPCC=new ControllerPagamentoCC();

	

	@Test
	void testControllaPag() {
		assertTrue(cPCC.controllaPag("2025-08-08","1852-9999-4152-9963","528"));
	}

	@Test
	void testAggiungiCartaDBL() throws SQLException {
		vis.setSpesaT((float)125.6);
		vis.setTypeAsBook();
		java.sql.Date data=Date.valueOf("2025-11-11");
		cPCC.aggiungiCartaDB("franco","rossi","1852-8444-5256-3361", data, "185", (float)3000.0);
		assertNotNull(data);
	}
	@Test
	void testAggiungiCartaDBG() throws SQLException {
		vis.setSpesaT((float)35.4);
		vis.setTypeAsDaily();
		java.sql.Date data=Date.valueOf("2026-06-11");
		cPCC.aggiungiCartaDB("luigi","neri","2552-8544-5256-3361", data, "263", (float)2500.0);
		assertNotNull(data);
	}
	@Test
	void testAggiungiCartaDBR() throws SQLException {
		vis.setSpesaT((float)14.9);
		vis.setTypeAsMagazine();
		java.sql.Date data=Date.valueOf("2028-02-22");
		cPCC.aggiungiCartaDB("silvia","gialli","0442-8544-2556-3311", data, "145", (float)5000.0);
		assertNotNull(data);
	}

	@Test
	void testRitornaElencoCC() throws SQLException {
		assertNotNull(cPCC.ritornaElencoCC("luigi"));
	}

	@Test
	void testTornaDalDb() throws SQLException {
		assertNotNull(cPCC.tornaDalDb("2552-8544-5256-3361"));
	}

	@Test
	void testPagamentoCCL() throws SQLException {
		vis.setTypeAsBook();
		vis.setSpesaT((float)125.6);
		vis.setId(1);
		cPCC.pagamentoCC("franco");
		assertNotEquals(0,vis.getId());
	}
	@Test
	void testPagamentoCCG() throws SQLException {
		vis.setTypeAsDaily();
		vis.setSpesaT((float)35.4);
		vis.setId(1);
		cPCC.pagamentoCC("luigi");
		assertNotEquals(0,vis.getId());
	}
	@Test
	void testPagamentoCCR() throws SQLException {
		vis.setTypeAsMagazine();
		vis.setSpesaT((float)14.9);
		vis.setId(1);
		cPCC.pagamentoCC("silvia");
		assertNotEquals(0,vis.getId());
	}

}
