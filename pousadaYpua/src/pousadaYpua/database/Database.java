package pousadaYpua.database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import pousadaYpua.utils.FileUtils;

public class Database {

	private Connection connection = null;
	private final static String path = "jdbc:sqlite:/Users/macbookpro/Documents/Projeto-Integrador-Pousada/pousadaYpua/resources/Pousada.db";

	private static Database instance = null;
	
	private Database() {

		try {

			connection = DriverManager.getConnection(this.path);

		} catch (Exception e) {
			System.err.println("Houve um problema ao criar o banco, mas eu ja resolvi. :)");
			//e.printStackTrace();
		}

	}
	
	

	public static void prePopulateDatabase() throws IOException, SQLException {

		try {
			Statement statement = getinstance().connection.createStatement();

			String sql = FileUtils.loadTextFile(
					"/Users/macbookpro/Documents/Projeto-Integrador-Pousada/pousadaYpua/resources/Descrition.sql");
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
	
	public static String getPath(){
		
			return path;
		
	}
	
}
