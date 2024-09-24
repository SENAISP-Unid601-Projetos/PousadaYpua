package pousadaYpua;

public class Quarto {
	private String numero, data;
	private boolean disponibilidade;
	private Usuario usuario;
	
	public Quarto(String numero, String data,boolean disponibilidade) {
		this.numero = numero;
		this.data = data;
		this.disponibilidade = disponibilidade;
	}
	public Quarto(String numero, String data,boolean disponibilidade, Usuario usuario) {
		this.numero = numero;
		this.data = data;
		this.disponibilidade = disponibilidade;
		this.usuario = usuario;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	

}
