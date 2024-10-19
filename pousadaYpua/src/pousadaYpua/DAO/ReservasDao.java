package pousadaYpua.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pousadaYpua.model.Clientes;
import pousadaYpua.model.Quarto;
import pousadaYpua.model.Reserva;

public class ReservasDao {
	
	 private Connection con;

	    public ReservasDao() {

	        try {
	            // Exemplo de inicialização da conexão
	            this.con = DriverManager.getConnection(
	                    "jdbc:sqlite:/Users/macbookpro/Documents/Projeto-Integrador-Pousada/pousadaYpua/resources/Pousada.db");

	        } catch (
	                SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void insert(Clientes cliente, Reserva reserva, Quarto quarto) {
	        String sql = "INSERT INTO Reservas (cpf, numero_quarto, data_entrada, data_saida, numero_reserva) VALUES ( ?, ?, ?, ?, ?)";
	        try (PreparedStatement stmt = con.prepareStatement(sql)) {
	            stmt.setString(1, cliente.getCpf());
	            stmt.setString(2, quarto.getNumero());
	            stmt.setString(3, reserva.getDataEntrada());
	            stmt.setString(4, reserva.getDataSaida());
	            stmt.executeUpdate(); // Use executeUpdate() para inserções
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }

	    }
	    public void delete(String cpf) {
	        String sql = "DELETE * FROM Clientes WHERE cpf = ?";
	        try (PreparedStatement stmt = con.prepareStatement(sql)) {
	        	stmt.setString(1, cpf);
	            stmt.executeUpdate(); // Use executeUpdate() para inserções
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }

	    }

}
