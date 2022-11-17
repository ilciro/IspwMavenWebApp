package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller.ControllerReportRaccolta;
import model.User;

class TestControllerReportRaccolta {
	private ControllerReportRaccolta cRR=new ControllerReportRaccolta();

	@Test
	void testGetTipo() {
		User.getInstance().setIdRuolo("UTENTE");
		assertEquals("UTENTE",cRR.getTipo());
	}
	@Test
	void testGetTipoW() {
		User.getInstance().setIdRuolo("W");
		assertEquals("SCRITTORE",cRR.getTipo());
	}

}
