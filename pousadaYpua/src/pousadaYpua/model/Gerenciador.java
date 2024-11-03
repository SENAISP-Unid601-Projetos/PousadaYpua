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
	public boolean verificaCpf(ArrayList<Reserva> verif, String cpf) {
		ReservasDao reservaDao = new ReservasDao();
				for(Reserva r : verif) {
					
					if( reservaDao.existeReserva(cpf)) {
						
						return true;
					}
				}
				return false;
		
	}
}
