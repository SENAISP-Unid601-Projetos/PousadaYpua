package pousadaYpua.model;

import java.util.ArrayList;
import pousadaYpua.DAO.*;

public class Gerenciador {
	private Usuario user;
	private UsuarioDao u = new UsuarioDao();
	
	
	
	
	
	
	
	
	
	public Usuario getUser() {
		return user;
	}
	public void setUser(Usuario user) {
		this.user = user;
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
	
	public void verificaLogin(String idUsuario, String senha) {
		
		Usuario user = u.buscarFuncionario(idUsuario);
		System.out.println(user.getNome());
		System.out.println(user.getId());
		System.out.println(user.getSenha());
		System.out.println(user.getPermissoes());
	}
}
