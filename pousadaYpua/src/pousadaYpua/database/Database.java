package pousadaYpua.database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import pousadaYpua.utils.FileUtils;
import pousadaYpua.utils.Path;

public class Database {

	private Connection connection = null;
	
	private static Database instance = null;
	
	private Database() {

		try {

			connection = DriverManager.getConnection(Path.getPathBanco());
			System.out.println(Path.getPathBanco());

		} catch (Exception e) {
			System.err.println("Houve um problema ao criar o banco, mas eu ja resolvi. :)");
			//e.printStackTrace();
		}

	}
	
	

//	public static void prePopulateDatabase() throws IOException, SQLException {
//
//		try {
//			Statement statement = getinstance().connection.createStatement();
//
//			String sql = FileUtils.loadTextFile(
//					"/Users/macbookpro/Documents/Projeto-Integrador-Pousada/pousadaYpua/resources/Descrition.sql");
//			System.out.println(sql);
//			statement.executeUpdate(sql);
//		}catch (Exception ex){
//			System.out.println("tratando as excecoes: " + ex.getMessage());
//		}
//	}

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
