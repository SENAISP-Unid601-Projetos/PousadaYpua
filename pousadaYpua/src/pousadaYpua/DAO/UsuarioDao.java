package pousadaYpua.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import pousadaYpua.model.Usuario;

public class UsuarioDao {

    private Connection con;

    public UsuarioDao() {

        try {
            // Exemplo de inicialização da conexão
            this.con = DriverManager.getConnection(
                    "jdbc:sqlite:/Users/macbookpro/Documents/Projeto-Integrador-Pousada/pousadaYpua/resources/Pousada.db");

        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }

    public void insert(Usuario usuario) {
        String sql = "INSERT INTO pearson (cpf, nome, celular, email, endereco, numero, cidade, cep, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, usuario.getCpf());
            stmt.setString(2, usuario.getNome());
            stmt.setString(3, usuario.getCelular());
            stmt.setString(4, usuario.getEmail());
            stmt.setString(5, usuario.getEndereco());
            stmt.setString(6, usuario.getNumero());
            stmt.setString(7, usuario.getCidade());
            stmt.setString(8, usuario.getCep());
            stmt.setString(9, usuario.getEstado());
            stmt.executeUpdate(); // Use executeUpdate() para inserções
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
