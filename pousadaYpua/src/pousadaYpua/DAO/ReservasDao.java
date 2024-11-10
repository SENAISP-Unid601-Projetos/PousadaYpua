package pousadaYpua.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pousadaYpua.database.Database;
import pousadaYpua.model.Clientes;
import pousadaYpua.model.Quarto;
import pousadaYpua.model.Reserva;

public class ReservasDao {
	
	private String path = Database.getPath();

	 private Connection con;

	    public ReservasDao() {

	        try {
	            // Exemplo de inicialização da conexão
	            this.con = DriverManager.getConnection(path);

	        } catch (
	                SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void insert(Reserva reserva) {
	    	Clientes cliente = reserva.getCliente();	
	    	Quarto quarto = reserva.getQuarto();
	    			
	    	
	        String sql = "INSERT INTO Reservas (cpf, numero_quarto) VALUES (  ?, ?)";
	        try (PreparedStatement stmt = con.prepareStatement(sql)) {
	            stmt.setString(1, cliente.getCpf());
	            stmt.setString(2, quarto.getNumero());
	            
	            
	            stmt.executeUpdate(); 
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }

	    }
	    public void delete(String numeroPedido) {
	        String sql = "DELETE FROM Reserva WHERE numero_pedido = ?";
	        try (PreparedStatement stmt = con.prepareStatement(sql)) {
	        	stmt.setString(1, numeroPedido);
	            stmt.executeUpdate(); 
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }

	    }
	    public Reserva buscar(String cpf) {
			String sql = "SELECT * FROM Reservas WHERE cpf = ?";
			try(PreparedStatement stmt = con.prepareStatement(sql)){
				stmt.setString(1, cpf);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				String numeroPedido = rs.getString("numero_pedido");
				String cpf2 = rs.getString("cpf");
				String numeroQuarto = rs.getString("numero_quarto");
				String dataReservada = rs.getString("data_reservada");
				
				
				Clientes cliente = new Clientes(cpf2);
				Quarto quarto = new Quarto(numeroQuarto);
				return new Reserva(dataReservada, numeroPedido, cliente, quarto);
			}
			
			}catch(Exception e) {
				
			}
			return null;
	    	
	    }
	    
	    
	    public boolean existeReserva(String cpf) {
			String sql = "SELECT * FROM Reservas WHERE cpf = ?";
			try(PreparedStatement stmt = con.prepareStatement(sql)){
				stmt.setString(1, cpf);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				 String cpf2= rs.getString("cpf");
				
				
				return true;
				
			}
			
			}catch(Exception e) {
				
			}
			return false;
	    }
	    
	    public String buscarDatas(Reserva reserva, String date )  {
	    	String sql = "SELECT numero_quarto, datas_reservadas FROM DatasReservadas WHERE numero_quarto = ? AND datas_reservadas = ?";
	    	try(PreparedStatement stmt = con.prepareStatement(sql)){
	    		stmt.setString(1, reserva.getQuarto().getNumero());
	    		stmt.setString(2, date);
	    		
	    	ResultSet rs = stmt.executeQuery();
	    	if(rs.next()) {
	    		String numeroQuarto = rs.getString("numero_quarto");
	    		String data = rs.getString("datas_reservadas");
	    		
	    		return data;    		
	    	}
	    		
	    	} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	return null;
			
	    }
	    
	    public void insertDatas(Reserva reserva) {
	    	
	    	for(String data : reserva.getDatasReservadas()) {
	    		String sql = "INSERT INTO DatasReservadas (numero_pedido, cpf, numero_quarto, datas_reservadas) VALUES (?,?,?,?)";
		    	try (PreparedStatement stmt = con.prepareStatement(sql)) {
		    		stmt.setString(1, reserva.getNumeroPedido());
		            stmt.setString(2, reserva.getCliente().getCpf());
		            stmt.setString(3, reserva.getQuarto().getNumero());
		            stmt.setString(4, data);
		            
		            
		            stmt.executeUpdate(); 
		        } catch (SQLException e) {
		            throw new RuntimeException(e);
		        }
	    	}
	    	

	    }
	    
	    public String buscarPedido()  {
	    	String sql = "SELECT MAX(numero_pedido) AS numero_pedido FROM Reservas ";
	    	try(PreparedStatement stmt = con.prepareStatement(sql)){
	    	
	    		
	    		
	    	ResultSet rs = stmt.executeQuery();
	    	if(rs.next()) {
	    		String numeroPedido = rs.getString("numero_pedido");
	    		
	    		return numeroPedido;    		
	    	}
	    		
	    	} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	return null;
			
	    }
	    public void deleteDatas(String numeroPedido) {
	        String sql = "DELETE FROM DatasReservadas WHERE numero_pedido = ?";
	        try (PreparedStatement stmt = con.prepareStatement(sql)) {
	        	stmt.setString(1, numeroPedido);
	            stmt.executeUpdate(); 
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }

	    }

}
