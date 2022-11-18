package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.CartaDiCredito;
import utilities.CreateDefaultDB;

class TestCartaCredito {
	
	private java.sql.Date dataS= new java.sql.Date(Calendar.getInstance().getTime().getTime());
	private CartaDiCredito cc1=new CartaDiCredito(3,"8541-8596-5552-9858",(double)3000.0,(double)200,dataS,"pippo",(float)156.3);
	private CartaDiCredito cc2=new CartaDiCredito("pippo","pluto","1452-9958-7485-2222",new Date(),"852",(float)125.36);

	@BeforeAll
	public static void init() throws FileNotFoundException, ClassNotFoundException, SQLException
	{
		CreateDefaultDB.createDefaultDB();
	}
	
	@Test
	void testGetTipo() {
		assertEquals(3,cc1.getTipo());
		
	}

	@Test
	void testGetNumeroCC() {
		assertNotNull(cc2.getNumeroCC());
	}

	@Test
	void testGetLimite() {
		assertEquals((float)3000.0 , cc1.getLimite());
	}

	@Test
	void testGetAmmontare() {
		assertNotEquals(0,cc2.getAmmontare());
	}

	@Test
	void testGetScadenza() {
		assertNotNull(cc1.getScadenza());
	}

	@Test
	void testGetNomeUser() {
		assertEquals("pippo",cc2.getNomeUser());
	}

	@Test
	void testGetPrezzoTransazine() {
		assertNotEquals(0,cc1.getPrezzoTransazine());
	}

	@Test
	void testGetCognomeUser() {
		assertNotNull(cc2.getCognomeUser());
	}

	@Test
	void testGetCiv() {
		assertNotNull(cc2.getCiv());
	}

}
