package pousadaYpua.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pousadaYpua.model.Usuario;

public class UsuarioDao {

	private Connection con;

	public UsuarioDao() {

		try {
			// Exemplo de inicialização da conexão
			this.con = DriverManager.getConnection(
					"jdbc:sqlite:/Users/macbookpro/Documents/Projeto-Integrador-Pousada/pousadaYpua/resources/Pousada.db");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void insert(Usuario usuario) {
		  String sql = "INSERT INTO Usuarios (id, nome, senha) VALUES (?, ?, ?)";
	        try (PreparedStatement stmt = con.prepareStatement(sql)) {
	            stmt.setString(1, usuario.getId());
	            stmt.setString(2, usuario.getNome());
	            stmt.setString(3, usuario.getSenha());
	            stmt.executeUpdate(); // Use executeUpdate() para inserções
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }

	}
}
