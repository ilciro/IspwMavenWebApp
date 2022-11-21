package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import database.RivistaDao;
import model.raccolta.Rivista;

class TestRivistaDao {
	private Rivista r=new Rivista();
	private RivistaDao rD=new RivistaDao();

	@Test
	void testGetDesc() throws SQLException {
		r.setTitolo("Rivista A");
		rD.getDesc(r);
		assertNotNull(r.getTitolo());
	}
	@Test
	void testRetId() throws SQLException
	{
		r.setTitolo("Rivista A");
		assertEquals(4,rD.retId(r));
	}
	@Test
	void testCheckDisp() throws SQLException
	{
		r.setId(4);
		assertTrue(rD.checkDisp(r));
	}
	@Test
	void testRivistaSinngoloById() throws SQLException
	{
		r.setId(4);
		assertNotNull(rD.getRivistaSingoloById(r));
	}

}
