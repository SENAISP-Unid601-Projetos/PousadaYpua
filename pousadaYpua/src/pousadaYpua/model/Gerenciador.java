package pousadaYpua.model;

import java.util.ArrayList;

import pousadaYpua.DAO.ReservasDao;

public class Gerenciador {
	
	
	public boolean verificaDatas(ArrayList<Reserva> datas) {
		ReservasDao reDao = new ReservasDao();
		for(Reserva r : datas ) {
			if(reDao.buscarDatas(r) != null) {
				return false;
				
			}
		}
		return true;
		
	}
}
