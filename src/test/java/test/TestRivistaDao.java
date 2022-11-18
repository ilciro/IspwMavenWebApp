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

}
