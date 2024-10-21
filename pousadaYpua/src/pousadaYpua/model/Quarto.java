package pousadaYpua.model;

import java.util.ArrayList;

import java.util.ArrayList;

public class Quarto {
	private String numero;
	private boolean disponibilidade;
	private ArrayList<Reserva> reservas = new ArrayList<>();
	
	public Quarto(String numero) {
		this.numero = numero;
		this.disponibilidade = true;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	

}
