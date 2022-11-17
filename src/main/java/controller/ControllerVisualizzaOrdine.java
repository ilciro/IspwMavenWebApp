package controller;

import java.sql.SQLException;

import database.PagamentoDao;
import model.Pagamento;
import javafx.collections.ObservableList;

public class ControllerVisualizzaOrdine {
	
	private PagamentoDao pD;
	
	public ObservableList<Pagamento> getDati() throws SQLException  {
		
		return pD.getPagamenti();
		}
	
	public ControllerVisualizzaOrdine()
	{
		pD=new PagamentoDao();
		
	}

}
