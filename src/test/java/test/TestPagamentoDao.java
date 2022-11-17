package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import database.PagamentoDao;
import model.User;

class TestPagamentoDao {
	private PagamentoDao pD=new PagamentoDao();

	@Test
	void testGetPagamenti() throws SQLException {
		User.getInstance().setEmail("giannni@gmail.com");
		assertNotNull(pD.getPagamenti());
	}

	@Test
	void testRetUltimoOrdine() throws SQLException {
		assertNotEquals(0,pD.retUltimoOrdine());
	}

	@Test
	void testAnnullaOrdine() throws SQLException {
		assertTrue(pD.annullaOrdine(9));
	}

}
