package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller.ControllerHomePageAfterLogin;
import exception.LogoutException;
import model.User;

class TestControllerHPAL {
	private static User u = User.getInstance();

	@Test
	void testLogout() throws LogoutException {
		u.setNome("Zerocalcare");
		assertTrue(ControllerHomePageAfterLogin.logout());
		
	}
	@Test
	void testLogoutE() throws LogoutException {
		u.setNome(null);
		Exception exception = assertThrows(LogoutException.class, () -> {
			ControllerHomePageAfterLogin.logout();
	    });
		String expectedMex="Errore Logout";
		String actualMex=exception.getMessage();
		assertTrue(actualMex.contains(expectedMex));
		
	}

}
