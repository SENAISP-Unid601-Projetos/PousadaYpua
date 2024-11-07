package pousadaYpua.model;

public class Usuario {
	private String nome;
	private String senha;
	private String id;
	private String permissoes;
	
	
	public Usuario(String nome, String senha, String id, String permissoes) {
		this.nome = nome;
		this.senha = senha;
		this.id = id;
		this.setPermissoes(permissoes);
	}
	public Usuario(String nome, String id) {
		this.nome = nome;
		this.id = id;
		
	}
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPermissoes() {
		return permissoes;
	}
	public void setPermissoes(String permissoes) {
		this.permissoes = permissoes;
	}
	
	
	

}
