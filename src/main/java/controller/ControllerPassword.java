package controller;

import java.sql.SQLException;
import java.util.logging.Level;

import database.UsersDao;

import model.User;

public class ControllerPassword {
	private User u = User.getInstance();
	private boolean status=false;
	public ControllerPassword()
	{
		java.util.logging.Logger.getLogger("Test Costruttore").log(Level.INFO,"Costruttore ControllerPassword");

	}

	public boolean aggiornaPass(String email,String vecchiaP,String nuovaP) throws SQLException
	{
		u.setEmail(email);
		u.setPassword(vecchiaP);
		if(u.getPassword().equals(vecchiaP) && (nuovaP.length()>=8 || !email.equals("") ) )
		{
			
				u.setPassword(nuovaP);

				if(UsersDao.checkUser(u) == 1)
				{
					status=UsersDao.checkResetpass(u, nuovaP,email);
				}
				
				
			
			
		}
		return status;
	}
}
