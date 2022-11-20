package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;

import org.junit.jupiter.api.Test;


import model.User;
import utilities.ConnToDb;

class TestUser {
	private User u=User.getInstance();

	@Test
	void testGetInstance() {
		assertNotNull(u);
	}

	@Test
	void testGetId() {
		u.setId(8);
		assertNotEquals(0,u.getId());
	}

	@Test
	void testGetNome() {
		u.setNome("userN8");
		assertNotNull(u.getNome());
	}

	@Test
	void testGetCognome() {
		u.setCognome("userC8");
		assertNotNull(u.getCognome());
	}

	@Test
	void testGetEmail() {
		u.setEmail("userEmail@gmail.com");
		assertNotNull(u.getEmail());
	}

	@Test
	void testGetPassword() {
		u.setPassword("user152");
		assertNotNull(u.getPassword());
	}

	

	@Test
	void testGetDataDiNascita() {
		u.setDataDiNascita(LocalDate.now());
		assertNotNull(u.getDataDiNascita());
	}

	@Test
	void testGetIdRuoloA() {
		u.setIdRuolo("ADMIN");
		assertEquals("ADMIN",u.getIdRuolo());
	}
	@Test
	void testGetIdRuoloE() {
		u.setIdRuolo("EDITORE");
		assertEquals("EDITORE",u.getIdRuolo());
	}
	@Test
	void testGetIdRuoloS() {
		u.setIdRuolo("SCRITTORE");
		assertEquals("SCRITTORE",u.getIdRuolo());
	}
	@Test
	void testGetIdRuoloF() {
		u.setIdRuolo("F");
		assertEquals("UTENTE",u.getIdRuolo());
		}
	
	
	@Test
	void testRimuoviDB()
	{
		String query="drop schema ispw";
		int row=0;
		try(Connection conn=ConnToDb.generalConnection();
				PreparedStatement prepQ=conn.prepareStatement(query);)
		{
			row=prepQ.executeUpdate();
		}catch(SQLException e)
		{
			java.util.logging.Logger.getLogger("cancella db").log(Level.INFO,"db cancellato \n");

		}
		

		assertEquals(11,row);
	}
	


}
