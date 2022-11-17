package controller;

import java.sql.SQLException;

import database.GiornaleDao;
import database.LibroDao;
import database.RivistaDao;
import model.raccolta.Giornale;
import model.raccolta.Libro;
import model.raccolta.Raccolta;
import model.raccolta.Rivista;
import javafx.collections.ObservableList;



public class ControllerGestionePage {
	private RivistaDao rD;
	private LibroDao lD;
	private GiornaleDao gD;
	private Libro l;
	private Giornale g;
	private Rivista r;
	
	public void cancella(int id) throws  SQLException {
		if(ControllerSystemState.getIstance().getType().equals("libro"))
		{
			l.setId(id);
			lD.cancella(l);
		}
		else if(ControllerSystemState.getIstance().getType().equals("giornale"))
		{
			g.setId(id);
			gD.cancella(g);
		}
		else if(ControllerSystemState.getIstance().getType().equals("rivista"))
		{
			r.setId(id);
			rD.cancella(r);
		}
	}
	
	public ObservableList<Raccolta> getRivistaS() throws SQLException {
		return rD.getRivistaSingolo();
	}
	
	public ObservableList<Raccolta> getLibroS() throws SQLException {
		return lD.getLibroSingolo();
	}
	
	public ObservableList<Raccolta> getGiornaleS() throws SQLException {
		return gD.getGiornaleSingolo();
	}
	
	public ControllerGestionePage()
	{
		rD=new RivistaDao();
		gD=new GiornaleDao();
		lD=new LibroDao();
		l=new Libro();
		g=new Giornale();
		r=new Rivista();
	}
	public String settaHeader()
	{
		String s=null;
		if(ControllerSystemState.getIstance().getType().equals("libro"))
		{
			s="Benvenuto nella schermata dei libri";
		}
		else if(ControllerSystemState.getIstance().getType().equals("giornale"))
		{
			s="Benvenuto nella schermata dei giornali";
		}
		else if(ControllerSystemState.getIstance().getType().equals("rivista"))
		{
			s="Benvenuto nella schermata dele riviste";
		}
		return s;
	}
}
