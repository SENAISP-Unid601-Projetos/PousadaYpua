package pousadaYpua.model;

public class Clientes {
	private String nome, celular, cpf, email, endereco, numero, cidade, cep, estado;

	public Clientes(String nome, String celular, String cpf, String email, String endereco, String numero,
			String cidade, String cep, String estado) {
		this.nome = nome;
		this.celular = celular;
		this.cpf = cpf;
		this.email = email;
		this.endereco = endereco;
		this.numero = numero;
		this.cidade = cidade;
		this.cep = cep;
		this.estado = estado;
	}

	public Clientes(String cpf) {
		this.cpf = cpf;
	}

	public String getInfo() {
		String s = "Nome: " + this.nome +"\n"+ " Celular: " + celular + "\n"+" CPF: " + cpf +"\n"+
	" Email: " + email + "\n"+ " Endereço: " + endereco +"\n"+
	" Numero: "+ numero +"\n"+ " Cidade: " + cidade
	+ "\n"+ " Cep: " + cep + "\n"+" Estado: " + estado;
		
		return s;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
