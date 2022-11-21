package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import database.GiornaleDao;
import model.raccolta.Giornale;

class TestGiornaleDao {
private GiornaleDao gD=new GiornaleDao();
private Giornale g=new Giornale();
	@Test
	void testRetId() throws SQLException {
		g.setTitolo("La gazzetta del profeta");
		assertEquals(12,gD.retId(g));
	}

	@Test
	void testGetDisp() throws SQLException {
		g.setId(12);
		assertEquals(1,gD.getDisp(g));
	}

}
