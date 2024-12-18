package pousadaYpua.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import pousadaYpua.database.Database;
import pousadaYpua.model.Clientes;
import pousadaYpua.utils.Path;

public class ClientesDao {

	private Connection con;
	
	

	
	public ClientesDao() {

		try {
			
			this.con = DriverManager.getConnection(Path.getPathBanco());

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
			stmt.executeUpdate(); 
			
			JOptionPane.showMessageDialog(null, 
                    " Cliente cadastrado com sucesso.", 
                    "Success", 
                    JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException e) {
        	JOptionPane.showMessageDialog(null, 
                    "Cliente já está cadastrado.", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
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

	public Clientes buscar(String cpf2) {
		String sql = "SELECT * FROM Clientes WHERE cpf = ? ";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, cpf2);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) { 
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
	
	
	public ArrayList<Clientes> buscaClientes(){
		String sql = "SELECT * FROM Clientes ";
		ArrayList<Clientes> clientes = new ArrayList<>();
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
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
				
				
				
			 clientes.add (new Clientes( nome,  celular,  cpf,  email,  endereco,  numero,
					 cidade,  cep, estado));
 
			}
			return clientes;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void atualizarCliente(Clientes cliente) {
	    String sql = "UPDATE Clientes SET nome = ?, celular = ?, email = ?, endereco = ?, numero = ?, cidade = ?, cep = ?, estado = ? WHERE cpf = ?";
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
			stmt.executeUpdate(); 
			
			
			JOptionPane.showMessageDialog(null, 
                    " Cliente atualizado com sucesso.", 
                    "Success", 
                    JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException e) {
        	
        }
			
	

	}
}
