package pousadaYpua.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pousadaYpua.database.Database;
import pousadaYpua.model.Clientes;

public class ClientesDao {

	private Connection con;
	
	
	private String path = Database.getPath();
	
	public ClientesDao() {

		try {
			// Exemplo de inicialização da conexão
			this.con = DriverManager.getConnection(path);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert(Clientes cliente) {
		String sql = "INSERT INTO Clientes (cpf, nome, celular, email, endereco, numero, cidade, cep, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, cliente.getCpf());
			stmt.setString(2, cliente.getNome());
			stmt.setString(3, cliente.getCelular());
			stmt.setString(4, cliente.getEmail());
			stmt.setString(5, cliente.getEndereco());
			stmt.setString(6, cliente.getNumero());
			stmt.setString(7, cliente.getCidade());
			stmt.setString(8, cliente.getCep());
			stmt.setString(9, cliente.getEstado());
			stmt.executeUpdate(); // Use executeUpdate() para inserções
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void delete(String cpf) {
		String sql = "DELETE FROM Clientes WHERE cpf = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, cpf);
			stmt.executeUpdate(); //
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public Clientes buscar(Clientes cliente) {
		String sql = "SELECT * FROM Clientes WHERE cpf = ? ";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, cliente.getCpf());
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) { // Verificando se o cliente foi encontrado
				// Criando um novo objeto Clientes com base nos dados retornados pelo SELECT

				String cpf = rs.getString("cpf");
				String nome = rs.getString("nome");
				String celular = rs.getString("celular");
				String email = rs.getString("email");
				String endereco = rs.getString("endereco");
				String numero = rs.getString("numero");
				String cidade = rs.getString("cidade");
				String cep = rs.getString("cep");
				String estado = rs.getString("estado");
				
				System.out.println("Buscando cliente com CPF: " + rs.getString("cpf"));
				System.out.println("Buscando cliente com CPF: " + rs.getString("nome"));
				System.out.println("Buscando cliente com CPF: " + rs.getString("celular"));
				
				
				
			 Clientes clienteNovo =new Clientes( nome,  celular,  cpf,  email,  endereco,  numero,
					 cidade,  cep, estado);

			 return clienteNovo;
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;

	}
}
