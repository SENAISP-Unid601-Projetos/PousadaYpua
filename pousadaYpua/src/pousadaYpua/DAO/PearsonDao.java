package pousadaYpua.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import pousadaYpua.database.Database;
import pousadaYpua.model.Pearson;


public class PearsonDao {
    private Connection con;
	String path = Database.getPath();


    public PearsonDao() {
        try {
            // Exemplo de inicialização da conexão
            this.con = DriverManager.getConnection(path);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insert(Pearson pearson) {
        String sql = "INSERT INTO pearson (id, name) VALUES (?, ?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, pearson.getId());
            stmt.setString(2, pearson.getName());
            stmt.executeUpdate(); // Use executeUpdate() para inserções
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
