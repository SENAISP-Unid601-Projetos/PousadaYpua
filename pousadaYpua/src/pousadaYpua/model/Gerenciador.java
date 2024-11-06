package pousadaYpua.model;

import java.util.ArrayList;

import pousadaYpua.DAO.ReservasDao;

public class Gerenciador {
	
	
	public boolean verificaDatas(Reserva reserva) {
		ReservasDao reDao = new ReservasDao();
		for(String dia : reserva.getDatasReservadas() ) {
			if(reDao.buscarDatas(reserva, dia) != null) {
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
