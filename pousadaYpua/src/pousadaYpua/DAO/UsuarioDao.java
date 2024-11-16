package pousadaYpua.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import pousadaYpua.database.Database;
import pousadaYpua.model.Usuario;
import pousadaYpua.utils.Path;

public class UsuarioDao {

	private Connection con;

	public UsuarioDao() {

		try {
			// Exemplo de inicialização da conexão
			this.con = DriverManager.getConnection(Path.getPathBanco());

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void insert(Usuario usuario) {
		String sql = "INSERT INTO Usuarios (id, nome, senha, permissoes) VALUES (?, ?, ?, ?)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, usuario.getId());
			stmt.setString(2, usuario.getNome());
			stmt.setString(3, usuario.getSenha());
			stmt.setString(4, usuario.getPermissoes());
			stmt.executeUpdate(); // Use executeUpdate() para inserções

			JOptionPane.showMessageDialog(null, " Usuario cadastrado com sucesso.", "Success",
					JOptionPane.INFORMATION_MESSAGE);

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Usuario já está cadastrado.", "Erro", JOptionPane.ERROR_MESSAGE);
		}

	}

	public void delete(Usuario usuario) {
		String sql = "DELETE FROM Usuarios WHERE id = ? ";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, usuario.getId());
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Usuario Removido com sucesso.", "Success", JOptionPane.ERROR_MESSAGE);
		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, "Usuario não cadastrado ou já removido.", "Erro",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public Usuario buscarFuncionario(String idUsuario) {
		String sql = "SELECT * FROM Usuarios WHERE id = ? ";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, idUsuario);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				String id = rs.getString("id");
				String nome = rs.getString("nome");
				String senha = rs.getString("senha");
				String permissoes = rs.getString("permissoes");

				return new Usuario(nome, senha, id, permissoes);
			}

		} catch (SQLException e) {

		}
		return null;
	}

	public ArrayList<Usuario> buscaDeFuncionario() {
		String sql = "SELECT * FROM Usuarios ";
		ArrayList<Usuario> usuarios = new ArrayList<>();

		try (PreparedStatement stmt = con.prepareStatement(sql)) {

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String nome = rs.getString("nome");
				String senha = rs.getString("senha");
				String permissoes = rs.getString("permissoes");
				Usuario usuario = new Usuario(

						nome, senha, id, permissoes);

				usuarios.add(usuario);
			}

		} catch (SQLException e) {

		}
		return usuarios;
	}

	public void atualizarUsuario(Usuario usuario) {
		String sql = "UPDATE Usuarios SET nome = ?, senha = ? WHERE id = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getSenha());
			stmt.setString(3, usuario.getId());
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Usuario Atualizado com sucesso.", "Success",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, "ID de Usuario incorreto ou Usuario não existe.", "Erro",
					JOptionPane.ERROR_MESSAGE);
		}
	}

}
