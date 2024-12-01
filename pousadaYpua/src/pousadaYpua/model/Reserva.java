package pousadaYpua.model;

import java.util.ArrayList;

public class Reserva {
	private String dataEntrada;
	private String dataSaida;
	private String numeroPedido;
	private Clientes cliente;
	private Quarto quarto;
	private String checkin;
	private String checkout;

	public Reserva(String dataEntrada, String dataSaida, Clientes cliente, Quarto quarto, String checkin, String checkout) {

		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.cliente = cliente;
		this.quarto = quarto;
		this.checkin = checkin;
		this.checkout = checkout;
		

	}
	public Reserva(String numeroPedido, String dataEntrada, String dataSaida, Clientes cliente, Quarto quarto, String checkin, String checkout) {

		
		this.numeroPedido = numeroPedido;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.cliente = cliente;
		this.quarto = quarto;
		this.checkin = checkin;
		this.checkout = checkout;
		

	}

	public Reserva(String numeroPedido) {
		this.numeroPedido = numeroPedido;

	}

//	public Reserva(ArrayList<String> datasReservadas, String numeroPedido, Clientes cliente, Quarto quarto) {
//		this.datasReservadas = datasReservadas;
//
//		this.numeroPedido = numeroPedido;
//		this.cliente = cliente;
//		this.quarto = quarto;
//
//	}

//	public Reserva(ArrayList<String> datasReservadas, Clientes cliente, Quarto quarto) {
//		this.datasReservadas = datasReservadas;
//		this.cliente = cliente;
//		this.quarto = quarto;
//
//	}

	public Reserva(String dataEntrada, String dataSaida, String numeroPedido, Clientes cliente, Quarto quarto) {
		this.numeroPedido = numeroPedido;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.cliente = cliente;
		this.quarto = quarto;

	}

	public Reserva(String dataEntrada, String dataSaida, Clientes cliente, Quarto quarto) {

		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.cliente = cliente;
		this.quarto = quarto;

	}

	
	
	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	
	

	

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public String getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	

}
