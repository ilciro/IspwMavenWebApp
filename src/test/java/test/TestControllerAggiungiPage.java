package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import controller.ControllerAggiungiPage;
import model.raccolta.Giornale;
import model.raccolta.Libro;
import model.raccolta.Rivista;

class TestControllerAggiungiPage {
	private Libro l=new Libro();
	private Giornale g=new Giornale();
	private Rivista r=new Rivista();
	private ControllerAggiungiPage cAP=new ControllerAggiungiPage();
	private String[] info=new String[7];
	private String[] infoGen= new String[6];
	

	@Test
	void testCheckData() throws SQLException {
		info[0]="titolo ins prova";
		info[1]="ARTE";
		info[2]="autore ins prova";
		info[3]="ita";
		info[4]="editore ins prova";
		info[5]="ARTE";
		info[6]="provo ad inserire un libro";
		infoGen[0]=String.valueOf(100);
		infoGen[1]="15263452";
		infoGen[2]=String.valueOf(84);
		infoGen[3]=String.valueOf(1);
		infoGen[4]=String.valueOf((float)2.25);
		infoGen[5]=String.valueOf(100);
		
		l.setDataPubb(LocalDate.now());
		l.setRecensione("provo ad inserire un libro");
		l.setDesc("libro da inserire");
		l.setId(0);
		
		assertTrue(cAP.checkData(info, l.getRecensione(), l.getDesc(), l.getDataPubb(), infoGen));
		
	}

	@Test
	void testCheckDataG() throws SQLException {
		g.setTitolo("giornale da inserire");
		g.setTipologia("quotidiano");
		g.setLingua("ita");
		g.setEditore("editore ins prova");
		g.setDataPubb(LocalDate.of(2022, 12,12));
		g.setCopieRimanenti(100);
		g.setDisponibilita(0);
		g.setPrezzo((float)2.45);
		assertTrue(cAP.checkDataG(g));
	}

	@Test
	void testCheckDataR() throws SQLException {
		info[0]="ins rivista prova";
		info[1]="SETTIMANALE";
		info[2]="autore ins rivi";
		info[3]="ita";
		info[4]="editore ins rivi";
		r.setDescrizione("aaa");
		r.setDataPubb(LocalDate.of(2022, 11,12));
		r.setDisp(0);
		r.setPrezzo((float)1.25);
		r.setCopieRim(5);
		assertTrue(cAP.checkDataR(info, r.getDataPubb(), r.getDisp(),r.getPrezzo() , r.getCopieRim(), r.getDescrizione()));

		
	}

}
