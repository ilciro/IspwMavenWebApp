package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import controller.ControllerModifPage;
import controller.ControllerSystemState;

class TestControllerModifPage {
	private ControllerModifPage cMP=new ControllerModifPage();
	private String[] cambio=new String[4];
	private String[] cambioR=new String[5];
	private String[] info=new String[6];
	private String[] infoCosti=new String[6];

	
	@Test
	void testGetLibriById() throws SQLException {
		assertNotNull(cMP.getLibriById(1));
	}

	@Test
	void testGetGiornaliById() throws SQLException {
		assertNotNull(cMP.getGiornaliById(2));
	}

	@Test
	void testCheckDataG() throws SQLException {
		ControllerSystemState.getIstance().setId(1);
		cambio[0]="cambio giornale";
		cambio[1]="quotidinao";
		cambio[2]="cambio ediitore";
		cambio[3]="italiano";
		cMP.checkDataG(cambio,LocalDate.of(2022, 11,20), 0, (float)1.25, 10);
		
	}

	@Test
	void testGetRivistaById() throws SQLException {
		assertNotNull(cMP.getRivistaById(5));
	}

	
	@Test
	void testCheckDataR() throws SQLException {
		cambioR[0]="cambio rivista";
		cambioR[1]="MENSILE";
		cambioR[2]="cambio autore";
		cambioR[3]="ita";
		cambioR[4]="cambio editore";
		cMP.checkDataR(cambioR, LocalDate.of(2023, 5,11), 0, (float)2.36, 100, 1, "rivista cambiata2");
	}

	@Test
	void testCheckDataL() throws NullPointerException, SQLException {
		info[0]="cambio libro";
		info[2]="cambio autore";
		info[3]="italiano";
		info[4]="cambio editore";
		info[5]="TECNOLOGIA_MEDICINA";
		
		infoCosti[0]="100";
		infoCosti[1]="12345674";
		infoCosti[3]="1";
		infoCosti[4]=String.valueOf((float)2.45);
		infoCosti[5]="50";
		ControllerSystemState.getIstance().setId(18);
		cMP.checkDataL(info, "aggiorno libro","provo ad aggiornare", LocalDate.of(2023,1,5), infoCosti);
	}

}
