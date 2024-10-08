package pousadaYpua.model;

public class Reserva {
	private String dataEntrada;
	private String dataSaida;
	private String numeroPedido;
	private Clientes cliente;
	
	
	
	public Reserva(String dataEntrada, String dataSaida, String numeroPedido, Clientes cliente) {
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.numeroPedido = numeroPedido;
		this.cliente = cliente;
	}
	public String getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public String getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
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
