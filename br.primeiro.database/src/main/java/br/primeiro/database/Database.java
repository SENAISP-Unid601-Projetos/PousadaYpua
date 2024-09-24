package br.primeiro.database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	private Connection connection = null;

	private static Database instance = null;

	private Database() {

		try {

			connection = DriverManager.getConnection("jdbc:sqlite:/Users/macbookpro/Documents/Projeto-Integrador-Pousada/br.primeiro.database/src/main/java/res/pousada.db");

		} catch (Exception e) {
			System.err.println("Houve um problema ao criar o banco, mas eu ja resolvi. :)");
			//e.printStackTrace();
		}

	}

	public static void prePopulateDatabase() throws IOException, SQLException {

		try {
			Statement statement = getinstance().connection.createStatement();

			String sql = FileUtils.loadTextFile(
					"/Users/macbookpro/Documents/Projeto-Integrador-Pousada/br.primeiro.database/src/main/java/res/Descrition.sql");
			System.out.println(sql);
			statement.executeUpdate(sql);
		}catch (Exception ex){
			System.out.println("tratando as excecoes: " + ex.getMessage());
		}
	}

	public static Database getinstance() throws IOException {
		if (instance == null) {
			instance = new Database();
		}

		return instance;

	}

	public Connection getConnection() {
		return this.connection;
	}

	public void closeConnection() {
		try {
			this.connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
