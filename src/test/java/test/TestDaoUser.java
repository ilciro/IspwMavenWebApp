package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import database.UsersDao;
import model.TempUser;

class TestDaoUser {
	private TempUser tu=TempUser.getInstance();
	

	@Test
	void testCreateUser2() throws SQLException {
		tu.setIdRuolo("E");
		tu.setNome("tempUser nome");
		tu.setCognome("tempUser cognome");
		tu.setEmail("tempUser@libero.it");
		tu.setPassword("userTemp963");
		tu.setDescrizione("provo ad inserire un tempUser");
		tu.setDataDiNascita(LocalDate.of(1988, 5,12));
		assertTrue(UsersDao.createUser2(tu));
		
	}

	@Test
	void testAggiornaTempNome() throws SQLException {
		tu.setNome("alfredo");
		assertNotNull(UsersDao.aggiornaTempNome(tu));
	}

	@Test
	void testAggiornaCognomeTempUser() throws SQLException {
		tu.setCognome("rosa");
		assertNotNull(UsersDao.aggiornaCognome(tu));
	}

	@Test
	void testAggiornaEmailTempUserString() throws SQLException {
		assertNotNull(UsersDao.aggiornaEmail(tu,"alfredo.rosa@gmail.com"));
		
	}

	@Test
	void testAggiornaTempUtente() throws SQLException {
		tu.setEmail("alfredo.rosa@gmail.com");
		tu.setIdRuolo("A");
		tu.setNome("alfredo1");
		tu.setCognome("rosa1");
		tu.setPassword("aarr1");
		tu.setDescrizione("pelato");
		tu.setDataDiNascita(LocalDate.of(1945, 3,6));
		assertNotNull(UsersDao.aggiornaTempUtente(tu,"alfredino25@libro.it"));
	}

	

	@Test
	void testMaxIdUSer() throws SQLException {
		assertNotEquals(0,UsersDao.maxIdUSer());
	}
	@Test
	void testCheckTempUser() throws SQLException
	{
		tu.setEmail("alfredino25@libro.it");
		assertEquals(-1,UsersDao.checkTempUser(tu));
	}
	
	@Test
	void testFindUser()
	{
		assertNotNull(UsersDao.findUser(tu));
	}
	@Test
	void testDeleteTempUser() throws SQLException
	{
		tu.setEmail("alfredino25@libro.it");
		assertTrue(UsersDao.deleteTempUser(tu));
	}

}
