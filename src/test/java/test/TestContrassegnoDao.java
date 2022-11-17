package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import database.ContrassegnoDao;

class TestContrassegnoDao {
	private ContrassegnoDao cD=new ContrassegnoDao();

	

	@Test
	void testAnnullaOrdine() throws SQLException {
		assertFalse(cD.annullaOrdine(2));
	}

}
