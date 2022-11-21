package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import model.TempUser;

class TestTempUser {
	private TempUser tu=TempUser.getInstance();

	@Test
	void testGetInstance() {
		
		assertNotNull(tu);
	}

	@Test
	void testGetId() {
		tu.setId(3);
		assertNotEquals(0,tu.getId());
	}

	@Test
	void testGetNome() {
		tu.setNome("tempUserN");
		assertNotNull(tu.getNome());
	}

	@Test
	void testGetCognome() {
		tu.setCognome("tempUserC");
		assertNotNull(tu.getCognome());
	}

	@Test
	void testGetEmail() {
		tu.setEmail("tempUserE@gmail.com");
		assertNotNull(tu.getEmail());
	}

	@Test
	void testGetPassword() {
		tu.setPassword("tempUser12");
		assertNotNull(tu.getPassword());
	}

	@Test
	void testGetDescrizione() {
		assertNotEquals("",tu.getDescrizione());
	}

	@Test
	void testGetDataDiNascita() {
		tu.setDataDiNascita(LocalDate.now());
		assertNotNull(tu.getDataDiNascita());
	}

	@Test
	void testGetIdRuoloA() {
		tu.setIdRuolo("ADMIN");
		assertEquals("ADMIN",tu.getIdRuolo());
	}
	@Test
	void testGetIdRuoloE() {
		tu.setIdRuolo("EDITORE");
		assertEquals("EDITORE",tu.getIdRuolo());
	}
	@Test
	void testGetIdRuoloS() {
		tu.setIdRuolo("SCRITTORE");
		assertEquals("SCRITTORE",tu.getIdRuolo());
	}
	@Test
	void testGetIdRuoloF() {
		tu.setIdRuolo("F");
		assertEquals("UTENTE",tu.getIdRuolo());
		}

}
