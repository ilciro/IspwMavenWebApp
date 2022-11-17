package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller.ControllerRicercaPerTipo;
import controller.ControllerSystemState;

class TestControllerRicercaPerTipo {
	private ControllerRicercaPerTipo cRT=new ControllerRicercaPerTipo();
	private ControllerSystemState vis=ControllerSystemState.getIstance();

	@Test
	void testSetRicercaL() {
		vis.setTypeAsBook();
		assertTrue(cRT.setRicercaL());
	}

	@Test
	void testSetRicercaG() {
		vis.setTypeAsDaily();
		assertTrue(cRT.setRicercaG());
	}

	@Test
	void testSetRicercaR() {
		vis.setTypeAsMagazine();
		assertTrue(cRT.setRicercaR());
	}

}
