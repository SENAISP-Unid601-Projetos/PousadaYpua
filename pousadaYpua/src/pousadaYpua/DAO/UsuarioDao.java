package pousadaYpua.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

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
	            
	            JOptionPane.showMessageDialog(null, 
	                    " Usuario cadastrado com sucesso.", 
	                    "Success", 
	                    JOptionPane.ERROR_MESSAGE);
	            
	        } catch (SQLException e) {
	        	JOptionPane.showMessageDialog(null, 
	                    "Usuario já está cadastrado.", 
	                    "Erro", 
	                    JOptionPane.ERROR_MESSAGE);
	        }

	}
	
	public void delete(Usuario usuario) {
		String sql = "DELETE FROM Usuarios WHERE id = ? ";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1, usuario.getId());
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, 
                    "Usuario Removido com sucesso.", 
                    "Success", 
                    JOptionPane.ERROR_MESSAGE);
		}
		catch(SQLException e) {
			
			JOptionPane.showMessageDialog(null, 
                    "Usuario não cadastrado ou já removido.", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
		}
	}
	public Usuario buscarFuncionario(Usuario usuario) {
		String sql = "SELECT FROM Usuarios WHERE id = ? ";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1, usuario.getId());
			ResultSet rs = stmt.executeQuery();
			
			return new Usuario(
					rs.getString("id"),
					rs.getString("nome"),
					rs.getString("senha")
					);
					
		}catch(SQLException e) {
			
		}
		return null;
	}
}
