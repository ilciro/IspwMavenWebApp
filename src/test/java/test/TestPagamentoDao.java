package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import database.PagamentoDao;
import model.Pagamento;
import model.User;

class TestPagamentoDao {
	private PagamentoDao pD=new PagamentoDao();
	private Pagamento p;

	@ParameterizedTest
	@ValueSource(strings={"cash","cCredito"},ints= {0,1},floats= {(float) 1.36,(float) 2.36})
	
	void testInserisciPagamento(String strings,int ints,float floats) throws SQLException {
		
		p.setTipo(strings);
		p.setEsito(ints);
		
		p.setNomeUtente("franco");
		p.setAmmontare(floats);
		
		User.getInstance().setEmail("franco.rossi@gmail.com");
		
		p.setTipo("libro");
		
		p.setId(0);
		
		
		pD.inserisciPagamento(p);
		
		assertNotNull(p);
		
	}

	@Test
	void testGetPagamenti() throws SQLException {
		User.getInstance().setEmail("franco.rossi@gmail.com");
		assertNotNull(pD.getPagamenti());
	}

	@Test
	void testRetUltimoOrdine() throws SQLException {
		assertNotEquals(0,pD.retUltimoOrdine());
	}

	@Test
	void testAnnullaOrdine() throws SQLException {
		int id=pD.retUltimoOrdine();
		assertTrue(pD.annullaOrdine(id));
		
	}

}
