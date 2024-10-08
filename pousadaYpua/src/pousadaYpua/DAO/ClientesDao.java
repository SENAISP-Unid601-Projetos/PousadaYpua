package pousadaYpua.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import pousadaYpua.model.Clientes;

public class ClientesDao {

    private Connection con;

    public ClientesDao() {

        try {
            // Exemplo de inicialização da conexão
            this.con = DriverManager.getConnection(
                    "jdbc:sqlite:/Users/macbookpro/Documents/Projeto-Integrador-Pousada/pousadaYpua/resources/Pousada.db");

        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }

    public void insert(Clientes cliente) {
        String sql = "INSERT INTO Usuario (cpf, nome, celular, email, endereco, numero, cidade, cep, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
        String sql = "DELETE FROM Usuario WHERE cpf = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
        	stmt.setString(1, cpf);
            stmt.executeUpdate(); // Use executeUpdate() para inserções
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
