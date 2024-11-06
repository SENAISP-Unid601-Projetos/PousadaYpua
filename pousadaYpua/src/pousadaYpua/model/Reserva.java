package pousadaYpua.model;

import java.util.ArrayList;

public class Reserva {
	private String dataEntrada;
	private int diasReservado;
	private String numeroPedido;
	private Clientes cliente;
	private Quarto quarto;
	private ArrayList<String> datasReservadas;
	
	public Reserva() {
	}

	public Reserva(String dataEntrada) {
		this.dataEntrada = dataEntrada;

	}

	public Reserva(ArrayList<String> datasReservadas, String numeroPedido, Clientes cliente, Quarto quarto) {
		this.datasReservadas = datasReservadas;

		this.numeroPedido = numeroPedido;
		this.cliente = cliente;
		this.quarto = quarto;

	}
	public Reserva(ArrayList<String> datasReservadas,  Clientes cliente, Quarto quarto) {
		this.datasReservadas = datasReservadas;
		this.cliente = cliente;
		this.quarto = quarto;

	}

	
	public Reserva(String dataEntrada, String numeroPedido, Clientes cliente, Quarto quarto) {
		this.numeroPedido = numeroPedido;
		this.dataEntrada =  dataEntrada;
		
		this.cliente = cliente;
		this.quarto = quarto;

	}
	
	public Reserva(String numeroPedido, Clientes cliente, Quarto quarto) {
		this.numeroPedido = numeroPedido;

		
		this.cliente = cliente;
		this.quarto = quarto;

	}
	
	
	public Reserva(String dataEntrada,  Quarto quarto) {
		this.dataEntrada = dataEntrada;
		this.quarto = quarto;

	}
	public Reserva(Clientes cliente,  Quarto quarto) {
		this.cliente = cliente;
		this.quarto = quarto;

	}
	
	

	public ArrayList<String> getDatasReservadas() {
		return datasReservadas;
	}

	public void setDatasReservadas(ArrayList<String> datasReservadas) {
		this.datasReservadas = datasReservadas;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public int getDiasReservado() {
		return diasReservado;
	}

	public void setDiasReservado(int diasReservado) {
		this.diasReservado = diasReservado;
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

}
