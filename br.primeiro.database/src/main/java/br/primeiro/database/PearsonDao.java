package br.primeiro.database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PearsonDao {
    private Connection con;


    public PearsonDao() throws IOException {
        con = Database.getinstance().getConnection();
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
