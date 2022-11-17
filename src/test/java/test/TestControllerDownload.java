package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.itextpdf.text.DocumentException;

import controller.ControllerDownload;
import controller.ControllerSystemState;
import database.ContrassegnoDao;
import database.PagamentoDao;
import model.Fattura;
import model.Pagamento;

class TestControllerDownload {
	private ControllerDownload cD=new ControllerDownload();
	private ControllerSystemState vis=ControllerSystemState.getIstance();
	
	private PagamentoDao pD=new PagamentoDao();
	private ContrassegnoDao cDao=new ContrassegnoDao();

	@Test
	void testScaricaLibro() throws DocumentException, IOException {
		vis.setId(2);
		cD.scaricaLibro();
		assertEquals(2,vis.getId());
	}

	

	@Test
	void testScaricaGiornale() throws IOException, DocumentException {
		vis.setId(1);
		cD.scaricaGiornale();
		assertEquals(1,vis.getId());
	}

	@Test
	void testScaricaRivista() throws DocumentException, IOException {
		vis.setId(5);
		cD.scaricaRivista();
		assertEquals(5,vis.getId());
	}
	@Test
	void testAnnullaOrdineL() throws SQLException
	{
		vis.setTypeAsBook();
		vis.setMetodoP("cash");
		Fattura f=new Fattura("pippo","pluto","via paperopoli 12","","1",(float)16.3);
		Fattura f1=new Fattura("pippo","pluto","via paperopoli 12","","2",(float)18.5);
		
		cDao.inserisciFattura(f);
		cDao.inserisciFattura(f1);

		Pagamento p=new Pagamento(1, "cash", 0, "pippo", (float)16.3, "cash");
		Pagamento p1=new Pagamento(2, "cash", 0, "pippo", (float)18.5, "cash");


		pD.inserisciPagamento(p);
		pD.inserisciPagamento(p1);
		
		cD.annullaOrdine();
		assertEquals("cash",vis.getMetodoP());
	}
	@Test
	void testAnnullaOrdineG() throws SQLException
	{
		vis.setTypeAsDaily();
		vis.setMetodoP("cash");
		Fattura f=new Fattura("pippo","pluto","via paperopoli 12","","1",(float)16.3);
		Fattura f1=new Fattura("pippo","pluto","via paperopoli 12","","2",(float)18.5);
		
		cDao.inserisciFattura(f);
		cDao.inserisciFattura(f1);

		Pagamento p=new Pagamento(1, "cash", 0, "pippo", (float)16.3, "cash");
		Pagamento p1=new Pagamento(2, "cash", 0, "pippo", (float)18.5, "cash");


		pD.inserisciPagamento(p);
		pD.inserisciPagamento(p1);
		
		cD.annullaOrdine();
		assertEquals("cash",vis.getMetodoP());
	}
	@Test
	void testAnnullaOrdineR() throws SQLException
	{
		vis.setTypeAsMagazine();
		vis.setMetodoP("cCredito");
		
		

		Pagamento p=new Pagamento(1, "cc", 0, "pippo", (float)16.3, "cash");
		Pagamento p1=new Pagamento(2, "cc", 0, "pippo", (float)18.5, "cash");


		pD.inserisciPagamento(p);
		pD.inserisciPagamento(p1);
		
		cD.annullaOrdine();
		assertEquals("cCredito",vis.getMetodoP());
	}

}
