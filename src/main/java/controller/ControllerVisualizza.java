package controller;

import java.sql.SQLException;
import java.util.logging.Level;

import database.GiornaleDao;
import database.LibroDao;
import database.RivistaDao;
import model.Log;
import model.raccolta.Giornale;
import model.raccolta.Libro;
import model.raccolta.Rivista;


public class ControllerVisualizza {
	
	private LibroDao lD;
	private Libro l;
	private Giornale g;
	private Rivista r;
	private RivistaDao rD;
	private GiornaleDao gD;
	
	private ControllerSystemState vis = ControllerSystemState.getIstance() ;
	
	public ControllerVisualizza()
	{
		l = new Libro();
		g=new Giornale();
		r=new Rivista();
		lD=new LibroDao();
		gD=new GiornaleDao();
		rD=new RivistaDao();
	}
	public void setID(String i)
	{		
		
		vis.setId(Integer.parseInt(i));
	}
	public int getID()
	{
		Log.LOGGER.log(Level.INFO,"{0}.",vis.getId());
		return vis.getId();
	}
	public Libro getDataL(int i) throws SQLException
	{
		// imposto che è un libro nel controller
		vis.setId(i);
		l.setId(vis.getId());
		return  lD.getLibro(l);
	}
	public Giornale getDataG(int i) throws SQLException
	{
		// imposto che è un libro nel controller
		vis.setId(i);
		g.setId(vis.getId());
		return  gD.getGiornale(g);
	}
	public Rivista getDataR(int i) throws SQLException
	{
		// imposto che è un libro nel controller
		vis.setId(i);
		r.setId(vis.getId());
		return  rD.getRivista(r);
	}
	
}