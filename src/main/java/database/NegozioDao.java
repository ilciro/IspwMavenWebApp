package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;

import model.Negozio;
import utilities.ConnToDb;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class NegozioDao {
	
	private String query;
	private static String eccezione="eccezione ottenuta:";
	
	
    
	public ObservableList<Negozio> getNegozi() throws SQLException
	{
		Negozio shop; 
		
		 ObservableList<Negozio> listOfNegozi;
		listOfNegozi=FXCollections.observableArrayList();

		query="SELECT  nome,via,isValid,isOpen from negozio";
				

			 try(Connection conn= ConnToDb.generalConnection();
			 PreparedStatement prepQ=conn.prepareStatement(query);)
			 {
	 			ResultSet rs=prepQ.executeQuery();
			
				while (rs.next())
				{
					shop = new Negozio(rs.getString(1),rs.getString(2),rs.getBoolean(3),rs.getBoolean(4));
					listOfNegozi.add(shop);
				}
			 }catch(SQLException e)
			 {
			java.util.logging.Logger.getLogger("Test Eccezione").log(Level.INFO, eccezione, e);
			 }
		
		return listOfNegozi;
	}
	
	public Boolean setOpen(Negozio shop, boolean i) throws SQLException 
	{
		// vanno messe  le query
		
		query="update ispw.negozio set isOpen =? where nome=?";
		
			
				try(Connection conn= ConnToDb.generalConnection();
				 PreparedStatement prepQ=conn.prepareStatement(query);)
				{
				
					prepQ.setBoolean(1, i);
					prepQ.setString(2, shop.getNome());
					prepQ.executeUpdate();
				}catch(SQLException e)
				{
					java.util.logging.Logger.getLogger("Test Eccezione").log(Level.INFO, eccezione, e);
				}
					
			
		return i;
		
		
	}
	
	public boolean setRitiro(Negozio shop, boolean i ) throws SQLException
	{
		
			query="update ispw.negozio set isValid =? where nome=?";
			try(Connection conn= ConnToDb.generalConnection();
					PreparedStatement  prepQ=conn.prepareStatement(query);
					)
			{
			
				
				
					prepQ.setBoolean(1, i);
					prepQ.setString(2, shop.getNome());
					prepQ.executeUpdate();
					
			}
		
		return i;
	}
	
	
	// controllo che il negozio sia aperto
	public boolean checkOpen(Negozio  shop) throws SQLException
	{
		int aperto=0;
		boolean state=false;
		query="select isOpen from negozio where nome=?";
		try(Connection conn=ConnToDb.generalConnection();
				PreparedStatement prepQ=conn.prepareCall(query);)
		{
			prepQ.setString(1, shop.getNome());
			ResultSet rs=prepQ.executeQuery();
			while(rs.next()){
				aperto=rs.getInt(1);
				if(aperto==1)
					state=true;
				
			}
		}catch(SQLException e)
		{
			java.util.logging.Logger.getLogger("Test Eccezione").log(Level.INFO, eccezione, e);
		}
			 
			
		
		return state;
	}

	
	//controllo se il negozio fa PickUP
	public boolean checkRitiro(Negozio shop) throws SQLException
	{
		query="select isValid form negozio where nome=?";
		boolean state=false;
		int disp;
		
		try(Connection conn=ConnToDb.generalConnection();
				PreparedStatement prepQ=conn.prepareStatement(query);)
		{
			prepQ.setString(1, shop.getNome());
			ResultSet rs=prepQ.executeQuery();
			while ( rs.next() ) {

					disp=rs.getInt(1);
					if (disp==1)
						state=true;
				
						
			}
			
		}catch(SQLException e)
		{
			java.util.logging.Logger.getLogger("Test Eccezione").log(Level.INFO, eccezione, e);
		}
			
		return state;
	}
	
}
