package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import controller.ControllerAcquista;
import controller.ControllerSystemState;
import model.raccolta.Giornale;
import model.raccolta.Libro;
import model.raccolta.Rivista;

class TestControllerAcquista {

	private Libro l=new Libro();
	private Giornale g=new Giornale();
	private Rivista r=new Rivista();
	private static ControllerSystemState vis = ControllerSystemState.getIstance() ;
	
	
	
	private ControllerAcquista cA=new ControllerAcquista();
	
	@Test
	void testTotale() throws SQLException {
		l.setTitolo("Apocalypse town: Cronache dalla fine della civilta' urbana");
		l.setNrCopie(200);
		vis.setQuantita(5);
		vis.setId(1);
		assertEquals(0,cA.totale(l.getTitolo(), l.getNrCopie(), vis.getQuantita()));
	}

	@Test
	void testTotaleG() throws SQLException {
		g.setTitolo("La Republica1");
		vis.setId(3);
		g.setCopieRimanenti(50);
		vis.setQuantita(3);
		assertNotEquals(0,cA.totaleG(g.getTitolo(), g.getCopieRimanenti(), vis.getQuantita()));
	}

	@Test
	void testTotaleR() throws SQLException {
		r.setTitolo("Rivista B");
		vis.setId(5);
		r.setCopieRim(30);
		vis.setQuantita(2);
		assertNotEquals(0,cA.totaleR(r.getTitolo(), r.getCopieRim(),vis.getQuantita()));
	}

	@Test
	void testGetNomeByIdL() throws SQLException
	{
		vis.setTypeAsBook();
		vis.setId(2);
		assertNotNull(cA.getNomeById());
	}
	@Test
	void testGetNomeByIdG() throws SQLException
	{
		vis.setTypeAsDaily();
		vis.setId(2);
		assertNotNull(cA.getNomeById());
	}
	@Test
	void testGetNomeByIdR() throws SQLException
	{
		vis.setTypeAsMagazine();
		vis.setId(2);
		assertNotNull(cA.getNomeById());
	}
	@Test 
	void testGetDispL() throws SQLException
	{
		vis.setTypeAsBook();
		vis.setId(1);
		assertNotEquals(0,cA.getDisp());
	}
	@Test 
	void testGetDispG() throws SQLException
	{
		vis.setTypeAsDaily();
		vis.setId(1);
		assertEquals(0,cA.getDisp());
	}
	@Test 
	void testGetDispR() throws SQLException
	{
		vis.setTypeAsMagazine();
		vis.setId(1);
		assertNotEquals(0,cA.getDisp());
	}
	@Test 
	void testGetCostoL() throws SQLException
	{
		vis.setTypeAsBook();
		l.setId(1);
		assertNotEquals(0,cA.getCosto());
	}
	@Test 
	void testGetCostoG() throws SQLException
	{
		vis.setTypeAsDaily();
		g.setId(1);
		vis.setId(g.getId());
		assertNotEquals(0,cA.getCosto());
	}
	@Test 
	void testGetCostoR() throws SQLException
	{
		vis.setTypeAsMagazine();
		r.setId(1);
		assertEquals(5,cA.getCosto());
	}

}
