package pousadaYpua.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pousadaYpua.database.Database;
import pousadaYpua.model.Clientes;
import pousadaYpua.model.Quarto;
import pousadaYpua.model.Reserva;

public class QuartosDao {
	
	
	private String path = Database.getPath();

	 private Connection con;

	    public QuartosDao() {

	        try {
	            // Exemplo de inicialização da conexão
	            this.con = DriverManager.getConnection(path);

	        } catch (
	                SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void insert(Quarto quarto) {
	    	
	    			
	    	
	        String sql = "INSERT INTO Quartos ( numero_quarto) VALUES ( ?)";
	        try (PreparedStatement stmt = con.prepareStatement(sql)) {
	            stmt.setInt(1, quarto.getNumero());
	           
	            
	            stmt.executeUpdate(); // Use executeUpdate() para inserções
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }

	    }

}
