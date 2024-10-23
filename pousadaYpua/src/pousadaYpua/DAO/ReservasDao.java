package pousadaYpua.DAO;

import java.sql.Connection;
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

	    public void insert(Reserva reserva) {
	    	Clientes cliente = reserva.getCliente();	
	    	Quarto quarto = reserva.getQuarto();
	    			
	    	
	        String sql = "INSERT INTO Reservas (cpf, numero_quarto, data_reservada) VALUES ( ?, ?, ?)";
	        try (PreparedStatement stmt = con.prepareStatement(sql)) {
	            stmt.setString(1, cliente.getCpf());
	            stmt.setString(2, quarto.getNumero());
	            stmt.setString(3, reserva.getDataEntrada());
	            
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
	    
	    public String buscarDatas(Reserva reserva)  {
	    	String sql = "SELECT numero_quarto, data_reservada FROM Reservas WHERE numero_quarto = ? AND data_reservada = ?";
	    	try(PreparedStatement stmt = con.prepareStatement(sql)){
	    		stmt.setString(1, reserva.getQuarto().getNumero());
	    		stmt.setString(2, reserva.getDataEntrada());
	    		
	    	ResultSet rs = stmt.executeQuery();
	    	if(rs.next()) {
	    		String numeroQuarto = rs.getString("numero_quarto");
	    		String data = rs.getString("data_reservada");
	    		
	    		return data;    		
	    	}
	    		
	    	} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	return null;
			
	    }

}
