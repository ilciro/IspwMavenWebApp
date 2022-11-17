package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import controller.ControllerReportPage;

class TestControllerReportPage {
	private ControllerReportPage cRP=new ControllerReportPage();

	@Test
	void testGeneraReportLibri() throws IOException, SQLException {
		cRP.generaReportLibri();
		assertNotNull("ReportFinale\\riepilogoLibro.txt");
	}

	@Test
	void testGetUtenti() throws IOException, SQLException {
		cRP.getUtenti();
		assertNotNull("ReportFinale\\riepilogoUtenti.txt");
	}

	@Test
	void testGeneraReportRiviste() throws IOException, SQLException {
		cRP.generaReportRiviste();
		assertNotNull("ReportFinale\\riepilogoRiviste.txt");
	}

	@Test
	void testGeneraReportGiornali() throws IOException, SQLException {
		cRP.generaReportGiornali();
		assertNotNull("ReportFinale\\riepilogoGiornali.txt");
	}

}
