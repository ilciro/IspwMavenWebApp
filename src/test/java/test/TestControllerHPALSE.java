package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller.ControllerHomePageAfterLoginSE;
import exception.LogoutException;
import model.User;

class TestControllerHPALSE {

	private static User u = User.getInstance();

	@Test
	void testLogout() throws LogoutException {
		u.setNome("Bao Publishing");
		assertTrue(ControllerHomePageAfterLoginSE.logout());
		
	}
	
}
