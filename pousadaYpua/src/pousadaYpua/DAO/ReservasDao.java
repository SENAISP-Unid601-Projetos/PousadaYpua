package pousadaYpua.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	    	
	    	
	        String sql = "INSERT INTO Reservas (numero_pedido, cpf, numero_quarto, data_reservada) VALUES ( ?, ?, ?, ?)";
	        try (PreparedStatement stmt = con.prepareStatement(sql)) {
	            stmt.setString(2, cliente.getCpf());
	            stmt.setString(3, quarto.getNumero());
	            stmt.setString(4, reserva.getDataEntrada());
	            
	            stmt.executeUpdate(); // Use executeUpdate() para inserções
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }

	    }
	    public void delete(String numeroReserva) {
	        String sql = "DELETE * FROM Reserva WHERE numero_pedido = ?";
	        try (PreparedStatement stmt = con.prepareStatement(sql)) {
	        	stmt.setString(1, numeroReserva);
	            stmt.executeUpdate(); // Use executeUpdate() para inserções
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }

	    }
	    public Reserva buscar(String numeroPedido) {
			String sql = "SELECT * FROM Reservas WHERE numero_pedido = ?";
			try(PreparedStatement stmt = con.prepareStatement(sql)){
				stmt.setString(1, numeroPedido);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				
				String cpf = rs.getString("cpf");
				String numeroQuarto = rs.getString("numero_quarto");
				String dataReservada = rs.getString("data_reservada");
				
				
				Clientes cliente = new Clientes(cpf);
				Quarto quarto = new Quarto(numeroQuarto);
				return new Reserva(dataReservada, numeroPedido, cliente, quarto);
			}
			
			}catch(Exception e) {
				
			}
			return null;
	    	
	    }

}
