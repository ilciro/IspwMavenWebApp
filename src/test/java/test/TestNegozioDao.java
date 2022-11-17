package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import database.NegozioDao;
import model.Negozio;

class TestNegozioDao {
	private NegozioDao nD=new NegozioDao();
	private Negozio shop=new Negozio();

	@Test
	void testGetNegozi() throws SQLException {
		assertNotNull(nD.getNegozi());
	}

	@Test
	void testCheckOpen() throws SQLException {
		shop.setNome("Negozio P");
		nD.setOpen(shop, false);
		assertFalse(nD.checkOpen(shop));
	}

	@Test
	void testCheckRitiro() throws SQLException {
		shop.setNome("Negozio P");
		nD.setRitiro(shop, true);
		assertFalse(nD.checkRitiro(shop));
	}

}
